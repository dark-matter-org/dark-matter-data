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
package org.dmd.features.extgwt.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeMvcSubMenuREFSV provides storage for a single-valued MvcSubMenuREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1547)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:488)
 */
@SuppressWarnings("serial")
public class DmcTypeMvcSubMenuREFSV extends DmcTypeMvcSubMenuREF implements Serializable {
    
    MvcSubMenuREF value;
    
    public DmcTypeMvcSubMenuREFSV(){
    
    }
    
    public DmcTypeMvcSubMenuREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeMvcSubMenuREFSV getNew(){
        return(new DmcTypeMvcSubMenuREFSV(attrInfo));
    }
    
    public DmcTypeMvcSubMenuREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeMvcSubMenuREFSV(ai));
    }
    
    @Override
    public DmcAttribute<MvcSubMenuREF> cloneIt(){
        DmcTypeMvcSubMenuREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public MvcSubMenuREF set(Object v) throws DmcValueException {
        MvcSubMenuREF rc = typeCheck(v);
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
    public MvcSubMenuREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

