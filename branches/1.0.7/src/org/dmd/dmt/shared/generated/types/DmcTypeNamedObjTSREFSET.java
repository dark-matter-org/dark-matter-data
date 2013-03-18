package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmt.shared.generated.dmo.NamedObjTSDMO;    // DmcType import
/**
 * The DmcTypeNamedObjTSREFSET provides storage for a set of NamedObjTSDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2602)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeNamedObjTSREFSET extends DmcTypeNamedObjTSREF implements Serializable {
    
     private final static Iterator<NamedObjTSDMO> emptyList =  (new HashSet<NamedObjTSDMO>()).iterator();
    
    
    protected Set<NamedObjTSDMO> value;
    
    public DmcTypeNamedObjTSREFSET(){
        value = null;
    }
    
    public DmcTypeNamedObjTSREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<NamedObjTSDMO>();
        else
            value = new TreeSet<NamedObjTSDMO>();
    }
    
    @Override
    public DmcTypeNamedObjTSREFSET getNew(){
        return(new DmcTypeNamedObjTSREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2643)
    public DmcAttribute<NamedObjTSDMO> cloneIt(){
        synchronized(this){
            DmcTypeNamedObjTSREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(NamedObjTSDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2666)
    public NamedObjTSDMO add(Object v) throws DmcValueException {
        synchronized(this){
            NamedObjTSDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2683)
    public NamedObjTSDMO del(Object v){
        synchronized(this){
            NamedObjTSDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2708)
    public Iterator<NamedObjTSDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<NamedObjTSDMO>(value)).iterator() );
            else
                return( (new TreeSet<NamedObjTSDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2722)
    public Set<NamedObjTSDMO> getMVCopy(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<NamedObjTSDMO>());
                else
                    return(new HashSet<NamedObjTSDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<NamedObjTSDMO>(value));
                else
                    return(new TreeSet<NamedObjTSDMO>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2742)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2753)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                NamedObjTSDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

