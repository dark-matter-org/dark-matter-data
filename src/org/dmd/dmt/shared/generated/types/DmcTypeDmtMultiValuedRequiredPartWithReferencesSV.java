package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.DmtMultiValuedRequiredPartWithReferences;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtMultiValuedRequiredPartWithReferences;    // DmcType import
/**
 * The DmcTypeDmtMultiValuedRequiredPartWithReferencesSV provides storage for a single-valued DmtMultiValuedRequiredPartWithReferences
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2151)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:125)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtMultiValuedRequiredPartWithReferencesSV extends DmcTypeDmtMultiValuedRequiredPartWithReferences implements Serializable {
    
    protected DmtMultiValuedRequiredPartWithReferences value;
    
    public DmcTypeDmtMultiValuedRequiredPartWithReferencesSV(){
    
    }
    
    public DmcTypeDmtMultiValuedRequiredPartWithReferencesSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeDmtMultiValuedRequiredPartWithReferencesSV getNew(){
        return(new DmcTypeDmtMultiValuedRequiredPartWithReferencesSV(getAttributeInfo()));
    }
    
    public DmcTypeDmtMultiValuedRequiredPartWithReferencesSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeDmtMultiValuedRequiredPartWithReferencesSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2183)
    public DmcAttribute<DmtMultiValuedRequiredPartWithReferences> cloneIt(){
        DmcTypeDmtMultiValuedRequiredPartWithReferencesSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2194)
    public DmtMultiValuedRequiredPartWithReferences getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2206)
    public DmtMultiValuedRequiredPartWithReferences set(Object v) throws DmcValueException {
        DmtMultiValuedRequiredPartWithReferences rc = typeCheck(v);
        // We only return a value if the value actually changed. This supports
        // the applyModifier() mechanism on DmcObject where we only return true
        // if something changed as a result of the modifier
        if (value == null)
            value = rc;
        else{
            if (value.equals(rc))
                rc = null;
            else
                value = rc;
        }
        return(rc);
    }
    
    @Override
    public DmtMultiValuedRequiredPartWithReferences getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

