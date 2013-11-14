package org.dmd.dmt.dsd.dsda.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeAConceptXREFSTATIC provides static access to functions used to manage values of type AConceptXREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2141)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2056)
 */
public class DmcTypeAConceptXREFSTATIC {
    
    public static DmcTypeAConceptXREFSTATIC instance;
    static DmcTypeAConceptXREFSV typeHelper;
    
    static {
        instance = new DmcTypeAConceptXREFSTATIC();
    }
    
    protected DmcTypeAConceptXREFSTATIC() {
        typeHelper = new DmcTypeAConceptXREFSV();
    }
    
    public AConceptXREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public AConceptXREF cloneValue(AConceptXREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, AConceptXREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public AConceptXREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

