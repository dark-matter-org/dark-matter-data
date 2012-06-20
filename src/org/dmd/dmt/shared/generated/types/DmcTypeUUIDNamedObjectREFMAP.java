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
import org.dmd.dmc.types.UUIDName;    // key type import
/**
 * The DmcTypeUUIDNamedObjectREFMAP provides storage for a map of UUIDNamedObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2762)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeUUIDNamedObjectREFMAP extends DmcTypeUUIDNamedObjectREF<UUIDNamedObjectREF,UUIDName> {
public class DmcTypeUUIDNamedObjectREFMAP extends DmcTypeUUIDNamedObjectREF implements Serializable {
    
    protected Map<UUIDName,UUIDNamedObjectREF> value;
    
    public DmcTypeUUIDNamedObjectREFMAP(){
        value = null;
    }
    
    public DmcTypeUUIDNamedObjectREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<UUIDName,UUIDNamedObjectREF>();
        else
            value = new TreeMap<UUIDName,UUIDNamedObjectREF>();
    }
    
    public UUIDName firstKey(){
        if (attrInfo.valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<UUIDName,UUIDNamedObjectREF> map = (TreeMap<UUIDName,UUIDNamedObjectREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + attrInfo.name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeUUIDNamedObjectREFMAP getNew(){
        return(new DmcTypeUUIDNamedObjectREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2816)
    public DmcAttribute<UUIDNamedObjectREF> cloneIt(){
        synchronized(this){
            DmcTypeUUIDNamedObjectREFMAP rc = getNew();
            for(UUIDNamedObjectREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2832)
    public UUIDNamedObjectREF add(Object v) throws DmcValueException {
        synchronized(this){
            UUIDNamedObjectREF newval = typeCheck(v);
            if (value == null)
                initValue();
            UUIDName key = (UUIDName)((DmcMappedAttributeIF)newval).getKey();
            UUIDNamedObjectREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2853)
    public UUIDNamedObjectREF del(Object key){
        synchronized(this){
           if (key instanceof UUIDName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2865)
    public Iterator<UUIDNamedObjectREF> getMV(){
        synchronized(this){
            Map<UUIDName,UUIDNamedObjectREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<UUIDName,UUIDNamedObjectREF>(value);
            else
                clone = new TreeMap<UUIDName,UUIDNamedObjectREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2878)
    public Map<UUIDName,UUIDNamedObjectREF> getMVCopy(){
        synchronized(this){
            Map<UUIDName,UUIDNamedObjectREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<UUIDName,UUIDNamedObjectREF>(value);
            else
                clone = new TreeMap<UUIDName,UUIDNamedObjectREF>(value);
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2891)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2903)
    public UUIDNamedObjectREF getByKey(Object key){
        synchronized(this){
            if (key instanceof UUIDName)
                return(value.get((UUIDName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2915)
    public boolean contains(Object v){
        synchronized(this){
            try {
                UUIDNamedObjectREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2936)
    public boolean containsKey(Object key){
        synchronized(this){
           if (key instanceof UUIDName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

