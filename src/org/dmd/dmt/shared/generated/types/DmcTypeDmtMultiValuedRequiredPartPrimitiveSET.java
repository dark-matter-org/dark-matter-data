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
import org.dmd.dmt.shared.generated.types.DmtMultiValuedRequiredPartPrimitive;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtMultiValuedRequiredPartPrimitive;    // DmcType import
/**
 * The DmcTypeDmtMultiValuedRequiredPartPrimitiveSET provides storage for a set of DmtMultiValuedRequiredPartPrimitive
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2634)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:127)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtMultiValuedRequiredPartPrimitiveSET extends DmcTypeDmtMultiValuedRequiredPartPrimitive implements Serializable {
    
     private final static Iterator<DmtMultiValuedRequiredPartPrimitive> emptyList =  (new HashSet<DmtMultiValuedRequiredPartPrimitive>()).iterator();
    
    
    protected Set<DmtMultiValuedRequiredPartPrimitive> value;
    
    public DmcTypeDmtMultiValuedRequiredPartPrimitiveSET(){
        value = null;
    }
    
    public DmcTypeDmtMultiValuedRequiredPartPrimitiveSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<DmtMultiValuedRequiredPartPrimitive>();
        else
            value = new TreeSet<DmtMultiValuedRequiredPartPrimitive>();
    }
    
    @Override
    public DmcTypeDmtMultiValuedRequiredPartPrimitiveSET getNew(){
        return(new DmcTypeDmtMultiValuedRequiredPartPrimitiveSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2675)
    public DmcAttribute<DmtMultiValuedRequiredPartPrimitive> cloneIt(){
        synchronized(this){
            DmcTypeDmtMultiValuedRequiredPartPrimitiveSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(DmtMultiValuedRequiredPartPrimitive val: value)
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
    public DmtMultiValuedRequiredPartPrimitive add(Object v) throws DmcValueException {
        synchronized(this){
            DmtMultiValuedRequiredPartPrimitive rc = typeCheck(v);
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
    public DmtMultiValuedRequiredPartPrimitive del(Object v){
        synchronized(this){
            DmtMultiValuedRequiredPartPrimitive rc = null;
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
    public Iterator<DmtMultiValuedRequiredPartPrimitive> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<DmtMultiValuedRequiredPartPrimitive>(value)).iterator() );
            else
                return( (new TreeSet<DmtMultiValuedRequiredPartPrimitive>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2754)
    public Set<DmtMultiValuedRequiredPartPrimitive> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<DmtMultiValuedRequiredPartPrimitive>());
                else
                    return(new HashSet<DmtMultiValuedRequiredPartPrimitive>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<DmtMultiValuedRequiredPartPrimitive>(value));
                else
                    return(new TreeSet<DmtMultiValuedRequiredPartPrimitive>(value));
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
                DmtMultiValuedRequiredPartPrimitive val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

