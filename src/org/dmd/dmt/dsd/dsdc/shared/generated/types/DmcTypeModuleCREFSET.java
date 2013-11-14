package org.dmd.dmt.dsd.dsdc.shared.generated.types;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * The DmcTypeModuleCREFSET provides storage for a set of ModuleCREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2606)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:532)
 */
@SuppressWarnings("serial")
public class DmcTypeModuleCREFSET extends DmcTypeModuleCREF implements Serializable {
    
     private final static Iterator<ModuleCREF> emptyList =  (new HashSet<ModuleCREF>()).iterator();
    
    
    protected Set<ModuleCREF> value;
    
    public DmcTypeModuleCREFSET(){
        value = null;
    }
    
    public DmcTypeModuleCREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ModuleCREF>();
        else
            value = new TreeSet<ModuleCREF>();
    }
    
    @Override
    public DmcTypeModuleCREFSET getNew(){
        return(new DmcTypeModuleCREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2647)
    public DmcAttribute<ModuleCREF> cloneIt(){
        synchronized(this){
            DmcTypeModuleCREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ModuleCREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2670)
    public ModuleCREF add(Object v) throws DmcValueException {
        synchronized(this){
            ModuleCREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2687)
    public ModuleCREF del(Object v){
        synchronized(this){
            ModuleCREF rc = null;
            if (value == null)
                return(rc);
            
            try {
                rc = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            if (value.contains(rc)){
                value.remove(rc);
                if (value.size() == 0)
                    value = null;
            }
            else
                rc = null;
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2712)
    public Iterator<ModuleCREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<ModuleCREF>(value)).iterator() );
            else
                return( (new TreeSet<ModuleCREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2726)
    public Set<ModuleCREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<ModuleCREF>());
                else
                    return(new HashSet<ModuleCREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<ModuleCREF>(value));
                else
                    return(new TreeSet<ModuleCREF>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2746)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2757)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                ModuleCREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

