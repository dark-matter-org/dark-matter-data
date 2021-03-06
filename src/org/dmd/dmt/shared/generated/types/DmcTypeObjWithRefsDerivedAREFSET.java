package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * The DmcTypeObjWithRefsDerivedAREFSET provides storage for a set of ObjWithRefsDerivedAREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2811)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:536)
 */
@SuppressWarnings("serial")
public class DmcTypeObjWithRefsDerivedAREFSET extends DmcTypeObjWithRefsDerivedAREF implements Serializable {
    
     private final static Iterator<ObjWithRefsDerivedAREF> emptyList =  (new HashSet<ObjWithRefsDerivedAREF>()).iterator();
    
    
    protected Set<ObjWithRefsDerivedAREF> value;
    
    public DmcTypeObjWithRefsDerivedAREFSET(){
        value = null;
    }
    
    public DmcTypeObjWithRefsDerivedAREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ObjWithRefsDerivedAREF>();
        else
            value = new TreeSet<ObjWithRefsDerivedAREF>();
    }
    
    @Override
    public DmcTypeObjWithRefsDerivedAREFSET getNew(){
        return(new DmcTypeObjWithRefsDerivedAREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2852)
    public DmcAttribute<ObjWithRefsDerivedAREF> cloneIt(){
        synchronized(this){
            DmcTypeObjWithRefsDerivedAREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ObjWithRefsDerivedAREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2875)
    public ObjWithRefsDerivedAREF add(Object v) throws DmcValueException {
        synchronized(this){
            ObjWithRefsDerivedAREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2892)
    public ObjWithRefsDerivedAREF del(Object v){
        synchronized(this){
            ObjWithRefsDerivedAREF rc = null;
            if (value == null)
                return(rc);
            
            try {
                rc = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            if (value.contains(rc)){
                value.remove(rc);
                if (value.size() == 0)
                    value = null;
            }
            else
                rc = null;
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2917)
    public Iterator<ObjWithRefsDerivedAREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<ObjWithRefsDerivedAREF>(value)).iterator() );
            else
                return( (new TreeSet<ObjWithRefsDerivedAREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2931)
    public Set<ObjWithRefsDerivedAREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<ObjWithRefsDerivedAREF>());
                else
                    return(new HashSet<ObjWithRefsDerivedAREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<ObjWithRefsDerivedAREF>(value));
                else
                    return(new TreeSet<ObjWithRefsDerivedAREF>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2951)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2962)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                ObjWithRefsDerivedAREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

