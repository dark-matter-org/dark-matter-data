package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestBasicNamedObjectExtendedREFMV provides storage for a multi-valued TestBasicNamedObjectExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1551)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:442)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectExtendedREFMV extends DmcTypeTestBasicNamedObjectExtendedREF implements Serializable {
    
    ArrayList<TestBasicNamedObjectExtendedREF> value;
    
    public DmcTypeTestBasicNamedObjectExtendedREFMV(){
    
    }
    
    public DmcTypeTestBasicNamedObjectExtendedREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeTestBasicNamedObjectExtendedREFMV getNew(){
        return(new DmcTypeTestBasicNamedObjectExtendedREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestBasicNamedObjectExtendedREF> cloneIt(){
        DmcTypeTestBasicNamedObjectExtendedREFMV rc = getNew();
        for(TestBasicNamedObjectExtendedREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public TestBasicNamedObjectExtendedREF add(Object v) throws DmcValueException {
        TestBasicNamedObjectExtendedREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<TestBasicNamedObjectExtendedREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public TestBasicNamedObjectExtendedREF del(Object v){
        TestBasicNamedObjectExtendedREF rc = null;
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
    public Iterator<TestBasicNamedObjectExtendedREF> getMV(){
        ArrayList<TestBasicNamedObjectExtendedREF> clone = new ArrayList<TestBasicNamedObjectExtendedREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<TestBasicNamedObjectExtendedREF> getMVCopy(){
        ArrayList<TestBasicNamedObjectExtendedREF> clone = new ArrayList<TestBasicNamedObjectExtendedREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public TestBasicNamedObjectExtendedREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestBasicNamedObjectExtendedREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

