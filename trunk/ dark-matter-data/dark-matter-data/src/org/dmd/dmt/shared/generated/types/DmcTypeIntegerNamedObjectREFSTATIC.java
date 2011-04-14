package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeIntegerNamedObjectREFSTATIC provides static access to functions used to manage values of type IntegerNamedObjectREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1455)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1392)
 */
public class DmcTypeIntegerNamedObjectREFSTATIC {
    
    static DmcTypeIntegerNamedObjectREFSV instance;
    
    static public IntegerNamedObjectREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeIntegerNamedObjectREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public IntegerNamedObjectREF cloneValueSTATIC(IntegerNamedObjectREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeIntegerNamedObjectREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, IntegerNamedObjectREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeIntegerNamedObjectREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public IntegerNamedObjectREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeIntegerNamedObjectREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

