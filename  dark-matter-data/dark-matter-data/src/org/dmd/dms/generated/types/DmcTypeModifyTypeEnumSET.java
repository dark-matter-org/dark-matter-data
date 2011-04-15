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

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.ModifyTypeEnum;    // DmcType import
/**
 * The DmcTypeModifyTypeEnumSET provides storage for a set of ModifyTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1850)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:203)
 */
@SuppressWarnings("serial")
public class DmcTypeModifyTypeEnumSET extends DmcTypeModifyTypeEnum implements Serializable {
    
    Set<ModifyTypeEnum> value;
    
    public DmcTypeModifyTypeEnumSET(){
        value = null;
    }
    
    public DmcTypeModifyTypeEnumSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ModifyTypeEnum>();
        else
            value = new TreeSet<ModifyTypeEnum>();
    }
    
    @Override
    public DmcTypeModifyTypeEnumSET getNew(){
        return(new DmcTypeModifyTypeEnumSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<ModifyTypeEnum> cloneIt(){
        DmcTypeModifyTypeEnumSET rc = getNew();
        for(ModifyTypeEnum val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public ModifyTypeEnum add(Object v) throws DmcValueException {
        ModifyTypeEnum rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public ModifyTypeEnum del(Object v){
        ModifyTypeEnum rc = null;
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
    public Iterator<ModifyTypeEnum> getMV(){
        Set<ModifyTypeEnum> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<ModifyTypeEnum>(value);
        else
            clone = new TreeSet<ModifyTypeEnum>(value);
        return(clone.iterator());
    }
    
    public Set<ModifyTypeEnum> getMVCopy(){
        Set<ModifyTypeEnum> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<ModifyTypeEnum>(value);
        else
            clone = new TreeSet<ModifyTypeEnum>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            ModifyTypeEnum val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

