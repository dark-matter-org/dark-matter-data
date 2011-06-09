package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterRequestDMO;    // DmcType import
/**
 * The DmcTypeClientCountFilterRequestREFSV provides storage for a single-valued ClientCountFilterRequest
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1547)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:218)
 */
@SuppressWarnings("serial")
public class DmcTypeClientCountFilterRequestREFSV extends DmcTypeClientCountFilterRequestREF implements Serializable {
    
    ClientCountFilterRequestDMO value;
    
    public DmcTypeClientCountFilterRequestREFSV(){
    
    }
    
    public DmcTypeClientCountFilterRequestREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeClientCountFilterRequestREFSV getNew(){
        return(new DmcTypeClientCountFilterRequestREFSV(attrInfo));
    }
    
    public DmcTypeClientCountFilterRequestREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeClientCountFilterRequestREFSV(ai));
    }
    
    @Override
    public DmcAttribute<ClientCountFilterRequestDMO> cloneIt(){
        DmcTypeClientCountFilterRequestREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public ClientCountFilterRequestDMO set(Object v) throws DmcValueException {
        ClientCountFilterRequestDMO rc = typeCheck(v);
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
    public ClientCountFilterRequestDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

