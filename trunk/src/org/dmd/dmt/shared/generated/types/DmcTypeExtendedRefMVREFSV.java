package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVDMO;    // DmcType import
/**
 * The DmcTypeExtendedRefMVREFSV provides storage for a single-valued ExtendedRefMV
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1944)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeExtendedRefMVREFSV extends DmcTypeExtendedRefMVREF implements Serializable {
    
    protected ExtendedRefMVDMO value;
    
    public DmcTypeExtendedRefMVREFSV(){
    
    }
    
    public DmcTypeExtendedRefMVREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeExtendedRefMVREFSV getNew(){
        return(new DmcTypeExtendedRefMVREFSV(attrInfo));
    }
    
    public DmcTypeExtendedRefMVREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeExtendedRefMVREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1976)
    public DmcAttribute<ExtendedRefMVDMO> cloneIt(){
        DmcTypeExtendedRefMVREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1987)
    public ExtendedRefMVDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1999)
    public ExtendedRefMVDMO set(Object v) throws DmcValueException {
        ExtendedRefMVDMO rc = typeCheck(v);
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
    public ExtendedRefMVDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

