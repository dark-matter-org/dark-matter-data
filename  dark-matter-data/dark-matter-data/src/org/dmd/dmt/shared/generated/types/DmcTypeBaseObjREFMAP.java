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
 * The DmcTypeBaseObjREFMAP provides storage for a map of BaseObjREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2603)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:532)
 */
@SuppressWarnings("serial")
// public class DmcTypeBaseObjREFMAP extends DmcTypeBaseObjREF<BaseObjREF,StringName> {
public class DmcTypeBaseObjREFMAP extends DmcTypeBaseObjREF implements Serializable {
    
    protected Map<StringName,BaseObjREF> value;
    
    public DmcTypeBaseObjREFMAP(){
        value = null;
    }
    
    public DmcTypeBaseObjREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,BaseObjREF>();
        else
            value = new TreeMap<StringName,BaseObjREF>();
    }
    
    @Override
    public DmcTypeBaseObjREFMAP getNew(){
        return(new DmcTypeBaseObjREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2646)
    public DmcAttribute<BaseObjREF> cloneIt(){
        synchronized(this){
            DmcTypeBaseObjREFMAP rc = getNew();
            for(BaseObjREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2662)
    public BaseObjREF add(Object v) throws DmcValueException {
        synchronized(this){
            BaseObjREF newval = typeCheck(v);
            if (value == null)
                initValue();
            StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
            BaseObjREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2683)
    public BaseObjREF del(Object key){
        synchronized(this){
           if (key instanceof StringName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2695)
    public Iterator<BaseObjREF> getMV(){
        synchronized(this){
            Map<StringName,BaseObjREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,BaseObjREF>(value);
            else
                clone = new TreeMap<StringName,BaseObjREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2708)
    public Map<StringName,BaseObjREF> getMVCopy(){
        synchronized(this){
            Map<StringName,BaseObjREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,BaseObjREF>(value);
            else
                clone = new TreeMap<StringName,BaseObjREF>(value);
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2721)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2733)
    public BaseObjREF getByKey(Object key){
        synchronized(this){
            if (key instanceof StringName)
                return(value.get(key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2745)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                BaseObjREF val = typeCheck(v);
                rc = value.containsValue(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2760)
    public boolean containsKey(Object key){
        synchronized(this){
            boolean rc = false;
           if (key instanceof StringName)
                rc = value.containsKey(key);
            return(rc);
        }
    }
    
}

