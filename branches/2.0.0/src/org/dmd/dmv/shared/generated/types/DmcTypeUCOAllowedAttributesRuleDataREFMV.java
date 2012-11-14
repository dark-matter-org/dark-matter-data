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
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmv.shared.generated.dmo.UCOAllowedAttributesRuleDataDMO;    // DmcType import
/**
 * The DmcTypeUCOAllowedAttributesRuleDataREFMV provides storage for a multi-valued UCOAllowedAttributesRuleData
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2299)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:255)
 */
@SuppressWarnings("serial")
public class DmcTypeUCOAllowedAttributesRuleDataREFMV extends DmcTypeUCOAllowedAttributesRuleDataREF implements Serializable {
    
    private final static Iterator<UCOAllowedAttributesRuleDataDMO> emptyList = (new ArrayList<UCOAllowedAttributesRuleDataDMO>()).iterator();
    
    protected ArrayList<UCOAllowedAttributesRuleDataDMO> value;
    
    public DmcTypeUCOAllowedAttributesRuleDataREFMV(){
    
    }
    
    public DmcTypeUCOAllowedAttributesRuleDataREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeUCOAllowedAttributesRuleDataREFMV getNew(){
        return(new DmcTypeUCOAllowedAttributesRuleDataREFMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2330)
    public DmcAttribute<UCOAllowedAttributesRuleDataDMO> cloneIt(){
        synchronized(this){
            DmcTypeUCOAllowedAttributesRuleDataREFMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(UCOAllowedAttributesRuleDataDMO val: value)
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
    public UCOAllowedAttributesRuleDataDMO add(Object v) throws DmcValueException {
        synchronized(this){
            UCOAllowedAttributesRuleDataDMO rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<UCOAllowedAttributesRuleDataDMO>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2376)
    public UCOAllowedAttributesRuleDataDMO del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            UCOAllowedAttributesRuleDataDMO key = null;
            UCOAllowedAttributesRuleDataDMO rc = null;
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
    public Iterator<UCOAllowedAttributesRuleDataDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<UCOAllowedAttributesRuleDataDMO> clone = new ArrayList<UCOAllowedAttributesRuleDataDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2422)
    public ArrayList<UCOAllowedAttributesRuleDataDMO> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<UCOAllowedAttributesRuleDataDMO>());
            else 
                return(new ArrayList<UCOAllowedAttributesRuleDataDMO>(value));
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
    public UCOAllowedAttributesRuleDataDMO getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2460)
    public UCOAllowedAttributesRuleDataDMO setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            UCOAllowedAttributesRuleDataDMO rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<UCOAllowedAttributesRuleDataDMO>(getAttributeInfo().indexSize);
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
                UCOAllowedAttributesRuleDataDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

