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
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVDMO;    // DmcType import
/**
 * The DmcTypeExtendedRefMVREFSET provides storage for a set of ExtendedRefMVDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2595)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeExtendedRefMVREFSET extends DmcTypeExtendedRefMVREF implements Serializable {
    
     private final static Iterator<ExtendedRefMVDMO> emptyList =  (new HashSet<ExtendedRefMVDMO>()).iterator();
    
    
    protected Set<ExtendedRefMVDMO> value;
    
    public DmcTypeExtendedRefMVREFSET(){
        value = null;
    }
    
    public DmcTypeExtendedRefMVREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ExtendedRefMVDMO>();
        else
            value = new TreeSet<ExtendedRefMVDMO>();
    }
    
    @Override
    public DmcTypeExtendedRefMVREFSET getNew(){
        return(new DmcTypeExtendedRefMVREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2636)
    public DmcAttribute<ExtendedRefMVDMO> cloneIt(){
        synchronized(this){
            DmcTypeExtendedRefMVREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ExtendedRefMVDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2659)
    public ExtendedRefMVDMO add(Object v) throws DmcValueException {
        synchronized(this){
            ExtendedRefMVDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2676)
    public ExtendedRefMVDMO del(Object v){
        synchronized(this){
            ExtendedRefMVDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2701)
    public Iterator<ExtendedRefMVDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<ExtendedRefMVDMO>(value)).iterator() );
            else
                return( (new TreeSet<ExtendedRefMVDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2715)
    public Set<ExtendedRefMVDMO> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<ExtendedRefMVDMO>());
                else
                    return(new HashSet<ExtendedRefMVDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<ExtendedRefMVDMO>(value));
                else
                    return(new TreeSet<ExtendedRefMVDMO>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2735)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2746)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                ExtendedRefMVDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

