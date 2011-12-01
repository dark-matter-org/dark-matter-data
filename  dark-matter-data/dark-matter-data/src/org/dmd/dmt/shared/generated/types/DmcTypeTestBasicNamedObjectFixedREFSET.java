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
/**
 * The DmcTypeTestBasicNamedObjectFixedREFSET provides storage for a set of TestBasicNamedObjectFixedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2382)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:524)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectFixedREFSET extends DmcTypeTestBasicNamedObjectFixedREF implements Serializable {
    
    protected Set<TestBasicNamedObjectFixedREF> value;
    
    public DmcTypeTestBasicNamedObjectFixedREFSET(){
        value = null;
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestBasicNamedObjectFixedREF>();
        else
            value = new TreeSet<TestBasicNamedObjectFixedREF>();
    }
    
    @Override
    public DmcTypeTestBasicNamedObjectFixedREFSET getNew(){
        return(new DmcTypeTestBasicNamedObjectFixedREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2419)
    public DmcAttribute<TestBasicNamedObjectFixedREF> cloneIt(){
        synchronized(this){
            DmcTypeTestBasicNamedObjectFixedREFSET rc = getNew();
            for(TestBasicNamedObjectFixedREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2438)
    public TestBasicNamedObjectFixedREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestBasicNamedObjectFixedREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2455)
    public TestBasicNamedObjectFixedREF del(Object v){
        synchronized(this){
            TestBasicNamedObjectFixedREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2474)
    public Iterator<TestBasicNamedObjectFixedREF> getMV(){
        synchronized(this){
            Set<TestBasicNamedObjectFixedREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<TestBasicNamedObjectFixedREF>(value);
            else
                clone = new TreeSet<TestBasicNamedObjectFixedREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2487)
    public Set<TestBasicNamedObjectFixedREF> getMVCopy(){
        synchronized(this){
            Set<TestBasicNamedObjectFixedREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<TestBasicNamedObjectFixedREF>(value);
            else
                clone = new TreeSet<TestBasicNamedObjectFixedREF>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2501)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2512)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                TestBasicNamedObjectFixedREF val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

