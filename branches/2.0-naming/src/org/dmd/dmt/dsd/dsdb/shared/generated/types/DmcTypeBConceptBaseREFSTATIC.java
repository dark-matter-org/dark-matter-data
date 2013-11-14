package org.dmd.dmt.dsd.dsdb.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeBConceptBaseREFSTATIC provides static access to functions used to manage values of type BConceptBaseREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2141)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2056)
 */
public class DmcTypeBConceptBaseREFSTATIC {
    
    public static DmcTypeBConceptBaseREFSTATIC instance;
    static DmcTypeBConceptBaseREFSV typeHelper;
    
    static {
        instance = new DmcTypeBConceptBaseREFSTATIC();
    }
    
    protected DmcTypeBConceptBaseREFSTATIC() {
        typeHelper = new DmcTypeBConceptBaseREFSV();
    }
    
    public BConceptBaseREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public BConceptBaseREF cloneValue(BConceptBaseREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, BConceptBaseREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public BConceptBaseREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

