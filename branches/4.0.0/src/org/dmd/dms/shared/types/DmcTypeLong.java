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

/**
 * The DmcLong type is meant to store Long values. The set/add interfaces
 * will accept Long, Integer and String values that represent valid Longs.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeLong extends DmcAttribute<Long> implements Serializable {
	
	/**
	 * Constructs a new Long attribute.
	 */
	public DmcTypeLong(){
	}
	
	public DmcTypeLong(DmcAttributeInfo ai){
		super(ai);
	}
		
    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	public Long typeCheck(Object value) throws DMFeedbackSet {
		Long rc = null;
		
        if (value instanceof Long){
            rc = (Long)value;
        }
        else if (value instanceof Integer){
            rc = new Long((Integer)value);
        }
        else if (value instanceof String){
        	String v = (String)value;
        	try{
        		rc = Long.valueOf(v);
        	}
        	catch(NumberFormatException e){
        		throw(new DMFeedbackSet("Invalid Long value: " + v));
        	}
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with Long expected."));
        }
        
        return(rc);
	}

	@Override
	public Long cloneValue(Long original) {
		return(new Long(original));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a Long.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, Long value) throws Exception {
        dos.writeLong(value);
    }

    /**
     * Read a Long.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public Long deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(new Long(dis.readLong()));
    }

}
