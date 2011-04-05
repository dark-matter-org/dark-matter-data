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
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * The DmcTypeMvcRegistryItemREFSET provides storage for a set of MvcRegistryItemREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1636)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:436)
 */
@SuppressWarnings("serial")
public class DmcTypeMvcRegistryItemREFSET extends DmcTypeMvcRegistryItemREF implements Serializable {
    
    Set<MvcRegistryItemREF> value;
    
    public DmcTypeMvcRegistryItemREFSET(){
        value = null;
    }
    
    public DmcTypeMvcRegistryItemREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<MvcRegistryItemREF>();
        else
            value = new TreeSet<MvcRegistryItemREF>();
    }
    
    public DmcTypeMvcRegistryItemREFSET getNew(){
        return(new DmcTypeMvcRegistryItemREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<MvcRegistryItemREF> cloneIt(){
        DmcTypeMvcRegistryItemREFSET rc = getNew();
        for(MvcRegistryItemREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public MvcRegistryItemREF add(Object v) throws DmcValueException {
        MvcRegistryItemREF rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    public MvcRegistryItemREF del(Object v){
        MvcRegistryItemREF rc = null;
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
    
    public Iterator<MvcRegistryItemREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            MvcRegistryItemREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

