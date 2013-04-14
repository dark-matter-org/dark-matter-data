package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NamedObjHMDMO;    // DmcType import
/**
 * The DmcTypeNamedObjHMREFSV provides storage for a single-valued NamedObjHM
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1966)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeNamedObjHMREFSV extends DmcTypeNamedObjHMREF implements Serializable {
    
    protected NamedObjHMDMO value;
    
    public DmcTypeNamedObjHMREFSV(){
    
    }
    
    public DmcTypeNamedObjHMREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeNamedObjHMREFSV getNew(){
        return(new DmcTypeNamedObjHMREFSV(getAttributeInfo()));
    }
    
    public DmcTypeNamedObjHMREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeNamedObjHMREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1998)
    public DmcAttribute<NamedObjHMDMO> cloneIt(){
        DmcTypeNamedObjHMREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2009)
    public NamedObjHMDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2021)
    public NamedObjHMDMO set(Object v) throws DmcValueException {
        NamedObjHMDMO rc = typeCheck(v);
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
    public NamedObjHMDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

