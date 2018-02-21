package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.DmtOptionalValueFieldWithSpaces;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtOptionalValueFieldWithSpaces;    // DmcType import
/**
 * The DmcTypeDmtOptionalValueFieldWithSpacesSV provides storage for a single-valued DmtOptionalValueFieldWithSpaces
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1994)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:125)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtOptionalValueFieldWithSpacesSV extends DmcTypeDmtOptionalValueFieldWithSpaces implements Serializable {
    
    protected DmtOptionalValueFieldWithSpaces value;
    
    public DmcTypeDmtOptionalValueFieldWithSpacesSV(){
    
    }
    
    public DmcTypeDmtOptionalValueFieldWithSpacesSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeDmtOptionalValueFieldWithSpacesSV getNew(){
        return(new DmcTypeDmtOptionalValueFieldWithSpacesSV(getAttributeInfo()));
    }
    
    public DmcTypeDmtOptionalValueFieldWithSpacesSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeDmtOptionalValueFieldWithSpacesSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2026)
    public DmcAttribute<DmtOptionalValueFieldWithSpaces> cloneIt(){
        DmcTypeDmtOptionalValueFieldWithSpacesSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2037)
    public DmtOptionalValueFieldWithSpaces getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2049)
    public DmtOptionalValueFieldWithSpaces set(Object v) throws DmcValueException {
        DmtOptionalValueFieldWithSpaces rc = typeCheck(v);
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
    public DmtOptionalValueFieldWithSpaces getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

