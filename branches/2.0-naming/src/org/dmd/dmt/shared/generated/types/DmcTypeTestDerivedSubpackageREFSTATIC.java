package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeTestDerivedSubpackageREFSTATIC provides static access to functions used to manage values of type TestDerivedSubpackageREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2130)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2045)
 */
public class DmcTypeTestDerivedSubpackageREFSTATIC {
    
    public static DmcTypeTestDerivedSubpackageREFSTATIC instance;
    static DmcTypeTestDerivedSubpackageREFSV typeHelper;
    
    static {
        instance = new DmcTypeTestDerivedSubpackageREFSTATIC();
    }
    
    protected DmcTypeTestDerivedSubpackageREFSTATIC() {
        typeHelper = new DmcTypeTestDerivedSubpackageREFSV();
    }
    
    public TestDerivedSubpackageREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public TestDerivedSubpackageREF cloneValue(TestDerivedSubpackageREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, TestDerivedSubpackageREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public TestDerivedSubpackageREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

