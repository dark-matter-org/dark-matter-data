package org.dmd.dmt.shared.generated.types;

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
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1395)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:536)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedSubpackageREFSET extends DmcTypeTestDerivedSubpackageREF {
    
    Set<TestDerivedSubpackageREF> value;
    
    public DmcTypeTestDerivedSubpackageREFSET(){
        value = null;
    }
    
    public DmcTypeTestDerivedSubpackageREFSET(DmcAttributeInfo ai){
        super(ai);
        if (ai.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestDerivedSubpackageREF>();
        else
            value = new TreeSet<TestDerivedSubpackageREF>();
    }
    
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
    
    public TestDerivedSubpackageREF add(Object v) throws DmcValueException {
        TestDerivedSubpackageREF rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public TestDerivedSubpackageREF del(Object v){
        TestDerivedSubpackageREF rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else;
            rc = null;
        return(rc);
    }
    
    public Iterator<TestDerivedSubpackageREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
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

