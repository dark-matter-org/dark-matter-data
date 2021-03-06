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
 * The DmcTypeIntegerName class provides support for simple, Integer based names for objects.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeIntegerName extends DmcTypeDmcObjectName<IntegerName> implements Serializable {
	
	public DmcTypeIntegerName(){
		
	}

	public DmcTypeIntegerName(DmcAttributeInfo ai){
		super(ai);
	}
		
    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	public IntegerName typeCheck(Object value) throws DmcValueException {
		IntegerName rc = null;
		
		if (value instanceof IntegerName){
			rc = (IntegerName) value;
		}
		else if (value instanceof Integer){
			rc =  new IntegerName((Integer) value);
		}
		else if (value instanceof String){
        	try{
        		Integer n = Integer.valueOf((String) value);
        		rc =  new IntegerName(n);
        	}
        	catch(NumberFormatException e){
        		throw(new DmcValueException("Invalid IntegerName value: " + value.toString()));
        	}
		}
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with IntegerName expected."));
        }

		return rc;
	}

	@Override
	public IntegerName cloneValue(IntegerName original) {
		return(new IntegerName(original.name));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a IntegerName.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, IntegerName value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a IntegerName.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public IntegerName deserializeValue(DmcInputStreamIF dis) throws Exception {
    	IntegerName rc = new IntegerName();
    	rc.deserializeIt(dis);
        return(rc);
    }

}
