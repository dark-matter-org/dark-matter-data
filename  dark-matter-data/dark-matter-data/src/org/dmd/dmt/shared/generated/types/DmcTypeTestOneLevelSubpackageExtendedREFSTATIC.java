package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
/**
 * The DmcTypeTestOneLevelSubpackageExtendedREFSTATIC provides static access to functions used to manage values of type TestOneLevelSubpackageExtendedREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1444)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1387)
 */
public class DmcTypeTestOneLevelSubpackageExtendedREFSTATIC {
    
    static DmcTypeTestOneLevelSubpackageExtendedREFSV instance;
    
    static public TestOneLevelSubpackageExtendedREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeTestOneLevelSubpackageExtendedREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public TestOneLevelSubpackageExtendedREF cloneValueSTATIC(TestOneLevelSubpackageExtendedREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeTestOneLevelSubpackageExtendedREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, TestOneLevelSubpackageExtendedREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestOneLevelSubpackageExtendedREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public TestOneLevelSubpackageExtendedREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestOneLevelSubpackageExtendedREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

