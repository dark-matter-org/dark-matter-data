package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.DmtOptionalValueFieldWithColons;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtOptionalValueFieldWithColons;    // DmcType import
/**
 * The DmcTypeDmtOptionalValueFieldWithColonsMV provides storage for a multi-valued DmtOptionalValueFieldWithColons
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2515)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:126)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtOptionalValueFieldWithColonsMV extends DmcTypeDmtOptionalValueFieldWithColons implements Serializable {
    
    private final static Iterator<DmtOptionalValueFieldWithColons> emptyList = (new ArrayList<DmtOptionalValueFieldWithColons>()).iterator();
    
    protected ArrayList<DmtOptionalValueFieldWithColons> value;
    
    public DmcTypeDmtOptionalValueFieldWithColonsMV(){
    
    }
    
    public DmcTypeDmtOptionalValueFieldWithColonsMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeDmtOptionalValueFieldWithColonsMV getNew(){
        return(new DmcTypeDmtOptionalValueFieldWithColonsMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2546)
    public DmcAttribute<DmtOptionalValueFieldWithColons> cloneIt(){
        synchronized(this){
            DmcTypeDmtOptionalValueFieldWithColonsMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(DmtOptionalValueFieldWithColons val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2579)
    public DmtOptionalValueFieldWithColons add(Object v) throws DmcValueException {
        synchronized(this){
            DmtOptionalValueFieldWithColons rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<DmtOptionalValueFieldWithColons>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2592)
    public DmtOptionalValueFieldWithColons del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            DmtOptionalValueFieldWithColons key = null;
            DmtOptionalValueFieldWithColons rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2626)
    public Iterator<DmtOptionalValueFieldWithColons> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<DmtOptionalValueFieldWithColons> clone = new ArrayList<DmtOptionalValueFieldWithColons>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2638)
    public ArrayList<DmtOptionalValueFieldWithColons> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<DmtOptionalValueFieldWithColons>());
            else 
                return(new ArrayList<DmtOptionalValueFieldWithColons>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2650)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2665)
    public DmtOptionalValueFieldWithColons getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2676)
    public DmtOptionalValueFieldWithColons setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            DmtOptionalValueFieldWithColons rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<DmtOptionalValueFieldWithColons>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2704)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2728)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                DmtOptionalValueFieldWithColons val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

