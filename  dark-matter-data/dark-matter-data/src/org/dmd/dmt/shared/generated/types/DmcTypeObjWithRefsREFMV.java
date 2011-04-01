package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeObjWithRefsREFMV provides storage for a multi-valued ObjWithRefsREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1490)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:554)
 */
@SuppressWarnings("serial")
public class DmcTypeObjWithRefsREFMV extends DmcTypeObjWithRefsREF {
    
    ArrayList<ObjWithRefsREF> value;
    
    public DmcTypeObjWithRefsREFMV(){
    
    }
    
    public DmcTypeObjWithRefsREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeObjWithRefsREFMV getNew(){
        return(new DmcTypeObjWithRefsREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<ObjWithRefsREF> cloneIt(){
        DmcTypeObjWithRefsREFMV rc = getNew();
        for(ObjWithRefsREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public ObjWithRefsREF add(Object v) throws DmcValueException {
        ObjWithRefsREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<ObjWithRefsREF>();
        value.add(rc);
        return(rc);
    }
    
    public ObjWithRefsREF del(Object v){
        ObjWithRefsREF rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else;
            rc = null;
        return(rc);
    }
    
    public Iterator<ObjWithRefsREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public ObjWithRefsREF getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            ObjWithRefsREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

