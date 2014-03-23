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
/**
 * The DmcTypeRelatedNumbersRuleDataREFMV provides storage for a multi-valued RelatedNumbersRuleDataREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2329)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:531)
 */
@SuppressWarnings("serial")
public class DmcTypeRelatedNumbersRuleDataREFMV extends DmcTypeRelatedNumbersRuleDataREF implements Serializable {
    
    private final static Iterator<RelatedNumbersRuleDataREF> emptyList = (new ArrayList<RelatedNumbersRuleDataREF>()).iterator();
    
    protected ArrayList<RelatedNumbersRuleDataREF> value;
    
    public DmcTypeRelatedNumbersRuleDataREFMV(){
    
    }
    
    public DmcTypeRelatedNumbersRuleDataREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeRelatedNumbersRuleDataREFMV getNew(){
        return(new DmcTypeRelatedNumbersRuleDataREFMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2360)
    public DmcAttribute<RelatedNumbersRuleDataREF> cloneIt(){
        synchronized(this){
            DmcTypeRelatedNumbersRuleDataREFMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(RelatedNumbersRuleDataREF val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2393)
    public RelatedNumbersRuleDataREF add(Object v) throws DmcValueException {
        synchronized(this){
            RelatedNumbersRuleDataREF rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<RelatedNumbersRuleDataREF>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2406)
    public RelatedNumbersRuleDataREF del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            RelatedNumbersRuleDataREF key = null;
            RelatedNumbersRuleDataREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2440)
    public Iterator<RelatedNumbersRuleDataREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<RelatedNumbersRuleDataREF> clone = new ArrayList<RelatedNumbersRuleDataREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2452)
    public ArrayList<RelatedNumbersRuleDataREF> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<RelatedNumbersRuleDataREF>());
            else 
                return(new ArrayList<RelatedNumbersRuleDataREF>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2464)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2479)
    public RelatedNumbersRuleDataREF getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2490)
    public RelatedNumbersRuleDataREF setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            RelatedNumbersRuleDataREF rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<RelatedNumbersRuleDataREF>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2518)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2542)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                RelatedNumbersRuleDataREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

