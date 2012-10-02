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
import org.dmd.dmt.shared.generated.dmo.NamedObjSVDMO;    // DmcType import
/**
 * The DmcTypeNamedObjSVREFSET provides storage for a set of NamedObjSVDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2567)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeNamedObjSVREFSET extends DmcTypeNamedObjSVREF implements Serializable {
    
     private final static Iterator<NamedObjSVDMO> emptyList =  (new HashSet<NamedObjSVDMO>()).iterator();
    
    
    protected Set<NamedObjSVDMO> value;
    
    public DmcTypeNamedObjSVREFSET(){
        value = null;
    }
    
    public DmcTypeNamedObjSVREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<NamedObjSVDMO>();
        else
            value = new TreeSet<NamedObjSVDMO>();
    }
    
    @Override
    public DmcTypeNamedObjSVREFSET getNew(){
        return(new DmcTypeNamedObjSVREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2608)
    public DmcAttribute<NamedObjSVDMO> cloneIt(){
        synchronized(this){
            DmcTypeNamedObjSVREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(NamedObjSVDMO val: value)
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
    public NamedObjSVDMO add(Object v) throws DmcValueException {
        synchronized(this){
            NamedObjSVDMO rc = typeCheck(v);
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
    public NamedObjSVDMO del(Object v){
        synchronized(this){
            NamedObjSVDMO rc = null;
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
    public Iterator<NamedObjSVDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<NamedObjSVDMO>(value)).iterator() );
            else
                return( (new TreeSet<NamedObjSVDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2687)
    public Set<NamedObjSVDMO> getMVCopy(){
        synchronized(this){
            if (attrInfo.valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<NamedObjSVDMO>());
                else
                    return(new HashSet<NamedObjSVDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<NamedObjSVDMO>(value));
                else
                    return(new TreeSet<NamedObjSVDMO>(value));
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
                NamedObjSVDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

