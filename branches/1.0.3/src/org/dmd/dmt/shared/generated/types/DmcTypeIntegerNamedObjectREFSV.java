package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeIntegerNamedObjectREFSV provides storage for a single-valued IntegerNamedObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1907)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:530)
 */
@SuppressWarnings("serial")
public class DmcTypeIntegerNamedObjectREFSV extends DmcTypeIntegerNamedObjectREF implements Serializable {
    
    protected IntegerNamedObjectREF value;
    
    public DmcTypeIntegerNamedObjectREFSV(){
    
    }
    
    public DmcTypeIntegerNamedObjectREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeIntegerNamedObjectREFSV getNew(){
        return(new DmcTypeIntegerNamedObjectREFSV(attrInfo));
    }
    
    public DmcTypeIntegerNamedObjectREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeIntegerNamedObjectREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1939)
    public DmcAttribute<IntegerNamedObjectREF> cloneIt(){
        DmcTypeIntegerNamedObjectREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1950)
    public IntegerNamedObjectREF getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1962)
    public IntegerNamedObjectREF set(Object v) throws DmcValueException {
        IntegerNamedObjectREF rc = typeCheck(v);
        // We only return a value if the value actually changed. This supports
        // the applyModifier() mechanism on DmcObject where we only return true
        // if something changed as a result of the modifier
        if (value == null)
            value = rc;
        else{
            if (value.equals(rc))
                rc = null;
            else
                value = rc;
        }
        return(rc);
    }
    
    @Override
    public IntegerNamedObjectREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}
