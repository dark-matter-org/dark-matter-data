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
import org.dmd.dms.generated.enums.FilterTypeEnum;    // DmcType import
/**
 * The DmcTypeFilterTypeEnumSV provides storage for a single-valued FilterTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1955)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:558)
 */
@SuppressWarnings("serial")
public class DmcTypeFilterTypeEnumSV extends DmcTypeFilterTypeEnum implements Serializable {
    
    protected FilterTypeEnum value;
    
    public DmcTypeFilterTypeEnumSV(){
    
    }
    
    public DmcTypeFilterTypeEnumSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeFilterTypeEnumSV getNew(){
        return(new DmcTypeFilterTypeEnumSV(getAttributeInfo()));
    }
    
    public DmcTypeFilterTypeEnumSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeFilterTypeEnumSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1987)
    public DmcAttribute<FilterTypeEnum> cloneIt(){
        DmcTypeFilterTypeEnumSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1998)
    public FilterTypeEnum getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2010)
    public FilterTypeEnum set(Object v) throws DmcValueException {
        FilterTypeEnum rc = typeCheck(v);
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
    public FilterTypeEnum getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}
