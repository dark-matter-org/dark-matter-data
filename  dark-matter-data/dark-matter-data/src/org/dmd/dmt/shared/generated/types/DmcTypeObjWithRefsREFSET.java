package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * The DmcTypeObjWithRefsREFSET provides storage for a set of ObjWithRefsREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1636)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:436)
 */
@SuppressWarnings("serial")
public class DmcTypeObjWithRefsREFSET extends DmcTypeObjWithRefsREF implements Serializable {
    
    Set<ObjWithRefsREF> value;
    
    public DmcTypeObjWithRefsREFSET(){
        value = null;
    }
    
    public DmcTypeObjWithRefsREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ObjWithRefsREF>();
        else
            value = new TreeSet<ObjWithRefsREF>();
    }
    
    public DmcTypeObjWithRefsREFSET getNew(){
        return(new DmcTypeObjWithRefsREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<ObjWithRefsREF> cloneIt(){
        DmcTypeObjWithRefsREFSET rc = getNew();
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
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
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
        else
            rc = null;
        return(rc);
    }
    
    public Iterator<ObjWithRefsREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
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

