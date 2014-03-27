package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVIDXDMO;    // DmcType import
/**
 * The DmcTypeExtendedRefMVIDXREFSV provides storage for a single-valued ExtendedRefMVIDX
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1955)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeExtendedRefMVIDXREFSV extends DmcTypeExtendedRefMVIDXREF implements Serializable {
    
    protected ExtendedRefMVIDXDMO value;
    
    public DmcTypeExtendedRefMVIDXREFSV(){
    
    }
    
    public DmcTypeExtendedRefMVIDXREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeExtendedRefMVIDXREFSV getNew(){
        return(new DmcTypeExtendedRefMVIDXREFSV(getAttributeInfo()));
    }
    
    public DmcTypeExtendedRefMVIDXREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeExtendedRefMVIDXREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1987)
    public DmcAttribute<ExtendedRefMVIDXDMO> cloneIt(){
        DmcTypeExtendedRefMVIDXREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1998)
    public ExtendedRefMVIDXDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2010)
    public ExtendedRefMVIDXDMO set(Object v) throws DmcValueException {
        ExtendedRefMVIDXDMO rc = typeCheck(v);
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
    public ExtendedRefMVIDXDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

