package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.DmtMultiValuedRequiredPartPrimitive;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtMultiValuedRequiredPartPrimitive;    // DmcType import
/**
 * The DmcTypeDmtMultiValuedRequiredPartPrimitiveMV provides storage for a multi-valued DmtMultiValuedRequiredPartPrimitive
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2338)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:126)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtMultiValuedRequiredPartPrimitiveMV extends DmcTypeDmtMultiValuedRequiredPartPrimitive implements Serializable {
    
    private final static Iterator<DmtMultiValuedRequiredPartPrimitive> emptyList = (new ArrayList<DmtMultiValuedRequiredPartPrimitive>()).iterator();
    
    protected ArrayList<DmtMultiValuedRequiredPartPrimitive> value;
    
    public DmcTypeDmtMultiValuedRequiredPartPrimitiveMV(){
    
    }
    
    public DmcTypeDmtMultiValuedRequiredPartPrimitiveMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeDmtMultiValuedRequiredPartPrimitiveMV getNew(){
        return(new DmcTypeDmtMultiValuedRequiredPartPrimitiveMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2369)
    public DmcAttribute<DmtMultiValuedRequiredPartPrimitive> cloneIt(){
        synchronized(this){
            DmcTypeDmtMultiValuedRequiredPartPrimitiveMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(DmtMultiValuedRequiredPartPrimitive val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2402)
    public DmtMultiValuedRequiredPartPrimitive add(Object v) throws DmcValueException {
        synchronized(this){
            DmtMultiValuedRequiredPartPrimitive rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<DmtMultiValuedRequiredPartPrimitive>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2415)
    public DmtMultiValuedRequiredPartPrimitive del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            DmtMultiValuedRequiredPartPrimitive key = null;
            DmtMultiValuedRequiredPartPrimitive rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2449)
    public Iterator<DmtMultiValuedRequiredPartPrimitive> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<DmtMultiValuedRequiredPartPrimitive> clone = new ArrayList<DmtMultiValuedRequiredPartPrimitive>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2461)
    public ArrayList<DmtMultiValuedRequiredPartPrimitive> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<DmtMultiValuedRequiredPartPrimitive>());
            else 
                return(new ArrayList<DmtMultiValuedRequiredPartPrimitive>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2473)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2488)
    public DmtMultiValuedRequiredPartPrimitive getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2499)
    public DmtMultiValuedRequiredPartPrimitive setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            DmtMultiValuedRequiredPartPrimitive rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<DmtMultiValuedRequiredPartPrimitive>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2527)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2551)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                DmtMultiValuedRequiredPartPrimitive val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

