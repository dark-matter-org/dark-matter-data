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
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1634)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:436)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedDiffSubpackageREFSET extends DmcTypeTestDerivedDiffSubpackageREF implements Serializable {
    
    Set<TestDerivedDiffSubpackageREF> value;
    
    public DmcTypeTestDerivedDiffSubpackageREFSET(){
        value = null;
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestDerivedDiffSubpackageREF>();
        else
            value = new TreeSet<TestDerivedDiffSubpackageREF>();
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFSET getNew(){
        return(new DmcTypeTestDerivedDiffSubpackageREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestDerivedDiffSubpackageREF> cloneIt(){
        DmcTypeTestDerivedDiffSubpackageREFSET rc = getNew();
        for(TestDerivedDiffSubpackageREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public TestDerivedDiffSubpackageREF add(Object v) throws DmcValueException {
        TestDerivedDiffSubpackageREF rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    public TestDerivedDiffSubpackageREF del(Object v){
        TestDerivedDiffSubpackageREF rc = null;
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
    
    public Iterator<TestDerivedDiffSubpackageREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestDerivedDiffSubpackageREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

