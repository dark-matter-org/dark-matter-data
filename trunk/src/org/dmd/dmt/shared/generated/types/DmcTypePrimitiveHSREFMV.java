package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.PrimitiveHSDMO;    // DmcType import
/**
 * The DmcTypePrimitiveHSREFMV provides storage for a multi-valued PrimitiveHS
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2280)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:255)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveHSREFMV extends DmcTypePrimitiveHSREF implements Serializable {
    
    protected ArrayList<PrimitiveHSDMO> value;
    
    public DmcTypePrimitiveHSREFMV(){
    
    }
    
    public DmcTypePrimitiveHSREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypePrimitiveHSREFMV getNew(){
        return(new DmcTypePrimitiveHSREFMV(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2310)
    public DmcAttribute<PrimitiveHSDMO> cloneIt(){
        synchronized(this){
            DmcTypePrimitiveHSREFMV rc = getNew();
            if (attrInfo.indexSize == 0){
                for(PrimitiveHSDMO val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2339)
    public PrimitiveHSDMO add(Object v) throws DmcValueException {
        synchronized(this){
            PrimitiveHSDMO rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<PrimitiveHSDMO>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2352)
    public PrimitiveHSDMO del(Object v){
        synchronized(this){
            PrimitiveHSDMO key = null;
            PrimitiveHSDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2383)
    public Iterator<PrimitiveHSDMO> getMV(){
        synchronized(this){
            ArrayList<PrimitiveHSDMO> clone = new ArrayList<PrimitiveHSDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2392)
    public ArrayList<PrimitiveHSDMO> getMVCopy(){
        synchronized(this){
            ArrayList<PrimitiveHSDMO> clone = new ArrayList<PrimitiveHSDMO>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2402)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2417)
    public PrimitiveHSDMO getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2428)
    public PrimitiveHSDMO setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (attrInfo.indexSize == 0)
                throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= attrInfo.indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
            
            PrimitiveHSDMO rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<PrimitiveHSDMO>(attrInfo.indexSize);
                for(int i=0;i<attrInfo.indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2456)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2480)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                PrimitiveHSDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

