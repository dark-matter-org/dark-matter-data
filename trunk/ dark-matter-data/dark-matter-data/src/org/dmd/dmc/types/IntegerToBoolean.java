package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcMappedAttributeIF;

/**
 * The IntegerToString class provides the basis for an attribute that maps an Integer to a String value.
 * It is used by the DmcHashedAttribute derivative, DmcTypeIntegerToString.
 *
 */
@SuppressWarnings("serial")
public class IntegerToBoolean implements DmcMappedAttributeIF, Serializable {
	
	Integer	key;
	Boolean	value;
	
	public IntegerToBoolean(){
		key = null;
		value = null;
	}

	public IntegerToBoolean(Integer k, Boolean v){
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
