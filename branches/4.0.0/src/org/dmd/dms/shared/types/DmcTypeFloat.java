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
 * The DmcFloat type is meant to store Float values. The set/add interfaces
 * will accept Float objects and String objects that represent valid Floats.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeFloat extends DmcAttribute<Float> implements Serializable {
	
	/**
	 * Constructs a new Float attribute.
	 */
	public DmcTypeFloat(){
	}
	
	public DmcTypeFloat(DmcAttributeInfo ai){
		super(ai);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// DmcAttribute abstract overrides

	public Float typeCheck(Object value) throws DMFeedbackSet {
		Float rc = null;
		
        if (value instanceof Float){
            rc = (Float)value;
        }
        else if (value instanceof Integer){
            rc = (Float)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	try{
        		rc = Float.valueOf(v);
        	}
        	catch(NumberFormatException e){
        		throw(new DMFeedbackSet("Invalid Float value: " + v));
        	}
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with Float expected."));
        }
        
        return(rc);
	}

	@Override
	public Float cloneValue(Float original) {
		return(new Float(original));
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
	/**
	 * Write a Float.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
	 */
    public void serializeValue(DmcOutputStreamIF dos, Float value) throws Exception {
    	dos.writeFloat(value);
    }

    /**
     * Read a Float.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public Float deserializeValue(DmcInputStreamIF dis) throws Exception {
    	return(new Float(dis.readFloat()));
    }

}
