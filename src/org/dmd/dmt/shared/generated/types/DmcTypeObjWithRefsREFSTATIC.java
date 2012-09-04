package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeObjWithRefsREFSTATIC provides static access to functions used to manage values of type ObjWithRefsREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2082)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1997)
 */
public class DmcTypeObjWithRefsREFSTATIC {
    
    public static DmcTypeObjWithRefsREFSTATIC instance;
    static DmcTypeObjWithRefsREFSV typeHelper;
    
    static {
        instance = new DmcTypeObjWithRefsREFSTATIC();
    }
    
    protected DmcTypeObjWithRefsREFSTATIC() {
        typeHelper = new DmcTypeObjWithRefsREFSV();
    }
    
    public ObjWithRefsREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public ObjWithRefsREF cloneValue(ObjWithRefsREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, ObjWithRefsREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public ObjWithRefsREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

