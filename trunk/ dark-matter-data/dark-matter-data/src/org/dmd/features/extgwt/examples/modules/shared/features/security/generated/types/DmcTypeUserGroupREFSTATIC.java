package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
/**
 * The DmcTypeUserGroupREFSTATIC provides static access to functions used to manage values of type UserGroupREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1444)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1387)
 */
public class DmcTypeUserGroupREFSTATIC {
    
    static DmcTypeUserGroupREFSV instance;
    
    static public UserGroupREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeUserGroupREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public UserGroupREF cloneValueSTATIC(UserGroupREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeUserGroupREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, UserGroupREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeUserGroupREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public UserGroupREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeUserGroupREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

