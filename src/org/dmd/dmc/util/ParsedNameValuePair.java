package org.dmd.dmc.util;

//import org.dmd.util.exceptions.DebugInfo;

/**
 * The NameValuePair class is used to represent a name and a value (strangely enough).
 * The class also allows for a value without a name.
 * 
 */
public class ParsedNameValuePair {
	String name;
	String value;
	
	public ParsedNameValuePair(){
		name = null;
		value = null;
	}
	
	public ParsedNameValuePair(String n, String v){
		name = n;
		value = v;
		
//		if ( (name==null) && (value==null)){
//			System.out.println(DebugInfo.getCurrentStack());
//		}
	}
	
	public ParsedNameValuePair(String v){
		name = null;
		value = v;
		
//		if ( (name==null) && (value==null)){
//			System.out.println(DebugInfo.getCurrentStack());
//		}
	}
	
	public String toString(){
		if (name == null){
			if (value == null)
				return("\"\"=\"\"");
			else
				return("\"\"=\"" + value + "\"");
		}
		else{
			if (value == null)
				return(name + "=\"\"");
			else
				return(name + "=\"" + value + "\"");
		}
	}
	
	public String getName(){
		return(name);
	}
	
	public String getValue(){
		return(value);
	}
}
