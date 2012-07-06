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
 * The DmcTypeTestDerivedDiffSubpackageREFMAP provides storage for a map of TestDerivedDiffSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2779)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestDerivedDiffSubpackageREFMAP extends DmcTypeTestDerivedDiffSubpackageREF<TestDerivedDiffSubpackageREF,StringName> {
public class DmcTypeTestDerivedDiffSubpackageREFMAP extends DmcTypeTestDerivedDiffSubpackageREF implements Serializable {
    
    protected Map<StringName,TestDerivedDiffSubpackageREF> value;
    
    public DmcTypeTestDerivedDiffSubpackageREFMAP(){
        value = null;
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,TestDerivedDiffSubpackageREF>();
        else
            value = new TreeMap<StringName,TestDerivedDiffSubpackageREF>();
    }
    
    public StringName firstKey(){
        if (attrInfo.valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<StringName,TestDerivedDiffSubpackageREF> map = (TreeMap<StringName,TestDerivedDiffSubpackageREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + attrInfo.name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeTestDerivedDiffSubpackageREFMAP getNew(){
        return(new DmcTypeTestDerivedDiffSubpackageREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2833)
    public DmcAttribute<TestDerivedDiffSubpackageREF> cloneIt(){
        synchronized(this){
            DmcTypeTestDerivedDiffSubpackageREFMAP rc = getNew();
            for(TestDerivedDiffSubpackageREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2849)
    public TestDerivedDiffSubpackageREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestDerivedDiffSubpackageREF newval = typeCheck(v);
            if (value == null)
                initValue();
            StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
            TestDerivedDiffSubpackageREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2870)
    public TestDerivedDiffSubpackageREF del(Object key){
        synchronized(this){
           if (key instanceof StringName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2882)
    public Iterator<TestDerivedDiffSubpackageREF> getMV(){
        synchronized(this){
            Map<StringName,TestDerivedDiffSubpackageREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestDerivedDiffSubpackageREF>(value);
            else
                clone = new TreeMap<StringName,TestDerivedDiffSubpackageREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2895)
    public Map<StringName,TestDerivedDiffSubpackageREF> getMVCopy(){
        synchronized(this){
            Map<StringName,TestDerivedDiffSubpackageREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestDerivedDiffSubpackageREF>(value);
            else
                clone = new TreeMap<StringName,TestDerivedDiffSubpackageREF>(value);
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2908)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2920)
    public TestDerivedDiffSubpackageREF getByKey(Object key){
        synchronized(this){
            if (key instanceof StringName)
                return(value.get((StringName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2932)
    public boolean contains(Object v){
        synchronized(this){
            try {
                TestDerivedDiffSubpackageREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2953)
    public boolean containsKey(Object key){
        synchronized(this){
           if (key instanceof StringName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

