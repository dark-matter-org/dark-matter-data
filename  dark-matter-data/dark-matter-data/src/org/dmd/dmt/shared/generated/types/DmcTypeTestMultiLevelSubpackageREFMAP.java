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
 * The DmcTypeTestMultiLevelSubpackageREFMAP provides storage for a map of TestMultiLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:1571)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:563)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestMultiLevelSubpackageREFMAP extends DmcTypeTestMultiLevelSubpackageREF<TestMultiLevelSubpackageREF,StringName> {
public class DmcTypeTestMultiLevelSubpackageREFMAP extends DmcTypeTestMultiLevelSubpackageREF {
    
    Map<StringName,TestMultiLevelSubpackageREF> value;
    
    public DmcTypeTestMultiLevelSubpackageREFMAP(){
        value = null;
    }
    
    public DmcTypeTestMultiLevelSubpackageREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,TestMultiLevelSubpackageREF>();
        else
            value = new TreeMap<StringName,TestMultiLevelSubpackageREF>();
    }
    
    public DmcTypeTestMultiLevelSubpackageREFMAP getNew(){
        return(new DmcTypeTestMultiLevelSubpackageREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestMultiLevelSubpackageREF> cloneIt(){
        DmcTypeTestMultiLevelSubpackageREFMAP rc = getNew();
        for(TestMultiLevelSubpackageREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public TestMultiLevelSubpackageREF add(Object v) throws DmcValueException {
        TestMultiLevelSubpackageREF rc = typeCheck(v);
        if (value == null);
            initValue();
        StringName key = (StringName)((DmcMappedAttributeIF)rc).getKey();
        value.put(key,rc);
        return(rc);
    }
    
    public TestMultiLevelSubpackageREF del(Object key){
        if (key instanceof StringName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public Iterator<TestMultiLevelSubpackageREF> getMV(){
        return(value.values().iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public TestMultiLevelSubpackageREF getByKey(Object key){
        if (key instanceof StringName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestMultiLevelSubpackageREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

