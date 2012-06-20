package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NamedObjMVDMO;    // DmcType import
/**
 * The DmcTypeNamedObjMVREFSV provides storage for a single-valued NamedObjMV
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1909)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeNamedObjMVREFSV extends DmcTypeNamedObjMVREF implements Serializable {
    
    protected NamedObjMVDMO value;
    
    public DmcTypeNamedObjMVREFSV(){
    
    }
    
    public DmcTypeNamedObjMVREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeNamedObjMVREFSV getNew(){
        return(new DmcTypeNamedObjMVREFSV(attrInfo));
    }
    
    public DmcTypeNamedObjMVREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeNamedObjMVREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1941)
    public DmcAttribute<NamedObjMVDMO> cloneIt(){
        DmcTypeNamedObjMVREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1952)
    public NamedObjMVDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1964)
    public NamedObjMVDMO set(Object v) throws DmcValueException {
        NamedObjMVDMO rc = typeCheck(v);
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
    public NamedObjMVDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

