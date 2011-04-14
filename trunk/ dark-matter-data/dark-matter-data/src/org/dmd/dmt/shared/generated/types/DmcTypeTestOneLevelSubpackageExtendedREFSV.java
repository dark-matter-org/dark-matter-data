package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestOneLevelSubpackageExtendedREFSV provides storage for a single-valued TestOneLevelSubpackageExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1320)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:440)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageExtendedREFSV extends DmcTypeTestOneLevelSubpackageExtendedREF implements Serializable {
    
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
        TestOneLevelSubpackageExtendedREF rc = typeCheck(v);
        // We only return a value if the value actually changed. This supports
        // the applyModifier() mechanism on DmcObject where we only return true
        // if something changed as a result of the modifier
        if (value == null)
            value = rc;
        else{
            if (value.equals(rc))
                rc = null;
            else
                value = rc;
        }
        return(rc);
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

