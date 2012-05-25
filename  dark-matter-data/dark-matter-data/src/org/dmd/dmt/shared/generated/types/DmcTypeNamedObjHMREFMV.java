package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NamedObjHMDMO;    // DmcType import
/**
 * The DmcTypeNamedObjHMREFMV provides storage for a multi-valued NamedObjHM
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2244)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:255)
 */
@SuppressWarnings("serial")
public class DmcTypeNamedObjHMREFMV extends DmcTypeNamedObjHMREF implements Serializable {
    
    protected ArrayList<NamedObjHMDMO> value;
    
    public DmcTypeNamedObjHMREFMV(){
    
    }
    
    public DmcTypeNamedObjHMREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeNamedObjHMREFMV getNew(){
        return(new DmcTypeNamedObjHMREFMV(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2274)
    public DmcAttribute<NamedObjHMDMO> cloneIt(){
        synchronized(this){
            DmcTypeNamedObjHMREFMV rc = getNew();
            if (attrInfo.indexSize == 0){
                for(NamedObjHMDMO val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2303)
    public NamedObjHMDMO add(Object v) throws DmcValueException {
        synchronized(this){
            NamedObjHMDMO rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<NamedObjHMDMO>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2316)
    public NamedObjHMDMO del(Object v){
        synchronized(this){
            NamedObjHMDMO key = null;
            NamedObjHMDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2347)
    public Iterator<NamedObjHMDMO> getMV(){
        synchronized(this){
            ArrayList<NamedObjHMDMO> clone = new ArrayList<NamedObjHMDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2356)
    public ArrayList<NamedObjHMDMO> getMVCopy(){
        synchronized(this){
            ArrayList<NamedObjHMDMO> clone = new ArrayList<NamedObjHMDMO>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2366)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2381)
    public NamedObjHMDMO getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2392)
    public NamedObjHMDMO setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (attrInfo.indexSize == 0)
                throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= attrInfo.indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
            
            NamedObjHMDMO rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<NamedObjHMDMO>(attrInfo.indexSize);
                for(int i=0;i<attrInfo.indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2420)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2444)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                NamedObjHMDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

