package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestBasicNamedObjectExtendedREFSV provides storage for a single-valued TestBasicNamedObjectExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1057)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectExtendedREFSV extends DmcTypeTestBasicNamedObjectExtendedREF {
    
    TestBasicNamedObjectExtendedREF value;
    
    public DmcTypeTestBasicNamedObjectExtendedREFSV(){
    
    }
    
    public DmcTypeTestBasicNamedObjectExtendedREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestBasicNamedObjectExtendedREFSV getNew(){
        return(new DmcTypeTestBasicNamedObjectExtendedREFSV(attrInfo));
    }
    
    public TestBasicNamedObjectExtendedREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public TestBasicNamedObjectExtendedREF getSV(){
        return(value);
    }
    
}

