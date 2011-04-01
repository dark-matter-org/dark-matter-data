package org.dmd.dmt.shared.generated.types;

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
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:1830)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:563)
 */
@SuppressWarnings("serial")
// public class DmcTypeIntegerNamedObjectREFMAP extends DmcTypeIntegerNamedObjectREF<IntegerNamedObjectREF,IntegerName> {
public class DmcTypeIntegerNamedObjectREFMAP extends DmcTypeIntegerNamedObjectREF {
    
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
    
    public IntegerNamedObjectREF add(Object v) throws DmcValueException {
        IntegerNamedObjectREF rc = typeCheck(v);
        if (value == null)
            initValue();
        IntegerName key = (IntegerName)((DmcMappedAttributeIF)rc).getKey();
        value.put(key,rc);
        return(rc);
    }
    
    public IntegerNamedObjectREF del(Object key){
        if (key instanceof IntegerName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public Iterator<IntegerNamedObjectREF> getMV(){
        return(value.values().iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public IntegerNamedObjectREF getByKey(Object key){
        if (key instanceof IntegerName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            IntegerNamedObjectREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

