package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.PrimitiveTMDMO;    // DmcType import
/**
 * The DmcTypePrimitiveTMREFSV provides storage for a single-valued PrimitiveTM
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1842)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveTMREFSV extends DmcTypePrimitiveTMREF implements Serializable {
    
    protected PrimitiveTMDMO value;
    
    public DmcTypePrimitiveTMREFSV(){
    
    }
    
    public DmcTypePrimitiveTMREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypePrimitiveTMREFSV getNew(){
        return(new DmcTypePrimitiveTMREFSV(attrInfo));
    }
    
    public DmcTypePrimitiveTMREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypePrimitiveTMREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1874)
    public DmcAttribute<PrimitiveTMDMO> cloneIt(){
        DmcTypePrimitiveTMREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1885)
    public PrimitiveTMDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1897)
    public PrimitiveTMDMO set(Object v) throws DmcValueException {
        PrimitiveTMDMO rc = typeCheck(v);
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
    public PrimitiveTMDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

