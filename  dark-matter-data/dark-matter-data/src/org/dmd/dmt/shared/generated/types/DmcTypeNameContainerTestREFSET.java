package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;    // DmcType import
/**
 * The DmcTypeNameContainerTestREFSET provides storage for a set of NameContainerTestDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2305)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:223)
 */
@SuppressWarnings("serial")
public class DmcTypeNameContainerTestREFSET extends DmcTypeNameContainerTestREF implements Serializable {
    
    Set<NameContainerTestDMO> value;
    
    public DmcTypeNameContainerTestREFSET(){
        value = null;
    }
    
    public DmcTypeNameContainerTestREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<NameContainerTestDMO>();
        else
            value = new TreeSet<NameContainerTestDMO>();
    }
    
    @Override
    public DmcTypeNameContainerTestREFSET getNew(){
        return(new DmcTypeNameContainerTestREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2342)
    public DmcAttribute<NameContainerTestDMO> cloneIt(){
        synchronized(this){
            DmcTypeNameContainerTestREFSET rc = getNew();
            for(NameContainerTestDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2361)
    public NameContainerTestDMO add(Object v) throws DmcValueException {
        synchronized(this){
            NameContainerTestDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2378)
    public NameContainerTestDMO del(Object v){
        synchronized(this){
            NameContainerTestDMO rc = null;
            try {
                rc = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            if (value.contains(rc))
                value.remove(rc);
            else
                rc = null;
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2397)
    public Iterator<NameContainerTestDMO> getMV(){
        synchronized(this){
            Set<NameContainerTestDMO> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<NameContainerTestDMO>(value);
            else
                clone = new TreeSet<NameContainerTestDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2410)
    public Set<NameContainerTestDMO> getMVCopy(){
        synchronized(this){
            Set<NameContainerTestDMO> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<NameContainerTestDMO>(value);
            else
                clone = new TreeSet<NameContainerTestDMO>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2424)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2435)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                NameContainerTestDMO val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

