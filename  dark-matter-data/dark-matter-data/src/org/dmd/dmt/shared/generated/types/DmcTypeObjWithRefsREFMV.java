package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeObjWithRefsREFMV provides storage for a multi-valued ObjWithRefsREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1842)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:489)
 */
@SuppressWarnings("serial")
public class DmcTypeObjWithRefsREFMV extends DmcTypeObjWithRefsREF implements Serializable {
    
    ArrayList<ObjWithRefsREF> value;
    
    public DmcTypeObjWithRefsREFMV(){
    
    }
    
    public DmcTypeObjWithRefsREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
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
    
    @Override
    public ObjWithRefsREF add(Object v) throws DmcValueException {
        ObjWithRefsREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<ObjWithRefsREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public ObjWithRefsREF del(Object v){
        ObjWithRefsREF rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else
            rc = null;
        return(rc);
    }
    
    @Override
    public Iterator<ObjWithRefsREF> getMV(){
        ArrayList<ObjWithRefsREF> clone = new ArrayList<ObjWithRefsREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<ObjWithRefsREF> getMVCopy(){
        ArrayList<ObjWithRefsREF> clone = new ArrayList<ObjWithRefsREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public ObjWithRefsREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
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

