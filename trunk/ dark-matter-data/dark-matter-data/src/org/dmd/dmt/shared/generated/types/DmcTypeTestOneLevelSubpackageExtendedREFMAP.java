package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
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
 * The DmcTypeTestOneLevelSubpackageExtendedREFMAP provides storage for a map of TestOneLevelSubpackageExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:1835)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:444)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestOneLevelSubpackageExtendedREFMAP extends DmcTypeTestOneLevelSubpackageExtendedREF<TestOneLevelSubpackageExtendedREF,StringName> {
public class DmcTypeTestOneLevelSubpackageExtendedREFMAP extends DmcTypeTestOneLevelSubpackageExtendedREF implements Serializable {
    
    Map<StringName,TestOneLevelSubpackageExtendedREF> value;
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMAP(){
        value = null;
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,TestOneLevelSubpackageExtendedREF>();
        else
            value = new TreeMap<StringName,TestOneLevelSubpackageExtendedREF>();
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMAP getNew(){
        return(new DmcTypeTestOneLevelSubpackageExtendedREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestOneLevelSubpackageExtendedREF> cloneIt(){
        DmcTypeTestOneLevelSubpackageExtendedREFMAP rc = getNew();
        for(TestOneLevelSubpackageExtendedREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public TestOneLevelSubpackageExtendedREF add(Object v) throws DmcValueException {
        TestOneLevelSubpackageExtendedREF rc = typeCheck(v);
        if (value == null)
            initValue();
        StringName key = (StringName)((DmcMappedAttributeIF)rc).getKey();
        value.put(key,rc);
        return(rc);
    }
    
    public TestOneLevelSubpackageExtendedREF del(Object key){
        if (key instanceof StringName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public Iterator<TestOneLevelSubpackageExtendedREF> getMV(){
        return(value.values().iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public TestOneLevelSubpackageExtendedREF getByKey(Object key){
        if (key instanceof StringName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestOneLevelSubpackageExtendedREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

