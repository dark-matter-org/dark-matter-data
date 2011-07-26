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
package org.dmd.dmp.shared.generated.types;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmp.shared.generated.dmo.DenotifyRequestDMO;    // DmcType import
/**
 * The DmcTypeDenotifyRequestREFSET provides storage for a set of DenotifyRequestDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2306)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:223)
 */
@SuppressWarnings("serial")
public class DmcTypeDenotifyRequestREFSET extends DmcTypeDenotifyRequestREF implements Serializable {
    
    Set<DenotifyRequestDMO> value;
    
    public DmcTypeDenotifyRequestREFSET(){
        value = null;
    }
    
    public DmcTypeDenotifyRequestREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<DenotifyRequestDMO>();
        else
            value = new TreeSet<DenotifyRequestDMO>();
    }
    
    @Override
    public DmcTypeDenotifyRequestREFSET getNew(){
        return(new DmcTypeDenotifyRequestREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2343)
    public DmcAttribute<DenotifyRequestDMO> cloneIt(){
        synchronized(this){
            DmcTypeDenotifyRequestREFSET rc = getNew();
            for(DenotifyRequestDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2362)
    public DenotifyRequestDMO add(Object v) throws DmcValueException {
        synchronized(this){
            DenotifyRequestDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2379)
    public DenotifyRequestDMO del(Object v){
        synchronized(this){
            DenotifyRequestDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2398)
    public Iterator<DenotifyRequestDMO> getMV(){
        synchronized(this){
            Set<DenotifyRequestDMO> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<DenotifyRequestDMO>(value);
            else
                clone = new TreeSet<DenotifyRequestDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2411)
    public Set<DenotifyRequestDMO> getMVCopy(){
        synchronized(this){
            Set<DenotifyRequestDMO> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<DenotifyRequestDMO>(value);
            else
                clone = new TreeSet<DenotifyRequestDMO>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2425)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2436)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                DenotifyRequestDMO val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

