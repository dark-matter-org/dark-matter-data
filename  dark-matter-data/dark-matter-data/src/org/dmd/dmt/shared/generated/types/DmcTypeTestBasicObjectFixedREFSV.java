package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;    // primitive import
/**
 * The DmcTypeTestBasicObjectFixedREFSV provides storage for a single-valued TestBasicObjectFixed
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1057)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicObjectFixedREFSV extends DmcTypeTestBasicObjectFixedREF {
    
    TestBasicObjectFixedDMO value;
    
    public DmcTypeTestBasicObjectFixedREFSV(){
    
    }
    
    public DmcTypeTestBasicObjectFixedREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestBasicObjectFixedREFSV getNew(){
        return(new DmcTypeTestBasicObjectFixedREFSV(attrInfo));
    }
    
    public TestBasicObjectFixedDMO set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestBasicObjectFixedDMO getSV(){
        return(value);
    }
    
}

