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
package org.dmd.dmv.shared.generated.types;

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
 * The DmcTypeCheckAttributesBasedOnValueRuleDataREFSET provides storage for a set of CheckAttributesBasedOnValueRuleDataREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2634)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:532)
 */
@SuppressWarnings("serial")
public class DmcTypeCheckAttributesBasedOnValueRuleDataREFSET extends DmcTypeCheckAttributesBasedOnValueRuleDataREF implements Serializable {
    
     private final static Iterator<CheckAttributesBasedOnValueRuleDataREF> emptyList =  (new HashSet<CheckAttributesBasedOnValueRuleDataREF>()).iterator();
    
    
    protected Set<CheckAttributesBasedOnValueRuleDataREF> value;
    
    public DmcTypeCheckAttributesBasedOnValueRuleDataREFSET(){
        value = null;
    }
    
    public DmcTypeCheckAttributesBasedOnValueRuleDataREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<CheckAttributesBasedOnValueRuleDataREF>();
        else
            value = new TreeSet<CheckAttributesBasedOnValueRuleDataREF>();
    }
    
    @Override
    public DmcTypeCheckAttributesBasedOnValueRuleDataREFSET getNew(){
        return(new DmcTypeCheckAttributesBasedOnValueRuleDataREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2675)
    public DmcAttribute<CheckAttributesBasedOnValueRuleDataREF> cloneIt(){
        synchronized(this){
            DmcTypeCheckAttributesBasedOnValueRuleDataREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(CheckAttributesBasedOnValueRuleDataREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2698)
    public CheckAttributesBasedOnValueRuleDataREF add(Object v) throws DmcValueException {
        synchronized(this){
            CheckAttributesBasedOnValueRuleDataREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2715)
    public CheckAttributesBasedOnValueRuleDataREF del(Object v){
        synchronized(this){
            CheckAttributesBasedOnValueRuleDataREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2740)
    public Iterator<CheckAttributesBasedOnValueRuleDataREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<CheckAttributesBasedOnValueRuleDataREF>(value)).iterator() );
            else
                return( (new TreeSet<CheckAttributesBasedOnValueRuleDataREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2754)
    public Set<CheckAttributesBasedOnValueRuleDataREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<CheckAttributesBasedOnValueRuleDataREF>());
                else
                    return(new HashSet<CheckAttributesBasedOnValueRuleDataREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<CheckAttributesBasedOnValueRuleDataREF>(value));
                else
                    return(new TreeSet<CheckAttributesBasedOnValueRuleDataREF>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2774)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2785)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                CheckAttributesBasedOnValueRuleDataREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

