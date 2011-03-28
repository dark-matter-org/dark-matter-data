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
package org.dmd.dmr.shared.base.generated.types;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * The DmcTypeDotNamedObjectREFSET provides storage for a set of DotNamedObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1395)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:548)
 */
@SuppressWarnings("serial")
public class DmcTypeDotNamedObjectREFSET extends DmcTypeDotNamedObjectREF {
    
    Set<DotNamedObjectREF> value;
    
    public DmcTypeDotNamedObjectREFSET(){
        value = null;
    }
    
    public DmcTypeDotNamedObjectREFSET(DmcAttributeInfo ai){
        super(ai);
        if (ai.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<DotNamedObjectREF>();
        else
            value = new TreeSet<DotNamedObjectREF>();
    }
    
    public DmcTypeDotNamedObjectREFSET getNew(){
        return(new DmcTypeDotNamedObjectREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<DotNamedObjectREF> cloneIt(){
        DmcTypeDotNamedObjectREFSET rc = getNew();
        for(DotNamedObjectREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public DotNamedObjectREF add(Object v) throws DmcValueException {
        DotNamedObjectREF rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public DotNamedObjectREF del(Object v){
        DotNamedObjectREF rc = null;
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
    
    public Iterator<DotNamedObjectREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            DotNamedObjectREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}
