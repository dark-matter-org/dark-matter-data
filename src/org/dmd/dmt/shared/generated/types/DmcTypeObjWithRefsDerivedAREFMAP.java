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
 * The DmcTypeObjWithRefsDerivedAREFMAP provides storage for a map of ObjWithRefsDerivedAREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3044)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:544)
 */
@SuppressWarnings("serial")
// public class DmcTypeObjWithRefsDerivedAREFMAP extends DmcTypeObjWithRefsDerivedAREF<ObjWithRefsDerivedAREF,DefinitionName> {
public class DmcTypeObjWithRefsDerivedAREFMAP extends DmcTypeObjWithRefsDerivedAREF implements Serializable {
    
    private final static Iterator<ObjWithRefsDerivedAREF> emptyList = (new HashMap<DefinitionName,ObjWithRefsDerivedAREF>()).values().iterator();
    
    protected Map<DefinitionName,ObjWithRefsDerivedAREF> value;
    
    public DmcTypeObjWithRefsDerivedAREFMAP(){
        value = null;
    }
    
    public DmcTypeObjWithRefsDerivedAREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<DefinitionName,ObjWithRefsDerivedAREF>();
        else
            value = new TreeMap<DefinitionName,ObjWithRefsDerivedAREF>();
    }
    
    public DefinitionName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<DefinitionName,ObjWithRefsDerivedAREF> map = (TreeMap<DefinitionName,ObjWithRefsDerivedAREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeObjWithRefsDerivedAREFMAP getNew(){
        return(new DmcTypeObjWithRefsDerivedAREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3101)
    public DmcAttribute<ObjWithRefsDerivedAREF> cloneIt(){
        synchronized(this){
            DmcTypeObjWithRefsDerivedAREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ObjWithRefsDerivedAREF val: value.values())
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
    public ObjWithRefsDerivedAREF add(Object v) throws DmcValueException {
        synchronized(this){
            ObjWithRefsDerivedAREF newval = typeCheck(v);
            if (value == null)
                initValue();
            DefinitionName key = (DefinitionName)((DmcMappedAttributeIF)newval).getKey();
            ObjWithRefsDerivedAREF oldval = value.put(key,newval);
            
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
    public ObjWithRefsDerivedAREF del(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3158)
    public Iterator<ObjWithRefsDerivedAREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<DefinitionName,ObjWithRefsDerivedAREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<DefinitionName,ObjWithRefsDerivedAREF>(value);
            else
                clone = new TreeMap<DefinitionName,ObjWithRefsDerivedAREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3175)
    public Map<DefinitionName,ObjWithRefsDerivedAREF> getMVCopy(){
        synchronized(this){
            Map<DefinitionName,ObjWithRefsDerivedAREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<DefinitionName,ObjWithRefsDerivedAREF>();
                else
                    clone = new HashMap<DefinitionName,ObjWithRefsDerivedAREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<DefinitionName,ObjWithRefsDerivedAREF>();
                else
                    clone = new TreeMap<DefinitionName,ObjWithRefsDerivedAREF>(value);
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
    public ObjWithRefsDerivedAREF getByKey(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3223)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                ObjWithRefsDerivedAREF val = typeCheck(v);
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
    
           if (key instanceof DefinitionName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

