package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeUUIDNamedObjectREFSTATIC provides static access to functions used to manage values of type UUIDNamedObjectREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2160)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2075)
 */
public class DmcTypeUUIDNamedObjectREFSTATIC {
    
    public static DmcTypeUUIDNamedObjectREFSTATIC instance;
    static DmcTypeUUIDNamedObjectREFSV typeHelper;
    
    static {
        instance = new DmcTypeUUIDNamedObjectREFSTATIC();
    }
    
    protected DmcTypeUUIDNamedObjectREFSTATIC() {
        typeHelper = new DmcTypeUUIDNamedObjectREFSV();
    }
    
    public UUIDNamedObjectREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public UUIDNamedObjectREF cloneValue(UUIDNamedObjectREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, UUIDNamedObjectREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public UUIDNamedObjectREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

