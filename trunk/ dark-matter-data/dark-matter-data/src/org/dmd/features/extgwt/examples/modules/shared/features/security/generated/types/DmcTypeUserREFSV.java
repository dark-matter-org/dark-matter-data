package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeUserREFSV provides storage for a single-valued UserREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1548)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:489)
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
    
    public DmcTypeUserREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeUserREFSV(ai));
    }
    
    @Override
    public DmcAttribute<UserREF> cloneIt(){
        DmcTypeUserREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public UserREF set(Object v) throws DmcValueException {
        UserREF rc = typeCheck(v);
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
    public UserREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

