package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeObjWithRefsDerivedAREFSV provides storage for a single-valued ObjWithRefsDerivedAREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2171)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:534)
 */
@SuppressWarnings("serial")
public class DmcTypeObjWithRefsDerivedAREFSV extends DmcTypeObjWithRefsDerivedAREF implements Serializable {
    
    protected ObjWithRefsDerivedAREF value;
    
    public DmcTypeObjWithRefsDerivedAREFSV(){
    
    }
    
    public DmcTypeObjWithRefsDerivedAREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeObjWithRefsDerivedAREFSV getNew(){
        return(new DmcTypeObjWithRefsDerivedAREFSV(getAttributeInfo()));
    }
    
    public DmcTypeObjWithRefsDerivedAREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeObjWithRefsDerivedAREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2203)
    public DmcAttribute<ObjWithRefsDerivedAREF> cloneIt(){
        DmcTypeObjWithRefsDerivedAREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2214)
    public ObjWithRefsDerivedAREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2226)
    public ObjWithRefsDerivedAREF set(Object v) throws DmcValueException {
        ObjWithRefsDerivedAREF rc = typeCheck(v);
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
    public ObjWithRefsDerivedAREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

