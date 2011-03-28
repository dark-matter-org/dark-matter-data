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

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * The DmcTypeMvcSubMenuREFSET provides storage for a set of MvcSubMenuREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1395)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:555)
 */
@SuppressWarnings("serial")
public class DmcTypeMvcSubMenuREFSET extends DmcTypeMvcSubMenuREF {
    
    Set<MvcSubMenuREF> value;
    
    public DmcTypeMvcSubMenuREFSET(){
        value = null;
    }
    
    public DmcTypeMvcSubMenuREFSET(DmcAttributeInfo ai){
        super(ai);
        if (ai.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<MvcSubMenuREF>();
        else
            value = new TreeSet<MvcSubMenuREF>();
    }
    
    public DmcTypeMvcSubMenuREFSET getNew(){
        return(new DmcTypeMvcSubMenuREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<MvcSubMenuREF> cloneIt(){
        DmcTypeMvcSubMenuREFSET rc = getNew();
        for(MvcSubMenuREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public MvcSubMenuREF add(Object v) throws DmcValueException {
        MvcSubMenuREF rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public MvcSubMenuREF del(Object v){
        MvcSubMenuREF rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else;
            rc = null;
        return(rc);
    }
    
    public Iterator<MvcSubMenuREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            MvcSubMenuREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}
