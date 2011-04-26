package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeBaseObjREFMV provides storage for a multi-valued BaseObjREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1784)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:455)
 */
@SuppressWarnings("serial")
public class DmcTypeBaseObjREFMV extends DmcTypeBaseObjREF implements Serializable {
    
    ArrayList<BaseObjREF> value;
    
    public DmcTypeBaseObjREFMV(){
    
    }
    
    public DmcTypeBaseObjREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeBaseObjREFMV getNew(){
        return(new DmcTypeBaseObjREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<BaseObjREF> cloneIt(){
        DmcTypeBaseObjREFMV rc = getNew();
        for(BaseObjREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public BaseObjREF add(Object v) throws DmcValueException {
        BaseObjREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<BaseObjREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public BaseObjREF del(Object v){
        BaseObjREF rc = null;
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
    public Iterator<BaseObjREF> getMV(){
        ArrayList<BaseObjREF> clone = new ArrayList<BaseObjREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<BaseObjREF> getMVCopy(){
        ArrayList<BaseObjREF> clone = new ArrayList<BaseObjREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public BaseObjREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            BaseObjREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

