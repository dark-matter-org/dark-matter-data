package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestDerivedSubpackageREFMV provides storage for a multi-valued TestDerivedSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1956)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:494)
 */
@SuppressWarnings("serial")
public class DmcTypeTestDerivedSubpackageREFMV extends DmcTypeTestDerivedSubpackageREF implements Serializable {
    
    ArrayList<TestDerivedSubpackageREF> value;
    
    public DmcTypeTestDerivedSubpackageREFMV(){
    
    }
    
    public DmcTypeTestDerivedSubpackageREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
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
    
    @Override
    public TestDerivedSubpackageREF add(Object v) throws DmcValueException {
        if (attrInfo.indexSize > 0)
            throw(new IllegalStateException("You must use the setMVnth() method for indexed attribute: " + attrInfo.name));
        
        TestDerivedSubpackageREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<TestDerivedSubpackageREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public TestDerivedSubpackageREF del(Object v){
        if (attrInfo.indexSize > 0)
            throw(new IllegalStateException("You must use the setMVnth(index,null) method to remove values from indexed attribute: " + attrInfo.name));
        
        TestDerivedSubpackageREF rc = null;
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
    public Iterator<TestDerivedSubpackageREF> getMV(){
        ArrayList<TestDerivedSubpackageREF> clone = new ArrayList<TestDerivedSubpackageREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<TestDerivedSubpackageREF> getMVCopy(){
        ArrayList<TestDerivedSubpackageREF> clone = new ArrayList<TestDerivedSubpackageREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public TestDerivedSubpackageREF getMVnth(int index){
        if ( (attrInfo.indexSize > 0) && ((index < 0) || (index >= attrInfo.indexSize)) )
            throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 < index < " + attrInfo.indexSize));
        
        return(value.get(index));
    }
    
    @Override
    public TestDerivedSubpackageREF setMVnth(int index, Object v) throws DmcValueException {
        if (attrInfo.indexSize == 0)
            throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
        
        if ( (index < 0) || (index >= attrInfo.indexSize))
            throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 < index < " + attrInfo.indexSize));
        
        TestDerivedSubpackageREF rc = null;
        
        if (v != null)
            rc = typeCheck(v);
        
        if (value == null)
            value = new ArrayList<TestDerivedSubpackageREF>(attrInfo.indexSize);
        
        value.set(index, rc);
        
        return(rc);
    }
    
    @Override
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

