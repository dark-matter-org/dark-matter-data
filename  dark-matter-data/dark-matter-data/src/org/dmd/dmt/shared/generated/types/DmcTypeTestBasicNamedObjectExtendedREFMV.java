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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2098)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:494)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectExtendedREFMV extends DmcTypeTestBasicNamedObjectExtendedREF implements Serializable {
    
    protected ArrayList<TestBasicNamedObjectExtendedREF> value;
    
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2128)
    public DmcAttribute<TestBasicNamedObjectExtendedREF> cloneIt(){
        synchronized(this){
            DmcTypeTestBasicNamedObjectExtendedREFMV rc = getNew();
            if (attrInfo.indexSize == 0){
                for(TestBasicNamedObjectExtendedREF val: value)
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2157)
    public TestBasicNamedObjectExtendedREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestBasicNamedObjectExtendedREF rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<TestBasicNamedObjectExtendedREF>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2170)
    public TestBasicNamedObjectExtendedREF del(Object v){
        synchronized(this){
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2189)
    public Iterator<TestBasicNamedObjectExtendedREF> getMV(){
        synchronized(this){
            ArrayList<TestBasicNamedObjectExtendedREF> clone = new ArrayList<TestBasicNamedObjectExtendedREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2198)
    public ArrayList<TestBasicNamedObjectExtendedREF> getMVCopy(){
        synchronized(this){
            ArrayList<TestBasicNamedObjectExtendedREF> clone = new ArrayList<TestBasicNamedObjectExtendedREF>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2208)
    public int getMVSize(){
        synchronized(this){
            if (attrInfo.indexSize == 0){
                if (value == null)
                    return(0);
                return(value.size());
            }
            else
                return(attrInfo.indexSize);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2223)
    public TestBasicNamedObjectExtendedREF getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2234)
    public TestBasicNamedObjectExtendedREF setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (attrInfo.indexSize == 0)
                throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= attrInfo.indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
            
            TestBasicNamedObjectExtendedREF rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<TestBasicNamedObjectExtendedREF>(attrInfo.indexSize);
                for(int i=0;i<attrInfo.indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2262)
    public boolean hasValue(){
        synchronized(this){
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2286)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                TestBasicNamedObjectExtendedREF val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

