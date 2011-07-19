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
 * The DmcTypeTestOneLevelSubpackageExtendedREFSET provides storage for a set of TestOneLevelSubpackageExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2288)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:495)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageExtendedREFSET extends DmcTypeTestOneLevelSubpackageExtendedREF implements Serializable {
    
    Set<TestOneLevelSubpackageExtendedREF> value;
    
    public DmcTypeTestOneLevelSubpackageExtendedREFSET(){
        value = null;
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestOneLevelSubpackageExtendedREF>();
        else
            value = new TreeSet<TestOneLevelSubpackageExtendedREF>();
    }
    
    @Override
    public DmcTypeTestOneLevelSubpackageExtendedREFSET getNew(){
        return(new DmcTypeTestOneLevelSubpackageExtendedREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2325)
    public DmcAttribute<TestOneLevelSubpackageExtendedREF> cloneIt(){
        synchronized(this){
            DmcTypeTestOneLevelSubpackageExtendedREFSET rc = getNew();
            for(TestOneLevelSubpackageExtendedREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2344)
    public TestOneLevelSubpackageExtendedREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestOneLevelSubpackageExtendedREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2361)
    public TestOneLevelSubpackageExtendedREF del(Object v){
        synchronized(this){
            TestOneLevelSubpackageExtendedREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2380)
    public Iterator<TestOneLevelSubpackageExtendedREF> getMV(){
        synchronized(this){
            Set<TestOneLevelSubpackageExtendedREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<TestOneLevelSubpackageExtendedREF>(value);
            else
                clone = new TreeSet<TestOneLevelSubpackageExtendedREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2393)
    public Set<TestOneLevelSubpackageExtendedREF> getMVCopy(){
        synchronized(this){
            Set<TestOneLevelSubpackageExtendedREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<TestOneLevelSubpackageExtendedREF>(value);
            else
                clone = new TreeSet<TestOneLevelSubpackageExtendedREF>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2407)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2418)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                TestOneLevelSubpackageExtendedREF val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

