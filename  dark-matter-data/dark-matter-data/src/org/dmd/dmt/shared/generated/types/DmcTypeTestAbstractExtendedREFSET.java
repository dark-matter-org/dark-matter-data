package org.dmd.dmt.shared.generated.types;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO;    // primitive import
/**
 * The DmcTypeTestAbstractExtendedREFSET provides storage for a set of TestAbstractExtendedDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1340)
 */
@SuppressWarnings("serial")
public class DmcTypeTestAbstractExtendedREFSET extends DmcTypeTestAbstractExtendedREF {
    
    Set<TestAbstractExtendedDMO> value;
    
    public DmcTypeTestAbstractExtendedREFSET(){
        value = null;
    }
    
    public DmcTypeTestAbstractExtendedREFSET(DmcAttributeInfo ai){
        super(ai);
        if (ai.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestAbstractExtendedDMO>();
        else
            value = new TreeSet<TestAbstractExtendedDMO>();
    }
    
    public DmcTypeTestAbstractExtendedREFSET getNew(){
        return(new DmcTypeTestAbstractExtendedREFSET(attrInfo));
    }
    
    public TestAbstractExtendedDMO add(Object v) throws DmcValueException {
        TestAbstractExtendedDMO rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public TestAbstractExtendedDMO del(Object v){
        TestAbstractExtendedDMO rc = null;
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
    
    public Iterator<TestAbstractExtendedDMO> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestAbstractExtendedDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

