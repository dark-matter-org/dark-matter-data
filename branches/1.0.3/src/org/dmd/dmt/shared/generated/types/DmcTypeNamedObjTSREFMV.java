package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NamedObjTSDMO;    // DmcType import
/**
 * The DmcTypeNamedObjTSREFMV provides storage for a multi-valued NamedObjTS
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2251)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:255)
 */
@SuppressWarnings("serial")
public class DmcTypeNamedObjTSREFMV extends DmcTypeNamedObjTSREF implements Serializable {
    
    protected ArrayList<NamedObjTSDMO> value;
    
    public DmcTypeNamedObjTSREFMV(){
    
    }
    
    public DmcTypeNamedObjTSREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeNamedObjTSREFMV getNew(){
        return(new DmcTypeNamedObjTSREFMV(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2281)
    public DmcAttribute<NamedObjTSDMO> cloneIt(){
        synchronized(this){
            DmcTypeNamedObjTSREFMV rc = getNew();
            if (attrInfo.indexSize == 0){
                for(NamedObjTSDMO val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2310)
    public NamedObjTSDMO add(Object v) throws DmcValueException {
        synchronized(this){
            NamedObjTSDMO rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<NamedObjTSDMO>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2323)
    public NamedObjTSDMO del(Object v){
        synchronized(this){
            NamedObjTSDMO key = null;
            NamedObjTSDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2354)
    public Iterator<NamedObjTSDMO> getMV(){
        synchronized(this){
            ArrayList<NamedObjTSDMO> clone = new ArrayList<NamedObjTSDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2363)
    public ArrayList<NamedObjTSDMO> getMVCopy(){
        synchronized(this){
            ArrayList<NamedObjTSDMO> clone = new ArrayList<NamedObjTSDMO>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2373)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2388)
    public NamedObjTSDMO getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2399)
    public NamedObjTSDMO setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (attrInfo.indexSize == 0)
                throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= attrInfo.indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
            
            NamedObjTSDMO rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<NamedObjTSDMO>(attrInfo.indexSize);
                for(int i=0;i<attrInfo.indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2427)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2451)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                NamedObjTSDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}
