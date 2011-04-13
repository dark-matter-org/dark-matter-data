package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
/**
 * The DmcTypeTestDerivedSubpackageREFSTATIC provides static access to functions used to manage values of type TestDerivedSubpackageREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1444)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1387)
 */
public class DmcTypeTestDerivedSubpackageREFSTATIC {
    
    static DmcTypeTestDerivedSubpackageREFSV instance;
    
    static public TestDerivedSubpackageREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeTestDerivedSubpackageREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public TestDerivedSubpackageREF cloneValueSTATIC(TestDerivedSubpackageREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeTestDerivedSubpackageREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, TestDerivedSubpackageREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestDerivedSubpackageREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public TestDerivedSubpackageREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestDerivedSubpackageREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

