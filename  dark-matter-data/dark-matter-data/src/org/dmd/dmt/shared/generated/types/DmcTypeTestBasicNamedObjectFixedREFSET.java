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
 * The DmcTypeTestBasicNamedObjectFixedREFSET provides storage for a set of TestBasicNamedObjectFixedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2035)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:490)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectFixedREFSET extends DmcTypeTestBasicNamedObjectFixedREF implements Serializable {
    
    Set<TestBasicNamedObjectFixedREF> value;
    
    public DmcTypeTestBasicNamedObjectFixedREFSET(){
        value = null;
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestBasicNamedObjectFixedREF>();
        else
            value = new TreeSet<TestBasicNamedObjectFixedREF>();
    }
    
    @Override
    public DmcTypeTestBasicNamedObjectFixedREFSET getNew(){
        return(new DmcTypeTestBasicNamedObjectFixedREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestBasicNamedObjectFixedREF> cloneIt(){
        DmcTypeTestBasicNamedObjectFixedREFSET rc = getNew();
        for(TestBasicNamedObjectFixedREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public TestBasicNamedObjectFixedREF add(Object v) throws DmcValueException {
        TestBasicNamedObjectFixedREF rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public TestBasicNamedObjectFixedREF del(Object v){
        TestBasicNamedObjectFixedREF rc = null;
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
    public Iterator<TestBasicNamedObjectFixedREF> getMV(){
        Set<TestBasicNamedObjectFixedREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TestBasicNamedObjectFixedREF>(value);
        else
            clone = new TreeSet<TestBasicNamedObjectFixedREF>(value);
        return(clone.iterator());
    }
    
    public Set<TestBasicNamedObjectFixedREF> getMVCopy(){
        Set<TestBasicNamedObjectFixedREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TestBasicNamedObjectFixedREF>(value);
        else
            clone = new TreeSet<TestBasicNamedObjectFixedREF>(value);
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
            TestBasicNamedObjectFixedREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

