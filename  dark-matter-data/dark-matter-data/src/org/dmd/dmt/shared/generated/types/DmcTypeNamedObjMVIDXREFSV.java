package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NamedObjMVIDXDMO;    // DmcType import
/**
 * The DmcTypeNamedObjMVIDXREFSV provides storage for a single-valued NamedObjMVIDX
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1900)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeNamedObjMVIDXREFSV extends DmcTypeNamedObjMVIDXREF implements Serializable {
    
    protected NamedObjMVIDXDMO value;
    
    public DmcTypeNamedObjMVIDXREFSV(){
    
    }
    
    public DmcTypeNamedObjMVIDXREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeNamedObjMVIDXREFSV getNew(){
        return(new DmcTypeNamedObjMVIDXREFSV(attrInfo));
    }
    
    public DmcTypeNamedObjMVIDXREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeNamedObjMVIDXREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1932)
    public DmcAttribute<NamedObjMVIDXDMO> cloneIt(){
        DmcTypeNamedObjMVIDXREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1943)
    public NamedObjMVIDXDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1955)
    public NamedObjMVIDXDMO set(Object v) throws DmcValueException {
        NamedObjMVIDXDMO rc = typeCheck(v);
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
    public NamedObjMVIDXDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

