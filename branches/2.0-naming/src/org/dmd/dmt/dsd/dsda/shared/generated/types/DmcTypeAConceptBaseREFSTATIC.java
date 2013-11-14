package org.dmd.dmt.dsd.dsda.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeAConceptBaseREFSTATIC provides static access to functions used to manage values of type AConceptBaseREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2141)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2056)
 */
public class DmcTypeAConceptBaseREFSTATIC {
    
    public static DmcTypeAConceptBaseREFSTATIC instance;
    static DmcTypeAConceptBaseREFSV typeHelper;
    
    static {
        instance = new DmcTypeAConceptBaseREFSTATIC();
    }
    
    protected DmcTypeAConceptBaseREFSTATIC() {
        typeHelper = new DmcTypeAConceptBaseREFSV();
    }
    
    public AConceptBaseREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public AConceptBaseREF cloneValue(AConceptBaseREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, AConceptBaseREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public AConceptBaseREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

