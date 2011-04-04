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
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeMvcControllerREFMV provides storage for a multi-valued MvcControllerREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1464)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:435)
 */
@SuppressWarnings("serial")
public class DmcTypeMvcControllerREFMV extends DmcTypeMvcControllerREF implements Serializable {
    
    ArrayList<MvcControllerREF> value;
    
    public DmcTypeMvcControllerREFMV(){
    
    }
    
    public DmcTypeMvcControllerREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeMvcControllerREFMV getNew(){
        return(new DmcTypeMvcControllerREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<MvcControllerREF> cloneIt(){
        DmcTypeMvcControllerREFMV rc = getNew();
        for(MvcControllerREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public MvcControllerREF add(Object v) throws DmcValueException {
        MvcControllerREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<MvcControllerREF>();
        value.add(rc);
        return(rc);
    }
    
    public MvcControllerREF del(Object v){
        MvcControllerREF rc = null;
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
    
    public Iterator<MvcControllerREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public MvcControllerREF getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            MvcControllerREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

