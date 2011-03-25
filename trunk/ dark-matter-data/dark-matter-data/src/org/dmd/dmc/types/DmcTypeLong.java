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

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcLong type is meant to store Long values. The set/add interfaces
 * will accept Long, Integer and String values that represent valid Longs.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeLong extends DmcAttribute<Long> {
	
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

	protected Long typeCheck(Object value) throws DmcValueException {
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
        		throw(new DmcValueException("Invalid Long value: " + v));
        	}
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Long expected."));
        }
        
        return(rc);
	}

	@Override
	protected Long cloneValue(Long original) {
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

    
    
    ////////////////////////////////////////////////////////////////////////////////
    // OBSOLETE
    
//	@Override
//	public String getString() {
//		if (sv == null){
//			StringBuffer sb = new StringBuffer();
//			for (Long d : mv){
//				sb.append(d + ", ");
//			}
//			return(sb.toString());
//		}
//		else{
//			return(sv.toString());
//		}
//
//	}
//
////	@Override
////	protected DmcAttribute<?> getOneOfMe() {
////		return(new DmcTypeLong());
////	}
//
//	////////////////////////////////////////////////////////////////////////////////
//	// Serialization
//	
//	@Override
//    public void serializeType(DmcOutputStreamIF dos) throws Exception {
//    	if (sv == null){
//			for (Long d : mv){
//				dos.writeLong(d);
//			}
//    	}
//    	else{
//    		dos.writeLong(sv);
//    	}
//    }
//	
//	@Override
//    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
//    	sv = new Long(dis.readLong());
//    }
//
//	@Override
//    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
//		if (mv == null)
//			mv = new ArrayList<Long>();
//		
//    	mv.add(new Long(dis.readLong()));
//    }


}
