package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.UsingObjRefHMDMO;    // DmcType import
/**
 * The DmcTypeUsingObjRefHMREFMV provides storage for a multi-valued UsingObjRefHM
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2270)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:255)
 */
@SuppressWarnings("serial")
public class DmcTypeUsingObjRefHMREFMV extends DmcTypeUsingObjRefHMREF implements Serializable {
    
    private final static Iterator<UsingObjRefHMDMO> emptyList = (new ArrayList<UsingObjRefHMDMO>()).iterator();
    
    protected ArrayList<UsingObjRefHMDMO> value;
    
    public DmcTypeUsingObjRefHMREFMV(){
    
    }
    
    public DmcTypeUsingObjRefHMREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeUsingObjRefHMREFMV getNew(){
        return(new DmcTypeUsingObjRefHMREFMV(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2302)
    public DmcAttribute<UsingObjRefHMDMO> cloneIt(){
        synchronized(this){
            DmcTypeUsingObjRefHMREFMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (attrInfo.indexSize == 0){
                for(UsingObjRefHMDMO val: value)
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
    public UsingObjRefHMDMO add(Object v) throws DmcValueException {
        synchronized(this){
            UsingObjRefHMDMO rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<UsingObjRefHMDMO>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2348)
    public UsingObjRefHMDMO del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            UsingObjRefHMDMO key = null;
            UsingObjRefHMDMO rc = null;
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
    public Iterator<UsingObjRefHMDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<UsingObjRefHMDMO> clone = new ArrayList<UsingObjRefHMDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2405)
    public ArrayList<UsingObjRefHMDMO> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<UsingObjRefHMDMO>());
            else{
                ArrayList<UsingObjRefHMDMO> rc = new  ArrayList<UsingObjRefHMDMO>(value.size());
                if (attrInfo.indexSize == 0){
                    for(UsingObjRefHMDMO val: value)
                        rc.add((UsingObjRefHMDMO) val.cloneIt());
                }
                else{
                    // Initialize all of the indices to null
                    for(int i=0;i<attrInfo.indexSize;i++)
                        rc.add(null);
    
                    for(int index=0; index<value.size(); index++){
                        if (value.get(index) != null)
                            rc.set(index, (UsingObjRefHMDMO) value.get(index).cloneIt());
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
    public UsingObjRefHMDMO getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2467)
    public UsingObjRefHMDMO setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (attrInfo.indexSize == 0)
                throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= attrInfo.indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
            
            UsingObjRefHMDMO rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<UsingObjRefHMDMO>(attrInfo.indexSize);
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
                UsingObjRefHMDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

