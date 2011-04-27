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
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;    // DmcType import
/**
 * The DmcTypeClientCountFilterREFSET provides storage for a set of ClientCountFilterDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2017)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:200)
 */
@SuppressWarnings("serial")
public class DmcTypeClientCountFilterREFSET extends DmcTypeClientCountFilterREF implements Serializable {
    
    Set<ClientCountFilterDMO> value;
    
    public DmcTypeClientCountFilterREFSET(){
        value = null;
    }
    
    public DmcTypeClientCountFilterREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ClientCountFilterDMO>();
        else
            value = new TreeSet<ClientCountFilterDMO>();
    }
    
    @Override
    public DmcTypeClientCountFilterREFSET getNew(){
        return(new DmcTypeClientCountFilterREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<ClientCountFilterDMO> cloneIt(){
        DmcTypeClientCountFilterREFSET rc = getNew();
        for(ClientCountFilterDMO val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public ClientCountFilterDMO add(Object v) throws DmcValueException {
        ClientCountFilterDMO rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public ClientCountFilterDMO del(Object v){
        ClientCountFilterDMO rc = null;
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
    public Iterator<ClientCountFilterDMO> getMV(){
        Set<ClientCountFilterDMO> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<ClientCountFilterDMO>(value);
        else
            clone = new TreeSet<ClientCountFilterDMO>(value);
        return(clone.iterator());
    }
    
    public Set<ClientCountFilterDMO> getMVCopy(){
        Set<ClientCountFilterDMO> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<ClientCountFilterDMO>(value);
        else
            clone = new TreeSet<ClientCountFilterDMO>(value);
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
            ClientCountFilterDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

