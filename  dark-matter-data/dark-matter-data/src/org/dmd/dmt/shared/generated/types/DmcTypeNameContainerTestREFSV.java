package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;    // primitive import
/**
 * The DmcTypeNameContainerTestREFSV provides storage for a single-valued NameContainerTest
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1296)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:187)
 */
@SuppressWarnings("serial")
public class DmcTypeNameContainerTestREFSV extends DmcTypeNameContainerTestREF implements Serializable {
    
    NameContainerTestDMO value;
    
    public DmcTypeNameContainerTestREFSV(){
    
    }
    
    public DmcTypeNameContainerTestREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeNameContainerTestREFSV getNew(){
        return(new DmcTypeNameContainerTestREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<NameContainerTestDMO> cloneIt(){
        DmcTypeNameContainerTestREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public NameContainerTestDMO set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
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

