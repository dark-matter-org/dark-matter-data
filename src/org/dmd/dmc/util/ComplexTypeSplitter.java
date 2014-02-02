package org.dmd.dmc.util;

import java.util.ArrayList;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.IntegerVar;

/**
 * The ComplexTypeSplitter is used to parse a micro-grammar in support of specifying complex type
 * values. It allows for brevity in specifying values and also handles optional values via a
 * name/value pair mechanism.
 * <p/>
 * In a complex type, you may have 3 value that always have to be specified and various optional
 * parts. For example:
 * <br/>
 * name type id comment="various things" version=1.2.3.4
 * <br/>
 * The micro grammar doesn't know anything about what's required or optional (that's handled
 * in higher level code), but for the input above, it will create a set of name/value pairs
 * 
 */
public class ComplexTypeSplitter {
	
	static public boolean debug = false;

	static public ArrayList<NameValuePair> parse(String initialInput) throws DmcValueException {
		return(parse(initialInput,' '));
	}

	static public ArrayList<NameValuePair> parse(String initialInput, char separator) throws DmcValueException {
        if (initialInput == null){
        	throw(new DmcValueException("No content to parse!"));
        }
        
		ArrayList<NameValuePair> rc = new ArrayList<NameValuePair>();
		NameValuePair nvp = null;
		
        String input = initialInput.trim();
        input = input.replaceAll("(\\s)+", " ");
        
        if (input.length() == 0){
        	throw(new DmcValueException("No content to parse!"));
        }
        
        IntegerVar position = new IntegerVar();
        for(int i=0; i<input.length(); i++){
        	if (input.charAt(i) == '"'){
        		position.set(i);
        		nvp = parseQuotedText(input, null, position);
        		rc.add(nvp);
        		i = position.intValue();
        	}
        	else if (input.charAt(i) == '='){
        		throw(new DmcValueException("Missing name for value"));
        	}
			else{
				position.set(i);
				if ( (nvp = parsePart(input,position,separator)) != null)
					rc.add(nvp);
        		i = position.intValue();
			}
        	
        	if ( (i+1) == input.length()){
        		// A funny edge condition, if we finish up with the last character being a separator,
        		// it means that someone meant to have another value (after the separator) so we'l'
        		// create the empty value
        		if (input.charAt(i) == separator)
        			rc.add(new NameValuePair());
        	}
        }
		
		return(rc);
	}
	
	static private NameValuePair parseQuotedText(String input, String namePart, IntegerVar position) throws DmcValueException {
		NameValuePair rc = null;
		
		if (debug)
			System.out.println("    -> parseQuoted i = " + position);
		
		if ((position.intValue() + 1) == input.length())
			throw(new DmcValueException("Unmatched \"" + showErrorLocation(position.intValue()+1, input)));
		
		for(int i=position.intValue() + 1; i<input.length(); i++){
			if (input.charAt(i) == '"'){
				String quotedPart = input.substring(position.intValue() + 1, i);
				
				// It's possible that we have nothing in the quotes, in which case the value would be null
				if (quotedPart.length() == 0)
					quotedPart = null;
				
				rc = new NameValuePair(namePart, quotedPart);
				position.set(i);
				break;
			}
		}
		
		if (rc == null)
			throw(new DmcValueException("Unmatched \"" + showErrorLocation(input.length(), input)));
		
		if (debug)
			System.out.println("    <- parseQuoted = " + position + "  - '" + input.charAt(position.intValue()) + "'");
		
		return(rc);
	}
	
