package org.dmd.dmt.dsd.dsda.shared.generated.types;

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
 * The DmcTypeAConceptXREFMAP provides storage for a map of AConceptXREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2839)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeAConceptXREFMAP extends DmcTypeAConceptXREF<AConceptXREF,DefinitionName> {
public class DmcTypeAConceptXREFMAP extends DmcTypeAConceptXREF implements Serializable {
    
    private final static Iterator<AConceptXREF> emptyList = (new HashMap<DefinitionName,AConceptXREF>()).values().iterator();
    
    protected Map<DefinitionName,AConceptXREF> value;
    
    public DmcTypeAConceptXREFMAP(){
        value = null;
    }
    
    public DmcTypeAConceptXREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<DefinitionName,AConceptXREF>();
        else
            value = new TreeMap<DefinitionName,AConceptXREF>();
    }
    
    public DefinitionName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<DefinitionName,AConceptXREF> map = (TreeMap<DefinitionName,AConceptXREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeAConceptXREFMAP getNew(){
        return(new DmcTypeAConceptXREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2896)
    public DmcAttribute<AConceptXREF> cloneIt(){
        synchronized(this){
            DmcTypeAConceptXREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(AConceptXREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2916)
    public AConceptXREF add(Object v) throws DmcValueException {
        synchronized(this){
            AConceptXREF newval = typeCheck(v);
            if (value == null)
                initValue();
            DefinitionName key = (DefinitionName)((DmcMappedAttributeIF)newval).getKey();
            AConceptXREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2937)
    public AConceptXREF del(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2953)
    public Iterator<AConceptXREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<DefinitionName,AConceptXREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<DefinitionName,AConceptXREF>(value);
            else
                clone = new TreeMap<DefinitionName,AConceptXREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2970)
    public Map<DefinitionName,AConceptXREF> getMVCopy(){
        synchronized(this){
            Map<DefinitionName,AConceptXREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<DefinitionName,AConceptXREF>();
                else
                    clone = new HashMap<DefinitionName,AConceptXREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<DefinitionName,AConceptXREF>();
                else
                    clone = new TreeMap<DefinitionName,AConceptXREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2991)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3003)
    public AConceptXREF getByKey(Object key){
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
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3018)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                AConceptXREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3035)
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

