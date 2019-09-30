//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
 * The DmcTypeReferencedAttributeTypeRuleDataREFSET provides storage for a set of ReferencedAttributeTypeRuleDataREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2808)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeReferencedAttributeTypeRuleDataREFSET extends DmcTypeReferencedAttributeTypeRuleDataREF implements Serializable {
    
     private final static Iterator<ReferencedAttributeTypeRuleDataREF> emptyList =  (new HashSet<ReferencedAttributeTypeRuleDataREF>()).iterator();
    
    
    protected Set<ReferencedAttributeTypeRuleDataREF> value;
    
    public DmcTypeReferencedAttributeTypeRuleDataREFSET(){
        value = null;
    }
    
    public DmcTypeReferencedAttributeTypeRuleDataREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ReferencedAttributeTypeRuleDataREF>();
        else
            value = new TreeSet<ReferencedAttributeTypeRuleDataREF>();
    }
    
    @Override
    public DmcTypeReferencedAttributeTypeRuleDataREFSET getNew(){
        return(new DmcTypeReferencedAttributeTypeRuleDataREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2849)
    public DmcAttribute<ReferencedAttributeTypeRuleDataREF> cloneIt(){
        synchronized(this){
            DmcTypeReferencedAttributeTypeRuleDataREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ReferencedAttributeTypeRuleDataREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2872)
    public ReferencedAttributeTypeRuleDataREF add(Object v) throws DmcValueException {
        synchronized(this){
            ReferencedAttributeTypeRuleDataREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2889)
    public ReferencedAttributeTypeRuleDataREF del(Object v){
        synchronized(this){
            ReferencedAttributeTypeRuleDataREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2914)
    public Iterator<ReferencedAttributeTypeRuleDataREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<ReferencedAttributeTypeRuleDataREF>(value)).iterator() );
            else
                return( (new TreeSet<ReferencedAttributeTypeRuleDataREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2928)
    public Set<ReferencedAttributeTypeRuleDataREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<ReferencedAttributeTypeRuleDataREF>());
                else
                    return(new HashSet<ReferencedAttributeTypeRuleDataREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<ReferencedAttributeTypeRuleDataREF>(value));
                else
                    return(new TreeSet<ReferencedAttributeTypeRuleDataREF>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2948)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2959)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                ReferencedAttributeTypeRuleDataREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