	/**
	 * We're starting with a non-whitespace character that isn't a double quote.
	 * We could have something of the form:
	 * value\b - which is fine
	 * name=\b - which is a missing value
	 * name=value - which is fine
	 * name="value" - which is fine
	 * @param input
	 * @param position
	 * @return
	 * @throws DmcValueException  
	 */
	static private NameValuePair parsePart(String input, IntegerVar position, char separator) throws DmcValueException {
		NameValuePair 	rc				= null;
		String 			namePart		= null;
		boolean			haveEquals		= false;
		int 			afterEqualsPos	= -1;
		int 			startPos		= position.intValue();
		
		if (debug)
			System.out.println("-> parsePart i = " + startPos);
		
		for(int i=startPos; i<input.length(); i++){
			if (debug)
				System.out.println("    i = " + i + "  - '" + input.charAt(i) + "'");
			
			if (input.charAt(i) == '"'){
				if (namePart == null){
					// We have something like - hey" - which is wrong
					throw(new DmcValueException("Misplaced double quote (or missing double quote), expecting part of a name or an equals sign." + showErrorLocation(i, input)));
				}
				else if (!haveEquals){
					throw(new DmcValueException("Missing = for value assignment." + showErrorLocation(i, input)));
				}
				// Otherwise, we grab the quoted value
				position.set(i);
				rc = parseQuotedText(input, namePart, position);
				// Note: the position will be set by parseQuotedText()
				break;
			}
			else if (input.charAt(i) == '='){
				haveEquals = true;
				afterEqualsPos = i+1;
				namePart = input.substring(startPos, i);
			}
			else if (input.charAt(i) == separator){
				if (i == startPos){
					if (debug)
						System.out.println("    SEPARATOR AT START");
					// Tricky - we could be in a situation where we had a quoted chunk followed 
					// by a separator e.g. n="value" x="blort"
					//                              ^
					// Or we could be in a situation where we have value::value in which case,
					//                                                   ^
					// we have an empty value location. So we have to look back and see what the previous
					// character was.
					if (i == 0){
						// It's the first character, it's a separator, so there's an empty value at the beginning
						rc = new NameValuePair();
						break;
					}
					else{
						if (input.charAt(i-1) == separator){
							// We have the separator followed by separator, which also means an empty value
							rc = new NameValuePair();
							break;
						}
						else{
							// We just need to advance - let the top level loop take care of it
							if (debug)
								System.out.println("<- parsePart = " + position + "  - '" + input.charAt(position.intValue()) + "'  NULL");
							return(null);
						}
					}
				}
				else if (namePart == null){
					// Okay, all we have is a single separator delimited token, so that's a value - we're done
					namePart = input.substring(startPos, i);
					
					// Now, it could be that we're using some character other than space as a separator, so we could
					// have something like value1::value2:value3 - in which case the name part will be a zero length
					// String. In that case, we'll actually set the value to null so that we can recognize a non existent
					// value.
					
					if (namePart.length() == 0)
						namePart = null;
					
					rc = new NameValuePair(namePart);
					position.set(i);
					break;
				}
				else{
					if (haveEquals){
						if (i > afterEqualsPos){
							// This is fine - we have name=blort\b
							rc = new NameValuePair(namePart,input.substring(afterEqualsPos, i));
							position.set(i);
							break;
						}
						else{
							// We have the name part, which means we had an equals, which means we're missing the value
							// For example: version= 
							throw(new DmcValueException("Missing value after equals (=) - no spaces allowed on either side of equals." + showErrorLocation(i, input)));
						}
					}
				}
			}
		}
		
		if (rc == null){
			// We've run out of input, which may be fine
			if (namePart == null){
				// we just have a value
				rc = new NameValuePair(input.substring(startPos));
				position.set(input.length());
			}
			else{
				if (haveEquals){
					if (afterEqualsPos >= input.length()){
						// We had the name part, which means we had equals, but we've run out of input, so the value is missing
						throw(new DmcValueException("Missing value after = " + showErrorLocation(input.length(), input)));
					}
					else{
						// We have the name and equals, take everything after the equals as the value
						rc = new NameValuePair(namePart,input.substring(afterEqualsPos));
						position.set(input.length());
					}
				}
			}
		}
		
		if (debug){
			if (position.intValue() < input.length())
				System.out.println("<- parsePart = " + position + "  - '" + input.charAt(position.intValue()) + "'");
			else
				System.out.println("<- parsePart = " + position + "  - <EOL>");
		}

		return(rc);
	}
	
	static private String showErrorLocation(int position, String input){
		StringBuffer sb = new StringBuffer("\n" + input + "\n");
		for(int i=0; i< position; i++){
			sb.append(" ");
		}
		sb.append("^");
		return(sb.toString());
	}
}
