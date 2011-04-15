package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeUUIDNamedObjectREFSV provides storage for a single-valued UUIDNamedObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1376)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:440)
 */
@SuppressWarnings("serial")
public class DmcTypeUUIDNamedObjectREFSV extends DmcTypeUUIDNamedObjectREF implements Serializable {
    
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
        UUIDNamedObjectREF rc = typeCheck(v);
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
    public UUIDNamedObjectREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

