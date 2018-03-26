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
 * The DmcTypeTestMultiLevelSubpackageREFSET provides storage for a set of TestMultiLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2637)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeTestMultiLevelSubpackageREFSET extends DmcTypeTestMultiLevelSubpackageREF implements Serializable {
    
     private final static Iterator<TestMultiLevelSubpackageREF> emptyList =  (new HashSet<TestMultiLevelSubpackageREF>()).iterator();
    
    
    protected Set<TestMultiLevelSubpackageREF> value;
    
    public DmcTypeTestMultiLevelSubpackageREFSET(){
        value = null;
    }
    
    public DmcTypeTestMultiLevelSubpackageREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestMultiLevelSubpackageREF>();
        else
            value = new TreeSet<TestMultiLevelSubpackageREF>();
    }
    
    @Override
    public DmcTypeTestMultiLevelSubpackageREFSET getNew(){
        return(new DmcTypeTestMultiLevelSubpackageREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2678)
    public DmcAttribute<TestMultiLevelSubpackageREF> cloneIt(){
        synchronized(this){
            DmcTypeTestMultiLevelSubpackageREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(TestMultiLevelSubpackageREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2701)
    public TestMultiLevelSubpackageREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestMultiLevelSubpackageREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2718)
    public TestMultiLevelSubpackageREF del(Object v){
        synchronized(this){
            TestMultiLevelSubpackageREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2743)
    public Iterator<TestMultiLevelSubpackageREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<TestMultiLevelSubpackageREF>(value)).iterator() );
            else
                return( (new TreeSet<TestMultiLevelSubpackageREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2757)
    public Set<TestMultiLevelSubpackageREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<TestMultiLevelSubpackageREF>());
                else
                    return(new HashSet<TestMultiLevelSubpackageREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<TestMultiLevelSubpackageREF>(value));
                else
                    return(new TreeSet<TestMultiLevelSubpackageREF>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2777)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2788)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                TestMultiLevelSubpackageREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

