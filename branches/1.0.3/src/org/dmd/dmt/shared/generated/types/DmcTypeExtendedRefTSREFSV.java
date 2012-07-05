package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefTSDMO;    // DmcType import
/**
 * The DmcTypeExtendedRefTSREFSV provides storage for a single-valued ExtendedRefTS
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1907)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeExtendedRefTSREFSV extends DmcTypeExtendedRefTSREF implements Serializable {
    
    protected ExtendedRefTSDMO value;
    
    public DmcTypeExtendedRefTSREFSV(){
    
    }
    
    public DmcTypeExtendedRefTSREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeExtendedRefTSREFSV getNew(){
        return(new DmcTypeExtendedRefTSREFSV(attrInfo));
    }
    
    public DmcTypeExtendedRefTSREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeExtendedRefTSREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1939)
    public DmcAttribute<ExtendedRefTSDMO> cloneIt(){
        DmcTypeExtendedRefTSREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1950)
    public ExtendedRefTSDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1962)
    public ExtendedRefTSDMO set(Object v) throws DmcValueException {
        ExtendedRefTSDMO rc = typeCheck(v);
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
    public ExtendedRefTSDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

