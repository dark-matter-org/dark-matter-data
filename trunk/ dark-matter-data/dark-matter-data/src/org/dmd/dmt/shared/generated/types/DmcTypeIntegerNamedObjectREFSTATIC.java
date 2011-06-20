package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeIntegerNamedObjectREFSTATIC provides static access to functions used to manage values of type IntegerNamedObjectREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1731)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1650)
 */
public class DmcTypeIntegerNamedObjectREFSTATIC {
    
    public static DmcTypeIntegerNamedObjectREFSTATIC instance;
    static DmcTypeIntegerNamedObjectREFSV typeHelper;
    
    static {
        instance = new DmcTypeIntegerNamedObjectREFSTATIC();
    }
    
    protected DmcTypeIntegerNamedObjectREFSTATIC() {
        typeHelper = new DmcTypeIntegerNamedObjectREFSV();
    }
    
    public IntegerNamedObjectREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public IntegerNamedObjectREF cloneValue(IntegerNamedObjectREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, IntegerNamedObjectREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public IntegerNamedObjectREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

