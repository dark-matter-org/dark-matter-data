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
import org.dmd.dmt.shared.generated.dmo.PrimitiveHSDMO;    // DmcType import
/**
 * The DmcTypePrimitiveHSREFSET provides storage for a set of PrimitiveHSDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2811)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveHSREFSET extends DmcTypePrimitiveHSREF implements Serializable {
    
     private final static Iterator<PrimitiveHSDMO> emptyList =  (new HashSet<PrimitiveHSDMO>()).iterator();
    
    
    protected Set<PrimitiveHSDMO> value;
    
    public DmcTypePrimitiveHSREFSET(){
        value = null;
    }
    
    public DmcTypePrimitiveHSREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<PrimitiveHSDMO>();
        else
            value = new TreeSet<PrimitiveHSDMO>();
    }
    
    @Override
    public DmcTypePrimitiveHSREFSET getNew(){
        return(new DmcTypePrimitiveHSREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2852)
    public DmcAttribute<PrimitiveHSDMO> cloneIt(){
        synchronized(this){
            DmcTypePrimitiveHSREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(PrimitiveHSDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2875)
    public PrimitiveHSDMO add(Object v) throws DmcValueException {
        synchronized(this){
            PrimitiveHSDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2892)
    public PrimitiveHSDMO del(Object v){
        synchronized(this){
            PrimitiveHSDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2917)
    public Iterator<PrimitiveHSDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<PrimitiveHSDMO>(value)).iterator() );
            else
                return( (new TreeSet<PrimitiveHSDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2931)
    public Set<PrimitiveHSDMO> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<PrimitiveHSDMO>());
                else
                    return(new HashSet<PrimitiveHSDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<PrimitiveHSDMO>(value));
                else
                    return(new TreeSet<PrimitiveHSDMO>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2951)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2962)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                PrimitiveHSDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

