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
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2332)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:223)
 */
@SuppressWarnings("serial")
public class DmcTypeClientCountFilterRequestREFSET extends DmcTypeClientCountFilterRequestREF implements Serializable {
    
    protected Set<ClientCountFilterRequestDMO> value;
    
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2369)
    public DmcAttribute<ClientCountFilterRequestDMO> cloneIt(){
        synchronized(this){
            DmcTypeClientCountFilterRequestREFSET rc = getNew();
            for(ClientCountFilterRequestDMO val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2388)
    public ClientCountFilterRequestDMO add(Object v) throws DmcValueException {
        synchronized(this){
            ClientCountFilterRequestDMO rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2405)
    public ClientCountFilterRequestDMO del(Object v){
        synchronized(this){
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2424)
    public Iterator<ClientCountFilterRequestDMO> getMV(){
        synchronized(this){
            Set<ClientCountFilterRequestDMO> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<ClientCountFilterRequestDMO>(value);
            else
                clone = new TreeSet<ClientCountFilterRequestDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2437)
    public Set<ClientCountFilterRequestDMO> getMVCopy(){
        synchronized(this){
            Set<ClientCountFilterRequestDMO> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<ClientCountFilterRequestDMO>(value);
            else
                clone = new TreeSet<ClientCountFilterRequestDMO>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2451)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2462)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                ClientCountFilterRequestDMO val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

