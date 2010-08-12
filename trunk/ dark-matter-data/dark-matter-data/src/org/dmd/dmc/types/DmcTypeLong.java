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
 * The DmcLong type is meant to store Long values. The set/add interfaces
 * will accept Long, Integer and String values that represent valid Longs.
 */
@SuppressWarnings("serial")
public class DmcTypeLong extends DmcAttribute<Long> {
	
	/**
	 * Constructs a new Long attribute.
	 */
	public DmcTypeLong(){
	}
	
	protected Long typeCheck(Object value) throws DmcValueException {
		Long rc = null;
		
        if (value instanceof Long){
            rc = (Long)value;
        }
        else if (value instanceof Integer){
            rc = (Long)value;
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
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (Long d : mv){
				sb.append(d + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}

	}

}
