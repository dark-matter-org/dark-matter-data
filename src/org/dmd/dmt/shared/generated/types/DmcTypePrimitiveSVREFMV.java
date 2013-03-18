package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.PrimitiveSVDMO;    // DmcType import
/**
 * The DmcTypePrimitiveSVREFMV provides storage for a multi-valued PrimitiveSV
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2270)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:255)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveSVREFMV extends DmcTypePrimitiveSVREF implements Serializable {
    
    private final static Iterator<PrimitiveSVDMO> emptyList = (new ArrayList<PrimitiveSVDMO>()).iterator();
    
    protected ArrayList<PrimitiveSVDMO> value;
    
    public DmcTypePrimitiveSVREFMV(){
    
    }
    
    public DmcTypePrimitiveSVREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypePrimitiveSVREFMV getNew(){
        return(new DmcTypePrimitiveSVREFMV(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2302)
    public DmcAttribute<PrimitiveSVDMO> cloneIt(){
        synchronized(this){
            DmcTypePrimitiveSVREFMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (attrInfo.indexSize == 0){
                for(PrimitiveSVDMO val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2335)
    public PrimitiveSVDMO add(Object v) throws DmcValueException {
        synchronized(this){
            PrimitiveSVDMO rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<PrimitiveSVDMO>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2348)
    public PrimitiveSVDMO del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            PrimitiveSVDMO key = null;
            PrimitiveSVDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2382)
    public Iterator<PrimitiveSVDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<PrimitiveSVDMO> clone = new ArrayList<PrimitiveSVDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2405)
    public ArrayList<PrimitiveSVDMO> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<PrimitiveSVDMO>());
            else{
                ArrayList<PrimitiveSVDMO> rc = new  ArrayList<PrimitiveSVDMO>(value.size());
                if (attrInfo.indexSize == 0){
                    for(PrimitiveSVDMO val: value)
                        rc.add((PrimitiveSVDMO) val.cloneIt());
                }
                else{
                    // Initialize all of the indices to null
                    for(int i=0;i<attrInfo.indexSize;i++)
                        rc.add(null);
    
                    for(int index=0; index<value.size(); index++){
                        if (value.get(index) != null)
                            rc.set(index, (PrimitiveSVDMO) value.get(index).cloneIt());
                    }
                }
                return(rc);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2441)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2456)
    public PrimitiveSVDMO getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2467)
    public PrimitiveSVDMO setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (attrInfo.indexSize == 0)
                throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= attrInfo.indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
            
            PrimitiveSVDMO rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<PrimitiveSVDMO>(attrInfo.indexSize);
                for(int i=0;i<attrInfo.indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2495)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2519)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                PrimitiveSVDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

