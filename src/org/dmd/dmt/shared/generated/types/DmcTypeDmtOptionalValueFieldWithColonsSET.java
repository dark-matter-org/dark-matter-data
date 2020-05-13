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
import org.dmd.dmt.shared.generated.types.DmtOptionalValueFieldWithColons;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtOptionalValueFieldWithColons;    // DmcType import
/**
 * The DmcTypeDmtOptionalValueFieldWithColonsSET provides storage for a set of DmtOptionalValueFieldWithColons
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2811)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:127)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtOptionalValueFieldWithColonsSET extends DmcTypeDmtOptionalValueFieldWithColons implements Serializable {
    
     private final static Iterator<DmtOptionalValueFieldWithColons> emptyList =  (new HashSet<DmtOptionalValueFieldWithColons>()).iterator();
    
    
    protected Set<DmtOptionalValueFieldWithColons> value;
    
    public DmcTypeDmtOptionalValueFieldWithColonsSET(){
        value = null;
    }
    
    public DmcTypeDmtOptionalValueFieldWithColonsSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<DmtOptionalValueFieldWithColons>();
        else
            value = new TreeSet<DmtOptionalValueFieldWithColons>();
    }
    
    @Override
    public DmcTypeDmtOptionalValueFieldWithColonsSET getNew(){
        return(new DmcTypeDmtOptionalValueFieldWithColonsSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2852)
    public DmcAttribute<DmtOptionalValueFieldWithColons> cloneIt(){
        synchronized(this){
            DmcTypeDmtOptionalValueFieldWithColonsSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(DmtOptionalValueFieldWithColons val: value)
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
    public DmtOptionalValueFieldWithColons add(Object v) throws DmcValueException {
        synchronized(this){
            DmtOptionalValueFieldWithColons rc = typeCheck(v);
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
    public DmtOptionalValueFieldWithColons del(Object v){
        synchronized(this){
            DmtOptionalValueFieldWithColons rc = null;
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
    public Iterator<DmtOptionalValueFieldWithColons> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<DmtOptionalValueFieldWithColons>(value)).iterator() );
            else
                return( (new TreeSet<DmtOptionalValueFieldWithColons>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2931)
    public Set<DmtOptionalValueFieldWithColons> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<DmtOptionalValueFieldWithColons>());
                else
                    return(new HashSet<DmtOptionalValueFieldWithColons>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<DmtOptionalValueFieldWithColons>(value));
                else
                    return(new TreeSet<DmtOptionalValueFieldWithColons>(value));
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
                DmtOptionalValueFieldWithColons val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

