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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2828)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestBasicNamedObjectFixedREFMAP extends DmcTypeTestBasicNamedObjectFixedREF<TestBasicNamedObjectFixedREF,StringName> {
public class DmcTypeTestBasicNamedObjectFixedREFMAP extends DmcTypeTestBasicNamedObjectFixedREF implements Serializable {
    
    private final static Iterator<TestBasicNamedObjectFixedREF> emptyList = (new HashMap<StringName,TestBasicNamedObjectFixedREF>()).values().iterator();
    
    protected Map<StringName,TestBasicNamedObjectFixedREF> value;
    
    public DmcTypeTestBasicNamedObjectFixedREFMAP(){
        value = null;
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,TestBasicNamedObjectFixedREF>();
        else
            value = new TreeMap<StringName,TestBasicNamedObjectFixedREF>();
    }
    
    public StringName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<StringName,TestBasicNamedObjectFixedREF> map = (TreeMap<StringName,TestBasicNamedObjectFixedREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeTestBasicNamedObjectFixedREFMAP getNew(){
        return(new DmcTypeTestBasicNamedObjectFixedREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2885)
    public DmcAttribute<TestBasicNamedObjectFixedREF> cloneIt(){
        synchronized(this){
            DmcTypeTestBasicNamedObjectFixedREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2905)
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2926)
    public TestBasicNamedObjectFixedREF del(Object key){
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
    public Iterator<TestBasicNamedObjectFixedREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<StringName,TestBasicNamedObjectFixedREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,TestBasicNamedObjectFixedREF>(value);
            else
                clone = new TreeMap<StringName,TestBasicNamedObjectFixedREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2959)
    public Map<StringName,TestBasicNamedObjectFixedREF> getMVCopy(){
        synchronized(this){
            Map<StringName,TestBasicNamedObjectFixedREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<StringName,TestBasicNamedObjectFixedREF>();
                else
                    clone = new HashMap<StringName,TestBasicNamedObjectFixedREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<StringName,TestBasicNamedObjectFixedREF>();
                else
                    clone = new TreeMap<StringName,TestBasicNamedObjectFixedREF>(value);
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
    public TestBasicNamedObjectFixedREF getByKey(Object key){
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
                TestBasicNamedObjectFixedREF val = typeCheck(v);
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

