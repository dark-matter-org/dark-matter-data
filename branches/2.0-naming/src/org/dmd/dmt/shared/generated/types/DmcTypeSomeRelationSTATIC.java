package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmt.shared.generated.types.SomeRelation;    // base type import

/**
 * The DmcTypeSomeRelationSTATIC provides static access to functions used to manage values of type SomeRelation
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2144)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2059)
 */
public class DmcTypeSomeRelationSTATIC {
    
    public static DmcTypeSomeRelationSTATIC instance;
    static DmcTypeSomeRelationSV typeHelper;
    
    static {
        instance = new DmcTypeSomeRelationSTATIC();
    }
    
    protected DmcTypeSomeRelationSTATIC() {
        typeHelper = new DmcTypeSomeRelationSV();
    }
    
    public SomeRelation typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public SomeRelation cloneValue(SomeRelation value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, SomeRelation value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public SomeRelation deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

