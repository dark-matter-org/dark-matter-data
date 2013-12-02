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
import org.dmd.dmc.types.DefinitionName;    // key type import
/**
 * The DmcTypeTestOneLevelSubpackageExtendedREFMAP provides storage for a map of TestOneLevelSubpackageExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2842)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestOneLevelSubpackageExtendedREFMAP extends DmcTypeTestOneLevelSubpackageExtendedREF<TestOneLevelSubpackageExtendedREF,DefinitionName> {
public class DmcTypeTestOneLevelSubpackageExtendedREFMAP extends DmcTypeTestOneLevelSubpackageExtendedREF implements Serializable {
    
    private final static Iterator<TestOneLevelSubpackageExtendedREF> emptyList = (new HashMap<DefinitionName,TestOneLevelSubpackageExtendedREF>()).values().iterator();
    
    protected Map<DefinitionName,TestOneLevelSubpackageExtendedREF> value;
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMAP(){
        value = null;
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<DefinitionName,TestOneLevelSubpackageExtendedREF>();
        else
            value = new TreeMap<DefinitionName,TestOneLevelSubpackageExtendedREF>();
    }
    
    public DefinitionName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<DefinitionName,TestOneLevelSubpackageExtendedREF> map = (TreeMap<DefinitionName,TestOneLevelSubpackageExtendedREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeTestOneLevelSubpackageExtendedREFMAP getNew(){
        return(new DmcTypeTestOneLevelSubpackageExtendedREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2899)
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2919)
    public TestOneLevelSubpackageExtendedREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestOneLevelSubpackageExtendedREF newval = typeCheck(v);
            if (value == null)
                initValue();
            DefinitionName key = (DefinitionName)((DmcMappedAttributeIF)newval).getKey();
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2940)
    public TestOneLevelSubpackageExtendedREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof DefinitionName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2956)
    public Iterator<TestOneLevelSubpackageExtendedREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<DefinitionName,TestOneLevelSubpackageExtendedREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<DefinitionName,TestOneLevelSubpackageExtendedREF>(value);
            else
                clone = new TreeMap<DefinitionName,TestOneLevelSubpackageExtendedREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2973)
    public Map<DefinitionName,TestOneLevelSubpackageExtendedREF> getMVCopy(){
        synchronized(this){
            Map<DefinitionName,TestOneLevelSubpackageExtendedREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<DefinitionName,TestOneLevelSubpackageExtendedREF>();
                else
                    clone = new HashMap<DefinitionName,TestOneLevelSubpackageExtendedREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<DefinitionName,TestOneLevelSubpackageExtendedREF>();
                else
                    clone = new TreeMap<DefinitionName,TestOneLevelSubpackageExtendedREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2994)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3006)
    public TestOneLevelSubpackageExtendedREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof DefinitionName)
                return(value.get((DefinitionName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3021)
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3038)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof DefinitionName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

