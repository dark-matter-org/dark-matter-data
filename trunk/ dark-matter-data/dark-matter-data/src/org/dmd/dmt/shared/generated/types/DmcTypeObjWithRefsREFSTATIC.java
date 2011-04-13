package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
/**
 * The DmcTypeObjWithRefsREFSTATIC provides static access to functions used to manage values of type ObjWithRefsREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1444)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1387)
 */
public class DmcTypeObjWithRefsREFSTATIC {
    
    static DmcTypeObjWithRefsREFSV instance;
    
    static public ObjWithRefsREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeObjWithRefsREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public ObjWithRefsREF cloneValueSTATIC(ObjWithRefsREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeObjWithRefsREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, ObjWithRefsREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeObjWithRefsREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public ObjWithRefsREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeObjWithRefsREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

