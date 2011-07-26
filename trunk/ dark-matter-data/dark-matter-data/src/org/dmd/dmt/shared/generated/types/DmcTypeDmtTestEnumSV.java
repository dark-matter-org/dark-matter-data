package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;    // DmcType import
/**
 * The DmcTypeDmtTestEnumSV provides storage for a single-valued DmtTestEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1730)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:324)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtTestEnumSV extends DmcTypeDmtTestEnum implements Serializable {
    
    DmtTestEnum value;
    
    public DmcTypeDmtTestEnumSV(){
    
    }
    
    public DmcTypeDmtTestEnumSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeDmtTestEnumSV getNew(){
        return(new DmcTypeDmtTestEnumSV(attrInfo));
    }
    
    public DmcTypeDmtTestEnumSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeDmtTestEnumSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1762)
    public DmcAttribute<DmtTestEnum> cloneIt(){
        DmcTypeDmtTestEnumSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1774)
    public DmtTestEnum set(Object v) throws DmcValueException {
        DmtTestEnum rc = typeCheck(v);
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
    public DmtTestEnum getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

