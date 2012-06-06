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
 * The DmcTypeLongName class provides support for simple, Long based names for objects.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeLongName extends DmcTypeDmcObjectName<LongName> implements Serializable {
	
	public DmcTypeLongName(){
		
	}

	public DmcTypeLongName(DmcAttributeInfo ai){
		super(ai);
	}
		
    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	public LongName typeCheck(Object value) throws DmcValueException {
		LongName rc = null;
		
		if (value instanceof LongName){
			rc = (LongName) value;
		}
		else if (value instanceof Long){
			rc =  new LongName((Long) value);
		}
		else if (value instanceof Integer){
			rc =  new LongName((Long) value);
		}
		else if (value instanceof String){
        	try{
        		Long n = Long.valueOf((String) value);
        		rc =  new LongName(n);
        	}
        	catch(NumberFormatException e){
        		throw(new DmcValueException("Invalid LongName value: " + value.toString()));
        	}
		}
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with LongName expected."));
        }

		return rc;
	}

	@Override
	public LongName cloneValue(LongName original) {
		return(new LongName(original.name));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a LongName.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, LongName value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a LongName.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public LongName deserializeValue(DmcInputStreamIF dis) throws Exception {
    	LongName rc = new LongName();
    	rc.deserializeIt(dis);
        return(rc);
    }

}
