package org.dmd.util.codegen;

/**
 * The Manipulator provides a variety of useful functions to manipulate
 * strings and things.
 */
public class Manipulator {

	/**
	 * @param value the string who first letter should be capitalized.
	 * @return take a string like hello and return Hello
	 */
	static public String capFirstChar(String value){
		if (value == null)
			return(null);
    	StringBuffer 	rc 	= new StringBuffer();
    	rc.append(value);
    	rc.setCharAt(0,Character.toUpperCase(rc.charAt(0)));
    	return(rc.toString());
	}
	
	/**
	 * @param value the string who first letter should be lower cased.
	 * @return take a string like Hello and return hello
	 */
	static public String lowerFirstChar(String value){
		if (value == null)
			return(null);
		
    	StringBuffer 	rc 	= new StringBuffer();
    	rc.append(value);
    	rc.setCharAt(0,Character.toLowerCase(rc.charAt(0)));
    	return(rc.toString());
	}
	
	/**
	 * Returns the class or interface name after the last dot in an import statement.
	 * @param value the import statement e.g. org.dmd.dmc.DmcObject
	 * @return the part after the last dot e.g. DmcObject
	 */
	static public String getClassFromImport(String value){
		int lastDot = value.lastIndexOf(".");
		return(value.substring(lastDot+1));
	}

}
