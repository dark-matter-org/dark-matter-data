//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.DmcAttribute;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;
import org.dmd.core.schema.DmcAttributeInfo;

/**
 * The DmcTypeAttributeID type stores integer identifiers of AttributeDefinitions.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeAttributeID extends DmcAttribute<AttributeID> implements Serializable {
	
	/**
	 * Constructs a new AttributeID attribute.
	 */
	public DmcTypeAttributeID(){
	}
	
	public DmcTypeAttributeID(DmcAttributeInfo ai){
		super(ai);
	}
		
	////////////////////////////////////////////////////////////////////////////////
	// DmcAttribute abstract overrides

	public AttributeID typeCheck(Object value) throws DMFeedbackSet {
		AttributeID rc = null;
		
        if (value instanceof AttributeID){
            rc = (AttributeID)value;
        }
        else if (value instanceof String){
        	rc = new AttributeID((String)value);
        }
        else if (value instanceof DmcAttributeInfo){
        	rc = new AttributeID((DmcAttributeInfo)value);
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with AttributeID/DmcAttributeInfo/String expected."));
        }
        
        return(rc);
	}

	@Override
	public AttributeID cloneValue(AttributeID original) {
		return(new AttributeID(original));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a Integer.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, AttributeID value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a Integer.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public AttributeID deserializeValue(DmcInputStreamIF dis) throws Exception {
    	AttributeID rc = new AttributeID();
    	rc.deserializeIt(dis);
    	return(rc);
    }

}
