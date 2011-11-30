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
 * The DmcTypeTestBasicNamedObjectFixedREFMAP provides storage for a map of TestBasicNamedObjectFixedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2579)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:532)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestBasicNamedObjectFixedREFMAP extends DmcTypeTestBasicNamedObjectFixedREF<TestBasicNamedObjectFixedREF,StringName> {
public class DmcTypeTestBasicNamedObjectFixedREFMAP extends DmcTypeTestBasicNamedObjectFixedREF implements Serializable {
    
    protected Map<StringName,TestBasicNamedObjectFixedREF> value;
    
    public DmcTypeTestBasicNamedObjectFixedREFMAP(){
        value = null;
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,TestBasicNamedObjectFixedREF>();
        else
            value = new TreeMap<StringName,TestBasicNamedObjectFixedREF>();
    }
    
    @Override
    public DmcTypeTestBasicNamedObjectFixedREFMAP getNew(){
        return(new DmcTypeTestBasicNamedObjectFixedREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2622)
    public DmcAttribute<TestBasicNamedObjectFixedREF> cloneIt(){
        synchronized(this){
            DmcTypeTestBasicNamedObjectFixedREFMAP rc = getNew();
            for(TestBasicNamedObjectFixedREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2638)
    public TestBasicNamedObjectFixedREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestBasicNamedObjectFixedREF newval = typeCheck(v);
            if (value == null)
                initValue();
            StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
            TestBasicNamedObjectFixedREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2659)
    public TestBasicNamedObjectFixedREF del(Object key){
        synchronized(this){
           if (key instanceof StringName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2671)
    public Iterator<TestBasicNamedObjectFixedREF> getMV(){
        synchronized(this){
            Map<StringName,TestBasicNamedObjectFixedREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestBasicNamedObjectFixedREF>(value);
            else
                clone = new TreeMap<StringName,TestBasicNamedObjectFixedREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2684)
    public Map<StringName,TestBasicNamedObjectFixedREF> getMVCopy(){
        synchronized(this){
            Map<StringName,TestBasicNamedObjectFixedREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestBasicNamedObjectFixedREF>(value);
            else
                clone = new TreeMap<StringName,TestBasicNamedObjectFixedREF>(value);
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2697)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2709)
    public TestBasicNamedObjectFixedREF getByKey(Object key){
        synchronized(this){
            if (key instanceof StringName)
                return(value.get(key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2721)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                TestBasicNamedObjectFixedREF val = typeCheck(v);
                rc = value.containsValue(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2736)
    public boolean containsKey(Object key){
        synchronized(this){
            boolean rc = false;
           if (key instanceof StringName)
                rc = value.containsKey(key);
            return(rc);
        }
    }
    
}

