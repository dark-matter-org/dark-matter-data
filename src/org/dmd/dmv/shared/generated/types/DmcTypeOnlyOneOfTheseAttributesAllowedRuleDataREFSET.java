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
 * The DmcTypeOnlyOneOfTheseAttributesAllowedRuleDataREFSET provides storage for a set of OnlyOneOfTheseAttributesAllowedRuleDataREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2791)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeOnlyOneOfTheseAttributesAllowedRuleDataREFSET extends DmcTypeOnlyOneOfTheseAttributesAllowedRuleDataREF implements Serializable {
    
     private final static Iterator<OnlyOneOfTheseAttributesAllowedRuleDataREF> emptyList =  (new HashSet<OnlyOneOfTheseAttributesAllowedRuleDataREF>()).iterator();
    
    
    protected Set<OnlyOneOfTheseAttributesAllowedRuleDataREF> value;
    
    public DmcTypeOnlyOneOfTheseAttributesAllowedRuleDataREFSET(){
        value = null;
    }
    
    public DmcTypeOnlyOneOfTheseAttributesAllowedRuleDataREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<OnlyOneOfTheseAttributesAllowedRuleDataREF>();
        else
            value = new TreeSet<OnlyOneOfTheseAttributesAllowedRuleDataREF>();
    }
    
    @Override
    public DmcTypeOnlyOneOfTheseAttributesAllowedRuleDataREFSET getNew(){
        return(new DmcTypeOnlyOneOfTheseAttributesAllowedRuleDataREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2832)
    public DmcAttribute<OnlyOneOfTheseAttributesAllowedRuleDataREF> cloneIt(){
        synchronized(this){
            DmcTypeOnlyOneOfTheseAttributesAllowedRuleDataREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(OnlyOneOfTheseAttributesAllowedRuleDataREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2855)
    public OnlyOneOfTheseAttributesAllowedRuleDataREF add(Object v) throws DmcValueException {
        synchronized(this){
            OnlyOneOfTheseAttributesAllowedRuleDataREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2872)
    public OnlyOneOfTheseAttributesAllowedRuleDataREF del(Object v){
        synchronized(this){
            OnlyOneOfTheseAttributesAllowedRuleDataREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2897)
    public Iterator<OnlyOneOfTheseAttributesAllowedRuleDataREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<OnlyOneOfTheseAttributesAllowedRuleDataREF>(value)).iterator() );
            else
                return( (new TreeSet<OnlyOneOfTheseAttributesAllowedRuleDataREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2911)
    public Set<OnlyOneOfTheseAttributesAllowedRuleDataREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<OnlyOneOfTheseAttributesAllowedRuleDataREF>());
                else
                    return(new HashSet<OnlyOneOfTheseAttributesAllowedRuleDataREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<OnlyOneOfTheseAttributesAllowedRuleDataREF>(value));
                else
                    return(new TreeSet<OnlyOneOfTheseAttributesAllowedRuleDataREF>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2931)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2942)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                OnlyOneOfTheseAttributesAllowedRuleDataREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

