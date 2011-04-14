package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmt.shared.types.DmtStringName;    // base type import

/**
 * The DmcTypeDmtStringNameSTATIC provides static access to functions used to manage values of type DmtStringName
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1455)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1392)
 */
public class DmcTypeDmtStringNameSTATIC {
    
    static DmcTypeDmtStringNameSV instance;
    
    static public DmtStringName typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeDmtStringNameSV();
    	   return(instance.typeCheck(value));
    }
    
    static public DmtStringName cloneValueSTATIC(DmtStringName value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeDmtStringNameSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, DmtStringName value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeDmtStringNameSV();
    	instance.serializeValue(dos, value);
    }
    
    static public DmtStringName deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeDmtStringNameSV();
    	return(instance.deserializeValue(dis));
    }
    
    static public DmcTypeDmtStringNameSV getNewNameHolder(){
    	if (instance == null)
    		instance = new DmcTypeDmtStringNameSV();
    	return(instance.getNew());
    }
    
}

