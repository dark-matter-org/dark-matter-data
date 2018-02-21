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
import org.dmd.dmt.shared.generated.dmo.PrimitiveSVDMO;    // DmcType import
/**
 * The DmcTypePrimitiveSVREFSET provides storage for a set of PrimitiveSVDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2634)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveSVREFSET extends DmcTypePrimitiveSVREF implements Serializable {
    
     private final static Iterator<PrimitiveSVDMO> emptyList =  (new HashSet<PrimitiveSVDMO>()).iterator();
    
    
    protected Set<PrimitiveSVDMO> value;
    
    public DmcTypePrimitiveSVREFSET(){
        value = null;
    }
    
    public DmcTypePrimitiveSVREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<PrimitiveSVDMO>();
        else
            value = new TreeSet<PrimitiveSVDMO>();
    }
    
    @Override
    public DmcTypePrimitiveSVREFSET getNew(){
        return(new DmcTypePrimitiveSVREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2675)
    public DmcAttribute<PrimitiveSVDMO> cloneIt(){
        synchronized(this){
            DmcTypePrimitiveSVREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(PrimitiveSVDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2698)
    public PrimitiveSVDMO add(Object v) throws DmcValueException {
        synchronized(this){
            PrimitiveSVDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2715)
    public PrimitiveSVDMO del(Object v){
        synchronized(this){
            PrimitiveSVDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2740)
    public Iterator<PrimitiveSVDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<PrimitiveSVDMO>(value)).iterator() );
            else
                return( (new TreeSet<PrimitiveSVDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2754)
    public Set<PrimitiveSVDMO> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<PrimitiveSVDMO>());
                else
                    return(new HashSet<PrimitiveSVDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<PrimitiveSVDMO>(value));
                else
                    return(new TreeSet<PrimitiveSVDMO>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2774)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2785)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                PrimitiveSVDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

