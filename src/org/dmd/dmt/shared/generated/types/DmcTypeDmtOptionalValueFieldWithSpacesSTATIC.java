package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmt.shared.generated.types.DmtOptionalValueFieldWithSpaces;    // base type import

/**
 * The DmcTypeDmtOptionalValueFieldWithSpacesSTATIC provides static access to functions used to manage values of type DmtOptionalValueFieldWithSpaces
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2144)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2059)
 */
public class DmcTypeDmtOptionalValueFieldWithSpacesSTATIC {
    
    public static DmcTypeDmtOptionalValueFieldWithSpacesSTATIC instance;
    static DmcTypeDmtOptionalValueFieldWithSpacesSV typeHelper;
    
    static {
        instance = new DmcTypeDmtOptionalValueFieldWithSpacesSTATIC();
    }
    
    protected DmcTypeDmtOptionalValueFieldWithSpacesSTATIC() {
        typeHelper = new DmcTypeDmtOptionalValueFieldWithSpacesSV();
    }
    
    public DmtOptionalValueFieldWithSpaces typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public DmtOptionalValueFieldWithSpaces cloneValue(DmtOptionalValueFieldWithSpaces value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, DmtOptionalValueFieldWithSpaces value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public DmtOptionalValueFieldWithSpaces deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

