//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
 * The DmcTypeDefinitionName class provides support for simple, String based names for objects.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDefinitionName extends DmcTypeDmcObjectName<DefinitionName> implements Serializable {
	
	public DmcTypeDefinitionName(){
		
	}

	public DmcTypeDefinitionName(DmcAttributeInfo ai){
		super(ai);
	}
		
    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	public DefinitionName typeCheck(Object value) throws DmcValueException {
		DefinitionName rc = null;
		
		if (value instanceof DefinitionName){
			rc = (DefinitionName) value;
		}
		else if (value instanceof String){
			rc =  new DefinitionName((String) value);
		}
		else if (value instanceof DotName){
			// This a small hack to allow for resetting the object name in
			// an object reference when generating documentation.
			rc =  new DefinitionName(((DotName) value).getNameString());
		}
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DefinitionName or String expected."));
        }

		return rc;
	}

	@Override
	public DefinitionName cloneValue(DefinitionName original) {
		return(new DefinitionName(original));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a DefinitionName.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, DefinitionName value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a DefinitionName.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public DefinitionName deserializeValue(DmcInputStreamIF dis) throws Exception {
    	DefinitionName rc = new DefinitionName();
        rc.deserializeIt(dis);
        return(rc);
    }

}
