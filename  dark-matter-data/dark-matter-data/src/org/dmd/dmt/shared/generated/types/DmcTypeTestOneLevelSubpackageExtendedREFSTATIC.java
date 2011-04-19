package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeTestOneLevelSubpackageExtendedREFSTATIC provides static access to functions used to manage values of type TestOneLevelSubpackageExtendedREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1629)
 *    Called from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1555)
 */
public class DmcTypeTestOneLevelSubpackageExtendedREFSTATIC {
    
    public static DmcTypeTestOneLevelSubpackageExtendedREFSTATIC instance;
    static DmcTypeTestOneLevelSubpackageExtendedREFSV typeHelper;
    
    static {
        instance = new DmcTypeTestOneLevelSubpackageExtendedREFSTATIC();
    }
    
    protected DmcTypeTestOneLevelSubpackageExtendedREFSTATIC() {
        typeHelper = new DmcTypeTestOneLevelSubpackageExtendedREFSV();
    }
    
    public TestOneLevelSubpackageExtendedREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public TestOneLevelSubpackageExtendedREF cloneValue(TestOneLevelSubpackageExtendedREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, TestOneLevelSubpackageExtendedREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public TestOneLevelSubpackageExtendedREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

