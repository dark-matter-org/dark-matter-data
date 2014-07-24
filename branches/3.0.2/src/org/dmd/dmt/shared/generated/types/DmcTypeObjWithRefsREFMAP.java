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
 * The DmcTypeObjWithRefsREFMAP provides storage for a map of ObjWithRefsREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2858)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeObjWithRefsREFMAP extends DmcTypeObjWithRefsREF<ObjWithRefsREF,DefinitionName> {
public class DmcTypeObjWithRefsREFMAP extends DmcTypeObjWithRefsREF implements Serializable {
    
    private final static Iterator<ObjWithRefsREF> emptyList = (new HashMap<DefinitionName,ObjWithRefsREF>()).values().iterator();
    
    protected Map<DefinitionName,ObjWithRefsREF> value;
    
    public DmcTypeObjWithRefsREFMAP(){
        value = null;
    }
    
    public DmcTypeObjWithRefsREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<DefinitionName,ObjWithRefsREF>();
        else
            value = new TreeMap<DefinitionName,ObjWithRefsREF>();
    }
    
    public DefinitionName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<DefinitionName,ObjWithRefsREF> map = (TreeMap<DefinitionName,ObjWithRefsREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeObjWithRefsREFMAP getNew(){
        return(new DmcTypeObjWithRefsREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2915)
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2935)
    public ObjWithRefsREF add(Object v) throws DmcValueException {
        synchronized(this){
            ObjWithRefsREF newval = typeCheck(v);
            if (value == null)
                initValue();
            DefinitionName key = (DefinitionName)((DmcMappedAttributeIF)newval).getKey();
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2956)
    public ObjWithRefsREF del(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2972)
    public Iterator<ObjWithRefsREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<DefinitionName,ObjWithRefsREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<DefinitionName,ObjWithRefsREF>(value);
            else
                clone = new TreeMap<DefinitionName,ObjWithRefsREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2989)
    public Map<DefinitionName,ObjWithRefsREF> getMVCopy(){
        synchronized(this){
            Map<DefinitionName,ObjWithRefsREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<DefinitionName,ObjWithRefsREF>();
                else
                    clone = new HashMap<DefinitionName,ObjWithRefsREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<DefinitionName,ObjWithRefsREF>();
                else
                    clone = new TreeMap<DefinitionName,ObjWithRefsREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3010)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3022)
    public ObjWithRefsREF getByKey(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3037)
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3054)
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

