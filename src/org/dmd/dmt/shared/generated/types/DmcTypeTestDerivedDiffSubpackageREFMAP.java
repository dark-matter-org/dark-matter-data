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
 * The DmcTypeTestDerivedDiffSubpackageREFMAP provides storage for a map of TestDerivedDiffSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3044)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:544)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestDerivedDiffSubpackageREFMAP extends DmcTypeTestDerivedDiffSubpackageREF<TestDerivedDiffSubpackageREF,DefinitionName> {
public class DmcTypeTestDerivedDiffSubpackageREFMAP extends DmcTypeTestDerivedDiffSubpackageREF implements Serializable {
    
    private final static Iterator<TestDerivedDiffSubpackageREF> emptyList = (new HashMap<DefinitionName,TestDerivedDiffSubpackageREF>()).values().iterator();
    
    protected Map<DefinitionName,TestDerivedDiffSubpackageREF> value;
    
    public DmcTypeTestDerivedDiffSubpackageREFMAP(){
        value = null;
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<DefinitionName,TestDerivedDiffSubpackageREF>();
        else
            value = new TreeMap<DefinitionName,TestDerivedDiffSubpackageREF>();
    }
    
    public DefinitionName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<DefinitionName,TestDerivedDiffSubpackageREF> map = (TreeMap<DefinitionName,TestDerivedDiffSubpackageREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeTestDerivedDiffSubpackageREFMAP getNew(){
        return(new DmcTypeTestDerivedDiffSubpackageREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3101)
    public DmcAttribute<TestDerivedDiffSubpackageREF> cloneIt(){
        synchronized(this){
            DmcTypeTestDerivedDiffSubpackageREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3121)
    public TestDerivedDiffSubpackageREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestDerivedDiffSubpackageREF newval = typeCheck(v);
            if (value == null)
                initValue();
            DefinitionName key = (DefinitionName)((DmcMappedAttributeIF)newval).getKey();
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3142)
    public TestDerivedDiffSubpackageREF del(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3158)
    public Iterator<TestDerivedDiffSubpackageREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<DefinitionName,TestDerivedDiffSubpackageREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<DefinitionName,TestDerivedDiffSubpackageREF>(value);
            else
                clone = new TreeMap<DefinitionName,TestDerivedDiffSubpackageREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3175)
    public Map<DefinitionName,TestDerivedDiffSubpackageREF> getMVCopy(){
        synchronized(this){
            Map<DefinitionName,TestDerivedDiffSubpackageREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<DefinitionName,TestDerivedDiffSubpackageREF>();
                else
                    clone = new HashMap<DefinitionName,TestDerivedDiffSubpackageREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<DefinitionName,TestDerivedDiffSubpackageREF>();
                else
                    clone = new TreeMap<DefinitionName,TestDerivedDiffSubpackageREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3196)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3208)
    public TestDerivedDiffSubpackageREF getByKey(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3223)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                TestDerivedDiffSubpackageREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3240)
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

