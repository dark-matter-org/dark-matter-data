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
 * The DmcTypeTestOneLevelSubpackageREFSET provides storage for a set of TestOneLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2017)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:456)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageREFSET extends DmcTypeTestOneLevelSubpackageREF implements Serializable {
    
    Set<TestOneLevelSubpackageREF> value;
    
    public DmcTypeTestOneLevelSubpackageREFSET(){
        value = null;
    }
    
    public DmcTypeTestOneLevelSubpackageREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<TestOneLevelSubpackageREF>();
        else
            value = new TreeSet<TestOneLevelSubpackageREF>();
    }
    
    @Override
    public DmcTypeTestOneLevelSubpackageREFSET getNew(){
        return(new DmcTypeTestOneLevelSubpackageREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestOneLevelSubpackageREF> cloneIt(){
        DmcTypeTestOneLevelSubpackageREFSET rc = getNew();
        for(TestOneLevelSubpackageREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public TestOneLevelSubpackageREF add(Object v) throws DmcValueException {
        TestOneLevelSubpackageREF rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public TestOneLevelSubpackageREF del(Object v){
        TestOneLevelSubpackageREF rc = null;
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
    public Iterator<TestOneLevelSubpackageREF> getMV(){
        Set<TestOneLevelSubpackageREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TestOneLevelSubpackageREF>(value);
        else
            clone = new TreeSet<TestOneLevelSubpackageREF>(value);
        return(clone.iterator());
    }
    
    public Set<TestOneLevelSubpackageREF> getMVCopy(){
        Set<TestOneLevelSubpackageREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<TestOneLevelSubpackageREF>(value);
        else
            clone = new TreeSet<TestOneLevelSubpackageREF>(value);
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
            TestOneLevelSubpackageREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

