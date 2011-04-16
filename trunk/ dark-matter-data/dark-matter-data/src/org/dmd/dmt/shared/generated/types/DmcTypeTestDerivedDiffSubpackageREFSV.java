package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestDerivedDiffSubpackageREFSV provides storage for a single-valued TestDerivedDiffSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1474)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:450)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedDiffSubpackageREFSV extends DmcTypeTestDerivedDiffSubpackageREF implements Serializable {
    
    TestDerivedDiffSubpackageREF value;
    
    public DmcTypeTestDerivedDiffSubpackageREFSV(){
    
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFSV getNew(){
        return(new DmcTypeTestDerivedDiffSubpackageREFSV(attrInfo));
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeTestDerivedDiffSubpackageREFSV(ai));
    }
    
    @Override
    public DmcAttribute<TestDerivedDiffSubpackageREF> cloneIt(){
        DmcTypeTestDerivedDiffSubpackageREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public TestDerivedDiffSubpackageREF set(Object v) throws DmcValueException {
        TestDerivedDiffSubpackageREF rc = typeCheck(v);
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
    public TestDerivedDiffSubpackageREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

