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
import org.dmd.dmc.DmcHierarchicObjectNameAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeDotName class provides support for simple, DotName names for objects.
 */
@SuppressWarnings("serial")
public class DmcTypeDotName extends DmcHierarchicObjectNameAttribute<DotName> {
	
	public DmcTypeDotName(){
		
	}

	public DmcTypeDotName(DmcAttributeInfo ai){
		super(ai);
	}
		
	@Override
	protected DotName cloneValue(DotName original) {
		return(new DotName(original.name));
	}

	@Override
	public void deserializeMV(DmcInputStreamIF dis) throws Exception {
		if (mv == null)
			mv = new ArrayList<DotName>();
		
		DotName sn = new DotName();
		sn.deserializeIt(dis);
		mv.add(sn);
	}

	@Override
	public void deserializeSV(DmcInputStreamIF dis) throws Exception {
		sv = new DotName();
		sv.deserializeIt(dis);
	}

	@Override
	protected DmcAttribute<?> getOneOfMe() {
		return(new DmcTypeDotName());
	}

	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (DotName d : mv){
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
			for (DotName d : mv){
				d.serializeIt(dos);
			}
    	}
    	else{
    		sv.serializeIt(dos);
    	}
	}

	@Override
	protected DotName typeCheck(Object value) throws DmcValueException {
		DotName rc = null;
		
		if (value instanceof DotName){
			rc = (DotName) value;
		}
		else if (value instanceof String){
			rc =  new DotName((String) value);
		}
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DotName or String expected."));
        }

		return rc;
	}

}
