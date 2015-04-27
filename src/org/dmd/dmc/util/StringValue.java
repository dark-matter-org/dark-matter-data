package org.dmd.dmc.util;

public class StringValue implements AttributeValueIF {
	
	String value;
	
	public StringValue(String v){
		value = v;
	}

	public String getValue(){
		return(value);
	}
}


