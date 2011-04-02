package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestOneLevelSubpackageREFSV provides storage for a single-valued TestOneLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1340)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:434)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageREFSV extends DmcTypeTestOneLevelSubpackageREF implements Serializable {
    
    TestOneLevelSubpackageREF value;
    
    public DmcTypeTestOneLevelSubpackageREFSV(){
    
    }
    
    public DmcTypeTestOneLevelSubpackageREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestOneLevelSubpackageREFSV getNew(){
        return(new DmcTypeTestOneLevelSubpackageREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestOneLevelSubpackageREF> cloneIt(){
        DmcTypeTestOneLevelSubpackageREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public TestOneLevelSubpackageREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestOneLevelSubpackageREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

