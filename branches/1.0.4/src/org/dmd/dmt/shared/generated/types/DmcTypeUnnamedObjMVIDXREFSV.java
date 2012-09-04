package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.UnnamedObjMVIDXDMO;    // DmcType import
/**
 * The DmcTypeUnnamedObjMVIDXREFSV provides storage for a single-valued UnnamedObjMVIDX
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1907)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeUnnamedObjMVIDXREFSV extends DmcTypeUnnamedObjMVIDXREF implements Serializable {
    
    protected UnnamedObjMVIDXDMO value;
    
    public DmcTypeUnnamedObjMVIDXREFSV(){
    
    }
    
    public DmcTypeUnnamedObjMVIDXREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUnnamedObjMVIDXREFSV getNew(){
        return(new DmcTypeUnnamedObjMVIDXREFSV(attrInfo));
    }
    
    public DmcTypeUnnamedObjMVIDXREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeUnnamedObjMVIDXREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1939)
    public DmcAttribute<UnnamedObjMVIDXDMO> cloneIt(){
        DmcTypeUnnamedObjMVIDXREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1950)
    public UnnamedObjMVIDXDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1962)
    public UnnamedObjMVIDXDMO set(Object v) throws DmcValueException {
        UnnamedObjMVIDXDMO rc = typeCheck(v);
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
    public UnnamedObjMVIDXDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

