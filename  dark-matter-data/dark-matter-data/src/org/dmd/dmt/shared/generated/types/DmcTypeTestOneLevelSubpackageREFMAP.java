package org.dmd.dmt.shared.generated.types;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.StringName;    // key type import
/**
 * The DmcTypeTestOneLevelSubpackageREFMAP provides storage for a map of TestOneLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:1571)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:563)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestOneLevelSubpackageREFMAP extends DmcTypeTestOneLevelSubpackageREF<TestOneLevelSubpackageREF,StringName> {
public class DmcTypeTestOneLevelSubpackageREFMAP extends DmcTypeTestOneLevelSubpackageREF {
    
    Map<StringName,TestOneLevelSubpackageREF> value;
    
    public DmcTypeTestOneLevelSubpackageREFMAP(){
        value = null;
    }
    
    public DmcTypeTestOneLevelSubpackageREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,TestOneLevelSubpackageREF>();
        else
            value = new TreeMap<StringName,TestOneLevelSubpackageREF>();
    }
    
    public DmcTypeTestOneLevelSubpackageREFMAP getNew(){
        return(new DmcTypeTestOneLevelSubpackageREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestOneLevelSubpackageREF> cloneIt(){
        DmcTypeTestOneLevelSubpackageREFMAP rc = getNew();
        for(TestOneLevelSubpackageREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public TestOneLevelSubpackageREF add(Object v) throws DmcValueException {
        TestOneLevelSubpackageREF rc = typeCheck(v);
        if (value == null)
            initValue();
        StringName key = (StringName)((DmcMappedAttributeIF)rc).getKey();
        value.put(key,rc);
        return(rc);
    }
    
    public TestOneLevelSubpackageREF del(Object key){
        if (key instanceof StringName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public Iterator<TestOneLevelSubpackageREF> getMV(){
        return(value.values().iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public TestOneLevelSubpackageREF getByKey(Object key){
        if (key instanceof StringName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestOneLevelSubpackageREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

