//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.util.parsing;

import org.dmd.dmc.types.IntegerVar;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.exceptions.ResultSet;

/**
 * The JSONParser will parse a JSON formatted string and produce a set of DmcUncheckedObjects.
 * These unchecked objects may be further processed to create actual DmcObject instances.
 */
public class JSONParser {
	
	// A globally used result set
	ResultSet		rsG;

	/**
	 * Constructs a new JSON parser.
	 */
	public JSONParser(){
		rsG = new ResultSet();
	}
	
	/**
	 * This method parses the specified string and returns an array of objects.
	 * @param input
	 * @return
	 * @throws ResultException
	 */
	public DmcUncheckedObject parse(String input) throws ResultException {
		return(parseObject(input));
	}
	
	/**
	 * This method parses a single JSON formatted object of the form { "attr1": "value1", "attr2": [ "valuea", "valueb" ], "attr3": "value3"... }
	 * @param in
	 * @param objects
	 * @throws ResultException
	 */
	DmcUncheckedObject parseObject(String in) throws ResultException {
		IntegerVar		index 			= new IntegerVar(0);
		boolean 		wantStartCurly 	= true;
		boolean 		wantEndCurly   	= false;
		String 			input 			= in.trim();
		DmcUncheckedObject	basic 			= new DmcUncheckedObject();
		
		// Reset the result set
		rsG.reset();
		
		for(; index.intValue()<input.length(); index.set(index.intValue()+1)){
			
			if (wantStartCurly){
				if (input.charAt(index.intValue()) == '{'){
					wantStartCurly = false;
					index.set(index.intValue()+1);
					parseObject(input, index, basic);
					wantEndCurly = true;
				}
				else{
					// ERROR Expecting {
					ResultException ex = new ResultException();
					ex.addError("Expecting opening bracket for object.");
					throw(ex);
				}
			}
			else if (wantEndCurly){
				eatWhiteSpace(input, index, "end bracket for object");
				
				if (input.charAt(index.intValue()) == '}'){
					// This should be the last character, if not, we have extraneous stuff - and, because 
					// we trimmed the string at the beginning of the process, we know that there's not
					// just whitespace there.
					if ( (input.length()-1) != index.intValue()){
						// ERROR extraneous stuff
						ResultException ex = new ResultException();
						ex.addError("Extraneous characters after object.");
						throw(ex);
					}
					
					// Set this so that we know we were terminated properly
					wantEndCurly = false;
				}
				else{
					// ERROR Expecting }
					ResultException ex = new ResultException();
					ex.addError("Expecting closing bracket for object.");
					throw(ex);
				}
			}
		}
		
		
		
//		// If there were no objects, that's an error too
//		if (objects.size() == 0){
//			// ERROR no objects
//		}
		
		if (wantEndCurly){
			// ERROR: We're missing the end curly brace
			ResultException ex = new ResultException();
			ex.addError("Closing bracket missing.");
			throw(ex);
		}
		
		return(basic);
		
	}
	
	void parseObject(String input, IntegerVar index, DmcUncheckedObject basic) throws ResultException {
		parseAttributes(input,index,basic);
	}
	
	/**
	 * Once we've recognized an object class, we will attempt to read its attributes, which will be
	 * contained in a set of curly braces. Attributes come in two basic forms, single valued and multi
	 * valued. Single valued attributes appear as:
	 * "name": "value" 
	 * Multi-valued attributes are arrays and appear as:
	 * "name": [ "value", "value" ]
	 * If there is another attribute coming, the attribute value will be followed by a comma ",".
	 * @param input   The input string
	 * @param index   The index at which we will start parsing.
	 * @param go      The current object that we are trying to populate with attributes.
	 * @param objects The place where will append new objects if we need to create them.
	 */
	void parseAttributes(String input, IntegerVar index, DmcUncheckedObject basic) throws ResultException {
		
		for(; index.intValue()<input.length(); index.set(index.intValue()+1)){
			
			// We're between the curlies, so we're looking for attributes
			if (parseAttribute(input, index, basic)){
				// After parsing an attribute value, we eat the white space, so, if the
				// value didn't have a comma after it, the current character should be the
				// end bracket.
				if (input.charAt(index.intValue()) == '}'){					
					// We got the terminating bracket for the attributes, we're done, so break
					
					// We back up by one character so that the enclosing parseObject can
					// find the terminating bracket for the object
					index.set(index.intValue()-1);
					break;
				}
				else{
					// ERROR Expecting }
					ResultException ex = new ResultException();
					ex.addError("Expecting closing bracket for object.");
					throw(ex);
				}
			}
			
		}
	}
	
