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
import org.dmd.core.DmcObject;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcContainerIF;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;
import org.dmd.core.schema.DmcAttributeInfo;

/**
 * The DmcTypeDmcObject type is meant to refer to raw DmcObjects. The typeCheck() will
 * accept DmcObjects or a DmcContainerIF.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDmcObject extends DmcAttribute<DmcObject> implements Serializable {
	
	/**
	 * Constructs a new Long attribute.
	 */
	public DmcTypeDmcObject(){
	}
	
	public DmcTypeDmcObject(DmcAttributeInfo ai){
		super(ai);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// DmcAttribute abstract overrides

	public DmcObject typeCheck(Object value) throws DMFeedbackSet {
		DmcObject rc = null;
		
        if (value instanceof DmcObject){
            rc = (DmcObject)value;
        }
        else if (value instanceof DmcContainerIF){
            rc = ((DmcContainerIF)value).getDmcObject();
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with DmcObject/DmcContainerIF expected."));
        }
        
        return(rc);
	}

	@Override
	public DmcObject cloneValue(DmcObject original) {
		System.out.println("\n\n***\n\nAround and around we go... Haven't implemnted object cloning yet\n\n\n***\n\n\n");
		return null;
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
	/**
	 * Write a DmcObject.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
	 */
    public void serializeValue(DmcOutputStreamIF dos, DmcObject value) throws Exception {
    	value.serializeIt(dos);
    }

    /**
     * Read a DmcObject.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public DmcObject deserializeValue(DmcInputStreamIF dis) throws Exception {
//		DmcTypeClassDefinitionREF	oc   = (DmcTypeClassDefinitionREF) dis.getAttributeInstance();
//		oc.deserializeIt(dis);
//    	DmcObject rc = dis.getDMOInstance(oc.getMVnth(0).getObjectName().getNameString());
//    	rc.deserializeIt(dis);
    	DmcObject rc = dis.getDMOInstance(dis);
    	rc.deserializeIt(dis);
    	return(rc);
    }

}
