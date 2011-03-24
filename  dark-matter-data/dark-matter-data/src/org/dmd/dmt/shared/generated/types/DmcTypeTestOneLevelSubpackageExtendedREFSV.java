package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestOneLevelSubpackageExtendedREFSV provides storage for a single-valued TestOneLevelSubpackageExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1057)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageExtendedREFSV extends DmcTypeTestOneLevelSubpackageExtendedREF {
    
    TestOneLevelSubpackageExtendedREF value;
    
    public DmcTypeTestOneLevelSubpackageExtendedREFSV(){
    
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFSV getNew(){
        return(new DmcTypeTestOneLevelSubpackageExtendedREFSV(attrInfo));
    }
    
    public TestOneLevelSubpackageExtendedREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestOneLevelSubpackageExtendedREF getSV(){
        return(value);
    }
    
}

