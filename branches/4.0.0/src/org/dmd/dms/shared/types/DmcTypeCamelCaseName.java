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

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;
import org.dmd.core.schema.DmcAttributeInfo;

/**
 * The DmcTypeCamelCaseName class provides support for camelCase based names for things.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeCamelCaseName extends DmcTypeDmcObjectName<CamelCaseName> implements Serializable {
	
	public DmcTypeCamelCaseName(){
		
	}

	public DmcTypeCamelCaseName(DmcAttributeInfo ai){
		super(ai);
	}
		
    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	public CamelCaseName typeCheck(Object value) throws DMFeedbackSet {
		CamelCaseName rc = null;
		
		if (value instanceof CamelCaseName){
			rc = (CamelCaseName) value;
		}
		else if (value instanceof String){
			rc =  new CamelCaseName((String) value);
		}
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with CamelCaseName or String expected."));
        }

		return rc;
	}

	@Override
	public CamelCaseName cloneValue(CamelCaseName original) {
		return(new CamelCaseName(original));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a CamelCaseName.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, CamelCaseName value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a CamelCaseName.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public CamelCaseName deserializeValue(DmcInputStreamIF dis) throws Exception {
    	CamelCaseName rc = new CamelCaseName();
        rc.deserializeIt(dis);
        return(rc);
    }

}
