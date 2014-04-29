package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.DmcHashedAttribute;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

/**
 * The DmcTypeIntegerToBoolean class provides hashed attribute support for mapping Integers to Booleans.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeIntegerToBoolean extends DmcHashedAttribute<IntegerToBoolean> implements Serializable {
	
	public DmcTypeIntegerToBoolean(){
		
	}

	public DmcTypeIntegerToBoolean(DmcAttributeInfo ai){
		super(ai);
	}

    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	public IntegerToBoolean typeCheck(Object value) throws DMFeedbackSet {
		IntegerToBoolean rc = null;
		
		if (value instanceof IntegerToBoolean){
			rc = (IntegerToBoolean) value;
		}
		else if (value instanceof Integer){
			rc = new IntegerToBoolean((Integer)value);
		}
		else if (value instanceof String){
			String v = (String) value;
			Integer	intValue = null;
			int space = v.indexOf(" ");
			if (space == -1){
	            throw(new DMFeedbackSet("Expecting integer followed by a boolean for IntegerToBoolean"));
			}
			
			String intPart = v.substring(0,space);
			try{
				intValue = Integer.valueOf(intPart);
        	}
        	catch(NumberFormatException e){
        		throw(new DMFeedbackSet("Invalid Integer value: " + intPart));
        	}
			
        	if ( (space+1) == v.length()){
        		throw(new DMFeedbackSet("Missing boolean value for IntegerToBoolean"));
        	}
        	
        	boolean b = Boolean.parseBoolean(v.substring(space+1));
        	
        	rc = new IntegerToBoolean(intValue,b);
		}
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with IntegerToBoolean expected."));
        }
		
		return(rc);
	}

	@Override
	public IntegerToBoolean cloneValue(IntegerToBoolean original) {
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

}
