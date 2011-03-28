package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeUserGroupREFMV provides storage for a multi-valued UserGroupREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1231)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:554)
 */
@SuppressWarnings("serial")
public class DmcTypeUserGroupREFMV extends DmcTypeUserGroupREF {
    
    ArrayList<UserGroupREF> value;
    
    public DmcTypeUserGroupREFMV(){
    
    }
    
    public DmcTypeUserGroupREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUserGroupREFMV getNew(){
        return(new DmcTypeUserGroupREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<UserGroupREF> cloneIt(){
        DmcTypeUserGroupREFMV rc = getNew();
        for(UserGroupREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public UserGroupREF add(Object v) throws DmcValueException {
        UserGroupREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<UserGroupREF>();
        value.add(rc);
        return(rc);
    }
    
    public UserGroupREF del(Object v){
        UserGroupREF rc = null;
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
    
    public Iterator<UserGroupREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public UserGroupREF getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            UserGroupREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

