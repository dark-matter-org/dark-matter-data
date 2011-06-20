package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;    // DmcType import

/**
 * The DmcTypeDmtTestEnumSTATIC provides static access to functions used to manage values of type DmtTestEnum
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1731)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1650)
 */
public class DmcTypeDmtTestEnumSTATIC {
    
    public static DmcTypeDmtTestEnumSTATIC instance;
    static DmcTypeDmtTestEnumSV typeHelper;
    
    static {
        instance = new DmcTypeDmtTestEnumSTATIC();
    }
    
    protected DmcTypeDmtTestEnumSTATIC() {
        typeHelper = new DmcTypeDmtTestEnumSV();
    }
    
    public DmtTestEnum typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public DmtTestEnum cloneValue(DmtTestEnum value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, DmtTestEnum value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public DmtTestEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

