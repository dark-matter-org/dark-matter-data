package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;    // DmcType import
/**
 * The DmcTypeClientCountFilterREFMV provides storage for a multi-valued ClientCountFilter
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1956)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:222)
 */
@SuppressWarnings("serial")
public class DmcTypeClientCountFilterREFMV extends DmcTypeClientCountFilterREF implements Serializable {
    
    ArrayList<ClientCountFilterDMO> value;
    
    public DmcTypeClientCountFilterREFMV(){
    
    }
    
    public DmcTypeClientCountFilterREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeClientCountFilterREFMV getNew(){
        return(new DmcTypeClientCountFilterREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<ClientCountFilterDMO> cloneIt(){
        DmcTypeClientCountFilterREFMV rc = getNew();
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
        if (attrInfo.indexSize > 0)
            throw(new IllegalStateException("You must use the setMVnth() method for indexed attribute: " + attrInfo.name));
        
        ClientCountFilterDMO rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<ClientCountFilterDMO>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public ClientCountFilterDMO del(Object v){
        if (attrInfo.indexSize > 0)
            throw(new IllegalStateException("You must use the setMVnth(index,null) method to remove values from indexed attribute: " + attrInfo.name));
        
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
        ArrayList<ClientCountFilterDMO> clone = new ArrayList<ClientCountFilterDMO>(value);
        return(clone.iterator());
    }
    
    public ArrayList<ClientCountFilterDMO> getMVCopy(){
        ArrayList<ClientCountFilterDMO> clone = new ArrayList<ClientCountFilterDMO>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public ClientCountFilterDMO getMVnth(int index){
        if ( (attrInfo.indexSize > 0) && ((index < 0) || (index >= attrInfo.indexSize)) )
            throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 < index < " + attrInfo.indexSize));
        
        return(value.get(index));
    }
    
    @Override
    public ClientCountFilterDMO setMVnth(int index, Object v) throws DmcValueException {
        if (attrInfo.indexSize == 0)
            throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
        
        if ( (index < 0) || (index >= attrInfo.indexSize))
            throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 < index < " + attrInfo.indexSize));
        
        ClientCountFilterDMO rc = null;
        
        if (v != null)
            rc = typeCheck(v);
        
        if (value == null)
            value = new ArrayList<ClientCountFilterDMO>(attrInfo.indexSize);
        
        value.set(index, rc);
        
        return(rc);
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

