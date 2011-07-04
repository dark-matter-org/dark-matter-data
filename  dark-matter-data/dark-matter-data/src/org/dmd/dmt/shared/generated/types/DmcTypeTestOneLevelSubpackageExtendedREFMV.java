package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestOneLevelSubpackageExtendedREFMV provides storage for a multi-valued TestOneLevelSubpackageExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1956)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:494)
 */
@SuppressWarnings("serial")
public class DmcTypeTestOneLevelSubpackageExtendedREFMV extends DmcTypeTestOneLevelSubpackageExtendedREF implements Serializable {
    
    ArrayList<TestOneLevelSubpackageExtendedREF> value;
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMV(){
    
    }
    
    public DmcTypeTestOneLevelSubpackageExtendedREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
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
    
    @Override
    public TestOneLevelSubpackageExtendedREF add(Object v) throws DmcValueException {
        if (attrInfo.indexSize > 0)
            throw(new IllegalStateException("You must use the setMVnth() method for indexed attribute: " + attrInfo.name));
        
        TestOneLevelSubpackageExtendedREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<TestOneLevelSubpackageExtendedREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public TestOneLevelSubpackageExtendedREF del(Object v){
        if (attrInfo.indexSize > 0)
            throw(new IllegalStateException("You must use the setMVnth(index,null) method to remove values from indexed attribute: " + attrInfo.name));
        
        TestOneLevelSubpackageExtendedREF rc = null;
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
    public Iterator<TestOneLevelSubpackageExtendedREF> getMV(){
        ArrayList<TestOneLevelSubpackageExtendedREF> clone = new ArrayList<TestOneLevelSubpackageExtendedREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<TestOneLevelSubpackageExtendedREF> getMVCopy(){
        ArrayList<TestOneLevelSubpackageExtendedREF> clone = new ArrayList<TestOneLevelSubpackageExtendedREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public TestOneLevelSubpackageExtendedREF getMVnth(int index){
        if ( (attrInfo.indexSize > 0) && ((index < 0) || (index >= attrInfo.indexSize)) )
            throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 < index < " + attrInfo.indexSize));
        
        return(value.get(index));
    }
    
    @Override
    public TestOneLevelSubpackageExtendedREF setMVnth(int index, Object v) throws DmcValueException {
        if (attrInfo.indexSize == 0)
            throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
        
        if ( (index < 0) || (index >= attrInfo.indexSize))
            throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 < index < " + attrInfo.indexSize));
        
        TestOneLevelSubpackageExtendedREF rc = null;
        
        if (v != null)
            rc = typeCheck(v);
        
        if (value == null)
            value = new ArrayList<TestOneLevelSubpackageExtendedREF>(attrInfo.indexSize);
        
        value.set(index, rc);
        
        return(rc);
    }
    
    @Override
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

