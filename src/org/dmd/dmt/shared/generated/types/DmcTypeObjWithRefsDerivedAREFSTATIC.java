package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeObjWithRefsDerivedAREFSTATIC provides static access to functions used to manage values of type ObjWithRefsDerivedAREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2346)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2261)
 */
public class DmcTypeObjWithRefsDerivedAREFSTATIC {
    
    public static DmcTypeObjWithRefsDerivedAREFSTATIC instance;
    static DmcTypeObjWithRefsDerivedAREFSV typeHelper;
    
    static {
        instance = new DmcTypeObjWithRefsDerivedAREFSTATIC();
    }
    
    protected DmcTypeObjWithRefsDerivedAREFSTATIC() {
        typeHelper = new DmcTypeObjWithRefsDerivedAREFSV();
    }
    
    public ObjWithRefsDerivedAREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public ObjWithRefsDerivedAREF cloneValue(ObjWithRefsDerivedAREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, ObjWithRefsDerivedAREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public ObjWithRefsDerivedAREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

