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
import org.dmd.dmt.shared.generated.dmo.UnnamedObjHSDMO;    // DmcType import
/**
 * The DmcTypeUnnamedObjHSREFSET provides storage for a set of UnnamedObjHSDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2553)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeUnnamedObjHSREFSET extends DmcTypeUnnamedObjHSREF implements Serializable {
    
    protected Set<UnnamedObjHSDMO> value;
    
    public DmcTypeUnnamedObjHSREFSET(){
        value = null;
    }
    
    public DmcTypeUnnamedObjHSREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<UnnamedObjHSDMO>();
        else
            value = new TreeSet<UnnamedObjHSDMO>();
    }
    
    @Override
    public DmcTypeUnnamedObjHSREFSET getNew(){
        return(new DmcTypeUnnamedObjHSREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2590)
    public DmcAttribute<UnnamedObjHSDMO> cloneIt(){
        synchronized(this){
            DmcTypeUnnamedObjHSREFSET rc = getNew();
            for(UnnamedObjHSDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2609)
    public UnnamedObjHSDMO add(Object v) throws DmcValueException {
        synchronized(this){
            UnnamedObjHSDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2626)
    public UnnamedObjHSDMO del(Object v){
        synchronized(this){
            UnnamedObjHSDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2651)
    public Iterator<UnnamedObjHSDMO> getMV(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<UnnamedObjHSDMO>(value)).iterator() );
            else
                return( (new TreeSet<UnnamedObjHSDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2668)
    public Set<UnnamedObjHSDMO> getMVCopy(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return(new HashSet<UnnamedObjHSDMO>(value));
            else
                return(new TreeSet<UnnamedObjHSDMO>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2686)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2697)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                UnnamedObjHSDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

