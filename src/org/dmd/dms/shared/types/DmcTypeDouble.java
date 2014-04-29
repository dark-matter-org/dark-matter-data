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
 * The DmcDouble type is meant to store Double values. The set/add interfaces
 * will accept Double objects and String objects that represent valid Doubles.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDouble extends DmcAttribute<Double> implements Serializable {
	
	/**
	 * Constructs a new Double attribute.
	 */
	public DmcTypeDouble(){
	}
	
	public DmcTypeDouble(DmcAttributeInfo ai){
		super(ai);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// DmcAttribute abstract overrides

	public Double typeCheck(Object value) throws DMFeedbackSet {
		Double rc = null;
		
        if (value instanceof Double){
            rc = (Double)value;
        }
        else if (value instanceof Integer){
            rc = new Double((Integer)value);
        }
        else if (value instanceof String){
        	String v = (String)value;
        	try{
        		rc = Double.valueOf(v);
        	}
        	catch(NumberFormatException e){
        		throw(new DMFeedbackSet("Invalid Double value: " + v));
        	}
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with Double expected."));
        }
        
        return(rc);
	}

	@Override
	public Double cloneValue(Double original) {
		return(new Double(original));
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
	/**
	 * Write a Double.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
	 */
    public void serializeValue(DmcOutputStreamIF dos, Double value) throws Exception {
    	dos.writeDouble(value);
    }

    /**
     * Read a Double.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public Double deserializeValue(DmcInputStreamIF dis) throws Exception {
    	return(new Double(dis.readDouble()));
    }

}
