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
 * The DmcTypeMvcViewREFSV provides storage for a single-valued MvcViewREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1546)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:463)
 */
@SuppressWarnings("serial")
public class DmcTypeMvcViewREFSV extends DmcTypeMvcViewREF implements Serializable {
    
    MvcViewREF value;
    
    public DmcTypeMvcViewREFSV(){
    
    }
    
    public DmcTypeMvcViewREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeMvcViewREFSV getNew(){
        return(new DmcTypeMvcViewREFSV(attrInfo));
    }
    
    public DmcTypeMvcViewREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeMvcViewREFSV(ai));
    }
    
    @Override
    public DmcAttribute<MvcViewREF> cloneIt(){
        DmcTypeMvcViewREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public MvcViewREF set(Object v) throws DmcValueException {
        MvcViewREF rc = typeCheck(v);
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
    public MvcViewREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

