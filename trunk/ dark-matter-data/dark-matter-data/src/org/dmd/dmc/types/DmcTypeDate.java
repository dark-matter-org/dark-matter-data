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

import java.util.Date;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeDate type is meant to store Date values. The set/add interfaces will accept
 * Dates and Long values that represent valid Dates or Strings that represent valid Long values.
 */
@SuppressWarnings("serial")
public class DmcTypeDate extends DmcAttribute<Date> {
	
	/**
	 * Constructs a new Long attribute.
	 */
	public DmcTypeDate(){
		new Date();
	}
	
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
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (Date d : mv){
				sb.append(d + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}

	}

	@Override
	protected Date cloneValue(Date original) {
		return(new Date(original.getTime()));
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DmcAttribute getOneOfMe() {
		return(new DmcTypeDate());
	}

}
