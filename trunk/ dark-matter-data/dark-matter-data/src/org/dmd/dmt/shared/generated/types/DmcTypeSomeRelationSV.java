package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.types.SomeRelation;    // base type import
import org.dmd.dmt.shared.generated.types.DmcTypeSomeRelation;    // DmcType import
/**
 * The DmcTypeSomeRelationSV provides storage for a single-valued SomeRelation
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1777)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:144)
 */
@SuppressWarnings("serial")
public class DmcTypeSomeRelationSV extends DmcTypeSomeRelation implements Serializable {
    
    protected SomeRelation value;
    
    public DmcTypeSomeRelationSV(){
    
    }
    
    public DmcTypeSomeRelationSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeSomeRelationSV getNew(){
        return(new DmcTypeSomeRelationSV(attrInfo));
    }
    
    public DmcTypeSomeRelationSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeSomeRelationSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1809)
    public DmcAttribute<SomeRelation> cloneIt(){
        DmcTypeSomeRelationSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1820)
    public SomeRelation getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1832)
    public SomeRelation set(Object v) throws DmcValueException {
        SomeRelation rc = typeCheck(v);
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
    public SomeRelation getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

