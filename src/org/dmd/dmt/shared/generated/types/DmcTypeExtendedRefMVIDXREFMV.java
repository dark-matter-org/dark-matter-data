package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVIDXDMO;    // DmcType import
/**
 * The DmcTypeExtendedRefMVIDXREFMV provides storage for a multi-valued ExtendedRefMVIDX
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2495)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:255)
 */
@SuppressWarnings("serial")
public class DmcTypeExtendedRefMVIDXREFMV extends DmcTypeExtendedRefMVIDXREF implements Serializable {
    
    private final static Iterator<ExtendedRefMVIDXDMO> emptyList = (new ArrayList<ExtendedRefMVIDXDMO>()).iterator();
    
    protected ArrayList<ExtendedRefMVIDXDMO> value;
    
    public DmcTypeExtendedRefMVIDXREFMV(){
    
    }
    
    public DmcTypeExtendedRefMVIDXREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeExtendedRefMVIDXREFMV getNew(){
        return(new DmcTypeExtendedRefMVIDXREFMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2526)
    public DmcAttribute<ExtendedRefMVIDXDMO> cloneIt(){
        synchronized(this){
            DmcTypeExtendedRefMVIDXREFMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(ExtendedRefMVIDXDMO val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2559)
    public ExtendedRefMVIDXDMO add(Object v) throws DmcValueException {
        synchronized(this){
            ExtendedRefMVIDXDMO rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<ExtendedRefMVIDXDMO>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2572)
    public ExtendedRefMVIDXDMO del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            ExtendedRefMVIDXDMO key = null;
            ExtendedRefMVIDXDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2606)
    public Iterator<ExtendedRefMVIDXDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<ExtendedRefMVIDXDMO> clone = new ArrayList<ExtendedRefMVIDXDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2618)
    public ArrayList<ExtendedRefMVIDXDMO> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<ExtendedRefMVIDXDMO>());
            else 
                return(new ArrayList<ExtendedRefMVIDXDMO>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2630)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2645)
    public ExtendedRefMVIDXDMO getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2656)
    public ExtendedRefMVIDXDMO setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            ExtendedRefMVIDXDMO rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<ExtendedRefMVIDXDMO>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2684)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2708)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                ExtendedRefMVIDXDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

