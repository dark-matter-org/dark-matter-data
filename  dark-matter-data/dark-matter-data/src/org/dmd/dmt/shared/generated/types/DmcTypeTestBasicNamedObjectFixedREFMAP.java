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
import org.dmd.dmc.types.StringName;    // key type import
/**
 * The DmcTypeTestBasicNamedObjectFixedREFMAP provides storage for a map of TestBasicNamedObjectFixedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:1571)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:563)
 */
@SuppressWarnings("serial")
// public class DmcTypeTestBasicNamedObjectFixedREFMAP extends DmcTypeTestBasicNamedObjectFixedREF<TestBasicNamedObjectFixedREF,StringName> {
public class DmcTypeTestBasicNamedObjectFixedREFMAP extends DmcTypeTestBasicNamedObjectFixedREF {
    
    Map<StringName,TestBasicNamedObjectFixedREF> value;
    
    public DmcTypeTestBasicNamedObjectFixedREFMAP(){
        value = null;
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,TestBasicNamedObjectFixedREF>();
        else
            value = new TreeMap<StringName,TestBasicNamedObjectFixedREF>();
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFMAP getNew(){
        return(new DmcTypeTestBasicNamedObjectFixedREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestBasicNamedObjectFixedREF> cloneIt(){
        DmcTypeTestBasicNamedObjectFixedREFMAP rc = getNew();
        for(TestBasicNamedObjectFixedREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public TestBasicNamedObjectFixedREF add(Object v) throws DmcValueException {
        TestBasicNamedObjectFixedREF rc = typeCheck(v);
        if (value == null)
            initValue();
        StringName key = (StringName)((DmcMappedAttributeIF)rc).getKey();
        value.put(key,rc);
        return(rc);
    }
    
    public TestBasicNamedObjectFixedREF del(Object key){
        if (key instanceof StringName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public Iterator<TestBasicNamedObjectFixedREF> getMV(){
        return(value.values().iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public TestBasicNamedObjectFixedREF getByKey(Object key){
        if (key instanceof StringName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestBasicNamedObjectFixedREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

