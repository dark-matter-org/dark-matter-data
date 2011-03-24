package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestMultiLevelSubpackageREFMV provides storage for a multi-valued TestMultiLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1192)
 */
@SuppressWarnings("serial")
public class DmcTypeTestMultiLevelSubpackageREFMV extends DmcTypeTestMultiLevelSubpackageREF {
    
    ArrayList<TestMultiLevelSubpackageREF> value;
    
    public DmcTypeTestMultiLevelSubpackageREFMV(){
    
    }
    
    public DmcTypeTestMultiLevelSubpackageREFMV(DmcAttributeInfo ai){
        super(ai);
        value = new ArrayList<TestMultiLevelSubpackageREF>();
    }
    
    public DmcTypeTestMultiLevelSubpackageREFMV getNew(){
        return(new DmcTypeTestMultiLevelSubpackageREFMV(attrInfo));
    }
    
    public TestMultiLevelSubpackageREF add(Object v) throws DmcValueException {
        TestMultiLevelSubpackageREF rc = typeCheck(v);
        value.add(rc);
        return(rc);
    }
    
    public TestMultiLevelSubpackageREF del(Object v){
        TestMultiLevelSubpackageREF rc = null;
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
    
    public Iterator<TestMultiLevelSubpackageREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public TestMultiLevelSubpackageREF getMVnth(int i){
        return(value.get(i));
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestMultiLevelSubpackageREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

