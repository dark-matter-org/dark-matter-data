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
 * The DmcTypeTestOneLevelSubpackageREFMAP provides storage for a map of TestOneLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2500)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:503)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestOneLevelSubpackageREFMAP extends DmcTypeTestOneLevelSubpackageREF<TestOneLevelSubpackageREF,StringName> {
public class DmcTypeTestOneLevelSubpackageREFMAP extends DmcTypeTestOneLevelSubpackageREF implements Serializable {
    
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
    
    @Override
    public DmcTypeTestOneLevelSubpackageREFMAP getNew(){
        return(new DmcTypeTestOneLevelSubpackageREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2543)
    public DmcAttribute<TestOneLevelSubpackageREF> cloneIt(){
        synchronized(this){
            DmcTypeTestOneLevelSubpackageREFMAP rc = getNew();
            for(TestOneLevelSubpackageREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2559)
    public TestOneLevelSubpackageREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestOneLevelSubpackageREF newval = typeCheck(v);
            if (value == null)
                initValue();
            StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
            TestOneLevelSubpackageREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2580)
    public TestOneLevelSubpackageREF del(Object key){
        synchronized(this){
           if (key instanceof StringName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2592)
    public Iterator<TestOneLevelSubpackageREF> getMV(){
        synchronized(this){
            Map<StringName,TestOneLevelSubpackageREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestOneLevelSubpackageREF>(value);
            else
                clone = new TreeMap<StringName,TestOneLevelSubpackageREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2605)
    public Map<StringName,TestOneLevelSubpackageREF> getMVCopy(){
        synchronized(this){
            Map<StringName,TestOneLevelSubpackageREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestOneLevelSubpackageREF>(value);
            else
                clone = new TreeMap<StringName,TestOneLevelSubpackageREF>(value);
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2618)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2630)
    public TestOneLevelSubpackageREF getByKey(Object key){
        synchronized(this){
            if (key instanceof StringName)
                return(value.get(key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2642)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                TestOneLevelSubpackageREF val = typeCheck(v);
                rc = value.containsValue(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2657)
    public boolean containsKey(Object key){
        synchronized(this){
            boolean rc = false;
           if (key instanceof StringName)
                rc = value.containsKey(key);
            return(rc);
        }
    }
    
}

