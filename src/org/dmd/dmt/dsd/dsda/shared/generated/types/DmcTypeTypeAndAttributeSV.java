//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013-2021 dark-matter-data committers
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
package org.dmd.dmt.dsd.dsda.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.dsd.dsda.shared.generated.types.TypeAndAttribute;    // base type import
import org.dmd.dmt.dsd.dsda.shared.generated.types.DmcTypeTypeAndAttribute;    // DmcType import
/**
 * The DmcTypeTypeAndAttributeSV provides storage for a single-valued TypeAndAttribute
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2171)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:125)
 */
@SuppressWarnings("serial")
public class DmcTypeTypeAndAttributeSV extends DmcTypeTypeAndAttribute implements Serializable {
    
    protected TypeAndAttribute value;
    
    public DmcTypeTypeAndAttributeSV(){
    
    }
    
    public DmcTypeTypeAndAttributeSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTypeAndAttributeSV getNew(){
        return(new DmcTypeTypeAndAttributeSV(getAttributeInfo()));
    }
    
    public DmcTypeTypeAndAttributeSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeTypeAndAttributeSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2203)
    public DmcAttribute<TypeAndAttribute> cloneIt(){
        DmcTypeTypeAndAttributeSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2214)
    public TypeAndAttribute getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2226)
    public TypeAndAttribute set(Object v) throws DmcValueException {
        TypeAndAttribute rc = typeCheck(v);
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
    public TypeAndAttribute getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

