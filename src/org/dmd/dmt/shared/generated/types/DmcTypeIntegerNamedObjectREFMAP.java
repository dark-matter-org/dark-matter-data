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
import org.dmd.dmc.types.IntegerName;    // key type import
/**
 * The DmcTypeIntegerNamedObjectREFMAP provides storage for a map of IntegerNamedObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3044)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:544)
 */
@SuppressWarnings("serial")
// public class DmcTypeIntegerNamedObjectREFMAP extends DmcTypeIntegerNamedObjectREF<IntegerNamedObjectREF,IntegerName> {
public class DmcTypeIntegerNamedObjectREFMAP extends DmcTypeIntegerNamedObjectREF implements Serializable {
    
    private final static Iterator<IntegerNamedObjectREF> emptyList = (new HashMap<IntegerName,IntegerNamedObjectREF>()).values().iterator();
    
    protected Map<IntegerName,IntegerNamedObjectREF> value;
    
    public DmcTypeIntegerNamedObjectREFMAP(){
        value = null;
    }
    
    public DmcTypeIntegerNamedObjectREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<IntegerName,IntegerNamedObjectREF>();
        else
            value = new TreeMap<IntegerName,IntegerNamedObjectREF>();
    }
    
    public IntegerName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<IntegerName,IntegerNamedObjectREF> map = (TreeMap<IntegerName,IntegerNamedObjectREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeIntegerNamedObjectREFMAP getNew(){
        return(new DmcTypeIntegerNamedObjectREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3101)
    public DmcAttribute<IntegerNamedObjectREF> cloneIt(){
        synchronized(this){
            DmcTypeIntegerNamedObjectREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(IntegerNamedObjectREF val: value.values())
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
    public IntegerNamedObjectREF add(Object v) throws DmcValueException {
        synchronized(this){
            IntegerNamedObjectREF newval = typeCheck(v);
            if (value == null)
                initValue();
            IntegerName key = (IntegerName)((DmcMappedAttributeIF)newval).getKey();
            IntegerNamedObjectREF oldval = value.put(key,newval);
            
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
    public IntegerNamedObjectREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof IntegerName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3158)
    public Iterator<IntegerNamedObjectREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<IntegerName,IntegerNamedObjectREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<IntegerName,IntegerNamedObjectREF>(value);
            else
                clone = new TreeMap<IntegerName,IntegerNamedObjectREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3175)
    public Map<IntegerName,IntegerNamedObjectREF> getMVCopy(){
        synchronized(this){
            Map<IntegerName,IntegerNamedObjectREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<IntegerName,IntegerNamedObjectREF>();
                else
                    clone = new HashMap<IntegerName,IntegerNamedObjectREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<IntegerName,IntegerNamedObjectREF>();
                else
                    clone = new TreeMap<IntegerName,IntegerNamedObjectREF>(value);
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
    public IntegerNamedObjectREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof IntegerName)
                return(value.get((IntegerName) key));
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
                IntegerNamedObjectREF val = typeCheck(v);
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
    
           if (key instanceof IntegerName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

