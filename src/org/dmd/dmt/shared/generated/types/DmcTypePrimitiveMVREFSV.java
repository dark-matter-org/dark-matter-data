package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.PrimitiveMVDMO;    // DmcType import
/**
 * The DmcTypePrimitiveMVREFSV provides storage for a single-valued PrimitiveMV
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1962)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypePrimitiveMVREFSV extends DmcTypePrimitiveMVREF implements Serializable {
    
    protected PrimitiveMVDMO value;
    
    public DmcTypePrimitiveMVREFSV(){
    
    }
    
    public DmcTypePrimitiveMVREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypePrimitiveMVREFSV getNew(){
        return(new DmcTypePrimitiveMVREFSV(getAttributeInfo()));
    }
    
    public DmcTypePrimitiveMVREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypePrimitiveMVREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1994)
    public DmcAttribute<PrimitiveMVDMO> cloneIt(){
        DmcTypePrimitiveMVREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2005)
    public PrimitiveMVDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2017)
    public PrimitiveMVDMO set(Object v) throws DmcValueException {
        PrimitiveMVDMO rc = typeCheck(v);
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
    public PrimitiveMVDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

