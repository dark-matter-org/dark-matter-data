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
import org.dmd.dmt.shared.generated.types.SomeRelation;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeSomeRelation;    // DmcType import
/**
 * The DmcTypeSomeRelationSET provides storage for a set of SomeRelation
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2439)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:146)
 */
@SuppressWarnings("serial")
public class DmcTypeSomeRelationSET extends DmcTypeSomeRelation implements Serializable {
    
    protected Set<SomeRelation> value;
    
    public DmcTypeSomeRelationSET(){
        value = null;
    }
    
    public DmcTypeSomeRelationSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<SomeRelation>();
        else
            value = new TreeSet<SomeRelation>();
    }
    
    @Override
    public DmcTypeSomeRelationSET getNew(){
        return(new DmcTypeSomeRelationSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2476)
    public DmcAttribute<SomeRelation> cloneIt(){
        synchronized(this){
            DmcTypeSomeRelationSET rc = getNew();
            for(SomeRelation val: value)
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
    public SomeRelation add(Object v) throws DmcValueException {
        synchronized(this){
            SomeRelation rc = typeCheck(v);
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
    public SomeRelation del(Object v){
        synchronized(this){
            SomeRelation rc = null;
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
    public Iterator<SomeRelation> getMV(){
        synchronized(this){
            Set<SomeRelation> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<SomeRelation>(value);
            else
                clone = new TreeSet<SomeRelation>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2550)
    public Set<SomeRelation> getMVCopy(){
        synchronized(this){
            Set<SomeRelation> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<SomeRelation>(value);
            else
                clone = new TreeSet<SomeRelation>(value);
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
                SomeRelation val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

