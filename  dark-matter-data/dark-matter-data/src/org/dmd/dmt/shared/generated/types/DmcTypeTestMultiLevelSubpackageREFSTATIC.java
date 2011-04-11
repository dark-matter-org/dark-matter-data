package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
/**
 * The DmcTypeTestMultiLevelSubpackageREFSTATIC provides static access to functions used to manage values of type TestMultiLevelSubpackageREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1454)
 *    Called from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1399)
 */
public class DmcTypeTestMultiLevelSubpackageREFSTATIC {
    
    static DmcTypeTestMultiLevelSubpackageREFSV instance;
    
    static public TestMultiLevelSubpackageREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeTestMultiLevelSubpackageREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public TestMultiLevelSubpackageREF cloneValueSTATIC(TestMultiLevelSubpackageREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeTestMultiLevelSubpackageREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, TestMultiLevelSubpackageREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestMultiLevelSubpackageREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public TestMultiLevelSubpackageREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestMultiLevelSubpackageREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

