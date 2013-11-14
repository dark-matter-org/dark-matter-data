package org.dmd.dmt.dsd.dsdb.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeBConceptXREFSTATIC provides static access to functions used to manage values of type BConceptXREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2141)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2056)
 */
public class DmcTypeBConceptXREFSTATIC {
    
    public static DmcTypeBConceptXREFSTATIC instance;
    static DmcTypeBConceptXREFSV typeHelper;
    
    static {
        instance = new DmcTypeBConceptXREFSTATIC();
    }
    
    protected DmcTypeBConceptXREFSTATIC() {
        typeHelper = new DmcTypeBConceptXREFSV();
    }
    
    public BConceptXREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public BConceptXREF cloneValue(BConceptXREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, BConceptXREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public BConceptXREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

