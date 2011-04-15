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
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;    // DmcType import
/**
 * The DmcTypeTestBasicObjectFixedREFSET provides storage for a set of TestBasicObjectFixedDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1850)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:191)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicObjectFixedREFSET extends DmcTypeTestBasicObjectFixedREF implements Serializable {
    
    Set<TestBasicObjectFixedDMO> value;
    
    public DmcTypeTestBasicObjectFixedREFSET(){
        value = null;
    }
    
    public DmcTypeTestBasicObjectFixedREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestBasicObjectFixedDMO>();
        else
            value = new TreeSet<TestBasicObjectFixedDMO>();
    }
    
    @Override
    public DmcTypeTestBasicObjectFixedREFSET getNew(){
        return(new DmcTypeTestBasicObjectFixedREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestBasicObjectFixedDMO> cloneIt(){
        DmcTypeTestBasicObjectFixedREFSET rc = getNew();
        for(TestBasicObjectFixedDMO val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public TestBasicObjectFixedDMO add(Object v) throws DmcValueException {
        TestBasicObjectFixedDMO rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public TestBasicObjectFixedDMO del(Object v){
        TestBasicObjectFixedDMO rc = null;
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
    public Iterator<TestBasicObjectFixedDMO> getMV(){
        Set<TestBasicObjectFixedDMO> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TestBasicObjectFixedDMO>(value);
        else
            clone = new TreeSet<TestBasicObjectFixedDMO>(value);
        return(clone.iterator());
    }
    
    public Set<TestBasicObjectFixedDMO> getMVCopy(){
        Set<TestBasicObjectFixedDMO> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TestBasicObjectFixedDMO>(value);
        else
            clone = new TreeSet<TestBasicObjectFixedDMO>(value);
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
            TestBasicObjectFixedDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

