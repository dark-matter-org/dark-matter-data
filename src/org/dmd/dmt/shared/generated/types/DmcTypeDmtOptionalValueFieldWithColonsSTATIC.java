package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmt.shared.generated.types.DmtOptionalValueFieldWithColons;    // base type import

/**
 * The DmcTypeDmtOptionalValueFieldWithColonsSTATIC provides static access to functions used to manage values of type DmtOptionalValueFieldWithColons
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2326)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2241)
 */
public class DmcTypeDmtOptionalValueFieldWithColonsSTATIC {
    
    public static DmcTypeDmtOptionalValueFieldWithColonsSTATIC instance;
    static DmcTypeDmtOptionalValueFieldWithColonsSV typeHelper;
    
    static {
        instance = new DmcTypeDmtOptionalValueFieldWithColonsSTATIC();
    }
    
    protected DmcTypeDmtOptionalValueFieldWithColonsSTATIC() {
        typeHelper = new DmcTypeDmtOptionalValueFieldWithColonsSV();
    }
    
    public DmtOptionalValueFieldWithColons typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public DmtOptionalValueFieldWithColons cloneValue(DmtOptionalValueFieldWithColons value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, DmtOptionalValueFieldWithColons value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public DmtOptionalValueFieldWithColons deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

