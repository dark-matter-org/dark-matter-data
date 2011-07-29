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
/**
 * The DmcTypeAttributeValidatorDefinitionREFSET provides storage for a set of AttributeValidatorDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2332)
 *    Called from: org.dmd.dms.meta.MetaGenerator.dumpDerivedTypes(MetaGenerator.java:241)
 */
@SuppressWarnings("serial")
public class DmcTypeAttributeValidatorDefinitionREFSET extends DmcTypeAttributeValidatorDefinitionREF implements Serializable {
    
    protected Set<AttributeValidatorDefinitionREF> value;
    
    public DmcTypeAttributeValidatorDefinitionREFSET(){
        value = null;
    }
    
    public DmcTypeAttributeValidatorDefinitionREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<AttributeValidatorDefinitionREF>();
        else
            value = new TreeSet<AttributeValidatorDefinitionREF>();
    }
    
    @Override
    public DmcTypeAttributeValidatorDefinitionREFSET getNew(){
        return(new DmcTypeAttributeValidatorDefinitionREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2369)
    public DmcAttribute<AttributeValidatorDefinitionREF> cloneIt(){
        synchronized(this){
            DmcTypeAttributeValidatorDefinitionREFSET rc = getNew();
            for(AttributeValidatorDefinitionREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2388)
    public AttributeValidatorDefinitionREF add(Object v) throws DmcValueException {
        synchronized(this){
            AttributeValidatorDefinitionREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2405)
    public AttributeValidatorDefinitionREF del(Object v){
        synchronized(this){
            AttributeValidatorDefinitionREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2424)
    public Iterator<AttributeValidatorDefinitionREF> getMV(){
        synchronized(this){
            Set<AttributeValidatorDefinitionREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<AttributeValidatorDefinitionREF>(value);
            else
                clone = new TreeSet<AttributeValidatorDefinitionREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2437)
    public Set<AttributeValidatorDefinitionREF> getMVCopy(){
        synchronized(this){
            Set<AttributeValidatorDefinitionREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<AttributeValidatorDefinitionREF>(value);
            else
                clone = new TreeSet<AttributeValidatorDefinitionREF>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2451)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2462)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                AttributeValidatorDefinitionREF val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

