package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestDerivedSubpackageREFSV provides storage for a single-valued TestDerivedSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1315)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:434)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedSubpackageREFSV extends DmcTypeTestDerivedSubpackageREF implements Serializable {
    
    TestDerivedSubpackageREF value;
    
    public DmcTypeTestDerivedSubpackageREFSV(){
    
    }
    
    public DmcTypeTestDerivedSubpackageREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestDerivedSubpackageREFSV getNew(){
        return(new DmcTypeTestDerivedSubpackageREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestDerivedSubpackageREF> cloneIt(){
        DmcTypeTestDerivedSubpackageREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public TestDerivedSubpackageREF set(Object v) throws DmcValueException {
        TestDerivedSubpackageREF rc = typeCheck(v);
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
    public TestDerivedSubpackageREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

