package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.DmtMultiValuedRequiredPartWithReferences;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtMultiValuedRequiredPartWithReferences;    // DmcType import
/**
 * The DmcTypeDmtMultiValuedRequiredPartWithReferencesMV provides storage for a multi-valued DmtMultiValuedRequiredPartWithReferences
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2515)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:126)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtMultiValuedRequiredPartWithReferencesMV extends DmcTypeDmtMultiValuedRequiredPartWithReferences implements Serializable {
    
    private final static Iterator<DmtMultiValuedRequiredPartWithReferences> emptyList = (new ArrayList<DmtMultiValuedRequiredPartWithReferences>()).iterator();
    
    protected ArrayList<DmtMultiValuedRequiredPartWithReferences> value;
    
    public DmcTypeDmtMultiValuedRequiredPartWithReferencesMV(){
    
    }
    
    public DmcTypeDmtMultiValuedRequiredPartWithReferencesMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeDmtMultiValuedRequiredPartWithReferencesMV getNew(){
        return(new DmcTypeDmtMultiValuedRequiredPartWithReferencesMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2546)
    public DmcAttribute<DmtMultiValuedRequiredPartWithReferences> cloneIt(){
        synchronized(this){
            DmcTypeDmtMultiValuedRequiredPartWithReferencesMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(DmtMultiValuedRequiredPartWithReferences val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2579)
    public DmtMultiValuedRequiredPartWithReferences add(Object v) throws DmcValueException {
        synchronized(this){
            DmtMultiValuedRequiredPartWithReferences rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<DmtMultiValuedRequiredPartWithReferences>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2592)
    public DmtMultiValuedRequiredPartWithReferences del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            DmtMultiValuedRequiredPartWithReferences key = null;
            DmtMultiValuedRequiredPartWithReferences rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2626)
    public Iterator<DmtMultiValuedRequiredPartWithReferences> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<DmtMultiValuedRequiredPartWithReferences> clone = new ArrayList<DmtMultiValuedRequiredPartWithReferences>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2638)
    public ArrayList<DmtMultiValuedRequiredPartWithReferences> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<DmtMultiValuedRequiredPartWithReferences>());
            else 
                return(new ArrayList<DmtMultiValuedRequiredPartWithReferences>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2650)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2665)
    public DmtMultiValuedRequiredPartWithReferences getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2676)
    public DmtMultiValuedRequiredPartWithReferences setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            DmtMultiValuedRequiredPartWithReferences rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<DmtMultiValuedRequiredPartWithReferences>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2704)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2728)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                DmtMultiValuedRequiredPartWithReferences val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

