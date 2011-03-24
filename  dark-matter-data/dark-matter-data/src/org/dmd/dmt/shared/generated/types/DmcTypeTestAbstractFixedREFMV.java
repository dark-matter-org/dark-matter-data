package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.TestAbstractFixedDMO;    // primitive import
/**
 * The DmcTypeTestAbstractFixedREFMV provides storage for a multi-valued TestAbstractFixed
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1192)
 */
@SuppressWarnings("serial")
public class DmcTypeTestAbstractFixedREFMV extends DmcTypeTestAbstractFixedREF {
    
    ArrayList<TestAbstractFixedDMO> value;
    
    public DmcTypeTestAbstractFixedREFMV(){
    
    }
    
    public DmcTypeTestAbstractFixedREFMV(DmcAttributeInfo ai){
        super(ai);
        value = new ArrayList<TestAbstractFixedDMO>();
    }
    
    public DmcTypeTestAbstractFixedREFMV getNew(){
        return(new DmcTypeTestAbstractFixedREFMV(attrInfo));
    }
    
    public TestAbstractFixedDMO add(Object v) throws DmcValueException {
        TestAbstractFixedDMO rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public TestAbstractFixedDMO del(Object v){
        TestAbstractFixedDMO rc = null;
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
    
    public Iterator<TestAbstractFixedDMO> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public TestAbstractFixedDMO getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestAbstractFixedDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

