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
 * The DmcTypeStringName class provides support for simple, String based names for objects.
 */
@SuppressWarnings("serial")
public class DmcTypeStringName extends DmcObjectNameAttribute<StringName> {
	
	public DmcTypeStringName(){
		
	}

	public DmcTypeStringName(DmcAttributeInfo ai){
		super(ai);
	}
		
	@Override
	protected StringName cloneValue(StringName original) {
		return(new StringName(original.name));
	}

	@Override
	public void deserializeMV(DmcInputStreamIF dis) throws Exception {
		if (mv == null)
			mv = new ArrayList<StringName>();
		
		StringName sn = new StringName();
		sn.deserializeIt(dis);
		mv.add(sn);
	}

	@Override
	public void deserializeSV(DmcInputStreamIF dis) throws Exception {
		sv = new StringName();
		sv.deserializeIt(dis);
	}

	@Override
	protected DmcAttribute<?> getOneOfMe() {
		return(new DmcTypeStringName());
	}

	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (StringName d : mv){
				sb.append(d.name + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.name);
		}
	}

	@Override
	public void serializeType(DmcOutputStreamIF dos) throws Exception {
    	if (sv == null){
			for (StringName d : mv){
				d.serializeIt(dos);
			}
    	}
    	else{
    		sv.serializeIt(dos);
    	}
	}

	@Override
	protected StringName typeCheck(Object value) throws DmcValueException {
		StringName rc = null;
		
		if (value instanceof StringName){
			rc = (StringName) value;
		}
		else if (value instanceof String){
			rc =  new StringName((String) value);
		}
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with StringName or String expected."));
        }

		return rc;
	}

}
