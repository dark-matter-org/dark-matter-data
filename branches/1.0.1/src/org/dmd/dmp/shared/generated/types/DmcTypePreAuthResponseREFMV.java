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
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.shared.generated.dmo.PreAuthResponseDMO;    // DmcType import
/**
 * The DmcTypePreAuthResponseREFMV provides storage for a multi-valued PreAuthResponse
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2247)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:255)
 */
@SuppressWarnings("serial")
public class DmcTypePreAuthResponseREFMV extends DmcTypePreAuthResponseREF implements Serializable {
    
    protected ArrayList<PreAuthResponseDMO> value;
    
    public DmcTypePreAuthResponseREFMV(){
    
    }
    
    public DmcTypePreAuthResponseREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypePreAuthResponseREFMV getNew(){
        return(new DmcTypePreAuthResponseREFMV(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2277)
    public DmcAttribute<PreAuthResponseDMO> cloneIt(){
        synchronized(this){
            DmcTypePreAuthResponseREFMV rc = getNew();
            if (attrInfo.indexSize == 0){
                for(PreAuthResponseDMO val: value)
                try {
                    rc.add(val);
                } catch (DmcValueException e) {
                    throw(new IllegalStateException("typeCheck() should never fail here!",e));
                }
            }
            else{
                for(int index=0; index<value.size(); index++)
                    try {
                        rc.setMVnth(index, value.get(index));
                    } catch (DmcValueException e) {
                        throw(new IllegalStateException("typeCheck() should never fail here!",e));
                    }
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2306)
    public PreAuthResponseDMO add(Object v) throws DmcValueException {
        synchronized(this){
            PreAuthResponseDMO rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<PreAuthResponseDMO>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2319)
    public PreAuthResponseDMO del(Object v){
        synchronized(this){
            PreAuthResponseDMO key = null;
            PreAuthResponseDMO rc = null;
            try {
                key = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            int indexof = value.indexOf(key);
            if (indexof != -1){
                rc = value.get(indexof);
                value.remove(rc);
            }

            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2350)
    public Iterator<PreAuthResponseDMO> getMV(){
        synchronized(this){
            ArrayList<PreAuthResponseDMO> clone = new ArrayList<PreAuthResponseDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2359)
    public ArrayList<PreAuthResponseDMO> getMVCopy(){
        synchronized(this){
            ArrayList<PreAuthResponseDMO> clone = new ArrayList<PreAuthResponseDMO>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2369)
    public int getMVSize(){
        synchronized(this){
            if (attrInfo.indexSize == 0){
                if (value == null)
                    return(0);
                return(value.size());
            }
            else
                return(attrInfo.indexSize);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2384)
    public PreAuthResponseDMO getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2395)
    public PreAuthResponseDMO setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (attrInfo.indexSize == 0)
                throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= attrInfo.indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
            
            PreAuthResponseDMO rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<PreAuthResponseDMO>(attrInfo.indexSize);
                for(int i=0;i<attrInfo.indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2423)
    public boolean hasValue(){
        synchronized(this){
            boolean rc = false;
            
            if (attrInfo.indexSize == 0)
                throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use hasValue()."));
            
            if (value == null)
                return(rc);
            
            for(int i=0; i<value.size(); i++){
                if (value.get(i) != null){
                    rc = true;
                    break;
                }
            }
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2447)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                PreAuthResponseDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

