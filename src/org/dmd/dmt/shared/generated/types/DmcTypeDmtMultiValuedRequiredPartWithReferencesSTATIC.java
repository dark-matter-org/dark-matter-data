package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmt.shared.generated.types.DmtMultiValuedRequiredPartWithReferences;    // base type import

/**
 * The DmcTypeDmtMultiValuedRequiredPartWithReferencesSTATIC provides static access to functions used to manage values of type DmtMultiValuedRequiredPartWithReferences
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2326)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2241)
 */
public class DmcTypeDmtMultiValuedRequiredPartWithReferencesSTATIC {
    
    public static DmcTypeDmtMultiValuedRequiredPartWithReferencesSTATIC instance;
    static DmcTypeDmtMultiValuedRequiredPartWithReferencesSV typeHelper;
    
    static {
        instance = new DmcTypeDmtMultiValuedRequiredPartWithReferencesSTATIC();
    }
    
    protected DmcTypeDmtMultiValuedRequiredPartWithReferencesSTATIC() {
        typeHelper = new DmcTypeDmtMultiValuedRequiredPartWithReferencesSV();
    }
    
    public DmtMultiValuedRequiredPartWithReferences typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public DmtMultiValuedRequiredPartWithReferences cloneValue(DmtMultiValuedRequiredPartWithReferences value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, DmtMultiValuedRequiredPartWithReferences value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public DmtMultiValuedRequiredPartWithReferences deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

