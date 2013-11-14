package org.dmd.dmt.dsd.dsda.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeAConceptXREFSV provides storage for a single-valued AConceptXREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1966)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeAConceptXREFSV extends DmcTypeAConceptXREF implements Serializable {
    
    protected AConceptXREF value;
    
    public DmcTypeAConceptXREFSV(){
    
    }
    
    public DmcTypeAConceptXREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeAConceptXREFSV getNew(){
        return(new DmcTypeAConceptXREFSV(getAttributeInfo()));
    }
    
    public DmcTypeAConceptXREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeAConceptXREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1998)
    public DmcAttribute<AConceptXREF> cloneIt(){
        DmcTypeAConceptXREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2009)
    public AConceptXREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2021)
    public AConceptXREF set(Object v) throws DmcValueException {
        AConceptXREF rc = typeCheck(v);
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
    public AConceptXREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

