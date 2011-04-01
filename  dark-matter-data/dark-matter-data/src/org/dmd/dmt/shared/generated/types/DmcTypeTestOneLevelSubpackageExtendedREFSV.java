package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestOneLevelSubpackageExtendedREFSV provides storage for a single-valued TestOneLevelSubpackageExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1328)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:553)
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
    
    @Override
    public DmcAttribute<TestOneLevelSubpackageExtendedREF> cloneIt(){
        DmcTypeTestOneLevelSubpackageExtendedREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public TestOneLevelSubpackageExtendedREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestOneLevelSubpackageExtendedREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

