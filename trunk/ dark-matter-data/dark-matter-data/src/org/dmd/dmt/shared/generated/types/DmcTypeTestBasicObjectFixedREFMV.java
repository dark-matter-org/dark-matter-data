package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;    // DmcType import
/**
 * The DmcTypeTestBasicObjectFixedREFMV provides storage for a multi-valued TestBasicObjectFixed
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2009)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:222)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicObjectFixedREFMV extends DmcTypeTestBasicObjectFixedREF implements Serializable {
    
    ArrayList<TestBasicObjectFixedDMO> value;
    
    public DmcTypeTestBasicObjectFixedREFMV(){
    
    }
    
    public DmcTypeTestBasicObjectFixedREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeTestBasicObjectFixedREFMV getNew(){
        return(new DmcTypeTestBasicObjectFixedREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<TestBasicObjectFixedDMO> cloneIt(){
        DmcTypeTestBasicObjectFixedREFMV rc = getNew();
        for(TestBasicObjectFixedDMO val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public TestBasicObjectFixedDMO add(Object v) throws DmcValueException {
        TestBasicObjectFixedDMO rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<TestBasicObjectFixedDMO>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public TestBasicObjectFixedDMO del(Object v){
        TestBasicObjectFixedDMO rc = null;
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
    public Iterator<TestBasicObjectFixedDMO> getMV(){
        ArrayList<TestBasicObjectFixedDMO> clone = new ArrayList<TestBasicObjectFixedDMO>(value);
        return(clone.iterator());
    }
    
    public ArrayList<TestBasicObjectFixedDMO> getMVCopy(){
        ArrayList<TestBasicObjectFixedDMO> clone = new ArrayList<TestBasicObjectFixedDMO>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public TestBasicObjectFixedDMO getMVnth(int index){
        return(value.get(index));
    }
    
    @Override
    public TestBasicObjectFixedDMO setMVnth(int index, Object v) throws DmcValueException {
        if (attrInfo.indexSize == 0)
            throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
        
        if ( (index < 0) || (index >= attrInfo.indexSize))
            throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
        
        TestBasicObjectFixedDMO rc = null;
        
        if (v != null)
            rc = typeCheck(v);
        
        if (value == null){
            value = new ArrayList<TestBasicObjectFixedDMO>(attrInfo.indexSize);
            for(int i=0;i<attrInfo.indexSize;i++)
                value.add(null);
        }
        
        value.set(index, rc);
        
        return(rc);
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            TestBasicObjectFixedDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

