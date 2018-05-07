package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ParseTestDMO;    // DmcType import
/**
 * The DmcTypeParseTestREFSV provides storage for a single-valued ParseTest
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2151)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:254)
 */
@SuppressWarnings("serial")
public class DmcTypeParseTestREFSV extends DmcTypeParseTestREF implements Serializable {
    
    protected ParseTestDMO value;
    
    public DmcTypeParseTestREFSV(){
    
    }
    
    public DmcTypeParseTestREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeParseTestREFSV getNew(){
        return(new DmcTypeParseTestREFSV(getAttributeInfo()));
    }
    
    public DmcTypeParseTestREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeParseTestREFSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2183)
    public DmcAttribute<ParseTestDMO> cloneIt(){
        DmcTypeParseTestREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2194)
    public ParseTestDMO getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2206)
    public ParseTestDMO set(Object v) throws DmcValueException {
        ParseTestDMO rc = typeCheck(v);
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
    public ParseTestDMO getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

