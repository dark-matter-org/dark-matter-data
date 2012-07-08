package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefSVDMO;    // DmcType import
/**
 * The DmcTypeExtendedRefSVREFSV provides storage for a single-valued ExtendedRefSV
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1936)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeExtendedRefSVREFSV extends DmcTypeExtendedRefSVREF implements Serializable {
    
    protected ExtendedRefSVDMO value;
    
    public DmcTypeExtendedRefSVREFSV(){
    
    }
    
    public DmcTypeExtendedRefSVREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeExtendedRefSVREFSV getNew(){
        return(new DmcTypeExtendedRefSVREFSV(attrInfo));
    }
    
    public DmcTypeExtendedRefSVREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeExtendedRefSVREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1968)
    public DmcAttribute<ExtendedRefSVDMO> cloneIt(){
        DmcTypeExtendedRefSVREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1979)
    public ExtendedRefSVDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1991)
    public ExtendedRefSVDMO set(Object v) throws DmcValueException {
        ExtendedRefSVDMO rc = typeCheck(v);
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
    public ExtendedRefSVDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