	/**
	 * This function parses a single attribute. When we're finished, the index will be advanced to 
	 * the position of closing character of the last attribute value - this allows the calling
	 * function to pick up processing
	 * @param input The original input string.
	 * @param index 
	 * @param go
	 * @param objects
	 * @return true if the attribute list is finished i.e. if the attribute value DOES NOT have a trailing comma.
	 * @throws ResultException
	 */
	boolean parseAttribute(String input, IntegerVar index, DmcUncheckedObject basic) throws ResultException {
		boolean rc = true;
		String attrName = getColonTerminatedChunk(input, index, "attribute name");
//		ImdAttributeDef ad = null;
//		
//		ad = schema.adef(attrName);
//		
//		if (ad == null){
//			ResultException ex = new ResultException();
//			ex.addError("Unknown attribute: " + attrName);
//			throw(ex);
//		}
		
//		DebugInfo.debug(attrName);
		
//		if(!go.allowsAttribute(ad)){
//			// The object doesn't allow this attribute, complain
//			ResultException ex = new ResultException();
//			ex.addError("Attribute: " + attrName + " is not allowed in objects of class: " + go.getConstructionClass().getName());
//			throw(ex);
//		}
		
		
		if (isMultiValued(input,index))
			parseMVAttribute(input, index, basic, attrName);
		else
			parseSVAttribute(input, index, basic, attrName);
		
//		// The attribute is okay for the object, now, parse it according to whether it's single or multi-valued.
//		if (BooleanVar.equals(true, ad.getIsSingleValued())){
//			parseSVAttribute(input, index, basic, attrName);
//		}
//		else{
//			parseMVAttribute(input, index, basic, attrName);
//		}
		
		// Eat any white space after the value
		eatWhiteSpace(input, index, "value separating comma");
		
		// If we wouldn't go beyond the end of the string, check if the next character is a comma.
		// If so, advance our index to the comma and return false (to indicate that we're not done
		// parsing attributes.
		if (input.charAt(index.intValue()) == ','){
//			index.set(index.intValue()+1);
			rc = false;
		}
		
		return(rc);
	}
	
	/**
	 * This method moves forward to the next available character (eating whitespace as required) and
	 * returns true if the next character is a [ and false otherwise.
	 * @param input
	 * @param index
	 * @return
	 */
	boolean isMultiValued(String input, IntegerVar index){
		boolean rc = false;
		
		for(int i=index.intValue(); i<input.length(); i++){
			if(Character.isWhitespace(input.charAt(i)))
				continue;
			
			if (input.charAt(i) == '[')
				rc = true;
			break;
		}
		return(rc);
	}
	
	/**
	 * This method parses the value for a single valued attribute, which is just a quote delimited string e.g. "value".
	 * @param input
	 * @param index
	 * @param go
	 * @param ad
	 * @throws ResultException
	 */
	void parseSVAttribute(String input, IntegerVar index, DmcUncheckedObject basic, String attrName) throws ResultException {
		String value = getQuotedValue(input, index, "value for attribute: " + attrName);
		
//		if (attrName.equals("objClass")){
//			basic.addClassName(value);
//		}
//		else
			basic.addValue(attrName, value);
	}
	
	/**
	 * This method parses the values for a multi-valued attribute. These values are represented as JSON arrays e.g.
	 * [ "value", "value"... ]
	 * @param input
	 * @param index
	 * @param go
	 * @param ad
	 * @throws ResultException
	 */
	void parseMVAttribute(String input, IntegerVar index, DmcUncheckedObject basic, String attrName) throws ResultException {
		String value = null;
		boolean wantOpenBracket = true;
		
		
		for( ; index.intValue()<input.length(); index.set(index.intValue()+1)){
			if (wantOpenBracket){
				eatWhiteSpace(input, index, "open square bracket for array");
				if (input.charAt(index.intValue()) == '['){
					wantOpenBracket = false;
				}
			}
			else{
				value = getQuotedValue(input, index, "value for attribute: " + attrName);
				
				if (attrName.equals("objectClass")){
					basic.addToClasses(value);
				}
				else
					basic.addValue(attrName, value);
				
				eatWhiteSpace(input, index, "comma or end of array");
				
				if (input.charAt(index.intValue()) == ']'){
					// We've reached the end of the array
					index.set(index.intValue()+1);
					break;
				}
				else if (input.charAt(index.intValue()) == ','){
					// Go around for another attribute
				}
				else{
					// Don't know what the heck this is
					ResultException ex = new ResultException();
					ex.addError("Malformed array - value followed by unrecognized character: " + input.charAt(index.intValue()));
					throw(ex);
				}
			}
		}
	}
	
