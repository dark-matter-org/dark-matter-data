package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeTestOneLevelSubpackageREFSTATIC provides static access to functions used to manage values of type TestOneLevelSubpackageREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2017)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1932)
 */
public class DmcTypeTestOneLevelSubpackageREFSTATIC {
    
    public static DmcTypeTestOneLevelSubpackageREFSTATIC instance;
    static DmcTypeTestOneLevelSubpackageREFSV typeHelper;
    
    static {
        instance = new DmcTypeTestOneLevelSubpackageREFSTATIC();
    }
    
    protected DmcTypeTestOneLevelSubpackageREFSTATIC() {
        typeHelper = new DmcTypeTestOneLevelSubpackageREFSV();
    }
    
    public TestOneLevelSubpackageREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public TestOneLevelSubpackageREF cloneValue(TestOneLevelSubpackageREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, TestOneLevelSubpackageREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public TestOneLevelSubpackageREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

