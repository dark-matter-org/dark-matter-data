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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeActivityREFSV provides storage for a single-valued ActivityREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1706)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:493)
 */
@SuppressWarnings("serial")
public class DmcTypeActivityREFSV extends DmcTypeActivityREF implements Serializable {
    
    ActivityREF value;
    
    public DmcTypeActivityREFSV(){
    
    }
    
    public DmcTypeActivityREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeActivityREFSV getNew(){
        return(new DmcTypeActivityREFSV(attrInfo));
    }
    
    public DmcTypeActivityREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeActivityREFSV(ai));
    }
    
    @Override
    public DmcAttribute<ActivityREF> cloneIt(){
        DmcTypeActivityREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public ActivityREF set(Object v) throws DmcValueException {
        ActivityREF rc = typeCheck(v);
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
    public ActivityREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

