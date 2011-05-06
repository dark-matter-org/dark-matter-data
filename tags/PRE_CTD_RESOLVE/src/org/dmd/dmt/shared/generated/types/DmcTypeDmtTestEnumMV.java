package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;    // DmcType import
/**
 * The DmcTypeDmtTestEnumMV provides storage for a multi-valued DmtTestEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1841)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:302)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtTestEnumMV extends DmcTypeDmtTestEnum implements Serializable {
    
    ArrayList<DmtTestEnum> value;
    
    public DmcTypeDmtTestEnumMV(){
    
    }
    
    public DmcTypeDmtTestEnumMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeDmtTestEnumMV getNew(){
        return(new DmcTypeDmtTestEnumMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<DmtTestEnum> cloneIt(){
        DmcTypeDmtTestEnumMV rc = getNew();
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
            value = new ArrayList<DmtTestEnum>();
        value.add(rc);
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
        ArrayList<DmtTestEnum> clone = new ArrayList<DmtTestEnum>(value);
        return(clone.iterator());
    }
    
    public ArrayList<DmtTestEnum> getMVCopy(){
        ArrayList<DmtTestEnum> clone = new ArrayList<DmtTestEnum>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public DmtTestEnum getMVnth(int i){
        return(value.get(i));
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

