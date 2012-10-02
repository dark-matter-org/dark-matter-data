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
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVIDXDMO;    // DmcType import
/**
 * The DmcTypeExtendedRefMVIDXREFSET provides storage for a set of ExtendedRefMVIDXDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2567)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeExtendedRefMVIDXREFSET extends DmcTypeExtendedRefMVIDXREF implements Serializable {
    
     private final static Iterator<ExtendedRefMVIDXDMO> emptyList =  (new HashSet<ExtendedRefMVIDXDMO>()).iterator();
    
    
    protected Set<ExtendedRefMVIDXDMO> value;
    
    public DmcTypeExtendedRefMVIDXREFSET(){
        value = null;
    }
    
    public DmcTypeExtendedRefMVIDXREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ExtendedRefMVIDXDMO>();
        else
            value = new TreeSet<ExtendedRefMVIDXDMO>();
    }
    
    @Override
    public DmcTypeExtendedRefMVIDXREFSET getNew(){
        return(new DmcTypeExtendedRefMVIDXREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2608)
    public DmcAttribute<ExtendedRefMVIDXDMO> cloneIt(){
        synchronized(this){
            DmcTypeExtendedRefMVIDXREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ExtendedRefMVIDXDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2631)
    public ExtendedRefMVIDXDMO add(Object v) throws DmcValueException {
        synchronized(this){
            ExtendedRefMVIDXDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2648)
    public ExtendedRefMVIDXDMO del(Object v){
        synchronized(this){
            ExtendedRefMVIDXDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2673)
    public Iterator<ExtendedRefMVIDXDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<ExtendedRefMVIDXDMO>(value)).iterator() );
            else
                return( (new TreeSet<ExtendedRefMVIDXDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2687)
    public Set<ExtendedRefMVIDXDMO> getMVCopy(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<ExtendedRefMVIDXDMO>());
                else
                    return(new HashSet<ExtendedRefMVIDXDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<ExtendedRefMVIDXDMO>(value));
                else
                    return(new TreeSet<ExtendedRefMVIDXDMO>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2707)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2718)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                ExtendedRefMVIDXDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

