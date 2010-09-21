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
public class DmcTypeDataTypeEnum extends DmcAttribute<DataTypeEnum>{

    /**
     * Default constructor.
     */
    public DmcTypeDataTypeEnum(){
    }

    protected DataTypeEnum typeCheck(Object value) throws DmcValueException {
        DataTypeEnum rc = null;

        if (value instanceof DataTypeEnum){
            rc = (DataTypeEnum)value;
        }
        else if (value instanceof String){
        		rc = DataTypeEnum.get((String)value);
        		if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid DataTypeEnum value."));
             }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DataTypeEnum expected."));
        }
        return(rc);
    }

    public String getString(){
        if (sv == null){
    	       StringBuffer sb = new StringBuffer();
    	       for (DataTypeEnum t : mv){
    		       sb.append(t + ", ");
    	       }
    	       return(sb.toString());
        }
        else{
    	       return(sv.toString());
        }
    }


}
