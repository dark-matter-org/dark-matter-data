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
package org.dmd.dms.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.*;

@SuppressWarnings("serial")
public class DmcTypeDebugEnum extends DmcAttribute<DebugEnum>{

    /**
     * Default constructor.
     */
    public DmcTypeDebugEnum(){
    }

    protected DebugEnum typeCheck(Object value) throws DmcValueException {
        DebugEnum rc = null;

        if (value instanceof DebugEnum){
            rc = (DebugEnum)value;
        }
        else if (value instanceof String){
        		rc = DebugEnum.get((String)value);
        		if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid DebugEnum value."));
             }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DebugEnum expected."));
        }
        return(rc);
    }

    public String getString(){
        if (sv == null){
    	       StringBuffer sb = new StringBuffer();
    	       for (DebugEnum t : mv){
    		       sb.append(t + ", ");
    	       }
    	       return(sb.toString());
        }
        else{
    	       return(sv.toString());
        }
    }


}
