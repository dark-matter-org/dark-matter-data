package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeIntegerToUUIDLite class provides hashed attribute support for mapping Integers to Booleans.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeIntegerToUUIDLite extends DmcHashedAttribute<IntegerToUUIDLite> implements Serializable {
	
	public DmcTypeIntegerToUUIDLite(){
		
	}

	public DmcTypeIntegerToUUIDLite(DmcAttributeInfo ai){
		super(ai);
	}

    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

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

	@Override
	protected IntegerToUUIDLite cloneValue(IntegerToUUIDLite original) {
		return (new IntegerToUUIDLite(original.key,original.value));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a IntegerToUUIDLite.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, IntegerToUUIDLite value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a IntegerToUUIDLite.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public IntegerToUUIDLite deserializeValue(DmcInputStreamIF dis) throws Exception {
    	IntegerToUUIDLite rc = new IntegerToUUIDLite();
        rc.deserializeIt(dis);
        return(rc);
    }

}
