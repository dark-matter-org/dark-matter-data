package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestOneLevelSubpackageREFMV provides storage for a multi-valued TestOneLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1907)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:493)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageREFMV extends DmcTypeTestOneLevelSubpackageREF implements Serializable {
    
    ArrayList<TestOneLevelSubpackageREF> value;
    
    public DmcTypeTestOneLevelSubpackageREFMV(){
    
    }
    
    public DmcTypeTestOneLevelSubpackageREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeTestOneLevelSubpackageREFMV getNew(){
        return(new DmcTypeTestOneLevelSubpackageREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestOneLevelSubpackageREF> cloneIt(){
        DmcTypeTestOneLevelSubpackageREFMV rc = getNew();
        for(TestOneLevelSubpackageREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public TestOneLevelSubpackageREF add(Object v) throws DmcValueException {
        TestOneLevelSubpackageREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<TestOneLevelSubpackageREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public TestOneLevelSubpackageREF del(Object v){
        TestOneLevelSubpackageREF rc = null;
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
    public Iterator<TestOneLevelSubpackageREF> getMV(){
        ArrayList<TestOneLevelSubpackageREF> clone = new ArrayList<TestOneLevelSubpackageREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<TestOneLevelSubpackageREF> getMVCopy(){
        ArrayList<TestOneLevelSubpackageREF> clone = new ArrayList<TestOneLevelSubpackageREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public TestOneLevelSubpackageREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestOneLevelSubpackageREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

