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
 * The DmcTypeTestOneLevelSubpackageREFMAP provides storage for a map of TestOneLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2870)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:538)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestOneLevelSubpackageREFMAP extends DmcTypeTestOneLevelSubpackageREF<TestOneLevelSubpackageREF,DefinitionName> {
public class DmcTypeTestOneLevelSubpackageREFMAP extends DmcTypeTestOneLevelSubpackageREF implements Serializable {
    
    private final static Iterator<TestOneLevelSubpackageREF> emptyList = (new HashMap<DefinitionName,TestOneLevelSubpackageREF>()).values().iterator();
    
    protected Map<DefinitionName,TestOneLevelSubpackageREF> value;
    
    public DmcTypeTestOneLevelSubpackageREFMAP(){
        value = null;
    }
    
    public DmcTypeTestOneLevelSubpackageREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<DefinitionName,TestOneLevelSubpackageREF>();
        else
            value = new TreeMap<DefinitionName,TestOneLevelSubpackageREF>();
    }
    
    public DefinitionName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<DefinitionName,TestOneLevelSubpackageREF> map = (TreeMap<DefinitionName,TestOneLevelSubpackageREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeTestOneLevelSubpackageREFMAP getNew(){
        return(new DmcTypeTestOneLevelSubpackageREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2927)
    public DmcAttribute<TestOneLevelSubpackageREF> cloneIt(){
        synchronized(this){
            DmcTypeTestOneLevelSubpackageREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2947)
    public TestOneLevelSubpackageREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestOneLevelSubpackageREF newval = typeCheck(v);
            if (value == null)
                initValue();
            DefinitionName key = (DefinitionName)((DmcMappedAttributeIF)newval).getKey();
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2968)
    public TestOneLevelSubpackageREF del(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2984)
    public Iterator<TestOneLevelSubpackageREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<DefinitionName,TestOneLevelSubpackageREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<DefinitionName,TestOneLevelSubpackageREF>(value);
            else
                clone = new TreeMap<DefinitionName,TestOneLevelSubpackageREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3001)
    public Map<DefinitionName,TestOneLevelSubpackageREF> getMVCopy(){
        synchronized(this){
            Map<DefinitionName,TestOneLevelSubpackageREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<DefinitionName,TestOneLevelSubpackageREF>();
                else
                    clone = new HashMap<DefinitionName,TestOneLevelSubpackageREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<DefinitionName,TestOneLevelSubpackageREF>();
                else
                    clone = new TreeMap<DefinitionName,TestOneLevelSubpackageREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3022)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3034)
    public TestOneLevelSubpackageREF getByKey(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3049)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                TestOneLevelSubpackageREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3066)
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

