package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestDerivedSubpackageREFMV provides storage for a multi-valued TestDerivedSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1490)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:554)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedSubpackageREFMV extends DmcTypeTestDerivedSubpackageREF {
    
    ArrayList<TestDerivedSubpackageREF> value;
    
    public DmcTypeTestDerivedSubpackageREFMV(){
    
    }
    
    public DmcTypeTestDerivedSubpackageREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestDerivedSubpackageREFMV getNew(){
        return(new DmcTypeTestDerivedSubpackageREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestDerivedSubpackageREF> cloneIt(){
        DmcTypeTestDerivedSubpackageREFMV rc = getNew();
        for(TestDerivedSubpackageREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public TestDerivedSubpackageREF add(Object v) throws DmcValueException {
        TestDerivedSubpackageREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<TestDerivedSubpackageREF>();
        value.add(rc);
        return(rc);
    }
    
    public TestDerivedSubpackageREF del(Object v){
        TestDerivedSubpackageREF rc = null;
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
    
    public Iterator<TestDerivedSubpackageREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public TestDerivedSubpackageREF getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestDerivedSubpackageREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

