package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO;    // primitive import
/**
 * The DmcTypeTestAbstractExtendedREFMV provides storage for a multi-valued TestAbstractExtended
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1192)
 */
@SuppressWarnings("serial")
public class DmcTypeTestAbstractExtendedREFMV extends DmcTypeTestAbstractExtendedREF {
    
    ArrayList<TestAbstractExtendedDMO> value;
    
    public DmcTypeTestAbstractExtendedREFMV(){
    
    }
    
    public DmcTypeTestAbstractExtendedREFMV(DmcAttributeInfo ai){
        super(ai);
        value = new ArrayList<TestAbstractExtendedDMO>();
    }
    
    public DmcTypeTestAbstractExtendedREFMV getNew(){
        return(new DmcTypeTestAbstractExtendedREFMV(attrInfo));
    }
    
    public TestAbstractExtendedDMO add(Object v) throws DmcValueException {
        TestAbstractExtendedDMO rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public TestAbstractExtendedDMO del(Object v){
        TestAbstractExtendedDMO rc = null;
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
    
    public Iterator<TestAbstractExtendedDMO> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public TestAbstractExtendedDMO getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestAbstractExtendedDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

