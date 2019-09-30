//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.DmtField;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtField;    // DmcType import
/**
 * The DmcTypeDmtFieldSV provides storage for a single-valued DmtField
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2168)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:125)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtFieldSV extends DmcTypeDmtField implements Serializable {
    
    protected DmtField value;
    
    public DmcTypeDmtFieldSV(){
    
    }
    
    public DmcTypeDmtFieldSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeDmtFieldSV getNew(){
        return(new DmcTypeDmtFieldSV(getAttributeInfo()));
    }
    
    public DmcTypeDmtFieldSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeDmtFieldSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2200)
    public DmcAttribute<DmtField> cloneIt(){
        DmcTypeDmtFieldSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2211)
    public DmtField getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2223)
    public DmtField set(Object v) throws DmcValueException {
        DmtField rc = typeCheck(v);
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
    public DmtField getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

