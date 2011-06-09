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
 * The DmcTypePresenterREFMV provides storage for a multi-valued PresenterREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1842)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:489)
 */
@SuppressWarnings("serial")
public class DmcTypePresenterREFMV extends DmcTypePresenterREF implements Serializable {
    
    ArrayList<PresenterREF> value;
    
    public DmcTypePresenterREFMV(){
    
    }
    
    public DmcTypePresenterREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypePresenterREFMV getNew(){
        return(new DmcTypePresenterREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<PresenterREF> cloneIt(){
        DmcTypePresenterREFMV rc = getNew();
        for(PresenterREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public PresenterREF add(Object v) throws DmcValueException {
        PresenterREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<PresenterREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public PresenterREF del(Object v){
        PresenterREF rc = null;
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
    public Iterator<PresenterREF> getMV(){
        ArrayList<PresenterREF> clone = new ArrayList<PresenterREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<PresenterREF> getMVCopy(){
        ArrayList<PresenterREF> clone = new ArrayList<PresenterREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public PresenterREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            PresenterREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

