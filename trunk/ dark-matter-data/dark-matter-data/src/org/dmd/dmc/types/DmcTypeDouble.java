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

	protected Double typeCheck(Object value) throws DmcValueException {
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
        		throw(new DmcValueException("Invalid Double value: " + v));
        	}
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Double expected."));
        }
        
        return(rc);
	}

	@Override
	protected Double cloneValue(Double original) {
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

    
    
//	////////////////////////////////////////////////////////////////////////////////
//	// OBSOLETE
//
//    
//    @Override
//	public String getString() {
//		if (sv == null){
//			StringBuffer sb = new StringBuffer();
//			for (Double d : mv){
//				sb.append(d + ", ");
//			}
//			return(sb.toString());
//		}
//		else{
//			return(sv.toString());
//		}
//	}
//
////	@Override
////	protected DmcAttribute<?> getOneOfMe() {
////		return(new DmcTypeDouble());
////	}
//
//	
//	////////////////////////////////////////////////////////////////////////////////
//	// Serialization
//	
//	@Override
//    public void serializeType(DmcOutputStreamIF dos) throws Exception {
//    	if (sv == null){
//			for (Double d : mv){
//				dos.writeDouble(d);
//			}
//    	}
//    	else{
//    		dos.writeDouble(sv);
//    	}
//    }
//	
//	@Override
//    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
//    	sv = new Double(dis.readDouble());
//    }
//
//	@Override
//    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
//		if (mv == null)
//			mv = new ArrayList<Double>();
//		
//    	mv.add(new Double(dis.readDouble()));
//    }


}
