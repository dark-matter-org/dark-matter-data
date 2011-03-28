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
package org.dmd.dms.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;    // primitive import
/**
 * The DmcTypeValueTypeEnumSV provides storage for a single-valued ValueTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1074)
 *    Called from:  org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:170)
 */
@SuppressWarnings("serial")
public class DmcTypeValueTypeEnumSV extends DmcTypeValueTypeEnum {
    
    ValueTypeEnum value;
    
    public DmcTypeValueTypeEnumSV(){
    
    }
    
    public DmcTypeValueTypeEnumSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeValueTypeEnumSV getNew(){
        return(new DmcTypeValueTypeEnumSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<ValueTypeEnum> cloneIt(){
        DmcTypeValueTypeEnumSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public ValueTypeEnum set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public ValueTypeEnum getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}
