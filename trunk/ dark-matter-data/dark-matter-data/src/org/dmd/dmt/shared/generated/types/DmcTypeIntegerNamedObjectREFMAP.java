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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:1963)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:450)
 */
@SuppressWarnings("serial")
// public class DmcTypeIntegerNamedObjectREFMAP extends DmcTypeIntegerNamedObjectREF<IntegerNamedObjectREF,IntegerName> {
public class DmcTypeIntegerNamedObjectREFMAP extends DmcTypeIntegerNamedObjectREF implements Serializable {
    
    Map<IntegerName,IntegerNamedObjectREF> value;
    
    public DmcTypeIntegerNamedObjectREFMAP(){
        value = null;
    }
    
    public DmcTypeIntegerNamedObjectREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<IntegerName,IntegerNamedObjectREF>();
        else
            value = new TreeMap<IntegerName,IntegerNamedObjectREF>();
    }
    
    @Override
    public DmcTypeIntegerNamedObjectREFMAP getNew(){
        return(new DmcTypeIntegerNamedObjectREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<IntegerNamedObjectREF> cloneIt(){
        DmcTypeIntegerNamedObjectREFMAP rc = getNew();
        for(IntegerNamedObjectREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public IntegerNamedObjectREF add(Object v) throws DmcValueException {
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
    
    @Override
    public IntegerNamedObjectREF del(Object key){
        if (key instanceof IntegerName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public Iterator<IntegerNamedObjectREF> getMV(){
        Map<IntegerName,IntegerNamedObjectREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<IntegerName,IntegerNamedObjectREF>(value);
        else
            clone = new TreeMap<IntegerName,IntegerNamedObjectREF>(value);
        return(clone.values().iterator());
    }
    
    public Map<IntegerName,IntegerNamedObjectREF> getMVCopy(){
        Map<IntegerName,IntegerNamedObjectREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<IntegerName,IntegerNamedObjectREF>(value);
        else
            clone = new TreeMap<IntegerName,IntegerNamedObjectREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public IntegerNamedObjectREF getByKey(Object key){
        if (key instanceof IntegerName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            IntegerNamedObjectREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
    @Override
    public boolean containsKey(Object key){
        boolean rc = false;
        if (key instanceof IntegerName)
            rc = value.containsKey(key);
        return(rc);
    }
    
}

