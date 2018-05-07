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
import org.dmd.dmt.shared.generated.dmo.UnnamedObjMVIDXDMO;    // DmcType import
/**
 * The DmcTypeUnnamedObjMVIDXREFSET provides storage for a set of UnnamedObjMVIDXDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2791)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeUnnamedObjMVIDXREFSET extends DmcTypeUnnamedObjMVIDXREF implements Serializable {
    
     private final static Iterator<UnnamedObjMVIDXDMO> emptyList =  (new HashSet<UnnamedObjMVIDXDMO>()).iterator();
    
    
    protected Set<UnnamedObjMVIDXDMO> value;
    
    public DmcTypeUnnamedObjMVIDXREFSET(){
        value = null;
    }
    
    public DmcTypeUnnamedObjMVIDXREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<UnnamedObjMVIDXDMO>();
        else
            value = new TreeSet<UnnamedObjMVIDXDMO>();
    }
    
    @Override
    public DmcTypeUnnamedObjMVIDXREFSET getNew(){
        return(new DmcTypeUnnamedObjMVIDXREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2832)
    public DmcAttribute<UnnamedObjMVIDXDMO> cloneIt(){
        synchronized(this){
            DmcTypeUnnamedObjMVIDXREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(UnnamedObjMVIDXDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2855)
    public UnnamedObjMVIDXDMO add(Object v) throws DmcValueException {
        synchronized(this){
            UnnamedObjMVIDXDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2872)
    public UnnamedObjMVIDXDMO del(Object v){
        synchronized(this){
            UnnamedObjMVIDXDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2897)
    public Iterator<UnnamedObjMVIDXDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<UnnamedObjMVIDXDMO>(value)).iterator() );
            else
                return( (new TreeSet<UnnamedObjMVIDXDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2911)
    public Set<UnnamedObjMVIDXDMO> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<UnnamedObjMVIDXDMO>());
                else
                    return(new HashSet<UnnamedObjMVIDXDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<UnnamedObjMVIDXDMO>(value));
                else
                    return(new TreeSet<UnnamedObjMVIDXDMO>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2931)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2942)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                UnnamedObjMVIDXDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

