package org.dmd.core.util;

/**
 * The NameValuePair class is used to represent a name and a value (strangely enough).
 * The class also allows for a value without a name. This is primarily used in parsing
 * the values associated with complex types.
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
		
		if ( (name==null) && (value==null)){
			throw(new IllegalStateException("The name and value for a ParsedNameValuePair can't both be null."));
		}
	}
	
	public ParsedNameValuePair(String v){
		name = null;
		value = v;
		
		if ( (name==null) && (value==null)){
			throw(new IllegalStateException("The name and value for a ParsedNameValuePair can't both be null."));
		}
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
