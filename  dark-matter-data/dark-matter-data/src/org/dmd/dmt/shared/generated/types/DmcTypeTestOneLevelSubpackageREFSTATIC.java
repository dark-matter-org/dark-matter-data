package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
/**
 * The DmcTypeTestOneLevelSubpackageREFSTATIC provides static access to functions used to manage values of type TestOneLevelSubpackageREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1444)
 *    Called from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1387)
 */
public class DmcTypeTestOneLevelSubpackageREFSTATIC {
    
    static DmcTypeTestOneLevelSubpackageREFSV instance;
    
    static public TestOneLevelSubpackageREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeTestOneLevelSubpackageREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public TestOneLevelSubpackageREF cloneValueSTATIC(TestOneLevelSubpackageREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeTestOneLevelSubpackageREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, TestOneLevelSubpackageREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestOneLevelSubpackageREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public TestOneLevelSubpackageREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestOneLevelSubpackageREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

