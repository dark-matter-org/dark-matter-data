package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestBasicNamedObjectFixedREFSV provides storage for a single-valued TestBasicNamedObjectFixedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1079)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:553)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectFixedREFSV extends DmcTypeTestBasicNamedObjectFixedREF {
    
    TestBasicNamedObjectFixedREF value;
    
    public DmcTypeTestBasicNamedObjectFixedREFSV(){
    
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFSV getNew(){
        return(new DmcTypeTestBasicNamedObjectFixedREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestBasicNamedObjectFixedREF> cloneIt(){
        DmcTypeTestBasicNamedObjectFixedREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public TestBasicNamedObjectFixedREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestBasicNamedObjectFixedREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

