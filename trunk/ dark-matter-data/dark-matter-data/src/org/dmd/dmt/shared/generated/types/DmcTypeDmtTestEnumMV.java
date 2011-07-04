package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;    // DmcType import
/**
 * The DmcTypeDmtTestEnumMV provides storage for a multi-valued DmtTestEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1956)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:325)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtTestEnumMV extends DmcTypeDmtTestEnum implements Serializable {
    
    ArrayList<DmtTestEnum> value;
    
    public DmcTypeDmtTestEnumMV(){
    
    }
    
    public DmcTypeDmtTestEnumMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeDmtTestEnumMV getNew(){
        return(new DmcTypeDmtTestEnumMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<DmtTestEnum> cloneIt(){
        DmcTypeDmtTestEnumMV rc = getNew();
        for(DmtTestEnum val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public DmtTestEnum add(Object v) throws DmcValueException {
        if (attrInfo.indexSize > 0)
            throw(new IllegalStateException("You must use the setMVnth() method for indexed attribute: " + attrInfo.name));
        
        DmtTestEnum rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<DmtTestEnum>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public DmtTestEnum del(Object v){
        if (attrInfo.indexSize > 0)
            throw(new IllegalStateException("You must use the setMVnth(index,null) method to remove values from indexed attribute: " + attrInfo.name));
        
        DmtTestEnum rc = null;
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
    public Iterator<DmtTestEnum> getMV(){
        ArrayList<DmtTestEnum> clone = new ArrayList<DmtTestEnum>(value);
        return(clone.iterator());
    }
    
    public ArrayList<DmtTestEnum> getMVCopy(){
        ArrayList<DmtTestEnum> clone = new ArrayList<DmtTestEnum>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public DmtTestEnum getMVnth(int index){
        if ( (attrInfo.indexSize > 0) && ((index < 0) || (index >= attrInfo.indexSize)) )
            throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 < index < " + attrInfo.indexSize));
        
        return(value.get(index));
    }
    
    @Override
    public DmtTestEnum setMVnth(int index, Object v) throws DmcValueException {
        if (attrInfo.indexSize == 0)
            throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
        
        if ( (index < 0) || (index >= attrInfo.indexSize))
            throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 < index < " + attrInfo.indexSize));
        
        DmtTestEnum rc = null;
        
        if (v != null)
            rc = typeCheck(v);
        
        if (value == null)
            value = new ArrayList<DmtTestEnum>(attrInfo.indexSize);
        
        value.set(index, rc);
        
        return(rc);
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            DmtTestEnum val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

