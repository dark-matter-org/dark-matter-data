package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.types.DmtStringName;    // base type import
import org.dmd.dmt.shared.types.DmcTypeDmtStringName;    // primitive import
/**
 * The DmcTypeDmtStringNameSV provides storage for a single-valued DmtStringName
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1296)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:90)
 */
@SuppressWarnings("serial")
public class DmcTypeDmtStringNameSV extends DmcTypeDmtStringName implements Serializable {
    
    DmtStringName value;
    
    public DmcTypeDmtStringNameSV(){
    
    }
    
    public DmcTypeDmtStringNameSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeDmtStringNameSV getNew(){
        return(new DmcTypeDmtStringNameSV(attrInfo));
    }
    
    @Override
    public DmcAttribute<DmtStringName> cloneIt(){
        DmcTypeDmtStringNameSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public DmtStringName set(Object v) throws DmcValueException {
        return(value = typeCheck(v));
    }
    
    @Override
    public DmtStringName getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

