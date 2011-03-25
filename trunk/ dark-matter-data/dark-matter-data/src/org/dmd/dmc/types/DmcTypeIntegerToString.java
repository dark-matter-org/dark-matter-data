package org.dmd.dmc.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeIntegerToString class provides hashed attribute support for mapping Integers to Strings.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeIntegerToString extends DmcHashedAttribute<IntegerToString> {
	
	public DmcTypeIntegerToString(){
		
	}

	public DmcTypeIntegerToString(DmcAttributeInfo ai){
		super(ai);
	}

    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

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

	@Override
	protected IntegerToString cloneValue(IntegerToString original) {
		return (new IntegerToString(original.key,original.value));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a IntegerToString.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, IntegerToString value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a XX.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public IntegerToString deserializeValue(DmcInputStreamIF dis) throws Exception {
    	IntegerToString rc = new IntegerToString();
        rc.deserializeIt(dis);
        return(rc);
    }

    
//    ////////////////////////////////////////////////////////////////////////////////
//    // OBSOLETE
//    
//
//	@Override
//	public void deserializeHM(DmcInputStreamIF dos) throws Exception {
//		if (map == null)
//			map = new TreeMap<Object, IntegerToString>();
//		IntegerToString its = readIt(dos);
//		map.put(its.getKey(), its);
//	}
//
//	@Override
//	public void deserializeTM(DmcInputStreamIF dos) throws Exception {
//		if (map == null)
//			map = new TreeMap<Object, IntegerToString>();
//		IntegerToString its = readIt(dos);
//		map.put(its.getKey(), its);
//	}
//
//	@Override
//	public void deserializeMV(DmcInputStreamIF dos) throws Exception {
//		if (mv == null)
//			mv = new ArrayList<IntegerToString>();
//		mv.add(readIt(dos));
//	}
//
//	@Override
//	public void deserializeSV(DmcInputStreamIF dos) throws Exception {
//		sv = readIt(dos);
//	}
//
//	IntegerToString readIt(DmcInputStreamIF dos) throws Exception {
//		Integer i = dos.readInt();
//		String  s = dos.readUTF();
//		return(new IntegerToString(i,s));
//	}
//	
////	@Override
////	protected DmcAttribute<?> getOneOfMe() {
////		return(new DmcTypeIntegerToString());
////	}
//
//	@Override
//	public String getString() {
//		String rc = null;
//		StringBuffer sb = null;
//		switch(attrInfo.valueType){
//		case SINGLE:
//			rc = sv.toString();
//			break;
//		case MULTI:
//			sb = new StringBuffer();
//			for(IntegerToString its: mv){
//				sb.append(its + ", ");
//			}
//			rc = sb.toString();
//			break;
//		case HASHMAPPED:
//			sb = new StringBuffer();
//			for(IntegerToString its: map.values()){
//				sb.append(its + ", ");
//			}
//			rc = sb.toString();
//			break;
//		case TREEMAPPED:
//			sb = new StringBuffer();
//			for(IntegerToString its: map.values()){
//				sb.append(its + ", ");
//			}
//			rc = sb.toString();
//			break;
//		}
//		return(rc);
//	}
//
//	@Override
//	public void serializeType(DmcOutputStreamIF dos) throws Exception {
//		switch(attrInfo.valueType){
//		case SINGLE:
//			dos.writeInt(sv.key);
//			dos.writeUTF(sv.value);
//			break;
//		case MULTI:
//			for(IntegerToString its: mv){
//				dos.writeInt(its.key);
//				dos.writeUTF(its.value);
//			}
//			break;
//		case HASHMAPPED:
//			for(IntegerToString its: map.values()){
//				dos.writeInt(its.key);
//				dos.writeUTF(its.value);
//			}
//			break;
//		case TREEMAPPED:
//			for(IntegerToString its: map.values()){
//				dos.writeInt(its.key);
//				dos.writeUTF(its.value);
//			}
//			break;
//		}
//		
//	}

}
