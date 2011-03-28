package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeUserREFMV provides storage for a multi-valued UserREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1231)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:554)
 */
@SuppressWarnings("serial")
public class DmcTypeUserREFMV extends DmcTypeUserREF {
    
    ArrayList<UserREF> value;
    
    public DmcTypeUserREFMV(){
    
    }
    
    public DmcTypeUserREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
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
    
    public UserREF add(Object v) throws DmcValueException {
        UserREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<UserREF>();
        value.add(rc);
        return(rc);
    }
    
    public UserREF del(Object v){
        UserREF rc = null;
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
    
    public Iterator<UserREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public UserREF getMVnth(int i){
        return(value.get(i));
    }
    
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

