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
import org.dmd.dmv.shared.generated.dmo.OneOfTheseAttributesRequiredRuleDataDMO;    // DmcType import
/**
 * The DmcTypeOneOfTheseAttributesRequiredRuleDataREFSET provides storage for a set of OneOfTheseAttributesRequiredRuleDataDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2595)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeOneOfTheseAttributesRequiredRuleDataREFSET extends DmcTypeOneOfTheseAttributesRequiredRuleDataREF implements Serializable {
    
     private final static Iterator<OneOfTheseAttributesRequiredRuleDataDMO> emptyList =  (new HashSet<OneOfTheseAttributesRequiredRuleDataDMO>()).iterator();
    
    
    protected Set<OneOfTheseAttributesRequiredRuleDataDMO> value;
    
    public DmcTypeOneOfTheseAttributesRequiredRuleDataREFSET(){
        value = null;
    }
    
    public DmcTypeOneOfTheseAttributesRequiredRuleDataREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<OneOfTheseAttributesRequiredRuleDataDMO>();
        else
            value = new TreeSet<OneOfTheseAttributesRequiredRuleDataDMO>();
    }
    
    @Override
    public DmcTypeOneOfTheseAttributesRequiredRuleDataREFSET getNew(){
        return(new DmcTypeOneOfTheseAttributesRequiredRuleDataREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2636)
    public DmcAttribute<OneOfTheseAttributesRequiredRuleDataDMO> cloneIt(){
        synchronized(this){
            DmcTypeOneOfTheseAttributesRequiredRuleDataREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(OneOfTheseAttributesRequiredRuleDataDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2659)
    public OneOfTheseAttributesRequiredRuleDataDMO add(Object v) throws DmcValueException {
        synchronized(this){
            OneOfTheseAttributesRequiredRuleDataDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2676)
    public OneOfTheseAttributesRequiredRuleDataDMO del(Object v){
        synchronized(this){
            OneOfTheseAttributesRequiredRuleDataDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2701)
    public Iterator<OneOfTheseAttributesRequiredRuleDataDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<OneOfTheseAttributesRequiredRuleDataDMO>(value)).iterator() );
            else
                return( (new TreeSet<OneOfTheseAttributesRequiredRuleDataDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2715)
    public Set<OneOfTheseAttributesRequiredRuleDataDMO> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<OneOfTheseAttributesRequiredRuleDataDMO>());
                else
                    return(new HashSet<OneOfTheseAttributesRequiredRuleDataDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<OneOfTheseAttributesRequiredRuleDataDMO>(value));
                else
                    return(new TreeSet<OneOfTheseAttributesRequiredRuleDataDMO>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2735)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2746)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                OneOfTheseAttributesRequiredRuleDataDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

