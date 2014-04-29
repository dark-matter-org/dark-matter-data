package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.DmcHashedAttribute;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

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
	public IntegerToUUIDLite typeCheck(Object value) throws DMFeedbackSet {
		IntegerToUUIDLite rc = null;
		
		if (value instanceof IntegerToUUIDLite){
			rc = (IntegerToUUIDLite) value;
		}
		else if (value instanceof IntegerToUUIDLite){
			rc = new IntegerToUUIDLite((Integer)value);
		}
		else if (value instanceof String){
			String v = (String) value;
			Integer	intValue = null;
			int space = v.indexOf(" ");
			if (space == -1){
	            throw(new DMFeedbackSet("Expecting integer followed by a UUID string for IntegerToUUIDLite"));
			}
			
			String intPart = v.substring(0,space);
			try{
				intValue = Integer.valueOf(intPart);
        	}
        	catch(NumberFormatException e){
        		throw(new DMFeedbackSet("Invalid Integer value: " + intPart));
        	}
			
        	if ( (space+1) == v.length()){
        		throw(new DMFeedbackSet("Missing UUID value for IntegerToUUIDLite"));
        	}
        	
        	UUIDLite uuid = new UUIDLite(v.substring(space+1));
        	
        	rc = new IntegerToUUIDLite(intValue,uuid);
		}
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with IntegerToUUIDLite expected."));
        }
		
		return(rc);
	}

	@Override
	public IntegerToUUIDLite cloneValue(IntegerToUUIDLite original) {
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
