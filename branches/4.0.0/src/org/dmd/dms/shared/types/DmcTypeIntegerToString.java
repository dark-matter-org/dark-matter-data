package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.DmcHashedAttribute;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

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
	public IntegerToString typeCheck(Object value) throws DMFeedbackSet {
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
	            throw(new DMFeedbackSet("Expecting integer followed by a string for IntegerToString"));
			}
			
			String intPart = v.substring(0,space);
			try{
				intValue = Integer.valueOf(intPart);
        	}
        	catch(NumberFormatException e){
        		throw(new DMFeedbackSet("Invalid Integer value: " + intPart));
        	}
			
        	if ( (space+1) == v.length()){
        		throw(new DMFeedbackSet("Missing string value for IntegerToString"));
        	}
        	
        	rc = new IntegerToString(intValue,v.substring(space+1));
		}
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with IntegerToString expected."));
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
