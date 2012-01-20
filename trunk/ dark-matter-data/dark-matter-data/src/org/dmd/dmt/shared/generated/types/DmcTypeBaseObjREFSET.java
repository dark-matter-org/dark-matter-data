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
 * The DmcTypeBaseObjREFSET provides storage for a set of BaseObjREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2439)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:524)
 */
@SuppressWarnings("serial")
public class DmcTypeBaseObjREFSET extends DmcTypeBaseObjREF implements Serializable {
    
    protected Set<BaseObjREF> value;
    
    public DmcTypeBaseObjREFSET(){
        value = null;
    }
    
    public DmcTypeBaseObjREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<BaseObjREF>();
        else
            value = new TreeSet<BaseObjREF>();
    }
    
    @Override
    public DmcTypeBaseObjREFSET getNew(){
        return(new DmcTypeBaseObjREFSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2476)
    public DmcAttribute<BaseObjREF> cloneIt(){
        synchronized(this){
            DmcTypeBaseObjREFSET rc = getNew();
            for(BaseObjREF val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2495)
    public BaseObjREF add(Object v) throws DmcValueException {
        synchronized(this){
            BaseObjREF rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2512)
    public BaseObjREF del(Object v){
        synchronized(this){
            BaseObjREF rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2537)
    public Iterator<BaseObjREF> getMV(){
        synchronized(this){
            Set<BaseObjREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<BaseObjREF>(value);
            else
                clone = new TreeSet<BaseObjREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2550)
    public Set<BaseObjREF> getMVCopy(){
        synchronized(this){
            Set<BaseObjREF> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<BaseObjREF>(value);
            else
                clone = new TreeSet<BaseObjREF>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2564)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2575)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            if (value == null)
                return(rc);
            
            try {
                BaseObjREF val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

