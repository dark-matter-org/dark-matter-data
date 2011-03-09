//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

import java.util.ArrayList;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObjectNameAttribute;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeIntegerName class provides support for simple, Integer based names for objects.
 */
@SuppressWarnings("serial")
public class DmcTypeIntegerName extends DmcObjectNameAttribute<IntegerName> {
	
	public DmcTypeIntegerName(){
		
	}

	public DmcTypeIntegerName(DmcAttributeInfo ai){
		super(ai);
	}
		
	@Override
	protected IntegerName cloneValue(IntegerName original) {
		return(new IntegerName(original.name));
	}

	@Override
	public void deserializeMV(DmcInputStreamIF dis) throws Exception {
		if (mv == null)
			mv = new ArrayList<IntegerName>();
		
		IntegerName in = new IntegerName();
		in.deserializeIt(dis);
		mv.add(in);		
	}

	@Override
	public void deserializeSV(DmcInputStreamIF dis) throws Exception {
		sv = new IntegerName();
		sv.deserializeIt(dis);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DmcAttribute getOneOfMe() {
		return(new DmcTypeIntegerName());
	}

	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (IntegerName d : mv){
				sb.append(d.name.toString() + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.name.toString());
		}
	}

	@Override
	public void serializeType(DmcOutputStreamIF dos) throws Exception {
    	if (sv == null){
			for (IntegerName d : mv){
				d.serializeIt(dos);
			}
    	}
    	else{
    		sv.serializeIt(dos);
    	}
	}

	@Override
	protected IntegerName typeCheck(Object value) throws DmcValueException {
		IntegerName rc = null;
		
		if (value instanceof IntegerName){
			rc = (IntegerName) value;
		}
		else if (value instanceof Integer){
			rc =  new IntegerName((Integer) value);
		}
		else if (value instanceof String){
        	try{
        		Integer n = Integer.valueOf((String) value);
        		rc =  new IntegerName(n);
        	}
        	catch(NumberFormatException e){
        		throw(new DmcValueException("Invalid IntegerName value: " + value.toString()));
        	}
		}
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with IntegerName expected."));
        }

		return rc;
	}

}
