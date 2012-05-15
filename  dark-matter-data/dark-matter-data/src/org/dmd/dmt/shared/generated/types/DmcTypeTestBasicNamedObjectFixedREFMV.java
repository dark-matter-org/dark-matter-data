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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2176)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:531)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectFixedREFMV extends DmcTypeTestBasicNamedObjectFixedREF implements Serializable {
    
    protected ArrayList<TestBasicNamedObjectFixedREF> value;
    
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2206)
    public DmcAttribute<TestBasicNamedObjectFixedREF> cloneIt(){
        synchronized(this){
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2235)
    public TestBasicNamedObjectFixedREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestBasicNamedObjectFixedREF rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<TestBasicNamedObjectFixedREF>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2248)
    public TestBasicNamedObjectFixedREF del(Object v){
        synchronized(this){
            TestBasicNamedObjectFixedREF key = null;
            TestBasicNamedObjectFixedREF rc = null;
            try {
                key = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            int indexof = value.indexOf(key);
            if (indexof != -1){
                rc = value.get(indexof);
                value.remove(rc);
            }

            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2279)
    public Iterator<TestBasicNamedObjectFixedREF> getMV(){
        synchronized(this){
            ArrayList<TestBasicNamedObjectFixedREF> clone = new ArrayList<TestBasicNamedObjectFixedREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2288)
    public ArrayList<TestBasicNamedObjectFixedREF> getMVCopy(){
        synchronized(this){
            ArrayList<TestBasicNamedObjectFixedREF> clone = new ArrayList<TestBasicNamedObjectFixedREF>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2298)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2313)
    public TestBasicNamedObjectFixedREF getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2324)
    public TestBasicNamedObjectFixedREF setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2352)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2376)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                TestBasicNamedObjectFixedREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

