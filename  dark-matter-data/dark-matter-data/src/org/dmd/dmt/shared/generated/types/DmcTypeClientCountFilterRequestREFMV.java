package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterRequestDMO;    // DmcType import
/**
 * The DmcTypeClientCountFilterRequestREFMV provides storage for a multi-valued ClientCountFilterRequest
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1947)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:222)
 */
@SuppressWarnings("serial")
public class DmcTypeClientCountFilterRequestREFMV extends DmcTypeClientCountFilterRequestREF implements Serializable {
    
    ArrayList<ClientCountFilterRequestDMO> value;
    
    public DmcTypeClientCountFilterRequestREFMV(){
    
    }
    
    public DmcTypeClientCountFilterRequestREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeClientCountFilterRequestREFMV getNew(){
        return(new DmcTypeClientCountFilterRequestREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<ClientCountFilterRequestDMO> cloneIt(){
        DmcTypeClientCountFilterRequestREFMV rc = getNew();
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
            value = new ArrayList<ClientCountFilterRequestDMO>();
        value.add(rc);
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
        ArrayList<ClientCountFilterRequestDMO> clone = new ArrayList<ClientCountFilterRequestDMO>(value);
        return(clone.iterator());
    }
    
    public ArrayList<ClientCountFilterRequestDMO> getMVCopy(){
        ArrayList<ClientCountFilterRequestDMO> clone = new ArrayList<ClientCountFilterRequestDMO>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public ClientCountFilterRequestDMO getMVnth(int i){
        return(value.get(i));
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

