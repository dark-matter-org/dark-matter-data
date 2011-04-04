package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestMultiLevelSubpackageREFSV provides storage for a single-valued TestMultiLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1296)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:434)
 */
@SuppressWarnings("serial")
public class DmcTypeTestMultiLevelSubpackageREFSV extends DmcTypeTestMultiLevelSubpackageREF implements Serializable {
    
    TestMultiLevelSubpackageREF value;
    
    public DmcTypeTestMultiLevelSubpackageREFSV(){
    
    }
    
    public DmcTypeTestMultiLevelSubpackageREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestMultiLevelSubpackageREFSV getNew(){
        return(new DmcTypeTestMultiLevelSubpackageREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestMultiLevelSubpackageREF> cloneIt(){
        DmcTypeTestMultiLevelSubpackageREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public TestMultiLevelSubpackageREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestMultiLevelSubpackageREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

