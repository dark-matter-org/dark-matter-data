package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.DmtMultiValuedRequiredPartPrimitive;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtMultiValuedRequiredPartPrimitive;    // DmcType import
/**
 * The DmcTypeDmtMultiValuedRequiredPartPrimitiveSV provides storage for a single-valued DmtMultiValuedRequiredPartPrimitive
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2171)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:125)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtMultiValuedRequiredPartPrimitiveSV extends DmcTypeDmtMultiValuedRequiredPartPrimitive implements Serializable {
    
    protected DmtMultiValuedRequiredPartPrimitive value;
    
    public DmcTypeDmtMultiValuedRequiredPartPrimitiveSV(){
    
    }
    
    public DmcTypeDmtMultiValuedRequiredPartPrimitiveSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeDmtMultiValuedRequiredPartPrimitiveSV getNew(){
        return(new DmcTypeDmtMultiValuedRequiredPartPrimitiveSV(getAttributeInfo()));
    }
    
    public DmcTypeDmtMultiValuedRequiredPartPrimitiveSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeDmtMultiValuedRequiredPartPrimitiveSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2203)
    public DmcAttribute<DmtMultiValuedRequiredPartPrimitive> cloneIt(){
        DmcTypeDmtMultiValuedRequiredPartPrimitiveSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2214)
    public DmtMultiValuedRequiredPartPrimitive getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2226)
    public DmtMultiValuedRequiredPartPrimitive set(Object v) throws DmcValueException {
        DmtMultiValuedRequiredPartPrimitive rc = typeCheck(v);
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
    public DmtMultiValuedRequiredPartPrimitive getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

