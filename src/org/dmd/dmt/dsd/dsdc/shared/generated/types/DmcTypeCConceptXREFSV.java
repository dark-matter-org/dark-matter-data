package org.dmd.dmt.dsd.dsdc.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeCConceptXREFSV provides storage for a single-valued CConceptXREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1966)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeCConceptXREFSV extends DmcTypeCConceptXREF implements Serializable {
    
    protected CConceptXREF value;
    
    public DmcTypeCConceptXREFSV(){
    
    }
    
    public DmcTypeCConceptXREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeCConceptXREFSV getNew(){
        return(new DmcTypeCConceptXREFSV(getAttributeInfo()));
    }
    
    public DmcTypeCConceptXREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeCConceptXREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1998)
    public DmcAttribute<CConceptXREF> cloneIt(){
        DmcTypeCConceptXREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2009)
    public CConceptXREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2021)
    public CConceptXREF set(Object v) throws DmcValueException {
        CConceptXREF rc = typeCheck(v);
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
    public CConceptXREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

