package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeTestBasicNamedObjectExtendedREFSV provides storage for a single-valued TestBasicNamedObjectExtendedREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1546)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:489)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicNamedObjectExtendedREFSV extends DmcTypeTestBasicNamedObjectExtendedREF implements Serializable {
    
    TestBasicNamedObjectExtendedREF value;
    
    public DmcTypeTestBasicNamedObjectExtendedREFSV(){
    
    }
    
    public DmcTypeTestBasicNamedObjectExtendedREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeTestBasicNamedObjectExtendedREFSV getNew(){
        return(new DmcTypeTestBasicNamedObjectExtendedREFSV(attrInfo));
    }
    
    public DmcTypeTestBasicNamedObjectExtendedREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeTestBasicNamedObjectExtendedREFSV(ai));
    }
    
    @Override
    public DmcAttribute<TestBasicNamedObjectExtendedREF> cloneIt(){
        DmcTypeTestBasicNamedObjectExtendedREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public TestBasicNamedObjectExtendedREF set(Object v) throws DmcValueException {
        TestBasicNamedObjectExtendedREF rc = typeCheck(v);
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
    public TestBasicNamedObjectExtendedREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

