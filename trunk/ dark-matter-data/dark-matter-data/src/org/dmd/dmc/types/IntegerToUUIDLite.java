package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The IntegerToString class provides the basis for an attribute that maps an Integer to a String value.
 * It is used by the DmcHashedAttribute derivative, DmcTypeIntegerToString.
 *
 */
@SuppressWarnings("serial")
public class IntegerToUUIDLite implements DmcMappedAttributeIF, Serializable {
	
	Integer		key;
	UUIDLite	value;
	
	public IntegerToUUIDLite(){
		key 	= null;
		value 	= null;
	}

	public IntegerToUUIDLite(Integer k, UUIDLite v){
		key 	= k;
		value 	= v;
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
		
		return(key.toString() + " " + value.toString());
	}
	
	public UUIDLite getUUID(){
		return(value);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeInt(key);
		dos.writeUTF(value.toString());
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		key = dis.readInt();
		value = new UUIDLite(dis.readUTF());
	}


}
