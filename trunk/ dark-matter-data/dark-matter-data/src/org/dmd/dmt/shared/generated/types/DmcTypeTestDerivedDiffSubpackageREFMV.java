package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestDerivedDiffSubpackageREFMV provides storage for a multi-valued TestDerivedDiffSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1551)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:442)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedDiffSubpackageREFMV extends DmcTypeTestDerivedDiffSubpackageREF implements Serializable {
    
    ArrayList<TestDerivedDiffSubpackageREF> value;
    
    public DmcTypeTestDerivedDiffSubpackageREFMV(){
    
    }
    
    public DmcTypeTestDerivedDiffSubpackageREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
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
    
    @Override
    public TestDerivedDiffSubpackageREF add(Object v) throws DmcValueException {
        TestDerivedDiffSubpackageREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<TestDerivedDiffSubpackageREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public TestDerivedDiffSubpackageREF del(Object v){
        TestDerivedDiffSubpackageREF rc = null;
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
    public Iterator<TestDerivedDiffSubpackageREF> getMV(){
        ArrayList<TestDerivedDiffSubpackageREF> clone = new ArrayList<TestDerivedDiffSubpackageREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<TestDerivedDiffSubpackageREF> getMVCopy(){
        ArrayList<TestDerivedDiffSubpackageREF> clone = new ArrayList<TestDerivedDiffSubpackageREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public TestDerivedDiffSubpackageREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
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

