package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;    // DmcType import
/**
 * The DmcTypeNameContainerTestREFSV provides storage for a single-valued NameContainerTest
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1833)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeNameContainerTestREFSV extends DmcTypeNameContainerTestREF implements Serializable {
    
    protected NameContainerTestDMO value;
    
    public DmcTypeNameContainerTestREFSV(){
    
    }
    
    public DmcTypeNameContainerTestREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeNameContainerTestREFSV getNew(){
        return(new DmcTypeNameContainerTestREFSV(attrInfo));
    }
    
    public DmcTypeNameContainerTestREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeNameContainerTestREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1865)
    public DmcAttribute<NameContainerTestDMO> cloneIt(){
        DmcTypeNameContainerTestREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1876)
    public NameContainerTestDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1888)
    public NameContainerTestDMO set(Object v) throws DmcValueException {
        NameContainerTestDMO rc = typeCheck(v);
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
    public NameContainerTestDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

