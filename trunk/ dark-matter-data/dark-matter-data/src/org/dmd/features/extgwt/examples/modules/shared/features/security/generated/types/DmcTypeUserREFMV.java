package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeUserREFMV provides storage for a multi-valued UserREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1947)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:494)
 */
@SuppressWarnings("serial")
public class DmcTypeUserREFMV extends DmcTypeUserREF implements Serializable {
    
    ArrayList<UserREF> value;
    
    public DmcTypeUserREFMV(){
    
    }
    
    public DmcTypeUserREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeUserREFMV getNew(){
        return(new DmcTypeUserREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<UserREF> cloneIt(){
        DmcTypeUserREFMV rc = getNew();
        for(UserREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public UserREF add(Object v) throws DmcValueException {
        UserREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<UserREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public UserREF del(Object v){
        UserREF rc = null;
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
    public Iterator<UserREF> getMV(){
        ArrayList<UserREF> clone = new ArrayList<UserREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<UserREF> getMVCopy(){
        ArrayList<UserREF> clone = new ArrayList<UserREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public UserREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            UserREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

