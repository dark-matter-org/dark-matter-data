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
package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmt.shared.generated.dmo.UnnamedObjHSDMO;    // DmcType import
/**
 * The DmcTypeUnnamedObjHSREFSET provides storage for a set of UnnamedObjHSDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2808)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeUnnamedObjHSREFSET extends DmcTypeUnnamedObjHSREF implements Serializable {
    
     private final static Iterator<UnnamedObjHSDMO> emptyList =  (new HashSet<UnnamedObjHSDMO>()).iterator();
    
    
    protected Set<UnnamedObjHSDMO> value;
    
    public DmcTypeUnnamedObjHSREFSET(){
        value = null;
    }
    
    public DmcTypeUnnamedObjHSREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<UnnamedObjHSDMO>();
        else
            value = new TreeSet<UnnamedObjHSDMO>();
    }
    
    @Override
    public DmcTypeUnnamedObjHSREFSET getNew(){
        return(new DmcTypeUnnamedObjHSREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2849)
    public DmcAttribute<UnnamedObjHSDMO> cloneIt(){
        synchronized(this){
            DmcTypeUnnamedObjHSREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(UnnamedObjHSDMO val: value)
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
    public UnnamedObjHSDMO add(Object v) throws DmcValueException {
        synchronized(this){
            UnnamedObjHSDMO rc = typeCheck(v);
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
    public UnnamedObjHSDMO del(Object v){
        synchronized(this){
            UnnamedObjHSDMO rc = null;
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
    public Iterator<UnnamedObjHSDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<UnnamedObjHSDMO>(value)).iterator() );
            else
                return( (new TreeSet<UnnamedObjHSDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2928)
    public Set<UnnamedObjHSDMO> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<UnnamedObjHSDMO>());
                else
                    return(new HashSet<UnnamedObjHSDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<UnnamedObjHSDMO>(value));
                else
                    return(new TreeSet<UnnamedObjHSDMO>(value));
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
                UnnamedObjHSDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

