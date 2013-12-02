package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeBaseObjREFSV provides storage for a single-valued BaseObjREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1969)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeBaseObjREFSV extends DmcTypeBaseObjREF implements Serializable {
    
    protected BaseObjREF value;
    
    public DmcTypeBaseObjREFSV(){
    
    }
    
    public DmcTypeBaseObjREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeBaseObjREFSV getNew(){
        return(new DmcTypeBaseObjREFSV(getAttributeInfo()));
    }
    
    public DmcTypeBaseObjREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeBaseObjREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2001)
    public DmcAttribute<BaseObjREF> cloneIt(){
        DmcTypeBaseObjREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2012)
    public BaseObjREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2024)
    public BaseObjREF set(Object v) throws DmcValueException {
        BaseObjREF rc = typeCheck(v);
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
    public BaseObjREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

