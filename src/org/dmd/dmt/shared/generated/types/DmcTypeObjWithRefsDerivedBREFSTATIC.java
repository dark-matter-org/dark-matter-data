package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeObjWithRefsDerivedBREFSTATIC provides static access to functions used to manage values of type ObjWithRefsDerivedBREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2169)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2084)
 */
public class DmcTypeObjWithRefsDerivedBREFSTATIC {
    
    public static DmcTypeObjWithRefsDerivedBREFSTATIC instance;
    static DmcTypeObjWithRefsDerivedBREFSV typeHelper;
    
    static {
        instance = new DmcTypeObjWithRefsDerivedBREFSTATIC();
    }
    
    protected DmcTypeObjWithRefsDerivedBREFSTATIC() {
        typeHelper = new DmcTypeObjWithRefsDerivedBREFSV();
    }
    
    public ObjWithRefsDerivedBREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public ObjWithRefsDerivedBREF cloneValue(ObjWithRefsDerivedBREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, ObjWithRefsDerivedBREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public ObjWithRefsDerivedBREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

