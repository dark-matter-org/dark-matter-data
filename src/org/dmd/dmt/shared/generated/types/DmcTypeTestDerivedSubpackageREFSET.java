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
 * The DmcTypeTestDerivedSubpackageREFSET provides storage for a set of TestDerivedSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2602)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:532)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedSubpackageREFSET extends DmcTypeTestDerivedSubpackageREF implements Serializable {
    
     private final static Iterator<TestDerivedSubpackageREF> emptyList =  (new HashSet<TestDerivedSubpackageREF>()).iterator();
    
    
    protected Set<TestDerivedSubpackageREF> value;
    
    public DmcTypeTestDerivedSubpackageREFSET(){
        value = null;
    }
    
    public DmcTypeTestDerivedSubpackageREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestDerivedSubpackageREF>();
        else
            value = new TreeSet<TestDerivedSubpackageREF>();
    }
    
    @Override
    public DmcTypeTestDerivedSubpackageREFSET getNew(){
        return(new DmcTypeTestDerivedSubpackageREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2643)
    public DmcAttribute<TestDerivedSubpackageREF> cloneIt(){
        synchronized(this){
            DmcTypeTestDerivedSubpackageREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(TestDerivedSubpackageREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2666)
    public TestDerivedSubpackageREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestDerivedSubpackageREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2683)
    public TestDerivedSubpackageREF del(Object v){
        synchronized(this){
            TestDerivedSubpackageREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2708)
    public Iterator<TestDerivedSubpackageREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<TestDerivedSubpackageREF>(value)).iterator() );
            else
                return( (new TreeSet<TestDerivedSubpackageREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2722)
    public Set<TestDerivedSubpackageREF> getMVCopy(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<TestDerivedSubpackageREF>());
                else
                    return(new HashSet<TestDerivedSubpackageREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<TestDerivedSubpackageREF>(value));
                else
                    return(new TreeSet<TestDerivedSubpackageREF>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2742)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2753)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                TestDerivedSubpackageREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

