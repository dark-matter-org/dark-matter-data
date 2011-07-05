package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeBaseObjREFSTATIC provides static access to functions used to manage values of type BaseObjREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1848)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1767)
 */
public class DmcTypeBaseObjREFSTATIC {
    
    public static DmcTypeBaseObjREFSTATIC instance;
    static DmcTypeBaseObjREFSV typeHelper;
    
    static {
        instance = new DmcTypeBaseObjREFSTATIC();
    }
    
    protected DmcTypeBaseObjREFSTATIC() {
        typeHelper = new DmcTypeBaseObjREFSV();
    }
    
    public BaseObjREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public BaseObjREF cloneValue(BaseObjREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, BaseObjREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public BaseObjREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

