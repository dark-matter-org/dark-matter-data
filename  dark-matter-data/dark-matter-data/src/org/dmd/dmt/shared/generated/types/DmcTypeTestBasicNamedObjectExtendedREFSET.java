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
 * The DmcTypeTestBasicNamedObjectExtendedREFSET provides storage for a set of TestBasicNamedObjectExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2530)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:532)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectExtendedREFSET extends DmcTypeTestBasicNamedObjectExtendedREF implements Serializable {
    
    protected Set<TestBasicNamedObjectExtendedREF> value;
    
    public DmcTypeTestBasicNamedObjectExtendedREFSET(){
        value = null;
    }
    
    public DmcTypeTestBasicNamedObjectExtendedREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestBasicNamedObjectExtendedREF>();
        else
            value = new TreeSet<TestBasicNamedObjectExtendedREF>();
    }
    
    @Override
    public DmcTypeTestBasicNamedObjectExtendedREFSET getNew(){
        return(new DmcTypeTestBasicNamedObjectExtendedREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2567)
    public DmcAttribute<TestBasicNamedObjectExtendedREF> cloneIt(){
        synchronized(this){
            DmcTypeTestBasicNamedObjectExtendedREFSET rc = getNew();
            for(TestBasicNamedObjectExtendedREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2586)
    public TestBasicNamedObjectExtendedREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestBasicNamedObjectExtendedREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2603)
    public TestBasicNamedObjectExtendedREF del(Object v){
        synchronized(this){
            TestBasicNamedObjectExtendedREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2628)
    public Iterator<TestBasicNamedObjectExtendedREF> getMV(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<TestBasicNamedObjectExtendedREF>(value)).iterator() );
            else
                return( (new TreeSet<TestBasicNamedObjectExtendedREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2645)
    public Set<TestBasicNamedObjectExtendedREF> getMVCopy(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return(new HashSet<TestBasicNamedObjectExtendedREF>(value));
            else
                return(new TreeSet<TestBasicNamedObjectExtendedREF>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2663)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2674)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                TestBasicNamedObjectExtendedREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

