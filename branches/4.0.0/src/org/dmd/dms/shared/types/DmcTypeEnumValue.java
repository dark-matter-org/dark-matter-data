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
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

@SuppressWarnings("serial")
abstract public class DmcTypeEnumValue extends DmcAttribute<EnumValue> implements Serializable {

	public DmcTypeEnumValue(){
		
	}
	
	public DmcTypeEnumValue(DmcAttributeInfo ai){
		super(ai);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// DmcAttribute abstract overrides

	public EnumValue typeCheck(Object value) throws DMFeedbackSet {
		EnumValue rc = null;
		
        if (value instanceof EnumValue){
            rc = (EnumValue)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	
        	rc = new EnumValue(v);
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with EnumValue expected."));
        }
        
        return(rc);
	}

	@Override
	public EnumValue cloneValue(EnumValue original) {
		return(new EnumValue(original));
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
	/**
	 * Write a EnumValue.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
	 */
    public void serializeValue(DmcOutputStreamIF dos, EnumValue value) throws Exception {
    	value.serializeIt(dos);
    }

    /**
     * Read a EnumValue.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public EnumValue deserializeValue(DmcInputStreamIF dis) throws Exception {
    	EnumValue rc = new EnumValue();
    	rc.deserializeIt(dis);
    	return(rc);
    }

}
