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
import org.dmd.dms.generated.types.DmwTypeToWrapperType;    // base type import
import org.dmd.dms.generated.types.DmcTypeDmwTypeToWrapperType;    // DmcType import
/**
 * The DmcTypeDmwTypeToWrapperTypeSET provides storage for a set of DmwTypeToWrapperType
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2364)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:268)
 */
@SuppressWarnings("serial")
public class DmcTypeDmwTypeToWrapperTypeSET extends DmcTypeDmwTypeToWrapperType implements Serializable {
    
    protected Set<DmwTypeToWrapperType> value;
    
    public DmcTypeDmwTypeToWrapperTypeSET(){
        value = null;
    }
    
    public DmcTypeDmwTypeToWrapperTypeSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<DmwTypeToWrapperType>();
        else
            value = new TreeSet<DmwTypeToWrapperType>();
    }
    
    @Override
    public DmcTypeDmwTypeToWrapperTypeSET getNew(){
        return(new DmcTypeDmwTypeToWrapperTypeSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2401)
    public DmcAttribute<DmwTypeToWrapperType> cloneIt(){
        synchronized(this){
            DmcTypeDmwTypeToWrapperTypeSET rc = getNew();
            for(DmwTypeToWrapperType val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2420)
    public DmwTypeToWrapperType add(Object v) throws DmcValueException {
        synchronized(this){
            DmwTypeToWrapperType rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2437)
    public DmwTypeToWrapperType del(Object v){
        synchronized(this){
            DmwTypeToWrapperType rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2456)
    public Iterator<DmwTypeToWrapperType> getMV(){
        synchronized(this){
            Set<DmwTypeToWrapperType> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<DmwTypeToWrapperType>(value);
            else
                clone = new TreeSet<DmwTypeToWrapperType>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2469)
    public Set<DmwTypeToWrapperType> getMVCopy(){
        synchronized(this){
            Set<DmwTypeToWrapperType> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<DmwTypeToWrapperType>(value);
            else
                clone = new TreeSet<DmwTypeToWrapperType>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2483)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2494)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                DmwTypeToWrapperType val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

