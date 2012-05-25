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
import org.dmd.dmt.shared.generated.dmo.ExtendedRefTSDMO;    // DmcType import
/**
 * The DmcTypeExtendedRefTSREFSET provides storage for a set of ExtendedRefTSDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2527)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeExtendedRefTSREFSET extends DmcTypeExtendedRefTSREF implements Serializable {
    
    protected Set<ExtendedRefTSDMO> value;
    
    public DmcTypeExtendedRefTSREFSET(){
        value = null;
    }
    
    public DmcTypeExtendedRefTSREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ExtendedRefTSDMO>();
        else
            value = new TreeSet<ExtendedRefTSDMO>();
    }
    
    @Override
    public DmcTypeExtendedRefTSREFSET getNew(){
        return(new DmcTypeExtendedRefTSREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2564)
    public DmcAttribute<ExtendedRefTSDMO> cloneIt(){
        synchronized(this){
            DmcTypeExtendedRefTSREFSET rc = getNew();
            for(ExtendedRefTSDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2583)
    public ExtendedRefTSDMO add(Object v) throws DmcValueException {
        synchronized(this){
            ExtendedRefTSDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2600)
    public ExtendedRefTSDMO del(Object v){
        synchronized(this){
            ExtendedRefTSDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2625)
    public Iterator<ExtendedRefTSDMO> getMV(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<ExtendedRefTSDMO>(value)).iterator() );
            else
                return( (new TreeSet<ExtendedRefTSDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2642)
    public Set<ExtendedRefTSDMO> getMVCopy(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return(new HashSet<ExtendedRefTSDMO>(value));
            else
                return(new TreeSet<ExtendedRefTSDMO>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2660)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2671)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                ExtendedRefTSDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

