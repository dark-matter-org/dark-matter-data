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
package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
abstract public class DmcTypeUUIDLite extends DmcAttribute<UUIDLite> implements Serializable {
	
	/**
	 * Constructs a new UUIDLite attribute.
	 */
	public DmcTypeUUIDLite(){
	}
	
	public DmcTypeUUIDLite(DmcAttributeInfo ai){
		super(ai);
	}
		
    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	protected UUIDLite typeCheck(Object value) throws DmcValueException {
		UUIDLite rc = null;
		
		if (value instanceof UUIDLite)
			rc = (UUIDLite)value;
		else if (value instanceof String)
			rc = new UUIDLite((String)value);
		else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with UUIDLite or String expected."));
		
		return(rc);
	}

	@Override
	protected UUIDLite cloneValue(UUIDLite original) {
		return(new UUIDLite(original));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a UUIDLite.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, UUIDLite value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a UUIDLite.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public UUIDLite deserializeValue(DmcInputStreamIF dis) throws Exception {
    	UUIDLite rc = new UUIDLite();
        rc.deserializeIt(dis);
        return(rc);
    }

}
