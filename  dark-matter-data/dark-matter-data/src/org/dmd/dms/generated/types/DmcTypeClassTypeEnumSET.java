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
import org.dmd.dms.generated.enums.ClassTypeEnum;    // DmcType import
/**
 * The DmcTypeClassTypeEnumSET provides storage for a set of ClassTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2313)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:230)
 */
@SuppressWarnings("serial")
public class DmcTypeClassTypeEnumSET extends DmcTypeClassTypeEnum implements Serializable {
    
    Set<ClassTypeEnum> value;
    
    public DmcTypeClassTypeEnumSET(){
        value = null;
    }
    
    public DmcTypeClassTypeEnumSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ClassTypeEnum>();
        else
            value = new TreeSet<ClassTypeEnum>();
    }
    
    @Override
    public DmcTypeClassTypeEnumSET getNew(){
        return(new DmcTypeClassTypeEnumSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2350)
    public DmcAttribute<ClassTypeEnum> cloneIt(){
        synchronized(this){
            DmcTypeClassTypeEnumSET rc = getNew();
            for(ClassTypeEnum val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2369)
    public ClassTypeEnum add(Object v) throws DmcValueException {
        synchronized(this){
            ClassTypeEnum rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2386)
    public ClassTypeEnum del(Object v){
        synchronized(this){
            ClassTypeEnum rc = null;
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2405)
    public Iterator<ClassTypeEnum> getMV(){
        synchronized(this){
            Set<ClassTypeEnum> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<ClassTypeEnum>(value);
            else
                clone = new TreeSet<ClassTypeEnum>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2418)
    public Set<ClassTypeEnum> getMVCopy(){
        synchronized(this){
            Set<ClassTypeEnum> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<ClassTypeEnum>(value);
            else
                clone = new TreeSet<ClassTypeEnum>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2432)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2443)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                ClassTypeEnum val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

