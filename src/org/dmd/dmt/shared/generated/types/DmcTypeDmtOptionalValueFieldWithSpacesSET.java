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
import org.dmd.dmt.shared.generated.types.DmtOptionalValueFieldWithSpaces;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeDmtOptionalValueFieldWithSpaces;    // DmcType import
/**
 * The DmcTypeDmtOptionalValueFieldWithSpacesSET provides storage for a set of DmtOptionalValueFieldWithSpaces
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2791)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:127)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtOptionalValueFieldWithSpacesSET extends DmcTypeDmtOptionalValueFieldWithSpaces implements Serializable {
    
     private final static Iterator<DmtOptionalValueFieldWithSpaces> emptyList =  (new HashSet<DmtOptionalValueFieldWithSpaces>()).iterator();
    
    
    protected Set<DmtOptionalValueFieldWithSpaces> value;
    
    public DmcTypeDmtOptionalValueFieldWithSpacesSET(){
        value = null;
    }
    
    public DmcTypeDmtOptionalValueFieldWithSpacesSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<DmtOptionalValueFieldWithSpaces>();
        else
            value = new TreeSet<DmtOptionalValueFieldWithSpaces>();
    }
    
    @Override
    public DmcTypeDmtOptionalValueFieldWithSpacesSET getNew(){
        return(new DmcTypeDmtOptionalValueFieldWithSpacesSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2832)
    public DmcAttribute<DmtOptionalValueFieldWithSpaces> cloneIt(){
        synchronized(this){
            DmcTypeDmtOptionalValueFieldWithSpacesSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(DmtOptionalValueFieldWithSpaces val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2855)
    public DmtOptionalValueFieldWithSpaces add(Object v) throws DmcValueException {
        synchronized(this){
            DmtOptionalValueFieldWithSpaces rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2872)
    public DmtOptionalValueFieldWithSpaces del(Object v){
        synchronized(this){
            DmtOptionalValueFieldWithSpaces rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2897)
    public Iterator<DmtOptionalValueFieldWithSpaces> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<DmtOptionalValueFieldWithSpaces>(value)).iterator() );
            else
                return( (new TreeSet<DmtOptionalValueFieldWithSpaces>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2911)
    public Set<DmtOptionalValueFieldWithSpaces> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<DmtOptionalValueFieldWithSpaces>());
                else
                    return(new HashSet<DmtOptionalValueFieldWithSpaces>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<DmtOptionalValueFieldWithSpaces>(value));
                else
                    return(new TreeSet<DmtOptionalValueFieldWithSpaces>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2931)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2942)
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

