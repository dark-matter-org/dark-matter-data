package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.types.DmtStringName;    // base type import
import org.dmd.dmt.shared.types.DmcTypeDmtStringName;    // DmcType import
/**
 * The DmcTypeDmtStringNameMV provides storage for a multi-valued DmtStringName
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1773)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:96)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtStringNameMV extends DmcTypeDmtStringName implements Serializable {
    
    ArrayList<DmtStringName> value;
    
    public DmcTypeDmtStringNameMV(){
    
    }
    
    public DmcTypeDmtStringNameMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeDmtStringNameMV getNew(){
        return(new DmcTypeDmtStringNameMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<DmtStringName> cloneIt(){
        DmcTypeDmtStringNameMV rc = getNew();
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
            value = new ArrayList<DmtStringName>();
        value.add(rc);
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
        ArrayList<DmtStringName> clone = new ArrayList<DmtStringName>(value);
        return(clone.iterator());
    }
    
    public ArrayList<DmtStringName> getMVCopy(){
        ArrayList<DmtStringName> clone = new ArrayList<DmtStringName>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public DmtStringName getMVnth(int i){
        return(value.get(i));
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

