package org.dmd.dmc.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeIntegerToUUIDLite class provides hashed attribute support for mapping Integers to Booleans.
 */
@SuppressWarnings("serial")
public class DmcTypeIntegerToUUIDLite extends DmcHashedAttribute<IntegerToUUIDLite> {
	
	public DmcTypeIntegerToUUIDLite(){
		
	}

	@Override
	public void deserializeHM(DmcInputStreamIF dos) throws Exception {
		if (map == null)
			map = new HashMap<Object, IntegerToUUIDLite>();
		IntegerToUUIDLite its = readIt(dos);
		map.put(its.getKey(), its);
	}

	@Override
	public void deserializeTM(DmcInputStreamIF dos) throws Exception {
		if (map == null)
			map = new TreeMap<Object, IntegerToUUIDLite>();
		IntegerToUUIDLite its = readIt(dos);
		map.put(its.getKey(), its);
	}

	@Override
	protected IntegerToUUIDLite cloneValue(IntegerToUUIDLite original) {
		return (new IntegerToUUIDLite(original.key,original.value));
	}

	@Override
	public void deserializeMV(DmcInputStreamIF dos) throws Exception {
		if (mv == null)
			mv = new ArrayList<IntegerToUUIDLite>();
		mv.add(readIt(dos));
	}

	@Override
	public void deserializeSV(DmcInputStreamIF dos) throws Exception {
		sv = readIt(dos);
	}

	IntegerToUUIDLite readIt(DmcInputStreamIF dos) throws Exception {
		Integer i = dos.readInt();
		Long msb = dos.readLong();
		Long lsb = dos.readLong();
		return(new IntegerToUUIDLite(i,new UUIDLite(msb, lsb)));
	}
	
	@Override
	protected DmcAttribute<?> getOneOfMe() {
		return(new DmcTypeIntegerToUUIDLite());
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
			for(IntegerToUUIDLite its: mv){
				sb.append(its + ", ");
			}
			rc = sb.toString();
			break;
		case HASHMAPPED:
			sb = new StringBuffer();
			for(IntegerToUUIDLite its: map.values()){
				sb.append(its + ", ");
			}
			rc = sb.toString();
			break;
		case SORTMAPPED:
			sb = new StringBuffer();
			for(IntegerToUUIDLite its: map.values()){
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
			dos.writeLong(sv.getUUID().getMostSignificantBits());
			dos.writeLong(sv.getUUID().getLeastSignificantBits());
			break;
		case MULTI:
			for(IntegerToUUIDLite its: mv){
				dos.writeInt(its.key);
				dos.writeLong(its.getUUID().getMostSignificantBits());
				dos.writeLong(its.getUUID().getLeastSignificantBits());
			}
			break;
		case HASHMAPPED:
			for(IntegerToUUIDLite its: map.values()){
				dos.writeInt(its.key);
				dos.writeLong(its.getUUID().getMostSignificantBits());
				dos.writeLong(its.getUUID().getLeastSignificantBits());
			}
			break;
		case SORTMAPPED:
			for(IntegerToUUIDLite its: map.values()){
				dos.writeInt(its.key);
				dos.writeLong(its.getUUID().getMostSignificantBits());
				dos.writeLong(its.getUUID().getLeastSignificantBits());
			}
			break;
		}
		
	}

	@Override
	protected IntegerToUUIDLite typeCheck(Object value) throws DmcValueException {
		IntegerToUUIDLite rc = null;
		
		if (value instanceof IntegerToUUIDLite){
			rc = (IntegerToUUIDLite) value;
		}
		else if (value instanceof String){
			String v = (String) value;
			Integer	intValue = null;
			int space = v.indexOf(" ");
			if (space == -1){
	            throw(new DmcValueException("Expecting integer followed by a UUID string for IntegerToUUIDLite"));
			}
			
			String intPart = v.substring(0,space);
			try{
				intValue = Integer.valueOf(intPart);
        	}
        	catch(NumberFormatException e){
        		throw(new DmcValueException("Invalid Integer value: " + intPart));
        	}
			
        	if ( (space+1) == v.length()){
        		throw(new DmcValueException("Missing UUID value for IntegerToUUIDLite"));
        	}
        	
        	UUIDLite uuid = new UUIDLite(v.substring(space+1));
        	
        	rc = new IntegerToUUIDLite(intValue,uuid);
		}
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with IntegerToUUIDLite expected."));
        }
		
		return(rc);
	}

}
