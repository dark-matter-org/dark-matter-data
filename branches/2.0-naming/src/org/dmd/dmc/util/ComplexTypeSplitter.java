package org.dmd.dmc.util;

import java.util.ArrayList;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.IntegerVar;

public class ComplexTypeSplitter {

	static public ArrayList<NameValuePair> parse(String initialInput) throws DmcValueException {
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
				rc.add(parsePart(input,position));
        		i = position.intValue();
			}
        }
		
		return(rc);
	}
	
	static private NameValuePair parseQuotedText(String input, String namePart, IntegerVar position) throws DmcValueException {
		NameValuePair rc = null;
		
		if ((position.intValue() + 1) == input.length())
			throw(new DmcValueException("Unmatched \"" + showErrorLocation(position.intValue()+1, input)));
		
		for(int i=position.intValue() + 1; i<input.length(); i++){
			if (input.charAt(i) == '"'){
				rc = new NameValuePair(namePart, input.substring(position.intValue() + 1, i));
				position.set(i);
				break;
			}
		}
		
		if (rc == null)
			throw(new DmcValueException("Unmatched \"" + showErrorLocation(input.length(), input)));
		
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
	static private NameValuePair parsePart(String input, IntegerVar position) throws DmcValueException {
		NameValuePair 	rc				= null;
		String 			namePart		= null;
		boolean			haveEquals		= false;
		int 			afterEqualsPos	= -1;
		int 			startPos		= position.intValue();
		
		for(int i=startPos; i<input.length(); i++){
			if (input.charAt(i) == '"'){
				if (namePart == null){
					// We have something like - hey" - which is wrong
					throw(new DmcValueException("Misplaced double quote, expecting part of a name or an equals sign." + showErrorLocation(i, input)));
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
			else if (input.charAt(i) == ' '){
				if (namePart == null){
					// Okay, all we have is a single space delimited token, so that's a value - we're done
					namePart = input.substring(startPos, i);
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
