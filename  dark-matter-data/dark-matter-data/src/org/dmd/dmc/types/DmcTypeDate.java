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
import java.util.Date;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeDate type is meant to store Date values. The set/add interfaces will accept
 * Dates and Long values that represent valid Dates or Strings that represent valid Long values.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDate extends DmcAttribute<Date> implements Serializable {
	
	/**
	 * Constructs a new Long attribute.
	 */
	public DmcTypeDate(){
	}
	
	public DmcTypeDate(DmcAttributeInfo ai){
		super(ai);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// DmcAttribute abstract overrides

	protected Date typeCheck(Object value) throws DmcValueException {
		Date rc = null;
		
        if (value instanceof Date){
            rc = (Date)value;
        }
        else if (value instanceof Long){
            rc = new Date((Long)value);
        }
        else if (value instanceof String){
        	Long temp = null;
        	try{
        		temp = Long.valueOf((String)value);
        		
        		rc = new Date(temp);
        	}
        	catch(NumberFormatException e){
        		throw(new DmcValueException("Invalid Long value to construct a Date: " + value));
        	}
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Date expected."));
        }
        
        return(rc);
	}

	@Override
	protected Date cloneValue(Date original) {
		return(new Date(original.getTime()));
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
	/**
	 * Write a Boolean.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
	 */
    public void serializeValue(DmcOutputStreamIF dos, Date value) throws Exception {
    	dos.writeLong(value.getTime());
    }

    /**
     * Read a Boolean.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public Date deserializeValue(DmcInputStreamIF dis) throws Exception {
    	return(new Date(dis.readLong()));
    }

    
    
//    ////////////////////////////////////////////////////////////////////////////////
//	// OBSOLETE
//	
////	@Override
////	protected DmcAttribute<?> getOneOfMe() {
////		return(new DmcTypeDate());
////	}
//
//	@Override
//	public String getString() {
//		if (sv == null){
//			StringBuffer sb = new StringBuffer();
//			for (Date d : mv){
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
//	////////////////////////////////////////////////////////////////////////////////
//	// Serialization
//	
//	@Override
//    public void serializeType(DmcOutputStreamIF dos) throws Exception {
//    	if (sv == null){
//			for (Date d : mv){
//				dos.writeLong(d.getTime());
//			}
//    	}
//    	else{
//    		dos.writeLong(sv.getTime());
//    	}
//    }
//	
//	@Override
//    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
//    	sv = new Date(dis.readLong());
//    }
//
//	@Override
//    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
//		if (mv == null)
//			mv = new ArrayList<Date>();
//		
//    	mv.add(new Date(dis.readLong()));
//    }


}
