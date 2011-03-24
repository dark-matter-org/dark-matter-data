package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO;    // primitive import
/**
 * The DmcTypeTestAbstractExtendedREFSV provides storage for a single-valued TestAbstractExtended
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1057)
 */
@SuppressWarnings("serial")
public class DmcTypeTestAbstractExtendedREFSV extends DmcTypeTestAbstractExtendedREF {
    
    TestAbstractExtendedDMO value;
    
    public DmcTypeTestAbstractExtendedREFSV(){
    
    }
    
    public DmcTypeTestAbstractExtendedREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestAbstractExtendedREFSV getNew(){
        return(new DmcTypeTestAbstractExtendedREFSV(attrInfo));
    }
    
    public TestAbstractExtendedDMO set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestAbstractExtendedDMO getSV(){
        return(value);
    }
    
}

