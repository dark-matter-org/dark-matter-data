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
 * The DmcTypeBaseObjREFSET provides storage for a set of BaseObjREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2034)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:485)
 */
@SuppressWarnings("serial")
public class DmcTypeBaseObjREFSET extends DmcTypeBaseObjREF implements Serializable {
    
    Set<BaseObjREF> value;
    
    public DmcTypeBaseObjREFSET(){
        value = null;
    }
    
    public DmcTypeBaseObjREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<BaseObjREF>();
        else
            value = new TreeSet<BaseObjREF>();
    }
    
    @Override
    public DmcTypeBaseObjREFSET getNew(){
        return(new DmcTypeBaseObjREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<BaseObjREF> cloneIt(){
        DmcTypeBaseObjREFSET rc = getNew();
        for(BaseObjREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public BaseObjREF add(Object v) throws DmcValueException {
        BaseObjREF rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public BaseObjREF del(Object v){
        BaseObjREF rc = null;
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
    public Iterator<BaseObjREF> getMV(){
        Set<BaseObjREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<BaseObjREF>(value);
        else
            clone = new TreeSet<BaseObjREF>(value);
        return(clone.iterator());
    }
    
    public Set<BaseObjREF> getMVCopy(){
        Set<BaseObjREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<BaseObjREF>(value);
        else
            clone = new TreeSet<BaseObjREF>(value);
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
            BaseObjREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

