package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestDerivedDiffSubpackageREFMV provides storage for a multi-valued TestDerivedDiffSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1490)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:554)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedDiffSubpackageREFMV extends DmcTypeTestDerivedDiffSubpackageREF {
    
    ArrayList<TestDerivedDiffSubpackageREF> value;
    
    public DmcTypeTestDerivedDiffSubpackageREFMV(){
    
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFMV getNew(){
        return(new DmcTypeTestDerivedDiffSubpackageREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestDerivedDiffSubpackageREF> cloneIt(){
        DmcTypeTestDerivedDiffSubpackageREFMV rc = getNew();
        for(TestDerivedDiffSubpackageREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public TestDerivedDiffSubpackageREF add(Object v) throws DmcValueException {
        TestDerivedDiffSubpackageREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<TestDerivedDiffSubpackageREF>();
        value.add(rc);
        return(rc);
    }
    
    public TestDerivedDiffSubpackageREF del(Object v){
        TestDerivedDiffSubpackageREF rc = null;
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
    
    public Iterator<TestDerivedDiffSubpackageREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public TestDerivedDiffSubpackageREF getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestDerivedDiffSubpackageREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

