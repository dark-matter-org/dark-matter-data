package org.dmd.dmt.dsd.dsdc.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeModuleCREFSTATIC provides static access to functions used to manage values of type ModuleCREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2141)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2056)
 */
public class DmcTypeModuleCREFSTATIC {
    
    public static DmcTypeModuleCREFSTATIC instance;
    static DmcTypeModuleCREFSV typeHelper;
    
    static {
        instance = new DmcTypeModuleCREFSTATIC();
    }
    
    protected DmcTypeModuleCREFSTATIC() {
        typeHelper = new DmcTypeModuleCREFSV();
    }
    
    public ModuleCREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public ModuleCREF cloneValue(ModuleCREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, ModuleCREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public ModuleCREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

