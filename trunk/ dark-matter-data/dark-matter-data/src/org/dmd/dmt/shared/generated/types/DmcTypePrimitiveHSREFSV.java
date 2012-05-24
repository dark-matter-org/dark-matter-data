package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.PrimitiveHSDMO;    // DmcType import
/**
 * The DmcTypePrimitiveHSREFSV provides storage for a single-valued PrimitiveHS
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1842)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveHSREFSV extends DmcTypePrimitiveHSREF implements Serializable {
    
    protected PrimitiveHSDMO value;
    
    public DmcTypePrimitiveHSREFSV(){
    
    }
    
    public DmcTypePrimitiveHSREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypePrimitiveHSREFSV getNew(){
        return(new DmcTypePrimitiveHSREFSV(attrInfo));
    }
    
    public DmcTypePrimitiveHSREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypePrimitiveHSREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1874)
    public DmcAttribute<PrimitiveHSDMO> cloneIt(){
        DmcTypePrimitiveHSREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1885)
    public PrimitiveHSDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1897)
    public PrimitiveHSDMO set(Object v) throws DmcValueException {
        PrimitiveHSDMO rc = typeCheck(v);
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
    public PrimitiveHSDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

