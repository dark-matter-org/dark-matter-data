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
 * The DmcTypeTestOneLevelSubpackageExtendedREFSET provides storage for a set of TestOneLevelSubpackageExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1395)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:536)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageExtendedREFSET extends DmcTypeTestOneLevelSubpackageExtendedREF {
    
    Set<TestOneLevelSubpackageExtendedREF> value;
    
    public DmcTypeTestOneLevelSubpackageExtendedREFSET(){
        value = null;
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFSET(DmcAttributeInfo ai){
        super(ai);
        if (ai.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestOneLevelSubpackageExtendedREF>();
        else
            value = new TreeSet<TestOneLevelSubpackageExtendedREF>();
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFSET getNew(){
        return(new DmcTypeTestOneLevelSubpackageExtendedREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestOneLevelSubpackageExtendedREF> cloneIt(){
        DmcTypeTestOneLevelSubpackageExtendedREFSET rc = getNew();
        for(TestOneLevelSubpackageExtendedREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public TestOneLevelSubpackageExtendedREF add(Object v) throws DmcValueException {
        TestOneLevelSubpackageExtendedREF rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public TestOneLevelSubpackageExtendedREF del(Object v){
        TestOneLevelSubpackageExtendedREF rc = null;
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
    
    public Iterator<TestOneLevelSubpackageExtendedREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestOneLevelSubpackageExtendedREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

