package org.dmd.dmt.dsd.dsdb.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeBConceptXREFSV provides storage for a single-valued BConceptXREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1966)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeBConceptXREFSV extends DmcTypeBConceptXREF implements Serializable {
    
    protected BConceptXREF value;
    
    public DmcTypeBConceptXREFSV(){
    
    }
    
    public DmcTypeBConceptXREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeBConceptXREFSV getNew(){
        return(new DmcTypeBConceptXREFSV(getAttributeInfo()));
    }
    
    public DmcTypeBConceptXREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeBConceptXREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1998)
    public DmcAttribute<BConceptXREF> cloneIt(){
        DmcTypeBConceptXREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2009)
    public BConceptXREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2021)
    public BConceptXREF set(Object v) throws DmcValueException {
        BConceptXREF rc = typeCheck(v);
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
    public BConceptXREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

