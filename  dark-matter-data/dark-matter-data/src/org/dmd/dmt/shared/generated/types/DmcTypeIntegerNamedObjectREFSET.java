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
/**
 * The DmcTypeIntegerNamedObjectREFSET provides storage for a set of IntegerNamedObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2140)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:495)
 */
@SuppressWarnings("serial")
public class DmcTypeIntegerNamedObjectREFSET extends DmcTypeIntegerNamedObjectREF implements Serializable {
    
    Set<IntegerNamedObjectREF> value;
    
    public DmcTypeIntegerNamedObjectREFSET(){
        value = null;
    }
    
    public DmcTypeIntegerNamedObjectREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<IntegerNamedObjectREF>();
        else
            value = new TreeSet<IntegerNamedObjectREF>();
    }
    
    @Override
    public DmcTypeIntegerNamedObjectREFSET getNew(){
        return(new DmcTypeIntegerNamedObjectREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<IntegerNamedObjectREF> cloneIt(){
        DmcTypeIntegerNamedObjectREFSET rc = getNew();
        for(IntegerNamedObjectREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public IntegerNamedObjectREF add(Object v) throws DmcValueException {
        IntegerNamedObjectREF rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public IntegerNamedObjectREF del(Object v){
        IntegerNamedObjectREF rc = null;
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
    public Iterator<IntegerNamedObjectREF> getMV(){
        Set<IntegerNamedObjectREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<IntegerNamedObjectREF>(value);
        else
            clone = new TreeSet<IntegerNamedObjectREF>(value);
        return(clone.iterator());
    }
    
    public Set<IntegerNamedObjectREF> getMVCopy(){
        Set<IntegerNamedObjectREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<IntegerNamedObjectREF>(value);
        else
            clone = new TreeSet<IntegerNamedObjectREF>(value);
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
            IntegerNamedObjectREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

