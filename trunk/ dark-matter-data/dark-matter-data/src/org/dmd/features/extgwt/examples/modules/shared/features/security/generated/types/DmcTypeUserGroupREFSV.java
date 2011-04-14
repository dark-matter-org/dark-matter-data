package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeUserGroupREFSV provides storage for a single-valued UserGroupREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1320)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:440)
 */
@SuppressWarnings("serial")
public class DmcTypeUserGroupREFSV extends DmcTypeUserGroupREF implements Serializable {
    
    UserGroupREF value;
    
    public DmcTypeUserGroupREFSV(){
    
    }
    
    public DmcTypeUserGroupREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUserGroupREFSV getNew(){
        return(new DmcTypeUserGroupREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<UserGroupREF> cloneIt(){
        DmcTypeUserGroupREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public UserGroupREF set(Object v) throws DmcValueException {
        UserGroupREF rc = typeCheck(v);
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
    public UserGroupREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

