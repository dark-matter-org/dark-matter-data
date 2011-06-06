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
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterRequestDMO;    // DmcType import
/**
 * The DmcTypeClientCountFilterRequestREFSET provides storage for a set of ClientCountFilterRequestDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2035)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:220)
 */
@SuppressWarnings("serial")
public class DmcTypeClientCountFilterRequestREFSET extends DmcTypeClientCountFilterRequestREF implements Serializable {
    
    Set<ClientCountFilterRequestDMO> value;
    
    public DmcTypeClientCountFilterRequestREFSET(){
        value = null;
    }
    
    public DmcTypeClientCountFilterRequestREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ClientCountFilterRequestDMO>();
        else
            value = new TreeSet<ClientCountFilterRequestDMO>();
    }
    
    @Override
    public DmcTypeClientCountFilterRequestREFSET getNew(){
        return(new DmcTypeClientCountFilterRequestREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<ClientCountFilterRequestDMO> cloneIt(){
        DmcTypeClientCountFilterRequestREFSET rc = getNew();
        for(ClientCountFilterRequestDMO val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public ClientCountFilterRequestDMO add(Object v) throws DmcValueException {
        ClientCountFilterRequestDMO rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public ClientCountFilterRequestDMO del(Object v){
        ClientCountFilterRequestDMO rc = null;
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
    public Iterator<ClientCountFilterRequestDMO> getMV(){
        Set<ClientCountFilterRequestDMO> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<ClientCountFilterRequestDMO>(value);
        else
            clone = new TreeSet<ClientCountFilterRequestDMO>(value);
        return(clone.iterator());
    }
    
    public Set<ClientCountFilterRequestDMO> getMVCopy(){
        Set<ClientCountFilterRequestDMO> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<ClientCountFilterRequestDMO>(value);
        else
            clone = new TreeSet<ClientCountFilterRequestDMO>(value);
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
            ClientCountFilterRequestDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

