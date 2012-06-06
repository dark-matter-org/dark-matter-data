package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeTestDerivedDiffSubpackageREFSTATIC provides static access to functions used to manage values of type TestDerivedDiffSubpackageREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2078)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1993)
 */
public class DmcTypeTestDerivedDiffSubpackageREFSTATIC {
    
    public static DmcTypeTestDerivedDiffSubpackageREFSTATIC instance;
    static DmcTypeTestDerivedDiffSubpackageREFSV typeHelper;
    
    static {
        instance = new DmcTypeTestDerivedDiffSubpackageREFSTATIC();
    }
    
    protected DmcTypeTestDerivedDiffSubpackageREFSTATIC() {
        typeHelper = new DmcTypeTestDerivedDiffSubpackageREFSV();
    }
    
    public TestDerivedDiffSubpackageREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public TestDerivedDiffSubpackageREF cloneValue(TestDerivedDiffSubpackageREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, TestDerivedDiffSubpackageREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public TestDerivedDiffSubpackageREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

