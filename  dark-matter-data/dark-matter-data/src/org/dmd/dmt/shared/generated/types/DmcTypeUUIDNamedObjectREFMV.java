package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeUUIDNamedObjectREFMV provides storage for a multi-valued UUIDNamedObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1721)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:451)
 */
@SuppressWarnings("serial")
public class DmcTypeUUIDNamedObjectREFMV extends DmcTypeUUIDNamedObjectREF implements Serializable {
    
    ArrayList<UUIDNamedObjectREF> value;
    
    public DmcTypeUUIDNamedObjectREFMV(){
    
    }
    
    public DmcTypeUUIDNamedObjectREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
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
    
    @Override
    public UUIDNamedObjectREF add(Object v) throws DmcValueException {
        UUIDNamedObjectREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<UUIDNamedObjectREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public UUIDNamedObjectREF del(Object v){
        UUIDNamedObjectREF rc = null;
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
    public Iterator<UUIDNamedObjectREF> getMV(){
        ArrayList<UUIDNamedObjectREF> clone = new ArrayList<UUIDNamedObjectREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<UUIDNamedObjectREF> getMVCopy(){
        ArrayList<UUIDNamedObjectREF> clone = new ArrayList<UUIDNamedObjectREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public UUIDNamedObjectREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
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