	/**
	 * This method advances the index past any whitespace characters it finds, starting at the the
	 * current index. If we advance beyond the end of the string, we throw an exception. Obviously,
	 * you only want to call this when you know you're looking for something that should be there.
	 * @param input
	 * @param index 
	 * @param message Indicates what you're looking for
	 * @throws ResultException
	 */
	void eatWhiteSpace(String input, IntegerVar index, String message) throws ResultException {
		for( ;index.intValue()<input.length(); index.set(index.intValue() + 1)){
			if(Character.isWhitespace(input.charAt(index.intValue()))){
				continue;
			}
			else{
				break;
			}
		}
		
		if (index.intValue() == input.length()){
			ResultException ex = new ResultException();
			ex.addError("Ran out of characters while expecting to find: " + message);
			throw(ex);
		}
	}
	
	/**
	 * This method starts at the specified index and grabs the string that should exist between a pair of
	 * double quotes and is terminated by a colon e.g. "somestring":
	 * @param input   The entire input string.
	 * @param index   The index at which we're going to start looking.
	 * @param message The message fragment indicating what we were trying to find e.g. class name, attribute name etc.
	 * @return
	 * @throws ResultException
	 */
	String getColonTerminatedChunk(String input, IntegerVar index, String message) throws ResultException {
		String rc = null;
		int quote1	= -1;
		int quote2	= -1;
		int colon	= -1;
		
		try{
//			quote1 = indexOf(input,"\"",index.intValue()+1,"Expecting open quote: ");
			quote1 = indexOf(input,"\"",index.intValue(),"Expecting open quote: ");
			quote2 = indexOf(input,"\"",quote1+1,"Expecting close quote: ");
			colon  = indexOf(input,":",quote2+1,"Expecting colon after: ");
		}
		catch(ResultException ex){
			ex.result.lastResult().moreMessages("While trying to parse " + message);
			throw(ex);
		}
		
		// Grab the string between the quotes
		rc = input.substring(quote1+1,quote2);
		
		// If it's empty, pitch a fit
		if (rc.length() == 0){
			ResultException ex = new ResultException();
			ex.addError("Empty string while trying to parse " + message + " at index: " + index.intValue() + " in input string: " + input);
			throw(ex);
		}
		
		index.set(colon + 1);
		
		return(rc);
	}
	
	/**
	 * 
	 * @param input
	 * @param index
	 * @param message
	 * @return
	 * @throws ResultException
	 */
	String getQuotedValue(String input, IntegerVar index, String message) throws ResultException {
		String rc = null;
		int quote1	= -1;
		int quote2	= -1;
		
		try{
//			quote1 = indexOf(input,"\"",index.intValue()+1,"Expecting open quote: ");
			quote1 = indexOf(input,"\"",index.intValue(),"Expecting open quote: ");
			quote2 = indexOf(input,"\"",quote1+1,"Expecting close quote: ");
		}
		catch(ResultException ex){
			ex.result.lastResult().moreMessages("While trying to parse " + message);
			throw(ex);
		}
		
		// Grab the string between the quotes
		rc = input.substring(quote1+1,quote2);
		
		// If it's empty, pitch a fit
		if (rc.length() == 0){
			ResultException ex = new ResultException();
			ex.addError("Empty string while trying to parse " + message + " at index: " + index.intValue() + " in input string: " + input);
			throw(ex);
		}
		
		index.set(quote2 + 1);
		
		return(rc);
	}
	
	/**
	 * This method tries to retrieve the index of the specified string after the specified index.
	 * If we can't find the substr, we throw an exception with the specified message.
	 * @param instr
	 * @param substr
	 * @param after
	 * @param message
	 * @return
	 */
	private int indexOf(String instr, String substr, int after, String message) throws ResultException {
		if (after >= instr.length()){
			ResultException ex = new ResultException();
			ex.addError("Ran out of input while trying to find: " + substr + "  at offset: " + after + "  in input string: " + instr );
			throw(ex);
		}
		
		int rc = instr.indexOf(substr,after);
		
		if (rc == -1){
			ResultException ex = new ResultException();
			ex.addError(message + instr);
			throw(ex);
		}
		
		return(rc);
	}
	

}
