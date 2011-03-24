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

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeBoolean;    // base type import
/**
 * The DmcTypeBooleanSV provides storage for a single-valued Boolean
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1057)
 */
@SuppressWarnings("serial")
public class DmcTypeBooleanSV extends DmcTypeBoolean {
    
    Boolean value;
    
    public DmcTypeBooleanSV(){
    
    }
    
    public DmcTypeBooleanSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeBooleanSV getNew(){
        return(new DmcTypeBooleanSV(attrInfo));
    }
    
    public Boolean set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public Boolean getSV(){
        return(value);
    }
    
}

