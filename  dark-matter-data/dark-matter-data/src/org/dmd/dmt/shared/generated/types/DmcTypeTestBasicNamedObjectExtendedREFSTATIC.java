package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
/**
 * The DmcTypeTestBasicNamedObjectExtendedREFSTATIC provides static access to functions used to manage values of type TestBasicNamedObjectExtendedREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1436)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1381)
 */
public class DmcTypeTestBasicNamedObjectExtendedREFSTATIC {
    
    static DmcTypeTestBasicNamedObjectExtendedREFSV instance;
    
    static public TestBasicNamedObjectExtendedREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeTestBasicNamedObjectExtendedREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public TestBasicNamedObjectExtendedREF cloneValueSTATIC(TestBasicNamedObjectExtendedREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeTestBasicNamedObjectExtendedREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, TestBasicNamedObjectExtendedREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestBasicNamedObjectExtendedREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public TestBasicNamedObjectExtendedREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeTestBasicNamedObjectExtendedREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

