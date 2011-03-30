package org.dmd.dmt.shared.generated.types;

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
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1400)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:555)
 */
@SuppressWarnings("serial")
public class DmcTypeIntegerNamedObjectREFSET extends DmcTypeIntegerNamedObjectREF {
    
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
    
    public IntegerNamedObjectREF add(Object v) throws DmcValueException {
        IntegerNamedObjectREF rc = typeCheck(v);
        if (value == null)
            initValue();
        value.add(rc);
        return(rc);
    }
    
    public IntegerNamedObjectREF del(Object v){
        IntegerNamedObjectREF rc = null;
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
    
    public Iterator<IntegerNamedObjectREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
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

