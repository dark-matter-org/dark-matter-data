package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeUserREFSTATIC provides static access to functions used to manage values of type UserREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1698)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1624)
 */
public class DmcTypeUserREFSTATIC {
    
    public static DmcTypeUserREFSTATIC instance;
    static DmcTypeUserREFSV typeHelper;
    
    static {
        instance = new DmcTypeUserREFSTATIC();
    }
    
    protected DmcTypeUserREFSTATIC() {
        typeHelper = new DmcTypeUserREFSV();
    }
    
    public UserREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public UserREF cloneValue(UserREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, UserREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public UserREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

