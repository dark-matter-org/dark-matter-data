package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefTSDMO;    // DmcType import
/**
 * The DmcTypeExtendedRefTSREFMV provides storage for a multi-valued ExtendedRefTS
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2299)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:255)
 */
@SuppressWarnings("serial")
public class DmcTypeExtendedRefTSREFMV extends DmcTypeExtendedRefTSREF implements Serializable {
    
    private final static Iterator<ExtendedRefTSDMO> emptyList = (new ArrayList<ExtendedRefTSDMO>()).iterator();
    
    protected ArrayList<ExtendedRefTSDMO> value;
    
    public DmcTypeExtendedRefTSREFMV(){
    
    }
    
    public DmcTypeExtendedRefTSREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeExtendedRefTSREFMV getNew(){
        return(new DmcTypeExtendedRefTSREFMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2330)
    public DmcAttribute<ExtendedRefTSDMO> cloneIt(){
        synchronized(this){
            DmcTypeExtendedRefTSREFMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(ExtendedRefTSDMO val: value)
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
    public ExtendedRefTSDMO add(Object v) throws DmcValueException {
        synchronized(this){
            ExtendedRefTSDMO rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<ExtendedRefTSDMO>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2376)
    public ExtendedRefTSDMO del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            ExtendedRefTSDMO key = null;
            ExtendedRefTSDMO rc = null;
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
    public Iterator<ExtendedRefTSDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<ExtendedRefTSDMO> clone = new ArrayList<ExtendedRefTSDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2422)
    public ArrayList<ExtendedRefTSDMO> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<ExtendedRefTSDMO>());
            else 
                return(new ArrayList<ExtendedRefTSDMO>(value));
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
    public ExtendedRefTSDMO getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2460)
    public ExtendedRefTSDMO setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            ExtendedRefTSDMO rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<ExtendedRefTSDMO>(getAttributeInfo().indexSize);
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
                ExtendedRefTSDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

