package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.MenuElementTypeAndComment;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeMenuElementTypeAndComment;    // DmcType import
/**
 * The DmcTypeMenuElementTypeAndCommentMV provides storage for a multi-valued MenuElementTypeAndComment
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2515)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:126)
 */
@SuppressWarnings("serial")
public class DmcTypeMenuElementTypeAndCommentMV extends DmcTypeMenuElementTypeAndComment implements Serializable {
    
    private final static Iterator<MenuElementTypeAndComment> emptyList = (new ArrayList<MenuElementTypeAndComment>()).iterator();
    
    protected ArrayList<MenuElementTypeAndComment> value;
    
    public DmcTypeMenuElementTypeAndCommentMV(){
    
    }
    
    public DmcTypeMenuElementTypeAndCommentMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeMenuElementTypeAndCommentMV getNew(){
        return(new DmcTypeMenuElementTypeAndCommentMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2546)
    public DmcAttribute<MenuElementTypeAndComment> cloneIt(){
        synchronized(this){
            DmcTypeMenuElementTypeAndCommentMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(MenuElementTypeAndComment val: value)
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
    public MenuElementTypeAndComment add(Object v) throws DmcValueException {
        synchronized(this){
            MenuElementTypeAndComment rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<MenuElementTypeAndComment>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2592)
    public MenuElementTypeAndComment del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            MenuElementTypeAndComment key = null;
            MenuElementTypeAndComment rc = null;
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
    public Iterator<MenuElementTypeAndComment> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<MenuElementTypeAndComment> clone = new ArrayList<MenuElementTypeAndComment>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2638)
    public ArrayList<MenuElementTypeAndComment> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<MenuElementTypeAndComment>());
            else 
                return(new ArrayList<MenuElementTypeAndComment>(value));
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
    public MenuElementTypeAndComment getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2676)
    public MenuElementTypeAndComment setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            MenuElementTypeAndComment rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<MenuElementTypeAndComment>(getAttributeInfo().indexSize);
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
                MenuElementTypeAndComment val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

