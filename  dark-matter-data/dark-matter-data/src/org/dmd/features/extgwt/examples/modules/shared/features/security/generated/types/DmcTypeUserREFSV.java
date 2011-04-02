package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeUserREFSV provides storage for a single-valued UserREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1340)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:434)
 */
@SuppressWarnings("serial")
public class DmcTypeUserREFSV extends DmcTypeUserREF implements Serializable {
    
    UserREF value;
    
    public DmcTypeUserREFSV(){
    
    }
    
    public DmcTypeUserREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUserREFSV getNew(){
        return(new DmcTypeUserREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<UserREF> cloneIt(){
        DmcTypeUserREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public UserREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public UserREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

