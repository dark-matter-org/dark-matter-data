package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.DmcHashedAttribute;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

/**
 * The DmcTypeStringToString class provides hashed attribute support for mapping Integers to Strings.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeStringToString extends DmcHashedAttribute<StringToString> implements Serializable {
	
	public DmcTypeStringToString(){
		
	}

	public DmcTypeStringToString(DmcAttributeInfo ai){
		super(ai);
	}

    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	public StringToString typeCheck(Object value) throws DMFeedbackSet {
		StringToString rc = null;
		
		if (value instanceof StringToString){
			rc = (StringToString) value;
		}
		else if (value instanceof String){
			String v = ((String) value).trim();

			int space = v.indexOf(" ");
			if (space == -1){
	            throw(new DMFeedbackSet("Expecting String followed by a String for StringToString"));
			}
			
			String keyPart = v.substring(0,space);
			
        	if ( (space+1) == v.length()){
        		throw(new DMFeedbackSet("Missing String value for StringToString"));
        	}
        	
        	rc = new StringToString(keyPart,v.substring(space+1).trim());
		}
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with StringToString expected."));
        }
		
		return(rc);
	}

	@Override
	public StringToString cloneValue(StringToString original) {
		return (new StringToString(original.key,original.value));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a StringToString.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, StringToString value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a XX.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public StringToString deserializeValue(DmcInputStreamIF dis) throws Exception {
    	StringToString rc = new StringToString();
        rc.deserializeIt(dis);
        return(rc);
    }

}
