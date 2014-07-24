package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestMultiLevelSubpackageREFSV provides storage for a single-valued TestMultiLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1985)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeTestMultiLevelSubpackageREFSV extends DmcTypeTestMultiLevelSubpackageREF implements Serializable {
    
    protected TestMultiLevelSubpackageREF value;
    
    public DmcTypeTestMultiLevelSubpackageREFSV(){
    
    }
    
    public DmcTypeTestMultiLevelSubpackageREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestMultiLevelSubpackageREFSV getNew(){
        return(new DmcTypeTestMultiLevelSubpackageREFSV(getAttributeInfo()));
    }
    
    public DmcTypeTestMultiLevelSubpackageREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeTestMultiLevelSubpackageREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2017)
    public DmcAttribute<TestMultiLevelSubpackageREF> cloneIt(){
        DmcTypeTestMultiLevelSubpackageREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2028)
    public TestMultiLevelSubpackageREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2040)
    public TestMultiLevelSubpackageREF set(Object v) throws DmcValueException {
        TestMultiLevelSubpackageREF rc = typeCheck(v);
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
    public TestMultiLevelSubpackageREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

