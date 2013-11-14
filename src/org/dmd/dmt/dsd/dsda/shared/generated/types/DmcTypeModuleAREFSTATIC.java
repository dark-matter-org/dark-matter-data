package org.dmd.dmt.dsd.dsda.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeModuleAREFSTATIC provides static access to functions used to manage values of type ModuleAREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2141)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2056)
 */
public class DmcTypeModuleAREFSTATIC {
    
    public static DmcTypeModuleAREFSTATIC instance;
    static DmcTypeModuleAREFSV typeHelper;
    
    static {
        instance = new DmcTypeModuleAREFSTATIC();
    }
    
    protected DmcTypeModuleAREFSTATIC() {
        typeHelper = new DmcTypeModuleAREFSV();
    }
    
    public ModuleAREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public ModuleAREF cloneValue(ModuleAREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, ModuleAREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public ModuleAREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

