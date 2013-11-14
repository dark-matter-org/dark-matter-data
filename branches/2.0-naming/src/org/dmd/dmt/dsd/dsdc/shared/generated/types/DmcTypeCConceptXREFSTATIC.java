package org.dmd.dmt.dsd.dsdc.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeCConceptXREFSTATIC provides static access to functions used to manage values of type CConceptXREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2141)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2056)
 */
public class DmcTypeCConceptXREFSTATIC {
    
    public static DmcTypeCConceptXREFSTATIC instance;
    static DmcTypeCConceptXREFSV typeHelper;
    
    static {
        instance = new DmcTypeCConceptXREFSTATIC();
    }
    
    protected DmcTypeCConceptXREFSTATIC() {
        typeHelper = new DmcTypeCConceptXREFSV();
    }
    
    public CConceptXREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public CConceptXREF cloneValue(CConceptXREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, CConceptXREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public CConceptXREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

