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
 * The DmcTypeObjWithRefsREFMAP provides storage for a map of ObjWithRefsREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:1864)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:444)
 */
@SuppressWarnings("serial")
// public class DmcTypeObjWithRefsREFMAP extends DmcTypeObjWithRefsREF<ObjWithRefsREF,StringName> {
public class DmcTypeObjWithRefsREFMAP extends DmcTypeObjWithRefsREF implements Serializable {
    
    Map<StringName,ObjWithRefsREF> value;
    
    public DmcTypeObjWithRefsREFMAP(){
        value = null;
    }
    
    public DmcTypeObjWithRefsREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,ObjWithRefsREF>();
        else
            value = new TreeMap<StringName,ObjWithRefsREF>();
    }
    
    @Override
    public DmcTypeObjWithRefsREFMAP getNew(){
        return(new DmcTypeObjWithRefsREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<ObjWithRefsREF> cloneIt(){
        DmcTypeObjWithRefsREFMAP rc = getNew();
        for(ObjWithRefsREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public ObjWithRefsREF add(Object v) throws DmcValueException {
        ObjWithRefsREF newval = typeCheck(v);
        if (value == null)
            initValue();
        StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
        ObjWithRefsREF oldval = value.put(key,newval);
        
        if (oldval != null){
            // We had a value with this key, ensure that the value actually changed
            if (oldval.valuesAreEqual(newval))
                newval = null;
        }
        
        return(newval);
    }
    
    @Override
    public ObjWithRefsREF del(Object key){
        if (key instanceof StringName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public Iterator<ObjWithRefsREF> getMV(){
        Map<StringName,ObjWithRefsREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<StringName,ObjWithRefsREF>(value);
        else
            clone = new TreeMap<StringName,ObjWithRefsREF>(value);
        return(clone.values().iterator());
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public ObjWithRefsREF getByKey(Object key){
        if (key instanceof StringName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            ObjWithRefsREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
    @Override
    public boolean containsKey(Object key){
        boolean rc = false;
        if (key instanceof StringName)
            rc = value.containsKey(key);
        return(rc);
    }
    
}

