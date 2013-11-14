package org.dmd.dmt.dsd.dsda.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeAConceptBaseREFSV provides storage for a single-valued AConceptBaseREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1966)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeAConceptBaseREFSV extends DmcTypeAConceptBaseREF implements Serializable {
    
    protected AConceptBaseREF value;
    
    public DmcTypeAConceptBaseREFSV(){
    
    }
    
    public DmcTypeAConceptBaseREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeAConceptBaseREFSV getNew(){
        return(new DmcTypeAConceptBaseREFSV(getAttributeInfo()));
    }
    
    public DmcTypeAConceptBaseREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeAConceptBaseREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1998)
    public DmcAttribute<AConceptBaseREF> cloneIt(){
        DmcTypeAConceptBaseREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2009)
    public AConceptBaseREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2021)
    public AConceptBaseREF set(Object v) throws DmcValueException {
        AConceptBaseREF rc = typeCheck(v);
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
    public AConceptBaseREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

