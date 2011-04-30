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
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;    // DmcType import
/**
 * The DmcTypeDmtTestEnumSET provides storage for a set of DmtTestEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2032)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:303)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtTestEnumSET extends DmcTypeDmtTestEnum implements Serializable {
    
    Set<DmtTestEnum> value;
    
    public DmcTypeDmtTestEnumSET(){
        value = null;
    }
    
    public DmcTypeDmtTestEnumSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<DmtTestEnum>();
        else
            value = new TreeSet<DmtTestEnum>();
    }
    
    @Override
    public DmcTypeDmtTestEnumSET getNew(){
        return(new DmcTypeDmtTestEnumSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<DmtTestEnum> cloneIt(){
        DmcTypeDmtTestEnumSET rc = getNew();
        for(DmtTestEnum val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public DmtTestEnum add(Object v) throws DmcValueException {
        DmtTestEnum rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public DmtTestEnum del(Object v){
        DmtTestEnum rc = null;
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
    public Iterator<DmtTestEnum> getMV(){
        Set<DmtTestEnum> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<DmtTestEnum>(value);
        else
            clone = new TreeSet<DmtTestEnum>(value);
        return(clone.iterator());
    }
    
    public Set<DmtTestEnum> getMVCopy(){
        Set<DmtTestEnum> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<DmtTestEnum>(value);
        else
            clone = new TreeSet<DmtTestEnum>(value);
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
            DmtTestEnum val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

