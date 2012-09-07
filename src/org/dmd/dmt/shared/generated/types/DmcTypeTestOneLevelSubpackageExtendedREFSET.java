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
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2595)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:532)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageExtendedREFSET extends DmcTypeTestOneLevelSubpackageExtendedREF implements Serializable {
    
     private final static Iterator<TestOneLevelSubpackageExtendedREF> emptyList =  (new HashSet<TestOneLevelSubpackageExtendedREF>()).iterator();
    
    
    protected Set<TestOneLevelSubpackageExtendedREF> value;
    
    public DmcTypeTestOneLevelSubpackageExtendedREFSET(){
        value = null;
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestOneLevelSubpackageExtendedREF>();
        else
            value = new TreeSet<TestOneLevelSubpackageExtendedREF>();
    }
    
    @Override
    public DmcTypeTestOneLevelSubpackageExtendedREFSET getNew(){
        return(new DmcTypeTestOneLevelSubpackageExtendedREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2636)
    public DmcAttribute<TestOneLevelSubpackageExtendedREF> cloneIt(){
        synchronized(this){
            DmcTypeTestOneLevelSubpackageExtendedREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2659)
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2676)
    public TestOneLevelSubpackageExtendedREF del(Object v){
        synchronized(this){
            TestOneLevelSubpackageExtendedREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2701)
    public Iterator<TestOneLevelSubpackageExtendedREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<TestOneLevelSubpackageExtendedREF>(value)).iterator() );
            else
                return( (new TreeSet<TestOneLevelSubpackageExtendedREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2715)
    public Set<TestOneLevelSubpackageExtendedREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<TestOneLevelSubpackageExtendedREF>());
                else
                    return(new HashSet<TestOneLevelSubpackageExtendedREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<TestOneLevelSubpackageExtendedREF>(value));
                else
                    return(new TreeSet<TestOneLevelSubpackageExtendedREF>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2735)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2746)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                TestOneLevelSubpackageExtendedREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

