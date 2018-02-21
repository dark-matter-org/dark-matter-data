//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.GPBFieldTypeEnum;    // DmcType import
/**
 * The DmcTypeGPBFieldTypeEnumSV provides storage for a single-valued GPBFieldTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1994)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:591)
 */
@SuppressWarnings("serial")
public class DmcTypeGPBFieldTypeEnumSV extends DmcTypeGPBFieldTypeEnum implements Serializable {
    
    protected GPBFieldTypeEnum value;
    
    public DmcTypeGPBFieldTypeEnumSV(){
    
    }
    
    public DmcTypeGPBFieldTypeEnumSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeGPBFieldTypeEnumSV getNew(){
        return(new DmcTypeGPBFieldTypeEnumSV(getAttributeInfo()));
    }
    
    public DmcTypeGPBFieldTypeEnumSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeGPBFieldTypeEnumSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2026)
    public DmcAttribute<GPBFieldTypeEnum> cloneIt(){
        DmcTypeGPBFieldTypeEnumSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2037)
    public GPBFieldTypeEnum getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2049)
    public GPBFieldTypeEnum set(Object v) throws DmcValueException {
        GPBFieldTypeEnum rc = typeCheck(v);
        // We only return a value if the value actually changed. This supports
        // the applyModifier() mechanism on DmcObject where we only return true
        // if something changed as a result of the modifier
        if (value == null)
            value = rc;
        else{
            if (value.equals(rc))
                rc = null;
            else
                value = rc;
        }
        return(rc);
    }
    
    @Override
    public GPBFieldTypeEnum getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

