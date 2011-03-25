package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestOneLevelSubpackageExtendedREFMV provides storage for a multi-valued TestOneLevelSubpackageExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1226)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:535)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageExtendedREFMV extends DmcTypeTestOneLevelSubpackageExtendedREF {
    
    ArrayList<TestOneLevelSubpackageExtendedREF> value;
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMV(){
    
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMV getNew(){
        return(new DmcTypeTestOneLevelSubpackageExtendedREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestOneLevelSubpackageExtendedREF> cloneIt(){
        DmcTypeTestOneLevelSubpackageExtendedREFMV rc = getNew();
        for(TestOneLevelSubpackageExtendedREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public TestOneLevelSubpackageExtendedREF add(Object v) throws DmcValueException {
        TestOneLevelSubpackageExtendedREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<TestOneLevelSubpackageExtendedREF>();
        value.add(rc);
        return(rc);
    }
    
    public TestOneLevelSubpackageExtendedREF del(Object v){
        TestOneLevelSubpackageExtendedREF rc = null;
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
    
    public Iterator<TestOneLevelSubpackageExtendedREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public TestOneLevelSubpackageExtendedREF getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestOneLevelSubpackageExtendedREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

