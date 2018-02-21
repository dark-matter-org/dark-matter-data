package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeObjWithRefsDerivedBREFMV provides storage for a multi-valued ObjWithRefsDerivedBREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2338)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:531)
 */
@SuppressWarnings("serial")
public class DmcTypeObjWithRefsDerivedBREFMV extends DmcTypeObjWithRefsDerivedBREF implements Serializable {
    
    private final static Iterator<ObjWithRefsDerivedBREF> emptyList = (new ArrayList<ObjWithRefsDerivedBREF>()).iterator();
    
    protected ArrayList<ObjWithRefsDerivedBREF> value;
    
    public DmcTypeObjWithRefsDerivedBREFMV(){
    
    }
    
    public DmcTypeObjWithRefsDerivedBREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeObjWithRefsDerivedBREFMV getNew(){
        return(new DmcTypeObjWithRefsDerivedBREFMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2369)
    public DmcAttribute<ObjWithRefsDerivedBREF> cloneIt(){
        synchronized(this){
            DmcTypeObjWithRefsDerivedBREFMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(ObjWithRefsDerivedBREF val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2402)
    public ObjWithRefsDerivedBREF add(Object v) throws DmcValueException {
        synchronized(this){
            ObjWithRefsDerivedBREF rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<ObjWithRefsDerivedBREF>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2415)
    public ObjWithRefsDerivedBREF del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            ObjWithRefsDerivedBREF key = null;
            ObjWithRefsDerivedBREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2449)
    public Iterator<ObjWithRefsDerivedBREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<ObjWithRefsDerivedBREF> clone = new ArrayList<ObjWithRefsDerivedBREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2461)
    public ArrayList<ObjWithRefsDerivedBREF> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<ObjWithRefsDerivedBREF>());
            else 
                return(new ArrayList<ObjWithRefsDerivedBREF>(value));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2473)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2488)
    public ObjWithRefsDerivedBREF getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2499)
    public ObjWithRefsDerivedBREF setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            ObjWithRefsDerivedBREF rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<ObjWithRefsDerivedBREF>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2527)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2551)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                ObjWithRefsDerivedBREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

