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
import org.dmd.dmt.shared.generated.dmo.NamedObjMVIDXDMO;    // DmcType import
/**
 * The DmcTypeNamedObjMVIDXREFSET provides storage for a set of NamedObjMVIDXDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2609)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:256)
 */
@SuppressWarnings("serial")
public class DmcTypeNamedObjMVIDXREFSET extends DmcTypeNamedObjMVIDXREF implements Serializable {
    
     private final static Iterator<NamedObjMVIDXDMO> emptyList =  (new HashSet<NamedObjMVIDXDMO>()).iterator();
    
    
    protected Set<NamedObjMVIDXDMO> value;
    
    public DmcTypeNamedObjMVIDXREFSET(){
        value = null;
    }
    
    public DmcTypeNamedObjMVIDXREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<NamedObjMVIDXDMO>();
        else
            value = new TreeSet<NamedObjMVIDXDMO>();
    }
    
    @Override
    public DmcTypeNamedObjMVIDXREFSET getNew(){
        return(new DmcTypeNamedObjMVIDXREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2650)
    public DmcAttribute<NamedObjMVIDXDMO> cloneIt(){
        synchronized(this){
            DmcTypeNamedObjMVIDXREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(NamedObjMVIDXDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2673)
    public NamedObjMVIDXDMO add(Object v) throws DmcValueException {
        synchronized(this){
            NamedObjMVIDXDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2690)
    public NamedObjMVIDXDMO del(Object v){
        synchronized(this){
            NamedObjMVIDXDMO rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2715)
    public Iterator<NamedObjMVIDXDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<NamedObjMVIDXDMO>(value)).iterator() );
            else
                return( (new TreeSet<NamedObjMVIDXDMO>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2729)
    public Set<NamedObjMVIDXDMO> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<NamedObjMVIDXDMO>());
                else
                    return(new HashSet<NamedObjMVIDXDMO>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<NamedObjMVIDXDMO>(value));
                else
                    return(new TreeSet<NamedObjMVIDXDMO>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2749)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2760)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                NamedObjMVIDXDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}
