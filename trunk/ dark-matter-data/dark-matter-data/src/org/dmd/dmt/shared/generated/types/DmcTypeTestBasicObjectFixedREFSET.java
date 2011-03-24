package org.dmd.dmt.shared.generated.types;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;    // primitive import
/**
 * The DmcTypeTestBasicObjectFixedREFSET provides storage for a set of TestBasicObjectFixedDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1340)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicObjectFixedREFSET extends DmcTypeTestBasicObjectFixedREF {
    
    Set<TestBasicObjectFixedDMO> value;
    
    public DmcTypeTestBasicObjectFixedREFSET(){
        value = null;
    }
    
    public DmcTypeTestBasicObjectFixedREFSET(DmcAttributeInfo ai){
        super(ai);
        if (ai.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestBasicObjectFixedDMO>();
        else
            value = new TreeSet<TestBasicObjectFixedDMO>();
    }
    
    public DmcTypeTestBasicObjectFixedREFSET getNew(){
        return(new DmcTypeTestBasicObjectFixedREFSET(attrInfo));
    }
    
    public TestBasicObjectFixedDMO add(Object v) throws DmcValueException {
        TestBasicObjectFixedDMO rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public TestBasicObjectFixedDMO del(Object v){
        TestBasicObjectFixedDMO rc = null;
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
    
    public Iterator<TestBasicObjectFixedDMO> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestBasicObjectFixedDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

