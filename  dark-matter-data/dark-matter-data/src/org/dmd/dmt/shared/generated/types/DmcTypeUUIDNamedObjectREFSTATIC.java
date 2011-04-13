package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
/**
 * The DmcTypeUUIDNamedObjectREFSTATIC provides static access to functions used to manage values of type UUIDNamedObjectREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1444)
 *    Called from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1387)
 */
public class DmcTypeUUIDNamedObjectREFSTATIC {
    
    static DmcTypeUUIDNamedObjectREFSV instance;
    
    static public UUIDNamedObjectREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeUUIDNamedObjectREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public UUIDNamedObjectREF cloneValueSTATIC(UUIDNamedObjectREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeUUIDNamedObjectREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, UUIDNamedObjectREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeUUIDNamedObjectREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public UUIDNamedObjectREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeUUIDNamedObjectREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

