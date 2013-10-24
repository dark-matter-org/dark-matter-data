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
import org.dmd.dmt.shared.generated.dmo.UnnamedObjMVDMO;    // DmcType import
/**
 * The DmcTypeUnnamedObjMVREFSET provides storage for a set of UnnamedObjMVDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2602)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeUnnamedObjMVREFSET extends DmcTypeUnnamedObjMVREF implements Serializable {
    
     private final static Iterator<UnnamedObjMVDMO> emptyList =  (new HashSet<UnnamedObjMVDMO>()).iterator();
    
    
    protected Set<UnnamedObjMVDMO> value;
    
    public DmcTypeUnnamedObjMVREFSET(){
        value = null;
    }
    
    public DmcTypeUnnamedObjMVREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<UnnamedObjMVDMO>();
        else
            value = new TreeSet<UnnamedObjMVDMO>();
    }
    
    @Override
    public DmcTypeUnnamedObjMVREFSET getNew(){
        return(new DmcTypeUnnamedObjMVREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2643)
    public DmcAttribute<UnnamedObjMVDMO> cloneIt(){
        synchronized(this){
            DmcTypeUnnamedObjMVREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(UnnamedObjMVDMO val: value)
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
    public UnnamedObjMVDMO add(Object v) throws DmcValueException {
        synchronized(this){
            UnnamedObjMVDMO rc = typeCheck(v);
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
    public UnnamedObjMVDMO del(Object v){
        synchronized(this){
            UnnamedObjMVDMO rc = null;
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
    public Iterator<UnnamedObjMVDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<UnnamedObjMVDMO>(value)).iterator() );
            else
                return( (new TreeSet<UnnamedObjMVDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2722)
    public Set<UnnamedObjMVDMO> getMVCopy(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<UnnamedObjMVDMO>());
                else
                    return(new HashSet<UnnamedObjMVDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<UnnamedObjMVDMO>(value));
                else
                    return(new TreeSet<UnnamedObjMVDMO>(value));
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
                UnnamedObjMVDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

