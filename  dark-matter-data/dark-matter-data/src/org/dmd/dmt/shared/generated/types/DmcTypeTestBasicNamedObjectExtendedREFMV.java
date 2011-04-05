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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1464)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:435)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectExtendedREFMV extends DmcTypeTestBasicNamedObjectExtendedREF implements Serializable {
    
    ArrayList<TestBasicNamedObjectExtendedREF> value;
    
    public DmcTypeTestBasicNamedObjectExtendedREFMV(){
    
    }
    
    public DmcTypeTestBasicNamedObjectExtendedREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
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
    
    public TestBasicNamedObjectExtendedREF add(Object v) throws DmcValueException {
        TestBasicNamedObjectExtendedREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<TestBasicNamedObjectExtendedREF>();
        value.add(rc);
        return(rc);
    }
    
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
    
    public Iterator<TestBasicNamedObjectExtendedREF> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    public TestBasicNamedObjectExtendedREF getMVnth(int i){
        return(value.get(i));
    }
    
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

