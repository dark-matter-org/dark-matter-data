package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeObjWithRefsREFSV provides storage for a single-valued ObjWithRefsREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2171)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:534)
 */
@SuppressWarnings("serial")
public class DmcTypeObjWithRefsREFSV extends DmcTypeObjWithRefsREF implements Serializable {
    
    protected ObjWithRefsREF value;
    
    public DmcTypeObjWithRefsREFSV(){
    
    }
    
    public DmcTypeObjWithRefsREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeObjWithRefsREFSV getNew(){
        return(new DmcTypeObjWithRefsREFSV(getAttributeInfo()));
    }
    
    public DmcTypeObjWithRefsREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeObjWithRefsREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2203)
    public DmcAttribute<ObjWithRefsREF> cloneIt(){
        DmcTypeObjWithRefsREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2214)
    public ObjWithRefsREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2226)
    public ObjWithRefsREF set(Object v) throws DmcValueException {
        ObjWithRefsREF rc = typeCheck(v);
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
    public ObjWithRefsREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

