package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
/**
 * The DmcTypeTestDerivedDiffSubpackageREFSTATIC provides static access to functions used to manage values of type TestDerivedDiffSubpackageREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1454)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1399)
 */
public class DmcTypeTestDerivedDiffSubpackageREFSTATIC {
    
    static DmcTypeTestDerivedDiffSubpackageREFSV instance;
    
    static public TestDerivedDiffSubpackageREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeTestDerivedDiffSubpackageREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public TestDerivedDiffSubpackageREF cloneValueSTATIC(TestDerivedDiffSubpackageREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeTestDerivedDiffSubpackageREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, TestDerivedDiffSubpackageREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestDerivedDiffSubpackageREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public TestDerivedDiffSubpackageREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestDerivedDiffSubpackageREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

