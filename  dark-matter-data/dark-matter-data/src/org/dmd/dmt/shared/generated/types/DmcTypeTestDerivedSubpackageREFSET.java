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
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2180)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:495)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedSubpackageREFSET extends DmcTypeTestDerivedSubpackageREF implements Serializable {
    
    Set<TestDerivedSubpackageREF> value;
    
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
    public DmcAttribute<TestDerivedSubpackageREF> cloneIt(){
        DmcTypeTestDerivedSubpackageREFSET rc = getNew();
        for(TestDerivedSubpackageREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public TestDerivedSubpackageREF add(Object v) throws DmcValueException {
        TestDerivedSubpackageREF rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public TestDerivedSubpackageREF del(Object v){
        TestDerivedSubpackageREF rc = null;
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
    
    @Override
    public Iterator<TestDerivedSubpackageREF> getMV(){
        Set<TestDerivedSubpackageREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TestDerivedSubpackageREF>(value);
        else
            clone = new TreeSet<TestDerivedSubpackageREF>(value);
        return(clone.iterator());
    }
    
    public Set<TestDerivedSubpackageREF> getMVCopy(){
        Set<TestDerivedSubpackageREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TestDerivedSubpackageREF>(value);
        else
            clone = new TreeSet<TestDerivedSubpackageREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestDerivedSubpackageREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

