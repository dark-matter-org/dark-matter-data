package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeTestMultiLevelSubpackageREFSTATIC provides static access to functions used to manage values of type TestMultiLevelSubpackageREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2008)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1923)
 */
public class DmcTypeTestMultiLevelSubpackageREFSTATIC {
    
    public static DmcTypeTestMultiLevelSubpackageREFSTATIC instance;
    static DmcTypeTestMultiLevelSubpackageREFSV typeHelper;
    
    static {
        instance = new DmcTypeTestMultiLevelSubpackageREFSTATIC();
    }
    
    protected DmcTypeTestMultiLevelSubpackageREFSTATIC() {
        typeHelper = new DmcTypeTestMultiLevelSubpackageREFSV();
    }
    
    public TestMultiLevelSubpackageREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public TestMultiLevelSubpackageREF cloneValue(TestMultiLevelSubpackageREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, TestMultiLevelSubpackageREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public TestMultiLevelSubpackageREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

