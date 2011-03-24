package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestDerivedDiffSubpackageREFSV provides storage for a single-valued TestDerivedDiffSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1057)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedDiffSubpackageREFSV extends DmcTypeTestDerivedDiffSubpackageREF {
    
    TestDerivedDiffSubpackageREF value;
    
    public DmcTypeTestDerivedDiffSubpackageREFSV(){
    
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFSV getNew(){
        return(new DmcTypeTestDerivedDiffSubpackageREFSV(attrInfo));
    }
    
    public TestDerivedDiffSubpackageREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestDerivedDiffSubpackageREF getSV(){
        return(value);
    }
    
}

