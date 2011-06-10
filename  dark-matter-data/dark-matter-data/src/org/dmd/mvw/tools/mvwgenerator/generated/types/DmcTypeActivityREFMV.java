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
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeActivityREFMV provides storage for a multi-valued ActivityREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1843)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:490)
 */
@SuppressWarnings("serial")
public class DmcTypeActivityREFMV extends DmcTypeActivityREF implements Serializable {
    
    ArrayList<ActivityREF> value;
    
    public DmcTypeActivityREFMV(){
    
    }
    
    public DmcTypeActivityREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeActivityREFMV getNew(){
        return(new DmcTypeActivityREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<ActivityREF> cloneIt(){
        DmcTypeActivityREFMV rc = getNew();
        for(ActivityREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public ActivityREF add(Object v) throws DmcValueException {
        ActivityREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<ActivityREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public ActivityREF del(Object v){
        ActivityREF rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else
            rc = null;
        return(rc);
    }
    
    @Override
    public Iterator<ActivityREF> getMV(){
        ArrayList<ActivityREF> clone = new ArrayList<ActivityREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<ActivityREF> getMVCopy(){
        ArrayList<ActivityREF> clone = new ArrayList<ActivityREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public ActivityREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            ActivityREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

