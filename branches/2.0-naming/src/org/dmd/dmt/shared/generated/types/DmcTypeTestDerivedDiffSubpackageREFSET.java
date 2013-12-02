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
 * The DmcTypeTestDerivedDiffSubpackageREFSET provides storage for a set of TestDerivedDiffSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2609)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:532)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedDiffSubpackageREFSET extends DmcTypeTestDerivedDiffSubpackageREF implements Serializable {
    
     private final static Iterator<TestDerivedDiffSubpackageREF> emptyList =  (new HashSet<TestDerivedDiffSubpackageREF>()).iterator();
    
    
    protected Set<TestDerivedDiffSubpackageREF> value;
    
    public DmcTypeTestDerivedDiffSubpackageREFSET(){
        value = null;
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestDerivedDiffSubpackageREF>();
        else
            value = new TreeSet<TestDerivedDiffSubpackageREF>();
    }
    
    @Override
    public DmcTypeTestDerivedDiffSubpackageREFSET getNew(){
        return(new DmcTypeTestDerivedDiffSubpackageREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2650)
    public DmcAttribute<TestDerivedDiffSubpackageREF> cloneIt(){
        synchronized(this){
            DmcTypeTestDerivedDiffSubpackageREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(TestDerivedDiffSubpackageREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2673)
    public TestDerivedDiffSubpackageREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestDerivedDiffSubpackageREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2690)
    public TestDerivedDiffSubpackageREF del(Object v){
        synchronized(this){
            TestDerivedDiffSubpackageREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2715)
    public Iterator<TestDerivedDiffSubpackageREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<TestDerivedDiffSubpackageREF>(value)).iterator() );
            else
                return( (new TreeSet<TestDerivedDiffSubpackageREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2729)
    public Set<TestDerivedDiffSubpackageREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<TestDerivedDiffSubpackageREF>());
                else
                    return(new HashSet<TestDerivedDiffSubpackageREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<TestDerivedDiffSubpackageREF>(value));
                else
                    return(new TreeSet<TestDerivedDiffSubpackageREF>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2749)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2760)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                TestDerivedDiffSubpackageREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

