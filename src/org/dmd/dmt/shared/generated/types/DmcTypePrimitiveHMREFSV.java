package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.PrimitiveHMDMO;    // DmcType import
/**
 * The DmcTypePrimitiveHMREFSV provides storage for a single-valued PrimitiveHM
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1994)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveHMREFSV extends DmcTypePrimitiveHMREF implements Serializable {
    
    protected PrimitiveHMDMO value;
    
    public DmcTypePrimitiveHMREFSV(){
    
    }
    
    public DmcTypePrimitiveHMREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypePrimitiveHMREFSV getNew(){
        return(new DmcTypePrimitiveHMREFSV(getAttributeInfo()));
    }
    
    public DmcTypePrimitiveHMREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypePrimitiveHMREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2026)
    public DmcAttribute<PrimitiveHMDMO> cloneIt(){
        DmcTypePrimitiveHMREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2037)
    public PrimitiveHMDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2049)
    public PrimitiveHMDMO set(Object v) throws DmcValueException {
        PrimitiveHMDMO rc = typeCheck(v);
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
    public PrimitiveHMDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

