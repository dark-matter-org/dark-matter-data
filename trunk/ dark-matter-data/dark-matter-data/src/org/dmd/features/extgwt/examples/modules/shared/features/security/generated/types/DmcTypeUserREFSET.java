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
 * The DmcTypeUserREFSET provides storage for a set of UserREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2035)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:490)
 */
@SuppressWarnings("serial")
public class DmcTypeUserREFSET extends DmcTypeUserREF implements Serializable {
    
    Set<UserREF> value;
    
    public DmcTypeUserREFSET(){
        value = null;
    }
    
    public DmcTypeUserREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<UserREF>();
        else
            value = new TreeSet<UserREF>();
    }
    
    @Override
    public DmcTypeUserREFSET getNew(){
        return(new DmcTypeUserREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<UserREF> cloneIt(){
        DmcTypeUserREFSET rc = getNew();
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
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
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
        Set<UserREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<UserREF>(value);
        else
            clone = new TreeSet<UserREF>(value);
        return(clone.iterator());
    }
    
    public Set<UserREF> getMVCopy(){
        Set<UserREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<UserREF>(value);
        else
            clone = new TreeSet<UserREF>(value);
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
            UserREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

