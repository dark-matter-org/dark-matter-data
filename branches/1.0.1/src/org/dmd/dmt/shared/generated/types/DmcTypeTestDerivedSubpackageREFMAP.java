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
 * The DmcTypeTestDerivedSubpackageREFMAP provides storage for a map of TestDerivedSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2760)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestDerivedSubpackageREFMAP extends DmcTypeTestDerivedSubpackageREF<TestDerivedSubpackageREF,StringName> {
public class DmcTypeTestDerivedSubpackageREFMAP extends DmcTypeTestDerivedSubpackageREF implements Serializable {
    
    protected Map<StringName,TestDerivedSubpackageREF> value;
    
    public DmcTypeTestDerivedSubpackageREFMAP(){
        value = null;
    }
    
    public DmcTypeTestDerivedSubpackageREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,TestDerivedSubpackageREF>();
        else
            value = new TreeMap<StringName,TestDerivedSubpackageREF>();
    }
    
    public StringName firstKey(){
        if (attrInfo.valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<StringName,TestDerivedSubpackageREF> map = (TreeMap<StringName,TestDerivedSubpackageREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + attrInfo.name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeTestDerivedSubpackageREFMAP getNew(){
        return(new DmcTypeTestDerivedSubpackageREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2814)
    public DmcAttribute<TestDerivedSubpackageREF> cloneIt(){
        synchronized(this){
            DmcTypeTestDerivedSubpackageREFMAP rc = getNew();
            for(TestDerivedSubpackageREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2830)
    public TestDerivedSubpackageREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestDerivedSubpackageREF newval = typeCheck(v);
            if (value == null)
                initValue();
            StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
            TestDerivedSubpackageREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2851)
    public TestDerivedSubpackageREF del(Object key){
        synchronized(this){
           if (key instanceof StringName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2863)
    public Iterator<TestDerivedSubpackageREF> getMV(){
        synchronized(this){
            Map<StringName,TestDerivedSubpackageREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestDerivedSubpackageREF>(value);
            else
                clone = new TreeMap<StringName,TestDerivedSubpackageREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2876)
    public Map<StringName,TestDerivedSubpackageREF> getMVCopy(){
        synchronized(this){
            Map<StringName,TestDerivedSubpackageREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestDerivedSubpackageREF>(value);
            else
                clone = new TreeMap<StringName,TestDerivedSubpackageREF>(value);
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2889)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2901)
    public TestDerivedSubpackageREF getByKey(Object key){
        synchronized(this){
            if (key instanceof StringName)
                return(value.get((StringName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2913)
    public boolean contains(Object v){
        synchronized(this){
            try {
                TestDerivedSubpackageREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2934)
    public boolean containsKey(Object key){
        synchronized(this){
           if (key instanceof StringName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}
