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
import org.dmd.dmc.types.ClassFilter;    // base type import
import org.dmd.dmc.types.DmcTypeClassFilter;    // DmcType import
/**
 * The DmcTypeClassFilterSET provides storage for a set of ClassFilter
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2439)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:272)
 */
@SuppressWarnings("serial")
public class DmcTypeClassFilterSET extends DmcTypeClassFilter implements Serializable {
    
    protected Set<ClassFilter> value;
    
    public DmcTypeClassFilterSET(){
        value = null;
    }
    
    public DmcTypeClassFilterSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ClassFilter>();
        else
            value = new TreeSet<ClassFilter>();
    }
    
    @Override
    public DmcTypeClassFilterSET getNew(){
        return(new DmcTypeClassFilterSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2476)
    public DmcAttribute<ClassFilter> cloneIt(){
        synchronized(this){
            DmcTypeClassFilterSET rc = getNew();
            for(ClassFilter val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2495)
    public ClassFilter add(Object v) throws DmcValueException {
        synchronized(this){
            ClassFilter rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2512)
    public ClassFilter del(Object v){
        synchronized(this){
            ClassFilter rc = null;
            if (value == null)
                return(rc);
            
            try {
                rc = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            if (value.contains(rc)){
                value.remove(rc);
                if (value.size() == 0)
                    value = null;
            }
            else
                rc = null;
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2537)
    public Iterator<ClassFilter> getMV(){
        synchronized(this){
            Set<ClassFilter> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<ClassFilter>(value);
            else
                clone = new TreeSet<ClassFilter>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2550)
    public Set<ClassFilter> getMVCopy(){
        synchronized(this){
            Set<ClassFilter> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<ClassFilter>(value);
            else
                clone = new TreeSet<ClassFilter>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2564)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2575)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            if (value == null)
                return(rc);
            
            try {
                ClassFilter val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

