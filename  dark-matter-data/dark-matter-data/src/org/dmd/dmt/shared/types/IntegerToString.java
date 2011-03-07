package org.dmd.dmt.shared.types;

import org.dmd.dmc.DmcMappedAttributeIF;

/**
 * The IntegerToString class is meant to exercise the the hashed attribute value concept.
 * It's key value is an integer and it's value is a String.
 *
 */
public class IntegerToString implements DmcMappedAttributeIF {
	
	Integer	key;
	String	value;
	
	public IntegerToString(){
		key = null;
		value = null;
	}

	public IntegerToString(Integer k, String v){
		key = k;
		value = v;
	}

	@Override
	public Object getKey() {
		return(key);
	}

	@Override
	public String getKeyAsString() {
		if (key == null)
			return("null");
		return(key.toString());
	}

	@Override
	public String toString(){
		if (key == null){
			if (value == null)
				return("null null");
			return("null " + value);
		}
		if (value == null)
			return(key.toString() + " null");
		
		return(key.toString() + " " + value);
	}
}
