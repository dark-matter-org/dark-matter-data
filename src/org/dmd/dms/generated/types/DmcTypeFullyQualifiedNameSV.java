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
import org.dmd.dmc.types.FullyQualifiedName;    // base type import
import org.dmd.dmc.types.DmcTypeFullyQualifiedName;    // DmcType import
/**
 * The DmcTypeFullyQualifiedNameSV provides storage for a single-valued FullyQualifiedName
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1969)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:656)
 */
@SuppressWarnings("serial")
public class DmcTypeFullyQualifiedNameSV extends DmcTypeFullyQualifiedName implements Serializable {
    
    protected FullyQualifiedName value;
    
    public DmcTypeFullyQualifiedNameSV(){
    
    }
    
    public DmcTypeFullyQualifiedNameSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeFullyQualifiedNameSV getNew(){
        return(new DmcTypeFullyQualifiedNameSV(getAttributeInfo()));
    }
    
    public DmcTypeFullyQualifiedNameSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeFullyQualifiedNameSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2001)
    public DmcAttribute<FullyQualifiedName> cloneIt(){
        DmcTypeFullyQualifiedNameSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2012)
    public FullyQualifiedName getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2024)
    public FullyQualifiedName set(Object v) throws DmcValueException {
        FullyQualifiedName rc = typeCheck(v);
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
    public FullyQualifiedName getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

