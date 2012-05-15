package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestOneLevelSubpackageREFSV provides storage for a single-valued TestOneLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1832)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageREFSV extends DmcTypeTestOneLevelSubpackageREF implements Serializable {
    
    protected TestOneLevelSubpackageREF value;
    
    public DmcTypeTestOneLevelSubpackageREFSV(){
    
    }
    
    public DmcTypeTestOneLevelSubpackageREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestOneLevelSubpackageREFSV getNew(){
        return(new DmcTypeTestOneLevelSubpackageREFSV(attrInfo));
    }
    
    public DmcTypeTestOneLevelSubpackageREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeTestOneLevelSubpackageREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1864)
    public DmcAttribute<TestOneLevelSubpackageREF> cloneIt(){
        DmcTypeTestOneLevelSubpackageREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1875)
    public TestOneLevelSubpackageREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1887)
    public TestOneLevelSubpackageREF set(Object v) throws DmcValueException {
        TestOneLevelSubpackageREF rc = typeCheck(v);
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
    public TestOneLevelSubpackageREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

