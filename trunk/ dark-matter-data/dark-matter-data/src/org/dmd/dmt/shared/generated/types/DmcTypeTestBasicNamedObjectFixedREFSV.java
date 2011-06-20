package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestBasicNamedObjectFixedREFSV provides storage for a single-valued TestBasicNamedObjectFixedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1573)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:492)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectFixedREFSV extends DmcTypeTestBasicNamedObjectFixedREF implements Serializable {
    
    TestBasicNamedObjectFixedREF value;
    
    public DmcTypeTestBasicNamedObjectFixedREFSV(){
    
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFSV getNew(){
        return(new DmcTypeTestBasicNamedObjectFixedREFSV(attrInfo));
    }
    
    public DmcTypeTestBasicNamedObjectFixedREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeTestBasicNamedObjectFixedREFSV(ai));
    }
    
    @Override
    public DmcAttribute<TestBasicNamedObjectFixedREF> cloneIt(){
        DmcTypeTestBasicNamedObjectFixedREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public TestBasicNamedObjectFixedREF set(Object v) throws DmcValueException {
        TestBasicNamedObjectFixedREF rc = typeCheck(v);
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
    public TestBasicNamedObjectFixedREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

