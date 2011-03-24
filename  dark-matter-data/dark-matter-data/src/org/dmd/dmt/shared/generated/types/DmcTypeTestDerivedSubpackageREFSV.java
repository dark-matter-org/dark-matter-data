package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestDerivedSubpackageREFSV provides storage for a single-valued TestDerivedSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1057)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedSubpackageREFSV extends DmcTypeTestDerivedSubpackageREF {
    
    TestDerivedSubpackageREF value;
    
    public DmcTypeTestDerivedSubpackageREFSV(){
    
    }
    
    public DmcTypeTestDerivedSubpackageREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestDerivedSubpackageREFSV getNew(){
        return(new DmcTypeTestDerivedSubpackageREFSV(attrInfo));
    }
    
    public TestDerivedSubpackageREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestDerivedSubpackageREF getSV(){
        return(value);
    }
    
}

