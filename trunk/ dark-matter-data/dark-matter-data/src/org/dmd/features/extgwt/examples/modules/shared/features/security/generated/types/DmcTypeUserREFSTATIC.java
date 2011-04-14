package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeUserREFSTATIC provides static access to functions used to manage values of type UserREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1455)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1392)
 */
public class DmcTypeUserREFSTATIC {
    
    static DmcTypeUserREFSV instance;
    
    static public UserREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeUserREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public UserREF cloneValueSTATIC(UserREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeUserREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, UserREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeUserREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public UserREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeUserREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

