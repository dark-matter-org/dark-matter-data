package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * The DmcTypeUserGroupREFSET provides storage for a set of UserGroupREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1395)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:548)
 */
@SuppressWarnings("serial")
public class DmcTypeUserGroupREFSET extends DmcTypeUserGroupREF {
    
    Set<UserGroupREF> value;
    
    public DmcTypeUserGroupREFSET(){
        value = null;
    }
    
    public DmcTypeUserGroupREFSET(DmcAttributeInfo ai){
        super(ai);
        if (ai.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<UserGroupREF>();
        else
            value = new TreeSet<UserGroupREF>();
    }
    
    public DmcTypeUserGroupREFSET getNew(){
        return(new DmcTypeUserGroupREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<UserGroupREF> cloneIt(){
        DmcTypeUserGroupREFSET rc = getNew();
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

