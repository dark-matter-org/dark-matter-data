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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2828)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestOneLevelSubpackageExtendedREFMAP extends DmcTypeTestOneLevelSubpackageExtendedREF<TestOneLevelSubpackageExtendedREF,StringName> {
public class DmcTypeTestOneLevelSubpackageExtendedREFMAP extends DmcTypeTestOneLevelSubpackageExtendedREF implements Serializable {
    
    private final static Iterator<TestOneLevelSubpackageExtendedREF> emptyList = (new HashMap<StringName,TestOneLevelSubpackageExtendedREF>()).values().iterator();
    
    protected Map<StringName,TestOneLevelSubpackageExtendedREF> value;
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMAP(){
        value = null;
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,TestOneLevelSubpackageExtendedREF>();
        else
            value = new TreeMap<StringName,TestOneLevelSubpackageExtendedREF>();
    }
    
    public StringName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<StringName,TestOneLevelSubpackageExtendedREF> map = (TreeMap<StringName,TestOneLevelSubpackageExtendedREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeTestOneLevelSubpackageExtendedREFMAP getNew(){
        return(new DmcTypeTestOneLevelSubpackageExtendedREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2885)
    public DmcAttribute<TestOneLevelSubpackageExtendedREF> cloneIt(){
        synchronized(this){
            DmcTypeTestOneLevelSubpackageExtendedREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(TestOneLevelSubpackageExtendedREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2905)
    public TestOneLevelSubpackageExtendedREF add(Object v) throws DmcValueException {
        synchronized(this){
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2926)
    public TestOneLevelSubpackageExtendedREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof StringName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2942)
    public Iterator<TestOneLevelSubpackageExtendedREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<StringName,TestOneLevelSubpackageExtendedREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestOneLevelSubpackageExtendedREF>(value);
            else
                clone = new TreeMap<StringName,TestOneLevelSubpackageExtendedREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2959)
    public Map<StringName,TestOneLevelSubpackageExtendedREF> getMVCopy(){
        synchronized(this){
            Map<StringName,TestOneLevelSubpackageExtendedREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<StringName,TestOneLevelSubpackageExtendedREF>();
                else
                    clone = new HashMap<StringName,TestOneLevelSubpackageExtendedREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<StringName,TestOneLevelSubpackageExtendedREF>();
                else
                    clone = new TreeMap<StringName,TestOneLevelSubpackageExtendedREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2980)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2992)
    public TestOneLevelSubpackageExtendedREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof StringName)
                return(value.get((StringName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3007)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                TestOneLevelSubpackageExtendedREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3024)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof StringName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

