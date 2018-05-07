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
import org.dmd.dmt.shared.generated.types.DmtMultiValuedRequiredPartWithReferences;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtMultiValuedRequiredPartWithReferences;    // DmcType import
/**
 * The DmcTypeDmtMultiValuedRequiredPartWithReferencesSET provides storage for a set of DmtMultiValuedRequiredPartWithReferences
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2791)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:127)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtMultiValuedRequiredPartWithReferencesSET extends DmcTypeDmtMultiValuedRequiredPartWithReferences implements Serializable {
    
     private final static Iterator<DmtMultiValuedRequiredPartWithReferences> emptyList =  (new HashSet<DmtMultiValuedRequiredPartWithReferences>()).iterator();
    
    
    protected Set<DmtMultiValuedRequiredPartWithReferences> value;
    
    public DmcTypeDmtMultiValuedRequiredPartWithReferencesSET(){
        value = null;
    }
    
    public DmcTypeDmtMultiValuedRequiredPartWithReferencesSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<DmtMultiValuedRequiredPartWithReferences>();
        else
            value = new TreeSet<DmtMultiValuedRequiredPartWithReferences>();
    }
    
    @Override
    public DmcTypeDmtMultiValuedRequiredPartWithReferencesSET getNew(){
        return(new DmcTypeDmtMultiValuedRequiredPartWithReferencesSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2832)
    public DmcAttribute<DmtMultiValuedRequiredPartWithReferences> cloneIt(){
        synchronized(this){
            DmcTypeDmtMultiValuedRequiredPartWithReferencesSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(DmtMultiValuedRequiredPartWithReferences val: value)
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
    public DmtMultiValuedRequiredPartWithReferences add(Object v) throws DmcValueException {
        synchronized(this){
            DmtMultiValuedRequiredPartWithReferences rc = typeCheck(v);
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
    public DmtMultiValuedRequiredPartWithReferences del(Object v){
        synchronized(this){
            DmtMultiValuedRequiredPartWithReferences rc = null;
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
    public Iterator<DmtMultiValuedRequiredPartWithReferences> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<DmtMultiValuedRequiredPartWithReferences>(value)).iterator() );
            else
                return( (new TreeSet<DmtMultiValuedRequiredPartWithReferences>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2911)
    public Set<DmtMultiValuedRequiredPartWithReferences> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<DmtMultiValuedRequiredPartWithReferences>());
                else
                    return(new HashSet<DmtMultiValuedRequiredPartWithReferences>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<DmtMultiValuedRequiredPartWithReferences>(value));
                else
                    return(new TreeSet<DmtMultiValuedRequiredPartWithReferences>(value));
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
                DmtMultiValuedRequiredPartWithReferences val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

