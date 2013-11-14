package org.dmd.dmt.dsd.dsdb.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeModuleBREFSTATIC provides static access to functions used to manage values of type ModuleBREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2141)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2056)
 */
public class DmcTypeModuleBREFSTATIC {
    
    public static DmcTypeModuleBREFSTATIC instance;
    static DmcTypeModuleBREFSV typeHelper;
    
    static {
        instance = new DmcTypeModuleBREFSTATIC();
    }
    
    protected DmcTypeModuleBREFSTATIC() {
        typeHelper = new DmcTypeModuleBREFSV();
    }
    
    public ModuleBREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public ModuleBREF cloneValue(ModuleBREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, ModuleBREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public ModuleBREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

