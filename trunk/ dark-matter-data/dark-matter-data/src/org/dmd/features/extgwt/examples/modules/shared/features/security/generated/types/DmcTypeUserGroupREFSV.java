package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeUserGroupREFSV provides storage for a single-valued UserGroupREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1074)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:546)
 */
@SuppressWarnings("serial")
public class DmcTypeUserGroupREFSV extends DmcTypeUserGroupREF {
    
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
        return(value = typeCheck(v));
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

