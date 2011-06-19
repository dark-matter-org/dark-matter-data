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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2245)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:499)
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
    
    @Override
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
    
    @Override
    public TestOneLevelSubpackageExtendedREF add(Object v) throws DmcValueException {
        TestOneLevelSubpackageExtendedREF newval = typeCheck(v);
        if (value == null)
            initValue();
        StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
        TestOneLevelSubpackageExtendedREF oldval = value.put(key,newval);
        
        if (oldval != null){
            // We had a value with this key, ensure that the value actually changed
            if (oldval.valuesAreEqual(newval))
                newval = null;
        }
        
        return(newval);
    }
    
    @Override
    public TestOneLevelSubpackageExtendedREF del(Object key){
        if (key instanceof StringName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public Iterator<TestOneLevelSubpackageExtendedREF> getMV(){
        Map<StringName,TestOneLevelSubpackageExtendedREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<StringName,TestOneLevelSubpackageExtendedREF>(value);
        else
            clone = new TreeMap<StringName,TestOneLevelSubpackageExtendedREF>(value);
        return(clone.values().iterator());
    }
    
    public Map<StringName,TestOneLevelSubpackageExtendedREF> getMVCopy(){
        Map<StringName,TestOneLevelSubpackageExtendedREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<StringName,TestOneLevelSubpackageExtendedREF>(value);
        else
            clone = new TreeMap<StringName,TestOneLevelSubpackageExtendedREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public TestOneLevelSubpackageExtendedREF getByKey(Object key){
        if (key instanceof StringName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestOneLevelSubpackageExtendedREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
    @Override
    public boolean containsKey(Object key){
        boolean rc = false;
        if (key instanceof StringName)
            rc = value.containsKey(key);
        return(rc);
    }
    
}

