package org.dmd.dmt.dsd.dsdc.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeCConceptBaseREFSTATIC provides static access to functions used to manage values of type CConceptBaseREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2141)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2056)
 */
public class DmcTypeCConceptBaseREFSTATIC {
    
    public static DmcTypeCConceptBaseREFSTATIC instance;
    static DmcTypeCConceptBaseREFSV typeHelper;
    
    static {
        instance = new DmcTypeCConceptBaseREFSTATIC();
    }
    
    protected DmcTypeCConceptBaseREFSTATIC() {
        typeHelper = new DmcTypeCConceptBaseREFSV();
    }
    
    public CConceptBaseREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public CConceptBaseREF cloneValue(CConceptBaseREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, CConceptBaseREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public CConceptBaseREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

