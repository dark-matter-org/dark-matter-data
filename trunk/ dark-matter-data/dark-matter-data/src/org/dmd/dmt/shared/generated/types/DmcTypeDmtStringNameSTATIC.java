package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcNameBuilderIF;
import org.dmd.dmc.types.DmcTypeDmcObjectName;
import org.dmd.dmt.shared.types.DmtStringName;    // base type import

/**
 * The DmcTypeDmtStringNameSTATIC provides static access to functions used to manage values of type DmtStringName
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1517)
 *    Called from:  org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1445)
 */
public class DmcTypeDmtStringNameSTATIC implements DmcNameBuilderIF {
    
    public static DmcTypeDmtStringNameSTATIC instance;
    static DmcTypeDmtStringNameSV typeHelper;
    static String nameClass = "DmtStringName";
    
    static {
        instance = new DmcTypeDmtStringNameSTATIC();
    }
    
    protected DmcTypeDmtStringNameSTATIC() {
        typeHelper = new DmcTypeDmtStringNameSV();
    }
    
    public DmtStringName typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public DmtStringName cloneValue(DmtStringName value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, DmtStringName value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public DmtStringName deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
    @Override
    public DmcTypeDmcObjectName<?> getNewNameHolder(){
    	   // return(typeHelper.getNew());
    	   return(null);
    }
    
    @Override
    public String getNameClass(){
    	   return(nameClass);
    }
    
}

