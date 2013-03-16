package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.PrimitiveTSDMO;    // DmcType import
/**
 * The DmcTypePrimitiveTSREFSV provides storage for a single-valued PrimitiveTS
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1926)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveTSREFSV extends DmcTypePrimitiveTSREF implements Serializable {
    
    protected PrimitiveTSDMO value;
    
    public DmcTypePrimitiveTSREFSV(){
    
    }
    
    public DmcTypePrimitiveTSREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypePrimitiveTSREFSV getNew(){
        return(new DmcTypePrimitiveTSREFSV(attrInfo));
    }
    
    public DmcTypePrimitiveTSREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypePrimitiveTSREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1958)
    public DmcAttribute<PrimitiveTSDMO> cloneIt(){
        DmcTypePrimitiveTSREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1969)
    public PrimitiveTSDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1981)
    public PrimitiveTSDMO set(Object v) throws DmcValueException {
        PrimitiveTSDMO rc = typeCheck(v);
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
    public PrimitiveTSDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

