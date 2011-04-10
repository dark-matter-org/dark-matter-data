package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
/**
 * The DmcTypeTestBasicNamedObjectFixedREFSTATIC provides static access to functions used to manage values of type TestBasicNamedObjectFixedREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1454)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1399)
 */
public class DmcTypeTestBasicNamedObjectFixedREFSTATIC {
    
    static DmcTypeTestBasicNamedObjectFixedREFSV instance;
    
    static public TestBasicNamedObjectFixedREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeTestBasicNamedObjectFixedREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public TestBasicNamedObjectFixedREF cloneValueSTATIC(TestBasicNamedObjectFixedREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeTestBasicNamedObjectFixedREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, TestBasicNamedObjectFixedREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestBasicNamedObjectFixedREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public TestBasicNamedObjectFixedREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestBasicNamedObjectFixedREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

