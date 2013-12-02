package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.UnnamedObjSVDMO;    // DmcType import
/**
 * The DmcTypeUnnamedObjSVREFSV provides storage for a single-valued UnnamedObjSV
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1969)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeUnnamedObjSVREFSV extends DmcTypeUnnamedObjSVREF implements Serializable {
    
    protected UnnamedObjSVDMO value;
    
    public DmcTypeUnnamedObjSVREFSV(){
    
    }
    
    public DmcTypeUnnamedObjSVREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUnnamedObjSVREFSV getNew(){
        return(new DmcTypeUnnamedObjSVREFSV(getAttributeInfo()));
    }
    
    public DmcTypeUnnamedObjSVREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeUnnamedObjSVREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2001)
    public DmcAttribute<UnnamedObjSVDMO> cloneIt(){
        DmcTypeUnnamedObjSVREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2012)
    public UnnamedObjSVDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2024)
    public UnnamedObjSVDMO set(Object v) throws DmcValueException {
        UnnamedObjSVDMO rc = typeCheck(v);
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
    public UnnamedObjSVDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

