package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeUUIDNamedObjectREFMV provides storage for a multi-valued UUIDNamedObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1226)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:535)
 */
@SuppressWarnings("serial")
public class DmcTypeUUIDNamedObjectREFMV extends DmcTypeUUIDNamedObjectREF {
    
    ArrayList<UUIDNamedObjectREF> value;
    
    public DmcTypeUUIDNamedObjectREFMV(){
    
    }
    
    public DmcTypeUUIDNamedObjectREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUUIDNamedObjectREFMV getNew(){
        return(new DmcTypeUUIDNamedObjectREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<UUIDNamedObjectREF> cloneIt(){
        DmcTypeUUIDNamedObjectREFMV rc = getNew();
        for(UUIDNamedObjectREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public UUIDNamedObjectREF add(Object v) throws DmcValueException {
        UUIDNamedObjectREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<UUIDNamedObjectREF>();
        value.add(rc);
        return(rc);
    }
    
    public UUIDNamedObjectREF del(Object v){
        UUIDNamedObjectREF rc = null;
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
    
    public Iterator<UUIDNamedObjectREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public UUIDNamedObjectREF getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            UUIDNamedObjectREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}
