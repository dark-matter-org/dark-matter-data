package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.DmtOptionalValueFieldWithColons;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtOptionalValueFieldWithColons;    // DmcType import
/**
 * The DmcTypeDmtOptionalValueFieldWithColonsSV provides storage for a single-valued DmtOptionalValueFieldWithColons
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2151)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:125)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtOptionalValueFieldWithColonsSV extends DmcTypeDmtOptionalValueFieldWithColons implements Serializable {
    
    protected DmtOptionalValueFieldWithColons value;
    
    public DmcTypeDmtOptionalValueFieldWithColonsSV(){
    
    }
    
    public DmcTypeDmtOptionalValueFieldWithColonsSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeDmtOptionalValueFieldWithColonsSV getNew(){
        return(new DmcTypeDmtOptionalValueFieldWithColonsSV(getAttributeInfo()));
    }
    
    public DmcTypeDmtOptionalValueFieldWithColonsSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeDmtOptionalValueFieldWithColonsSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2183)
    public DmcAttribute<DmtOptionalValueFieldWithColons> cloneIt(){
        DmcTypeDmtOptionalValueFieldWithColonsSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2194)
    public DmtOptionalValueFieldWithColons getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2206)
    public DmtOptionalValueFieldWithColons set(Object v) throws DmcValueException {
        DmtOptionalValueFieldWithColons rc = typeCheck(v);
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
    public DmtOptionalValueFieldWithColons getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

