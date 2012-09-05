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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2800)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeObjWithRefsREFMAP extends DmcTypeObjWithRefsREF<ObjWithRefsREF,StringName> {
public class DmcTypeObjWithRefsREFMAP extends DmcTypeObjWithRefsREF implements Serializable {
    
    private final static Iterator<ObjWithRefsREF> emptyList = (new HashMap<StringName,ObjWithRefsREF>()).values().iterator();
    
    protected Map<StringName,ObjWithRefsREF> value;
    
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
    
    public StringName firstKey(){
        if (attrInfo.valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<StringName,ObjWithRefsREF> map = (TreeMap<StringName,ObjWithRefsREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + attrInfo.name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeObjWithRefsREFMAP getNew(){
        return(new DmcTypeObjWithRefsREFMAP(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2857)
    public DmcAttribute<ObjWithRefsREF> cloneIt(){
        synchronized(this){
            DmcTypeObjWithRefsREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ObjWithRefsREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2877)
    public ObjWithRefsREF add(Object v) throws DmcValueException {
        synchronized(this){
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2898)
    public ObjWithRefsREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof StringName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2914)
    public Iterator<ObjWithRefsREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<StringName,ObjWithRefsREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,ObjWithRefsREF>(value);
            else
                clone = new TreeMap<StringName,ObjWithRefsREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2931)
    public Map<StringName,ObjWithRefsREF> getMVCopy(){
        synchronized(this){
            Map<StringName,ObjWithRefsREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<StringName,ObjWithRefsREF>();
                else
                    clone = new HashMap<StringName,ObjWithRefsREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<StringName,ObjWithRefsREF>();
                else
                    clone = new TreeMap<StringName,ObjWithRefsREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2952)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2964)
    public ObjWithRefsREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof StringName)
                return(value.get((StringName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2979)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                ObjWithRefsREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2996)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof StringName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

