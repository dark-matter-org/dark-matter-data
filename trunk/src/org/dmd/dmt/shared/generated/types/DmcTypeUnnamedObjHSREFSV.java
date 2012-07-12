package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.UnnamedObjHSDMO;    // DmcType import
/**
 * The DmcTypeUnnamedObjHSREFSV provides storage for a single-valued UnnamedObjHS
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1944)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeUnnamedObjHSREFSV extends DmcTypeUnnamedObjHSREF implements Serializable {
    
    protected UnnamedObjHSDMO value;
    
    public DmcTypeUnnamedObjHSREFSV(){
    
    }
    
    public DmcTypeUnnamedObjHSREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUnnamedObjHSREFSV getNew(){
        return(new DmcTypeUnnamedObjHSREFSV(attrInfo));
    }
    
    public DmcTypeUnnamedObjHSREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeUnnamedObjHSREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1976)
    public DmcAttribute<UnnamedObjHSDMO> cloneIt(){
        DmcTypeUnnamedObjHSREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1987)
    public UnnamedObjHSDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1999)
    public UnnamedObjHSDMO set(Object v) throws DmcValueException {
        UnnamedObjHSDMO rc = typeCheck(v);
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
    public UnnamedObjHSDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

