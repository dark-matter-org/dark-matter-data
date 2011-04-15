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
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2093)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:455)
 */
@SuppressWarnings("serial")
// public class DmcTypeUUIDNamedObjectREFMAP extends DmcTypeUUIDNamedObjectREF<UUIDNamedObjectREF,UUIDName> {
public class DmcTypeUUIDNamedObjectREFMAP extends DmcTypeUUIDNamedObjectREF implements Serializable {
    
    Map<UUIDName,UUIDNamedObjectREF> value;
    
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
    
    @Override
    public DmcTypeUUIDNamedObjectREFMAP getNew(){
        return(new DmcTypeUUIDNamedObjectREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<UUIDNamedObjectREF> cloneIt(){
        DmcTypeUUIDNamedObjectREFMAP rc = getNew();
        for(UUIDNamedObjectREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public UUIDNamedObjectREF add(Object v) throws DmcValueException {
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
    
    @Override
    public UUIDNamedObjectREF del(Object key){
        if (key instanceof UUIDName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public Iterator<UUIDNamedObjectREF> getMV(){
        Map<UUIDName,UUIDNamedObjectREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<UUIDName,UUIDNamedObjectREF>(value);
        else
            clone = new TreeMap<UUIDName,UUIDNamedObjectREF>(value);
        return(clone.values().iterator());
    }
    
    public Map<UUIDName,UUIDNamedObjectREF> getMVCopy(){
        Map<UUIDName,UUIDNamedObjectREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<UUIDName,UUIDNamedObjectREF>(value);
        else
            clone = new TreeMap<UUIDName,UUIDNamedObjectREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public UUIDNamedObjectREF getByKey(Object key){
        if (key instanceof UUIDName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            UUIDNamedObjectREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
    @Override
    public boolean containsKey(Object key){
        boolean rc = false;
        if (key instanceof UUIDName)
            rc = value.containsKey(key);
        return(rc);
    }
    
}

