package org.dmd.dmt.shared.types;

import java.io.Serializable;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The KeyedType class is used to exercise functionality associated with types
 * that support the DmcMappedAttributeIF. Mapped types can be used with attributes
 * with valueType TREEMAPPED or HASHMAPPED.
 * <p/>
 * The standard string format for a value of this type is "key value", where the key
 * is the first space delimited string optionally followed by a value.
 */
@SuppressWarnings("serial")
public class KeyedType implements DmcMappedAttributeIF, Serializable {
	
	String key;
	String value;
	
	/**
	 * Mandatory zero arg constructor.
	 */
	public KeyedType() {
		key = null;
		value = null;
	}
	
	/**
	 * Convenience copy constructor.
	 * @param kt the original KeyedType.
	 */
	public KeyedType(KeyedType kt){
		key = new String(kt.key);
		value = new String(kt.value);
	}
	
	public KeyedType(String s){
		String tmp = s.trim();
		
		int spacepos = tmp.indexOf(' ');
		if (spacepos == -1){
			key 	= tmp;
			value 	= null;
		}
		else{
			key = tmp.substring(0, spacepos);
			value = tmp.substring(spacepos + 1);
		}
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	public String getValue(){
		return(value);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(key);
		dos.writeUTF(value);
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		key = dis.readUTF();
		value = dis.readUTF();
	}

	///////////////////////////////////////////////////////////////////////////
	// DmcMappedAttributeIF implementation
	
	@Override
	public Object getKey() {
		return(key);
	}
	
	@Override
	public String getKeyAsString() {
		return(key);
	}
	
	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj) {
		if (obj instanceof KeyedType){
			KeyedType other = (KeyedType) obj;
			
			if (key.equals(other.key)){
				if (value.equals(other.key))
					return(true);
			}
		}
		
		return(false);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof KeyedType)
			return(valuesAreEqual((KeyedType)obj));
		return(false);
	}


	
	

}
