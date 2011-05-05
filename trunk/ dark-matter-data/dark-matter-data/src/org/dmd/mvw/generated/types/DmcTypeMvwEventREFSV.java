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
package org.dmd.mvw.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeMvwEventREFSV provides storage for a single-valued MvwEventREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1546)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:463)
 */
@SuppressWarnings("serial")
public class DmcTypeMvwEventREFSV extends DmcTypeMvwEventREF implements Serializable {
    
    MvwEventREF value;
    
    public DmcTypeMvwEventREFSV(){
    
    }
    
    public DmcTypeMvwEventREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeMvwEventREFSV getNew(){
        return(new DmcTypeMvwEventREFSV(attrInfo));
    }
    
    public DmcTypeMvwEventREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeMvwEventREFSV(ai));
    }
    
    @Override
    public DmcAttribute<MvwEventREF> cloneIt(){
        DmcTypeMvwEventREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public MvwEventREF set(Object v) throws DmcValueException {
        MvwEventREF rc = typeCheck(v);
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
    public MvwEventREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

