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
 * The DmcTypeTestBasicNamedObjectExtendedREFMAP provides storage for a map of TestBasicNamedObjectExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2579)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:532)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestBasicNamedObjectExtendedREFMAP extends DmcTypeTestBasicNamedObjectExtendedREF<TestBasicNamedObjectExtendedREF,StringName> {
public class DmcTypeTestBasicNamedObjectExtendedREFMAP extends DmcTypeTestBasicNamedObjectExtendedREF implements Serializable {
    
    protected Map<StringName,TestBasicNamedObjectExtendedREF> value;
    
    public DmcTypeTestBasicNamedObjectExtendedREFMAP(){
        value = null;
    }
    
    public DmcTypeTestBasicNamedObjectExtendedREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,TestBasicNamedObjectExtendedREF>();
        else
            value = new TreeMap<StringName,TestBasicNamedObjectExtendedREF>();
    }
    
    @Override
    public DmcTypeTestBasicNamedObjectExtendedREFMAP getNew(){
        return(new DmcTypeTestBasicNamedObjectExtendedREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2622)
    public DmcAttribute<TestBasicNamedObjectExtendedREF> cloneIt(){
        synchronized(this){
            DmcTypeTestBasicNamedObjectExtendedREFMAP rc = getNew();
            for(TestBasicNamedObjectExtendedREF val: value.values())
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
    public TestBasicNamedObjectExtendedREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestBasicNamedObjectExtendedREF newval = typeCheck(v);
            if (value == null)
                initValue();
            StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
            TestBasicNamedObjectExtendedREF oldval = value.put(key,newval);
            
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
    public TestBasicNamedObjectExtendedREF del(Object key){
        synchronized(this){
           if (key instanceof StringName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2671)
    public Iterator<TestBasicNamedObjectExtendedREF> getMV(){
        synchronized(this){
            Map<StringName,TestBasicNamedObjectExtendedREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestBasicNamedObjectExtendedREF>(value);
            else
                clone = new TreeMap<StringName,TestBasicNamedObjectExtendedREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2684)
    public Map<StringName,TestBasicNamedObjectExtendedREF> getMVCopy(){
        synchronized(this){
            Map<StringName,TestBasicNamedObjectExtendedREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestBasicNamedObjectExtendedREF>(value);
            else
                clone = new TreeMap<StringName,TestBasicNamedObjectExtendedREF>(value);
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
    public TestBasicNamedObjectExtendedREF getByKey(Object key){
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
                TestBasicNamedObjectExtendedREF val = typeCheck(v);
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

