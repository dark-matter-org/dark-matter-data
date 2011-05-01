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
import org.dmd.dms.generated.enums.NameTypeEnum;    // DmcType import
/**
 * The DmcTypeNameTypeEnumSET provides storage for a set of NameTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2034)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:222)
 */
@SuppressWarnings("serial")
public class DmcTypeNameTypeEnumSET extends DmcTypeNameTypeEnum implements Serializable {
    
    Set<NameTypeEnum> value;
    
    public DmcTypeNameTypeEnumSET(){
        value = null;
    }
    
    public DmcTypeNameTypeEnumSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<NameTypeEnum>();
        else
            value = new TreeSet<NameTypeEnum>();
    }
    
    @Override
    public DmcTypeNameTypeEnumSET getNew(){
        return(new DmcTypeNameTypeEnumSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<NameTypeEnum> cloneIt(){
        DmcTypeNameTypeEnumSET rc = getNew();
        for(NameTypeEnum val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public NameTypeEnum add(Object v) throws DmcValueException {
        NameTypeEnum rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public NameTypeEnum del(Object v){
        NameTypeEnum rc = null;
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
    public Iterator<NameTypeEnum> getMV(){
        Set<NameTypeEnum> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<NameTypeEnum>(value);
        else
            clone = new TreeSet<NameTypeEnum>(value);
        return(clone.iterator());
    }
    
    public Set<NameTypeEnum> getMVCopy(){
        Set<NameTypeEnum> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<NameTypeEnum>(value);
        else
            clone = new TreeSet<NameTypeEnum>(value);
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
            NameTypeEnum val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

