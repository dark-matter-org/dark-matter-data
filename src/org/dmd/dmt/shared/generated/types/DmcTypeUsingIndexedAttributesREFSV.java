package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.UsingIndexedAttributesDMO;    // DmcType import
/**
 * The DmcTypeUsingIndexedAttributesREFSV provides storage for a single-valued UsingIndexedAttributes
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1909)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeUsingIndexedAttributesREFSV extends DmcTypeUsingIndexedAttributesREF implements Serializable {
    
    protected UsingIndexedAttributesDMO value;
    
    public DmcTypeUsingIndexedAttributesREFSV(){
    
    }
    
    public DmcTypeUsingIndexedAttributesREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeUsingIndexedAttributesREFSV getNew(){
        return(new DmcTypeUsingIndexedAttributesREFSV(attrInfo));
    }
    
    public DmcTypeUsingIndexedAttributesREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeUsingIndexedAttributesREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1941)
    public DmcAttribute<UsingIndexedAttributesDMO> cloneIt(){
        DmcTypeUsingIndexedAttributesREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1952)
    public UsingIndexedAttributesDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1964)
    public UsingIndexedAttributesDMO set(Object v) throws DmcValueException {
        UsingIndexedAttributesDMO rc = typeCheck(v);
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
    public UsingIndexedAttributesDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

