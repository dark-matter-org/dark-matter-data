package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestMultiLevelSubpackageREFMV provides storage for a multi-valued TestMultiLevelSubpackageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2313)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:531)
 */
@SuppressWarnings("serial")
public class DmcTypeTestMultiLevelSubpackageREFMV extends DmcTypeTestMultiLevelSubpackageREF implements Serializable {
    
    private final static Iterator<TestMultiLevelSubpackageREF> emptyList = (new ArrayList<TestMultiLevelSubpackageREF>()).iterator();
    
    protected ArrayList<TestMultiLevelSubpackageREF> value;
    
    public DmcTypeTestMultiLevelSubpackageREFMV(){
    
    }
    
    public DmcTypeTestMultiLevelSubpackageREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeTestMultiLevelSubpackageREFMV getNew(){
        return(new DmcTypeTestMultiLevelSubpackageREFMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2344)
    public DmcAttribute<TestMultiLevelSubpackageREF> cloneIt(){
        synchronized(this){
            DmcTypeTestMultiLevelSubpackageREFMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(TestMultiLevelSubpackageREF val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2377)
    public TestMultiLevelSubpackageREF add(Object v) throws DmcValueException {
        synchronized(this){
            TestMultiLevelSubpackageREF rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<TestMultiLevelSubpackageREF>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2390)
    public TestMultiLevelSubpackageREF del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            TestMultiLevelSubpackageREF key = null;
            TestMultiLevelSubpackageREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2424)
    public Iterator<TestMultiLevelSubpackageREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<TestMultiLevelSubpackageREF> clone = new ArrayList<TestMultiLevelSubpackageREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2436)
    public ArrayList<TestMultiLevelSubpackageREF> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<TestMultiLevelSubpackageREF>());
            else 
                return(new ArrayList<TestMultiLevelSubpackageREF>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2448)
    public int getMVSize(){
        synchronized(this){
            if (getAttributeInfo().indexSize == 0){
                if (value == null)
                    return(0);
                return(value.size());
            }
            else
                return(getAttributeInfo().indexSize);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2463)
    public TestMultiLevelSubpackageREF getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2474)
    public TestMultiLevelSubpackageREF setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            TestMultiLevelSubpackageREF rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<TestMultiLevelSubpackageREF>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2502)
    public boolean hasValue(){
        synchronized(this){
            boolean rc = false;
            
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use hasValue()."));
            
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2526)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                TestMultiLevelSubpackageREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

