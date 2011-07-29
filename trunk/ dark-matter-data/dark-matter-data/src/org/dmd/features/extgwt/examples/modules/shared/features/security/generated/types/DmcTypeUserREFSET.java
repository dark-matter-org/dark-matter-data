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
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2332)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:495)
 */
@SuppressWarnings("serial")
public class DmcTypeUserREFSET extends DmcTypeUserREF implements Serializable {
    
    protected Set<UserREF> value;
    
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2369)
    public DmcAttribute<UserREF> cloneIt(){
        synchronized(this){
            DmcTypeUserREFSET rc = getNew();
            for(UserREF val: value)
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
    public UserREF add(Object v) throws DmcValueException {
        synchronized(this){
            UserREF rc = typeCheck(v);
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
    public UserREF del(Object v){
        synchronized(this){
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2424)
    public Iterator<UserREF> getMV(){
        synchronized(this){
            Set<UserREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<UserREF>(value);
            else
                clone = new TreeSet<UserREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2437)
    public Set<UserREF> getMVCopy(){
        synchronized(this){
            Set<UserREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<UserREF>(value);
            else
                clone = new TreeSet<UserREF>(value);
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
                UserREF val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

