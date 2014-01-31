package org.dmd.dmc.util;

/**
 * The NameValuePair class is used to represent a name and a value (strangely enough).
 * The class also allows for a value without a name.
 * 
 */
public class NameValuePair {
	String name;
	String value;
	
	public NameValuePair(String n, String v){
		name = n;
		value = v;
	}
	
	public NameValuePair(String v){
		name = null;
		value = v;
	}
	
	public String toString(){
		if (name == null)
			return("[]=\"" + value + "\"");
		else
			return(name + "=\"" + value + "\"");
	}
	
	public String getName(){
		return(name);
	}
	
	public String getValue(){
		return(value);
	}
}
