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
package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeUUIDName class provides support for naming of objects by UUIDs.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeUUIDName extends DmcTypeDmcObjectName<UUIDName> implements Serializable {
	
	public DmcTypeUUIDName(){
		
	}

	public DmcTypeUUIDName(DmcAttributeInfo ai){
		super(ai);
	}
		
    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	public UUIDName typeCheck(Object value) throws DmcValueException {
		UUIDName rc = null;
		
		if (value instanceof UUIDName){
			rc = (UUIDName) value;
		}
		else if (value instanceof UUIDLite){
			rc =  new UUIDName((UUIDLite) value);
		}
		else if (value instanceof String){
        	rc =  new UUIDName((String) value);
		}
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with UUIDName, UUIDLite or String expected."));
        }

		return rc;
	}

	@Override
	public UUIDName cloneValue(UUIDName original) {
		return(new UUIDName(original));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a UUIDName.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, UUIDName value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a UUIDName.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public UUIDName deserializeValue(DmcInputStreamIF dis) throws Exception {
    	UUIDName rc = new UUIDName();
        rc.deserializeIt(dis);
        return(rc);
    }


}
