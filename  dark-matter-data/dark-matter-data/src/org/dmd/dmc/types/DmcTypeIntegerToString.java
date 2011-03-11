package org.dmd.dmc.types;

import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeIntegerToString class provides hashed attribute support for mapping Integers to Strings.
 */
@SuppressWarnings("serial")
public class DmcTypeIntegerToString extends DmcHashedAttribute<IntegerToString> {
	
	public DmcTypeIntegerToString(){
		
	}

	@Override
	public void deserializeHM(DmcInputStreamIF dos) throws Exception {
		if (tm == null)
			tm = new TreeMap<Object, IntegerToString>();
		IntegerToString its = readIt(dos);
		tm.put(its.getKey(), its);
	}

	@Override
	public void deserializeTM(DmcInputStreamIF dos) throws Exception {
		if (tm == null)
			tm = new TreeMap<Object, IntegerToString>();
		IntegerToString its = readIt(dos);
		tm.put(its.getKey(), its);
	}

	@Override
	protected IntegerToString cloneValue(IntegerToString original) {
		return (new IntegerToString(original.key,original.value));
	}

	@Override
	public void deserializeMV(DmcInputStreamIF dos) throws Exception {
		if (mv == null)
			mv = new ArrayList<IntegerToString>();
		mv.add(readIt(dos));
	}

	@Override
	public void deserializeSV(DmcInputStreamIF dos) throws Exception {
		sv = readIt(dos);
	}

	IntegerToString readIt(DmcInputStreamIF dos) throws Exception {
		Integer i = dos.readInt();
		String  s = dos.readUTF();
		return(new IntegerToString(i,s));
	}
	
	@Override
	protected DmcAttribute<?> getOneOfMe() {
		return(new DmcTypeIntegerToString());
	}

	@Override
	public String getString() {
		String rc = null;
		StringBuffer sb = null;
		switch(attrInfo.valueType){
		case SINGLE:
			rc = sv.toString();
			break;
		case MULTI:
			sb = new StringBuffer();
			for(IntegerToString its: mv){
				sb.append(its + ", ");
			}
			rc = sb.toString();
			break;
		case HASHMAPPED:
			sb = new StringBuffer();
			for(IntegerToString its: hm.values()){
				sb.append(its + ", ");
			}
			rc = sb.toString();
			break;
		case SORTMAPPED:
			sb = new StringBuffer();
			for(IntegerToString its: tm.values()){
				sb.append(its + ", ");
			}
			rc = sb.toString();
			break;
		}
		return(rc);
	}

	@Override
	public void serializeType(DmcOutputStreamIF dos) throws Exception {
		switch(attrInfo.valueType){
		case SINGLE:
			dos.writeInt(sv.key);
			dos.writeUTF(sv.value);
			break;
		case MULTI:
			for(IntegerToString its: mv){
				dos.writeInt(its.key);
				dos.writeUTF(its.value);
			}
			break;
		case HASHMAPPED:
			for(IntegerToString its: hm.values()){
				dos.writeInt(its.key);
				dos.writeUTF(its.value);
			}
			break;
		case SORTMAPPED:
			for(IntegerToString its: tm.values()){
				dos.writeInt(its.key);
				dos.writeUTF(its.value);
			}
			break;
		}
		
	}

	@Override
	protected IntegerToString typeCheck(Object value) throws DmcValueException {
		IntegerToString rc = null;
		
		if (value instanceof IntegerToString){
			rc = (IntegerToString) value;
		}
		else if (value instanceof String){
			String v = (String) value;
			Integer	intValue = null;
			int space = v.indexOf(" ");
			if (space == -1){
	            throw(new DmcValueException("Expecting integer followed by a string for IntegerToString"));
			}
			
			String intPart = v.substring(0,space);
			try{
				intValue = Integer.valueOf(intPart);
        	}
        	catch(NumberFormatException e){
        		throw(new DmcValueException("Invalid Integer value: " + intPart));
        	}
			
        	if ( (space+1) == v.length()){
        		throw(new DmcValueException("Missing string value for IntegerToString"));
        	}
        	
        	rc = new IntegerToString(intValue,v.substring(space+1));
		}
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with IntegerToString expected."));
        }
		
		return(rc);
	}

}
