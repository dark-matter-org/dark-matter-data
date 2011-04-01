package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeObjWithRefsREFSV provides storage for a single-valued ObjWithRefsREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1338)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:553)
 */
@SuppressWarnings("serial")
public class DmcTypeObjWithRefsREFSV extends DmcTypeObjWithRefsREF {
    
    ObjWithRefsREF value;
    
    public DmcTypeObjWithRefsREFSV(){
    
    }
    
    public DmcTypeObjWithRefsREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeObjWithRefsREFSV getNew(){
        return(new DmcTypeObjWithRefsREFSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<ObjWithRefsREF> cloneIt(){
        DmcTypeObjWithRefsREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public ObjWithRefsREF set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
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

