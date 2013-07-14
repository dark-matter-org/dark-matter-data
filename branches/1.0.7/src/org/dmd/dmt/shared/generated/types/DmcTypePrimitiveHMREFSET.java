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
import org.dmd.dmt.shared.generated.dmo.PrimitiveHMDMO;    // DmcType import
/**
 * The DmcTypePrimitiveHMREFSET provides storage for a set of PrimitiveHMDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2602)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveHMREFSET extends DmcTypePrimitiveHMREF implements Serializable {
    
     private final static Iterator<PrimitiveHMDMO> emptyList =  (new HashSet<PrimitiveHMDMO>()).iterator();
    
    
    protected Set<PrimitiveHMDMO> value;
    
    public DmcTypePrimitiveHMREFSET(){
        value = null;
    }
    
    public DmcTypePrimitiveHMREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<PrimitiveHMDMO>();
        else
            value = new TreeSet<PrimitiveHMDMO>();
    }
    
    @Override
    public DmcTypePrimitiveHMREFSET getNew(){
        return(new DmcTypePrimitiveHMREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2643)
    public DmcAttribute<PrimitiveHMDMO> cloneIt(){
        synchronized(this){
            DmcTypePrimitiveHMREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(PrimitiveHMDMO val: value)
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
    public PrimitiveHMDMO add(Object v) throws DmcValueException {
        synchronized(this){
            PrimitiveHMDMO rc = typeCheck(v);
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
    public PrimitiveHMDMO del(Object v){
        synchronized(this){
            PrimitiveHMDMO rc = null;
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
    public Iterator<PrimitiveHMDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<PrimitiveHMDMO>(value)).iterator() );
            else
                return( (new TreeSet<PrimitiveHMDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2722)
    public Set<PrimitiveHMDMO> getMVCopy(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<PrimitiveHMDMO>());
                else
                    return(new HashSet<PrimitiveHMDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<PrimitiveHMDMO>(value));
                else
                    return(new TreeSet<PrimitiveHMDMO>(value));
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
                PrimitiveHMDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}
