package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeTestBasicNamedObjectFixedREFSTATIC provides static access to functions used to manage values of type TestBasicNamedObjectFixedREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2137)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2052)
 */
public class DmcTypeTestBasicNamedObjectFixedREFSTATIC {
    
    public static DmcTypeTestBasicNamedObjectFixedREFSTATIC instance;
    static DmcTypeTestBasicNamedObjectFixedREFSV typeHelper;
    
    static {
        instance = new DmcTypeTestBasicNamedObjectFixedREFSTATIC();
    }
    
    protected DmcTypeTestBasicNamedObjectFixedREFSTATIC() {
        typeHelper = new DmcTypeTestBasicNamedObjectFixedREFSV();
    }
    
    public TestBasicNamedObjectFixedREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public TestBasicNamedObjectFixedREF cloneValue(TestBasicNamedObjectFixedREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, TestBasicNamedObjectFixedREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public TestBasicNamedObjectFixedREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

