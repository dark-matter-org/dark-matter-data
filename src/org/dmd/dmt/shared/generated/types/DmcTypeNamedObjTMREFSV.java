package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NamedObjTMDMO;    // DmcType import
/**
 * The DmcTypeNamedObjTMREFSV provides storage for a single-valued NamedObjTM
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2171)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeNamedObjTMREFSV extends DmcTypeNamedObjTMREF implements Serializable {
    
    protected NamedObjTMDMO value;
    
    public DmcTypeNamedObjTMREFSV(){
    
    }
    
    public DmcTypeNamedObjTMREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeNamedObjTMREFSV getNew(){
        return(new DmcTypeNamedObjTMREFSV(getAttributeInfo()));
    }
    
    public DmcTypeNamedObjTMREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeNamedObjTMREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2203)
    public DmcAttribute<NamedObjTMDMO> cloneIt(){
        DmcTypeNamedObjTMREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2214)
    public NamedObjTMDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2226)
    public NamedObjTMDMO set(Object v) throws DmcValueException {
        NamedObjTMDMO rc = typeCheck(v);
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
    public NamedObjTMDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

