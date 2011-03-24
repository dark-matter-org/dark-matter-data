package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestMultiLevelSubpackageREFSV provides storage for a single-valued TestMultiLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1057)
 */
@SuppressWarnings("serial")
public class DmcTypeTestMultiLevelSubpackageREFSV extends DmcTypeTestMultiLevelSubpackageREF {
    
    TestMultiLevelSubpackageREF value;
    
    public DmcTypeTestMultiLevelSubpackageREFSV(){
    
    }
    
    public DmcTypeTestMultiLevelSubpackageREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestMultiLevelSubpackageREFSV getNew(){
        return(new DmcTypeTestMultiLevelSubpackageREFSV(attrInfo));
    }
    
    public TestMultiLevelSubpackageREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestMultiLevelSubpackageREF getSV(){
        return(value);
    }
    
}

