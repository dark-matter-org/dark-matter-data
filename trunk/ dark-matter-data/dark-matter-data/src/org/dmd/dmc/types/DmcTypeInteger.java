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
import org.dmd.dmc.DmcValueException;

/**
 * The DmcInteger type is meant to store Integer values. The set/add interfaces
 * will accept Integer objects and String objects that represent valid Integers.
 */
@SuppressWarnings("serial")
public class DmcTypeInteger extends DmcAttribute<Integer> {
	
	/**
	 * Constructs a new Integer attribute.
	 */
	public DmcTypeInteger(){
	}
	
//	/**
//	 * Constructs a new Integer attribute.
//	 */
//	public DmcTypeInteger(DmcAttributeInfo ai){
//		super(ai);
//	}
	
	protected Integer typeCheck(Object value) throws DmcValueException {
		Integer rc = null;
		
        if (value instanceof Integer){
            rc = (Integer)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	try{
        		rc = Integer.valueOf(v);
        	}
        	catch(NumberFormatException e){
        		throw(new DmcValueException("Invalid Integer value: " + v));
        	}
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Integer expected."));
        }
        
        return(rc);
	}

	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (Integer d : mv){
				sb.append(d + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}

	}

	@Override
	protected Integer cloneValue(Integer original) {
		return(new Integer(original));
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DmcAttribute getOneOfMe() {
		return(new DmcTypeInteger());
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Serialization
	
//	@Override
//    public void serializeType(DmcOutputStreamIF dos) throws Exception {
//    	if (sv == null){
//			for (Integer d : mv){
//				dos.writeInt(d);
//			}
//    	}
//    	else{
//    		dos.writeInt(sv);
//    	}
//    }
//	
//	@Override
//    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
//    	sv = new Integer(dis.readInt());
//    }
//
//	@Override
//    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
//		if (mv == null)
//			mv = new ArrayList<Integer>();
//		
//    	mv.add(new Integer(dis.readInt()));
//    }



}
