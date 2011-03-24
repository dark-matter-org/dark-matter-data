package org.dmd.dmc.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeIntegerToBoolean class provides hashed attribute support for mapping Integers to Booleans.
 */
@SuppressWarnings("serial")
public class DmcTypeIntegerToBoolean extends DmcHashedAttribute<IntegerToBoolean> {
	
	public DmcTypeIntegerToBoolean(){
		
	}

	public DmcTypeIntegerToBoolean(DmcAttributeInfo ai){
		super(ai);
	}

    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	protected IntegerToBoolean typeCheck(Object value) throws DmcValueException {
		IntegerToBoolean rc = null;
		
		if (value instanceof IntegerToBoolean){
			rc = (IntegerToBoolean) value;
		}
		else if (value instanceof String){
			String v = (String) value;
			Integer	intValue = null;
			int space = v.indexOf(" ");
			if (space == -1){
	            throw(new DmcValueException("Expecting integer followed by a boolean for IntegerToBoolean"));
			}
			
			String intPart = v.substring(0,space);
			try{
				intValue = Integer.valueOf(intPart);
        	}
        	catch(NumberFormatException e){
        		throw(new DmcValueException("Invalid Integer value: " + intPart));
        	}
			
        	if ( (space+1) == v.length()){
        		throw(new DmcValueException("Missing boolean value for IntegerToBoolean"));
        	}
        	
        	boolean b = Boolean.parseBoolean(v.substring(space+1));
        	
        	rc = new IntegerToBoolean(intValue,b);
		}
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with IntegerToBoolean expected."));
        }
		
		return(rc);
	}

	@Override
	protected IntegerToBoolean cloneValue(IntegerToBoolean original) {
		return (new IntegerToBoolean(original.key,original.value));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a IntegerToBoolean.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, IntegerToBoolean value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a IntegerToBoolean.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public IntegerToBoolean deserializeValue(DmcInputStreamIF dis) throws Exception {
    	IntegerToBoolean rc = new IntegerToBoolean();
    	rc.deserializeIt(dis);
        return(rc);
    }

    
    
    ////////////////////////////////////////////////////////////////////////////////
    // OBSOLETE
    
	@Override
	public void deserializeHM(DmcInputStreamIF dos) throws Exception {
		if (map == null)
			map = new HashMap<Object, IntegerToBoolean>();
		IntegerToBoolean its = readIt(dos);
		map.put(its.getKey(), its);
	}

	@Override
	public void deserializeTM(DmcInputStreamIF dos) throws Exception {
		if (map == null)
			map = new TreeMap<Object, IntegerToBoolean>();
		IntegerToBoolean its = readIt(dos);
		map.put(its.getKey(), its);
	}

	@Override
	public void deserializeMV(DmcInputStreamIF dos) throws Exception {
		if (mv == null)
			mv = new ArrayList<IntegerToBoolean>();
		mv.add(readIt(dos));
	}

	@Override
	public void deserializeSV(DmcInputStreamIF dos) throws Exception {
		sv = readIt(dos);
	}

	IntegerToBoolean readIt(DmcInputStreamIF dos) throws Exception {
		Integer i = dos.readInt();
		Boolean  b = dos.readBoolean();
		return(new IntegerToBoolean(i,b));
	}
	
	@Override
	protected DmcAttribute<?> getOneOfMe() {
		return(new DmcTypeIntegerToBoolean());
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
			for(IntegerToBoolean its: mv){
				sb.append(its + ", ");
			}
			rc = sb.toString();
			break;
		case HASHMAPPED:
			sb = new StringBuffer();
			for(IntegerToBoolean its: map.values()){
				sb.append(its + ", ");
			}
			rc = sb.toString();
			break;
		case TREEMAPPED:
			sb = new StringBuffer();
			for(IntegerToBoolean its: map.values()){
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
			dos.writeBoolean(sv.value);
			break;
		case MULTI:
			for(IntegerToBoolean its: mv){
				dos.writeInt(its.key);
				dos.writeBoolean(its.value);
			}
			break;
		case HASHMAPPED:
			for(IntegerToBoolean its: map.values()){
				dos.writeInt(its.key);
				dos.writeBoolean(its.value);
			}
			break;
		case TREEMAPPED:
			for(IntegerToBoolean its: map.values()){
				dos.writeInt(its.key);
				dos.writeBoolean(its.value);
			}
			break;
		}
		
	}

}
