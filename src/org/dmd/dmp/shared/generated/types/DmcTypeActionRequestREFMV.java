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
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;    // DmcType import
/**
 * The DmcTypeActionRequestREFMV provides storage for a multi-valued ActionRequest
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2299)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:255)
 */
@SuppressWarnings("serial")
public class DmcTypeActionRequestREFMV extends DmcTypeActionRequestREF implements Serializable {
    
    private final static Iterator<ActionRequestDMO> emptyList = (new ArrayList<ActionRequestDMO>()).iterator();
    
    protected ArrayList<ActionRequestDMO> value;
    
    public DmcTypeActionRequestREFMV(){
    
    }
    
    public DmcTypeActionRequestREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeActionRequestREFMV getNew(){
        return(new DmcTypeActionRequestREFMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2330)
    public DmcAttribute<ActionRequestDMO> cloneIt(){
        synchronized(this){
            DmcTypeActionRequestREFMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(ActionRequestDMO val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2363)
    public ActionRequestDMO add(Object v) throws DmcValueException {
        synchronized(this){
            ActionRequestDMO rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<ActionRequestDMO>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2376)
    public ActionRequestDMO del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            ActionRequestDMO key = null;
            ActionRequestDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2410)
    public Iterator<ActionRequestDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<ActionRequestDMO> clone = new ArrayList<ActionRequestDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2422)
    public ArrayList<ActionRequestDMO> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<ActionRequestDMO>());
            else 
                return(new ArrayList<ActionRequestDMO>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2434)
    public int getMVSize(){
        synchronized(this){
            if (getAttributeInfo().indexSize == 0){
                if (value == null)
                    return(0);
                return(value.size());
            }
            else
                return(getAttributeInfo().indexSize);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2449)
    public ActionRequestDMO getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2460)
    public ActionRequestDMO setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            ActionRequestDMO rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<ActionRequestDMO>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2488)
    public boolean hasValue(){
        synchronized(this){
            boolean rc = false;
            
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use hasValue()."));
            
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2512)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                ActionRequestDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

