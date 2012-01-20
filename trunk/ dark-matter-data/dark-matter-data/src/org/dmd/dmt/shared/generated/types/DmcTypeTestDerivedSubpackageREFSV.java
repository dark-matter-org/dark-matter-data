package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestDerivedSubpackageREFSV provides storage for a single-valued TestDerivedSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1825)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:522)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedSubpackageREFSV extends DmcTypeTestDerivedSubpackageREF implements Serializable {
    
    protected TestDerivedSubpackageREF value;
    
    public DmcTypeTestDerivedSubpackageREFSV(){
    
    }
    
    public DmcTypeTestDerivedSubpackageREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestDerivedSubpackageREFSV getNew(){
        return(new DmcTypeTestDerivedSubpackageREFSV(attrInfo));
    }
    
    public DmcTypeTestDerivedSubpackageREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeTestDerivedSubpackageREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1857)
    public DmcAttribute<TestDerivedSubpackageREF> cloneIt(){
        DmcTypeTestDerivedSubpackageREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1868)
    public TestDerivedSubpackageREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1880)
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

