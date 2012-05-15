package org.dmd.dmc.types;

import java.util.ArrayList;

public class CheapSplitter {

	/**
	 * Splits the string on the specified separator character. Optionally, you can have
	 * the separators returned as well.
	 * @param value The string to be split.
	 * @param sep The separator character.
	 * @param returnSep A flag to indicate if you want the separators back in the return value.
	 * @param trimTokens If true, the values between the separators will be trimmed() before being
	 * added to the result array.
	 * @return And array of strings (and possibly the separators).
	 */
	static public ArrayList<String> split(String value, char sep, boolean returnSep, boolean trimTokens){
		ArrayList<String> rc = new ArrayList<String>();
		
		String separator	= "" + sep;
		int spos 			= value.indexOf(separator);
		String remainder 	= value;
		
		while(true){
			spos = remainder.indexOf(separator);
			
			if (spos == -1){
				if (trimTokens)
					rc.add(remainder.trim());
				else
					rc.add(remainder);
				break;
			}
			else{
				if (remainder.startsWith(separator)){
					if (returnSep)
						rc.add(separator);
					if (remainder.length() == 1)
						break;
					remainder = remainder.substring(1);
				}
				else{
					if (trimTokens)
						rc.add(remainder.substring(0,spos).trim());
					else
						rc.add(remainder.substring(0,spos));
					
					if ( (spos + 1) == remainder.length()){
						if (returnSep)
							rc.add(separator);
						remainder = "";
						break;
					}
					
					if (returnSep)
						rc.add(separator);

					remainder = remainder.substring(spos+1);
				}
			}
		}
		
		return(rc);
	}
}
