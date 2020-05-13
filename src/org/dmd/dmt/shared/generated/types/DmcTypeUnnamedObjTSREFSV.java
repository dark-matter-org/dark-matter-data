package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.UnnamedObjTSDMO;    // DmcType import
/**
 * The DmcTypeUnnamedObjTSREFSV provides storage for a single-valued UnnamedObjTS
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2171)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeUnnamedObjTSREFSV extends DmcTypeUnnamedObjTSREF implements Serializable {
    
    protected UnnamedObjTSDMO value;
    
    public DmcTypeUnnamedObjTSREFSV(){
    
    }
    
    public DmcTypeUnnamedObjTSREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUnnamedObjTSREFSV getNew(){
        return(new DmcTypeUnnamedObjTSREFSV(getAttributeInfo()));
    }
    
    public DmcTypeUnnamedObjTSREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeUnnamedObjTSREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2203)
    public DmcAttribute<UnnamedObjTSDMO> cloneIt(){
        DmcTypeUnnamedObjTSREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2214)
    public UnnamedObjTSDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2226)
    public UnnamedObjTSDMO set(Object v) throws DmcValueException {
        UnnamedObjTSDMO rc = typeCheck(v);
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
    public UnnamedObjTSDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

