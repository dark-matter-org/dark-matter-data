package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.PrimitiveSVDMO;    // DmcType import
/**
 * The DmcTypePrimitiveSVREFSV provides storage for a single-valued PrimitiveSV
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2171)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveSVREFSV extends DmcTypePrimitiveSVREF implements Serializable {
    
    protected PrimitiveSVDMO value;
    
    public DmcTypePrimitiveSVREFSV(){
    
    }
    
    public DmcTypePrimitiveSVREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypePrimitiveSVREFSV getNew(){
        return(new DmcTypePrimitiveSVREFSV(getAttributeInfo()));
    }
    
    public DmcTypePrimitiveSVREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypePrimitiveSVREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2203)
    public DmcAttribute<PrimitiveSVDMO> cloneIt(){
        DmcTypePrimitiveSVREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2214)
    public PrimitiveSVDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2226)
    public PrimitiveSVDMO set(Object v) throws DmcValueException {
        PrimitiveSVDMO rc = typeCheck(v);
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
    public PrimitiveSVDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

