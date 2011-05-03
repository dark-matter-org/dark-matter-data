package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;    // DmcType import
/**
 * The DmcTypeTestBasicObjectFixedREFSV provides storage for a single-valued TestBasicObjectFixed
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1546)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:198)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicObjectFixedREFSV extends DmcTypeTestBasicObjectFixedREF implements Serializable {
    
    TestBasicObjectFixedDMO value;
    
    public DmcTypeTestBasicObjectFixedREFSV(){
    
    }
    
    public DmcTypeTestBasicObjectFixedREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestBasicObjectFixedREFSV getNew(){
        return(new DmcTypeTestBasicObjectFixedREFSV(attrInfo));
    }
    
    public DmcTypeTestBasicObjectFixedREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeTestBasicObjectFixedREFSV(ai));
    }
    
    @Override
    public DmcAttribute<TestBasicObjectFixedDMO> cloneIt(){
        DmcTypeTestBasicObjectFixedREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public TestBasicObjectFixedDMO set(Object v) throws DmcValueException {
        TestBasicObjectFixedDMO rc = typeCheck(v);
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
    public TestBasicObjectFixedDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

