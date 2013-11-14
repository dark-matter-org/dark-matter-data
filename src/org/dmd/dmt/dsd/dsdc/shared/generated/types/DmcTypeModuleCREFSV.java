package org.dmd.dmt.dsd.dsdc.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeModuleCREFSV provides storage for a single-valued ModuleCREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1966)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeModuleCREFSV extends DmcTypeModuleCREF implements Serializable {
    
    protected ModuleCREF value;
    
    public DmcTypeModuleCREFSV(){
    
    }
    
    public DmcTypeModuleCREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeModuleCREFSV getNew(){
        return(new DmcTypeModuleCREFSV(getAttributeInfo()));
    }
    
    public DmcTypeModuleCREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeModuleCREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1998)
    public DmcAttribute<ModuleCREF> cloneIt(){
        DmcTypeModuleCREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2009)
    public ModuleCREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2021)
    public ModuleCREF set(Object v) throws DmcValueException {
        ModuleCREF rc = typeCheck(v);
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
    public ModuleCREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

