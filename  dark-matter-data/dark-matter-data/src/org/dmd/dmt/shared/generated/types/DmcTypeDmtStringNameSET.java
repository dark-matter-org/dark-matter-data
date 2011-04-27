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
import org.dmd.dmt.shared.types.DmtStringName;    // base type import
import org.dmd.dmt.shared.types.DmcTypeDmtStringName;    // DmcType import
/**
 * The DmcTypeDmtStringNameSET provides storage for a set of DmtStringName
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2017)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:97)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtStringNameSET extends DmcTypeDmtStringName implements Serializable {
    
    Set<DmtStringName> value;
    
    public DmcTypeDmtStringNameSET(){
        value = null;
    }
    
    public DmcTypeDmtStringNameSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<DmtStringName>();
        else
            value = new TreeSet<DmtStringName>();
    }
    
    @Override
    public DmcTypeDmtStringNameSET getNew(){
        return(new DmcTypeDmtStringNameSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<DmtStringName> cloneIt(){
        DmcTypeDmtStringNameSET rc = getNew();
        for(DmtStringName val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public DmtStringName add(Object v) throws DmcValueException {
        DmtStringName rc = typeCheck(v);
        if (value == null)
            initValue();
    
        // If false is returned, we didn't modify the set, so return null
        if (!value.add(rc))
            rc = null;
    
        return(rc);
    }
    
    @Override
    public DmtStringName del(Object v){
        DmtStringName rc = null;
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
    public Iterator<DmtStringName> getMV(){
        Set<DmtStringName> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<DmtStringName>(value);
        else
            clone = new TreeSet<DmtStringName>(value);
        return(clone.iterator());
    }
    
    public Set<DmtStringName> getMVCopy(){
        Set<DmtStringName> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            clone = new HashSet<DmtStringName>(value);
        else
            clone = new TreeSet<DmtStringName>(value);
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
            DmtStringName val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

