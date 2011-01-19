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

@SuppressWarnings("serial")
public class DmcTypeModifier extends DmcAttribute<Modifier> {

	protected Modifier typeCheck(Object value) throws DmcValueException {
		Modifier rc = null;
		
        if (value instanceof Modifier){
            rc = (Modifier)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	
        	rc = new Modifier(v);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Modifier expected."));
        }
        
        return(rc);
	}

	@Override
	public String getString() {
		if (sv == null){
			if (mv == null)
				return("");
			
			StringBuffer sb = new StringBuffer();
			for (Modifier e : mv){
				sb.append(e + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}
	}

	@Override
	protected Modifier cloneValue(Modifier original) {
		return(new Modifier(original));
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DmcAttribute getOneOfMe() {
		return(new DmcTypeModifier());
	}

}
