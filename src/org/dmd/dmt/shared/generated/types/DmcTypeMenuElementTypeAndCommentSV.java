package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.MenuElementTypeAndComment;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeMenuElementTypeAndComment;    // DmcType import
/**
 * The DmcTypeMenuElementTypeAndCommentSV provides storage for a single-valued MenuElementTypeAndComment
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2151)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:125)
 */
@SuppressWarnings("serial")
public class DmcTypeMenuElementTypeAndCommentSV extends DmcTypeMenuElementTypeAndComment implements Serializable {
    
    protected MenuElementTypeAndComment value;
    
    public DmcTypeMenuElementTypeAndCommentSV(){
    
    }
    
    public DmcTypeMenuElementTypeAndCommentSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeMenuElementTypeAndCommentSV getNew(){
        return(new DmcTypeMenuElementTypeAndCommentSV(getAttributeInfo()));
    }
    
    public DmcTypeMenuElementTypeAndCommentSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeMenuElementTypeAndCommentSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2183)
    public DmcAttribute<MenuElementTypeAndComment> cloneIt(){
        DmcTypeMenuElementTypeAndCommentSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2194)
    public MenuElementTypeAndComment getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2206)
    public MenuElementTypeAndComment set(Object v) throws DmcValueException {
        MenuElementTypeAndComment rc = typeCheck(v);
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
    public MenuElementTypeAndComment getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

