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
package org.dmd.dmp.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeActionResponseREFMV provides storage for a multi-valued ActionResponseREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1551)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:442)
 */
@SuppressWarnings("serial")
public class DmcTypeActionResponseREFMV extends DmcTypeActionResponseREF implements Serializable {
    
    ArrayList<ActionResponseREF> value;
    
    public DmcTypeActionResponseREFMV(){
    
    }
    
    public DmcTypeActionResponseREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeActionResponseREFMV getNew(){
        return(new DmcTypeActionResponseREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<ActionResponseREF> cloneIt(){
        DmcTypeActionResponseREFMV rc = getNew();
        for(ActionResponseREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public ActionResponseREF add(Object v) throws DmcValueException {
        ActionResponseREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<ActionResponseREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public ActionResponseREF del(Object v){
        ActionResponseREF rc = null;
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
    public Iterator<ActionResponseREF> getMV(){
        ArrayList<ActionResponseREF> clone = new ArrayList<ActionResponseREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<ActionResponseREF> getMVCopy(){
        ArrayList<ActionResponseREF> clone = new ArrayList<ActionResponseREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public ActionResponseREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            ActionResponseREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

