package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeIntegerToString class provides hashed attribute support for mapping Integers to Strings.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeIntegerToString extends DmcHashedAttribute<IntegerToString> implements Serializable {
	
	public DmcTypeIntegerToString(){
		
	}

	public DmcTypeIntegerToString(DmcAttributeInfo ai){
		super(ai);
	}

    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	public IntegerToString typeCheck(Object value) throws DmcValueException {
		IntegerToString rc = null;
		
		if (value instanceof IntegerToString){
			rc = (IntegerToString) value;
		}
		else if (value instanceof Integer){
			rc = new IntegerToString((Integer)value);
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
	public IntegerToString cloneValue(IntegerToString original) {
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

}
