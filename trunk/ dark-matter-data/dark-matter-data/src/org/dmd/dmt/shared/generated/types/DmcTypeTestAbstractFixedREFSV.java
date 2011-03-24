package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.TestAbstractFixedDMO;    // primitive import
/**
 * The DmcTypeTestAbstractFixedREFSV provides storage for a single-valued TestAbstractFixed
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1057)
 */
@SuppressWarnings("serial")
public class DmcTypeTestAbstractFixedREFSV extends DmcTypeTestAbstractFixedREF {
    
    TestAbstractFixedDMO value;
    
    public DmcTypeTestAbstractFixedREFSV(){
    
    }
    
    public DmcTypeTestAbstractFixedREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestAbstractFixedREFSV getNew(){
        return(new DmcTypeTestAbstractFixedREFSV(attrInfo));
    }
    
    public TestAbstractFixedDMO set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestAbstractFixedDMO getSV(){
        return(value);
    }
    
}

