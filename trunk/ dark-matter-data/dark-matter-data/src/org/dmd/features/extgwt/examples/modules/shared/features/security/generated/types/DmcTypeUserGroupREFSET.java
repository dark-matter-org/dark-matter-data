package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

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
 * The DmcTypeUserGroupREFSET provides storage for a set of UserGroupREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1850)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:442)
 */
@SuppressWarnings("serial")
public class DmcTypeUserGroupREFSET extends DmcTypeUserGroupREF implements Serializable {
    
    Set<UserGroupREF> value;
    
    public DmcTypeUserGroupREFSET(){
        value = null;
    }
    
    public DmcTypeUserGroupREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<UserGroupREF>();
        else
            value = new TreeSet<UserGroupREF>();
    }
    
    @Override
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
    
    @Override
    public UserGroupREF add(Object v) throws DmcValueException {
        UserGroupREF rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public UserGroupREF del(Object v){
        UserGroupREF rc = null;
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
    public Iterator<UserGroupREF> getMV(){
        Set<UserGroupREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<UserGroupREF>(value);
        else
            clone = new TreeSet<UserGroupREF>(value);
        return(clone.iterator());
    }
    
    public Set<UserGroupREF> getMVCopy(){
        Set<UserGroupREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<UserGroupREF>(value);
        else
            clone = new TreeSet<UserGroupREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
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

