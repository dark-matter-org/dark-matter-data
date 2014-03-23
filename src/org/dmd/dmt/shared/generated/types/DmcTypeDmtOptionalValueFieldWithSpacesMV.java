package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.DmtOptionalValueFieldWithSpaces;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtOptionalValueFieldWithSpaces;    // DmcType import
/**
 * The DmcTypeDmtOptionalValueFieldWithSpacesMV provides storage for a multi-valued DmtOptionalValueFieldWithSpaces
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2329)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:126)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtOptionalValueFieldWithSpacesMV extends DmcTypeDmtOptionalValueFieldWithSpaces implements Serializable {
    
    private final static Iterator<DmtOptionalValueFieldWithSpaces> emptyList = (new ArrayList<DmtOptionalValueFieldWithSpaces>()).iterator();
    
    protected ArrayList<DmtOptionalValueFieldWithSpaces> value;
    
    public DmcTypeDmtOptionalValueFieldWithSpacesMV(){
    
    }
    
    public DmcTypeDmtOptionalValueFieldWithSpacesMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeDmtOptionalValueFieldWithSpacesMV getNew(){
        return(new DmcTypeDmtOptionalValueFieldWithSpacesMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2360)
    public DmcAttribute<DmtOptionalValueFieldWithSpaces> cloneIt(){
        synchronized(this){
            DmcTypeDmtOptionalValueFieldWithSpacesMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(DmtOptionalValueFieldWithSpaces val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2393)
    public DmtOptionalValueFieldWithSpaces add(Object v) throws DmcValueException {
        synchronized(this){
            DmtOptionalValueFieldWithSpaces rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<DmtOptionalValueFieldWithSpaces>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2406)
    public DmtOptionalValueFieldWithSpaces del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            DmtOptionalValueFieldWithSpaces key = null;
            DmtOptionalValueFieldWithSpaces rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2440)
    public Iterator<DmtOptionalValueFieldWithSpaces> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<DmtOptionalValueFieldWithSpaces> clone = new ArrayList<DmtOptionalValueFieldWithSpaces>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2452)
    public ArrayList<DmtOptionalValueFieldWithSpaces> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<DmtOptionalValueFieldWithSpaces>());
            else 
                return(new ArrayList<DmtOptionalValueFieldWithSpaces>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2464)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2479)
    public DmtOptionalValueFieldWithSpaces getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2490)
    public DmtOptionalValueFieldWithSpaces setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            DmtOptionalValueFieldWithSpaces rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<DmtOptionalValueFieldWithSpaces>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2518)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2542)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                DmtOptionalValueFieldWithSpaces val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

