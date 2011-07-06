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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2009)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:494)
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
        if (attrInfo.indexSize == 0){
            for(TestBasicNamedObjectFixedREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
        }
        else{
            for(int index=0; index<value.size(); index++)
                try {
                    rc.setMVnth(index, value.get(index));
                } catch (DmcValueException e) {
                    throw(new IllegalStateException("typeCheck() should never fail here!",e));
                }
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
    public TestBasicNamedObjectFixedREF getMVnth(int index){
        return(value.get(index));
    }
    
    @Override
    public TestBasicNamedObjectFixedREF setMVnth(int index, Object v) throws DmcValueException {
        if (attrInfo.indexSize == 0)
            throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
        
        if ( (index < 0) || (index >= attrInfo.indexSize))
            throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
        
        TestBasicNamedObjectFixedREF rc = null;
        
        if (v != null)
            rc = typeCheck(v);
        
        if (value == null){
            value = new ArrayList<TestBasicNamedObjectFixedREF>(attrInfo.indexSize);
            for(int i=0;i<attrInfo.indexSize;i++)
                value.add(null);
        }
        
        value.set(index, rc);
        
        return(rc);
    }
    
    @Override
    public boolean hasValue(){
        boolean rc = false;
        
        if (attrInfo.indexSize == 0)
            throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use hasValue()."));
        
        if (value == null)
            return(rc);
        
        for(int i=0; i<value.size(); i++){
            if (value.get(i) != null){
                rc = true;
                break;
            }
        }
        
        return(rc);
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

