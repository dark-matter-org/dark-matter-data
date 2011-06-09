package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestBasicNamedObjectFixedREFMV provides storage for a multi-valued TestBasicNamedObjectFixedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1842)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:489)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectFixedREFMV extends DmcTypeTestBasicNamedObjectFixedREF implements Serializable {
    
    ArrayList<TestBasicNamedObjectFixedREF> value;
    
    public DmcTypeTestBasicNamedObjectFixedREFMV(){
    
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeTestBasicNamedObjectFixedREFMV getNew(){
        return(new DmcTypeTestBasicNamedObjectFixedREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestBasicNamedObjectFixedREF> cloneIt(){
        DmcTypeTestBasicNamedObjectFixedREFMV rc = getNew();
        for(TestBasicNamedObjectFixedREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public TestBasicNamedObjectFixedREF add(Object v) throws DmcValueException {
        TestBasicNamedObjectFixedREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<TestBasicNamedObjectFixedREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public TestBasicNamedObjectFixedREF del(Object v){
        TestBasicNamedObjectFixedREF rc = null;
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
    public Iterator<TestBasicNamedObjectFixedREF> getMV(){
        ArrayList<TestBasicNamedObjectFixedREF> clone = new ArrayList<TestBasicNamedObjectFixedREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<TestBasicNamedObjectFixedREF> getMVCopy(){
        ArrayList<TestBasicNamedObjectFixedREF> clone = new ArrayList<TestBasicNamedObjectFixedREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public TestBasicNamedObjectFixedREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestBasicNamedObjectFixedREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

