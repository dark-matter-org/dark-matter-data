package org.dmd.util.parsing;

import java.util.ArrayList;

import org.dmd.dmc.types.IntegerVar;

/**
 * The CSVRowSplitter is designed to parse a CSV line and return a set of Strings
 * that represent the values in each column. In cases where columns are empty, the
 * value string "null" is returned.
 */
public class CSVRowSplitter {

	/**
	 * Splits the string on the specified separator character. Optionally, you can have
	 * the separators returned as well.
	 * @param input The string to be split.
	 * @return An array of strings
	 */
	static public ArrayList<String> split(String row){
		ArrayList<String> rc = new ArrayList<String>();
		
		if ((row == null) || (row.length() == 0))
			return(rc);
		
		String input = row.trim();
		input = input.replaceAll("\"\"", "");
		
		while(true){
			if (input.indexOf(",,") != -1)
				input = input.replaceAll(",,",",null,");
			else
				break;
		}
		if (input.endsWith(","))
			input = input + "null";
		
		IntegerVar position	= new IntegerVar();
		
		int valueStart = 0;
		
		for(int i=0; i<input.length(); i++){
			if (input.charAt(i) == ','){
				if (valueStart == i){
					// We have an empty value
					valueStart++;
				}
				else{
					// Take everything from valueStart up to the current position
					rc.add(input.substring(valueStart, i));
					valueStart = i+1;
				}
			}
			else if (input.charAt(i) == '"'){
				position.set(i);
				rc.add(parseQuotedText(input,position));
				i = position.intValue();
				valueStart = i+1;
			}
		}
		
		if (valueStart < input.length())
			rc.add(input.substring(valueStart));
		
		return(rc);
	}
	
	static String parseQuotedText(String input, IntegerVar position){
		String rc = "";
		
		for(int i=position.intValue() + 1; i<input.length(); i++){
			if (input.charAt(i) == '"'){
				rc = input.substring(position.intValue()+1, i);
				position.set(i);
				break;
			}
		}
		
		return(rc);
	}
}
