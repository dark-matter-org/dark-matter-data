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
 * The DmcTypeTestOneLevelSubpackageREFSET provides storage for a set of TestOneLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2563)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:532)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageREFSET extends DmcTypeTestOneLevelSubpackageREF implements Serializable {
    
    protected Set<TestOneLevelSubpackageREF> value;
    
    public DmcTypeTestOneLevelSubpackageREFSET(){
        value = null;
    }
    
    public DmcTypeTestOneLevelSubpackageREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestOneLevelSubpackageREF>();
        else
            value = new TreeSet<TestOneLevelSubpackageREF>();
    }
    
    @Override
    public DmcTypeTestOneLevelSubpackageREFSET getNew(){
        return(new DmcTypeTestOneLevelSubpackageREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2600)
    public DmcAttribute<TestOneLevelSubpackageREF> cloneIt(){
        synchronized(this){
            DmcTypeTestOneLevelSubpackageREFSET rc = getNew();
            for(TestOneLevelSubpackageREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2619)
    public TestOneLevelSubpackageREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestOneLevelSubpackageREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2636)
    public TestOneLevelSubpackageREF del(Object v){
        synchronized(this){
            TestOneLevelSubpackageREF rc = null;
            if (value == null)
                return(rc);
            
            try {
                rc = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            if (value.contains(rc)){
                value.remove(rc);
                if (value.size() == 0)
                    value = null;
            }
            else
                rc = null;
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2661)
    public Iterator<TestOneLevelSubpackageREF> getMV(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<TestOneLevelSubpackageREF>(value)).iterator() );
            else
                return( (new TreeSet<TestOneLevelSubpackageREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2678)
    public Set<TestOneLevelSubpackageREF> getMVCopy(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return(new HashSet<TestOneLevelSubpackageREF>(value));
            else
                return(new TreeSet<TestOneLevelSubpackageREF>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2696)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2707)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                TestOneLevelSubpackageREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

