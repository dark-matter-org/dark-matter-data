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
 * The DmcByte type is meant to store Byte values. The set/add interfaces
 * will accept Byte objects and String objects that represent valid Bytes.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeByte extends DmcAttribute<Byte> implements Serializable {
	
	/**
	 * Constructs a new Byte attribute.
	 */
	public DmcTypeByte(){
	}
	
	public DmcTypeByte(DmcAttributeInfo ai){
		super(ai);
	}
		
	////////////////////////////////////////////////////////////////////////////////
	// DmcAttribute abstract overrides

	public Byte typeCheck(Object value) throws DMFeedbackSet {
		Byte rc = null;
		
        if (value instanceof Byte){
            rc = (Byte)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	try{
        		rc = Byte.valueOf(v);
        	}
        	catch(NumberFormatException e){
        		throw(new DMFeedbackSet("Invalid Byte value: " + v));
        	}
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with Byte expected."));
        }
        
        return(rc);
	}

	@Override
	public Byte cloneValue(Byte original) {
		return(new Byte(original));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a Byte.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, Byte value) throws Exception {
        dos.writeByte(value);
    }

    /**
     * Read a Byte.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public Byte deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(new Byte(dis.readByte()));
    }

}
