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
 * The DmcTypeTestMultiLevelSubpackageREFSET provides storage for a set of TestMultiLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2032)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:456)
 */
@SuppressWarnings("serial")
public class DmcTypeTestMultiLevelSubpackageREFSET extends DmcTypeTestMultiLevelSubpackageREF implements Serializable {
    
    Set<TestMultiLevelSubpackageREF> value;
    
    public DmcTypeTestMultiLevelSubpackageREFSET(){
        value = null;
    }
    
    public DmcTypeTestMultiLevelSubpackageREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestMultiLevelSubpackageREF>();
        else
            value = new TreeSet<TestMultiLevelSubpackageREF>();
    }
    
    @Override
    public DmcTypeTestMultiLevelSubpackageREFSET getNew(){
        return(new DmcTypeTestMultiLevelSubpackageREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestMultiLevelSubpackageREF> cloneIt(){
        DmcTypeTestMultiLevelSubpackageREFSET rc = getNew();
        for(TestMultiLevelSubpackageREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public TestMultiLevelSubpackageREF add(Object v) throws DmcValueException {
        TestMultiLevelSubpackageREF rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public TestMultiLevelSubpackageREF del(Object v){
        TestMultiLevelSubpackageREF rc = null;
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
    public Iterator<TestMultiLevelSubpackageREF> getMV(){
        Set<TestMultiLevelSubpackageREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TestMultiLevelSubpackageREF>(value);
        else
            clone = new TreeSet<TestMultiLevelSubpackageREF>(value);
        return(clone.iterator());
    }
    
    public Set<TestMultiLevelSubpackageREF> getMVCopy(){
        Set<TestMultiLevelSubpackageREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TestMultiLevelSubpackageREF>(value);
        else
            clone = new TreeSet<TestMultiLevelSubpackageREF>(value);
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
            TestMultiLevelSubpackageREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

