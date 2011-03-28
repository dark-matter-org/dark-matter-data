package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeUUIDNamedObjectREFSV provides storage for a single-valued UUIDNamedObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1079)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:553)
 */
@SuppressWarnings("serial")
public class DmcTypeUUIDNamedObjectREFSV extends DmcTypeUUIDNamedObjectREF {
    
    UUIDNamedObjectREF value;
    
    public DmcTypeUUIDNamedObjectREFSV(){
    
    }
    
    public DmcTypeUUIDNamedObjectREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUUIDNamedObjectREFSV getNew(){
        return(new DmcTypeUUIDNamedObjectREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<UUIDNamedObjectREF> cloneIt(){
        DmcTypeUUIDNamedObjectREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public UUIDNamedObjectREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public UUIDNamedObjectREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

