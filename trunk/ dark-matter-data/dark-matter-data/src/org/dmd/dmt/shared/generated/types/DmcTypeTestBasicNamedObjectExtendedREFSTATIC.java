package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeTestBasicNamedObjectExtendedREFSTATIC provides static access to functions used to manage values of type TestBasicNamedObjectExtendedREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1751)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1670)
 */
public class DmcTypeTestBasicNamedObjectExtendedREFSTATIC {
    
    public static DmcTypeTestBasicNamedObjectExtendedREFSTATIC instance;
    static DmcTypeTestBasicNamedObjectExtendedREFSV typeHelper;
    
    static {
        instance = new DmcTypeTestBasicNamedObjectExtendedREFSTATIC();
    }
    
    protected DmcTypeTestBasicNamedObjectExtendedREFSTATIC() {
        typeHelper = new DmcTypeTestBasicNamedObjectExtendedREFSV();
    }
    
    public TestBasicNamedObjectExtendedREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public TestBasicNamedObjectExtendedREF cloneValue(TestBasicNamedObjectExtendedREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, TestBasicNamedObjectExtendedREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public TestBasicNamedObjectExtendedREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

