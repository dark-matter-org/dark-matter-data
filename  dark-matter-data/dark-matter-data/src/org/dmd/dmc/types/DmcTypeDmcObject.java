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
import org.dmd.dmc.DmcContainerIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeDmcObject type is meant to refer to raw DmcObjects. The typeCheck() will
 * accept DmcObjects or a DmcContainerIF.
 */
@SuppressWarnings("serial")
public class DmcTypeDmcObject extends DmcAttribute<DmcObject> {
	
	/**
	 * Constructs a new Long attribute.
	 */
	public DmcTypeDmcObject(){
	}
	
	protected DmcObject typeCheck(Object value) throws DmcValueException {
		DmcObject rc = null;
		
        if (value instanceof DmcObject){
            rc = (DmcObject)value;
        }
        else if (value instanceof DmcContainerIF){
            rc = ((DmcContainerIF)value).getDmcObject();
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DmcObject/DmcContainerIF expected."));
        }
        
        return(rc);
	}

	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (DmcObject d : mv){
				sb.append(d + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}

	}

	@Override
	protected DmcObject cloneValue(DmcObject original) {
		System.out.println("\n\n***\n\nAround and around we go... Haven't implemnted object cloning yet\n\n\n***\n\n\n");
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DmcAttribute getOneOfMe() {
		return(new DmcTypeDmcObject());
	}

}
