package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeIntegerNamedObjectREFSV provides storage for a single-valued IntegerNamedObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1057)
 */
@SuppressWarnings("serial")
public class DmcTypeIntegerNamedObjectREFSV extends DmcTypeIntegerNamedObjectREF {
    
    IntegerNamedObjectREF value;
    
    public DmcTypeIntegerNamedObjectREFSV(){
    
    }
    
    public DmcTypeIntegerNamedObjectREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeIntegerNamedObjectREFSV getNew(){
        return(new DmcTypeIntegerNamedObjectREFSV(attrInfo));
    }
    
    public IntegerNamedObjectREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public IntegerNamedObjectREF getSV(){
        return(value);
    }
    
}

