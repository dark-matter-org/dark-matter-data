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

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.ClassInfoRef;    // base type import
import org.dmd.dmc.types.DmcTypeClassInfoRef;    // DmcType import
/**
 * The DmcTypeClassInfoRefSV provides storage for a single-valued ClassInfoRef
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1726)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:266)
 */
@SuppressWarnings("serial")
public class DmcTypeClassInfoRefSV extends DmcTypeClassInfoRef implements Serializable {
    
    ClassInfoRef value;
    
    public DmcTypeClassInfoRefSV(){
    
    }
    
    public DmcTypeClassInfoRefSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeClassInfoRefSV getNew(){
        return(new DmcTypeClassInfoRefSV(attrInfo));
    }
    
    public DmcTypeClassInfoRefSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeClassInfoRefSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1758)
    public DmcAttribute<ClassInfoRef> cloneIt(){
        DmcTypeClassInfoRefSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1770)
    public ClassInfoRef set(Object v) throws DmcValueException {
        ClassInfoRef rc = typeCheck(v);
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
    public ClassInfoRef getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

