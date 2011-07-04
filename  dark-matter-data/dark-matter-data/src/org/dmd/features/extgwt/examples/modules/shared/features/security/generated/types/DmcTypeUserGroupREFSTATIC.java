package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeUserGroupREFSTATIC provides static access to functions used to manage values of type UserGroupREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1771)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1690)
 */
public class DmcTypeUserGroupREFSTATIC {
    
    public static DmcTypeUserGroupREFSTATIC instance;
    static DmcTypeUserGroupREFSV typeHelper;
    
    static {
        instance = new DmcTypeUserGroupREFSTATIC();
    }
    
    protected DmcTypeUserGroupREFSTATIC() {
        typeHelper = new DmcTypeUserGroupREFSV();
    }
    
    public UserGroupREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public UserGroupREF cloneValue(UserGroupREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, UserGroupREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public UserGroupREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

