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
import org.dmd.dmt.shared.generated.dmo.PrimitiveTSDMO;    // DmcType import
/**
 * The DmcTypePrimitiveTSREFSET provides storage for a set of PrimitiveTSDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2606)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveTSREFSET extends DmcTypePrimitiveTSREF implements Serializable {
    
     private final static Iterator<PrimitiveTSDMO> emptyList =  (new HashSet<PrimitiveTSDMO>()).iterator();
    
    
    protected Set<PrimitiveTSDMO> value;
    
    public DmcTypePrimitiveTSREFSET(){
        value = null;
    }
    
    public DmcTypePrimitiveTSREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<PrimitiveTSDMO>();
        else
            value = new TreeSet<PrimitiveTSDMO>();
    }
    
    @Override
    public DmcTypePrimitiveTSREFSET getNew(){
        return(new DmcTypePrimitiveTSREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2647)
    public DmcAttribute<PrimitiveTSDMO> cloneIt(){
        synchronized(this){
            DmcTypePrimitiveTSREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(PrimitiveTSDMO val: value)
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
    public PrimitiveTSDMO add(Object v) throws DmcValueException {
        synchronized(this){
            PrimitiveTSDMO rc = typeCheck(v);
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
    public PrimitiveTSDMO del(Object v){
        synchronized(this){
            PrimitiveTSDMO rc = null;
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
    public Iterator<PrimitiveTSDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<PrimitiveTSDMO>(value)).iterator() );
            else
                return( (new TreeSet<PrimitiveTSDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2726)
    public Set<PrimitiveTSDMO> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<PrimitiveTSDMO>());
                else
                    return(new HashSet<PrimitiveTSDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<PrimitiveTSDMO>(value));
                else
                    return(new TreeSet<PrimitiveTSDMO>(value));
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
                PrimitiveTSDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

