package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.UnnamedObjMVDMO;    // DmcType import
/**
 * The DmcTypeUnnamedObjMVREFSV provides storage for a single-valued UnnamedObjMV
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1997)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeUnnamedObjMVREFSV extends DmcTypeUnnamedObjMVREF implements Serializable {
    
    protected UnnamedObjMVDMO value;
    
    public DmcTypeUnnamedObjMVREFSV(){
    
    }
    
    public DmcTypeUnnamedObjMVREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUnnamedObjMVREFSV getNew(){
        return(new DmcTypeUnnamedObjMVREFSV(getAttributeInfo()));
    }
    
    public DmcTypeUnnamedObjMVREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeUnnamedObjMVREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2029)
    public DmcAttribute<UnnamedObjMVDMO> cloneIt(){
        DmcTypeUnnamedObjMVREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2040)
    public UnnamedObjMVDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2052)
    public UnnamedObjMVDMO set(Object v) throws DmcValueException {
        UnnamedObjMVDMO rc = typeCheck(v);
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
    public UnnamedObjMVDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

