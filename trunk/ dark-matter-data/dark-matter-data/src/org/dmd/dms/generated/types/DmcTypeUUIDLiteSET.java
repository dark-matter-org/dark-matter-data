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
package org.dmd.dms.generated.types;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.DmcTypeUUIDLite;    // base type import
import org.dmd.dmc.types.UUIDLite;    // primitive import
/**
 * The DmcTypeUUIDLiteSET provides storage for a set of UUIDLite
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1370)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:190)
 */
@SuppressWarnings("serial")
public class DmcTypeUUIDLiteSET extends DmcTypeUUIDLite {
    
    Set<UUIDLite> value;
    
    public DmcTypeUUIDLiteSET(){
        value = null;
    }
    
    public DmcTypeUUIDLiteSET(DmcAttributeInfo ai){
        super(ai);
        if (ai.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<UUIDLite>();
        else
            value = new TreeSet<UUIDLite>();
    }
    
    public DmcTypeUUIDLiteSET getNew(){
        return(new DmcTypeUUIDLiteSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<UUIDLite> cloneIt(){
        DmcTypeUUIDLiteSET rc = getNew();
        for(UUIDLite val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public UUIDLite add(Object v) throws DmcValueException {
        UUIDLite rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public UUIDLite del(Object v){
        UUIDLite rc = null;
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
    
    public Iterator<UUIDLite> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            UUIDLite val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

