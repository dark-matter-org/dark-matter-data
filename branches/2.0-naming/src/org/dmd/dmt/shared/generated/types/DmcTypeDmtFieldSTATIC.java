package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmt.shared.generated.types.DmtField;    // base type import

/**
 * The DmcTypeDmtFieldSTATIC provides static access to functions used to manage values of type DmtField
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2141)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2056)
 */
public class DmcTypeDmtFieldSTATIC {
    
    public static DmcTypeDmtFieldSTATIC instance;
    static DmcTypeDmtFieldSV typeHelper;
    
    static {
        instance = new DmcTypeDmtFieldSTATIC();
    }
    
    protected DmcTypeDmtFieldSTATIC() {
        typeHelper = new DmcTypeDmtFieldSV();
    }
    
    public DmtField typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public DmtField cloneValue(DmtField value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, DmtField value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public DmtField deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

