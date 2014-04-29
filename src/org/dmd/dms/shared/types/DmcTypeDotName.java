//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

/**
 * The DmcTypeDotName class provides support for simple, DotName names for objects.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDotName extends DmcTypeDmcHierarchicObjectName<DotName> implements Serializable {
	
	public DmcTypeDotName(){
		
	}

	public DmcTypeDotName(DmcAttributeInfo ai){
		super(ai);
	}
		
	////////////////////////////////////////////////////////////////////////////////
	// DmcAttribute abstract overrides

	@Override
	public DotName typeCheck(Object value) throws DMFeedbackSet {
		DotName rc = null;
		
		if (value instanceof DotName){
			rc = (DotName) value;
		}
		else if (value instanceof String){
			rc =  new DotName((String) value);
		}
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with DotName or String expected."));
        }

		return rc;
	}

	@Override
	public DotName cloneValue(DotName original) {
		return (DotName) (original.cloneIt());
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
	/**
	 * Write a DotName.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
	 */
    public void serializeValue(DmcOutputStreamIF dos, DotName value) throws Exception {
    	dos.writeUTF(value.getNameString());
    }

    /**
     * Read a DotName.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public DotName deserializeValue(DmcInputStreamIF dis) throws Exception {
    	return(new DotName(dis.readUTF()));
    }

}
