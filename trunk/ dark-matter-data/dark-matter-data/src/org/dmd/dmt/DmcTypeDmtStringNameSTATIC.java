package org.dmd.dmt;

import org.dmd.dmc.DmcNameBuilderIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.types.DmcTypeDmcObjectName;
import org.dmd.dmt.shared.generated.types.DmcTypeDmtStringNameSV;
import org.dmd.dmt.shared.types.DmtStringName;    // base type import

/**
 * The DmcTypeDmtStringNameSTATIC provides static access to functions used to manage values of type DmtStringName
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1455)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1392)
 */
public class DmcTypeDmtStringNameSTATIC implements DmcNameBuilderIF {
    
    static DmcTypeDmtStringNameSV 		nameHelper;
    static DmcTypeDmtStringNameSTATIC	instance;
    static String nameClass = "DmtStringName";
    
    protected DmcTypeDmtStringNameSTATIC(){
    	nameHelper = new DmcTypeDmtStringNameSV();
    }
    
    public DmtStringName typeCheck(Object value) throws DmcValueException {
    	return(nameHelper.typeCheck(value));
    }
    
    public DmtStringName cloneValue(DmtStringName value) throws DmcValueException {
    	return(nameHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, DmtStringName value) throws Exception {
    	nameHelper.serializeValue(dos, value);
    }
    
    public DmtStringName deserializeValue(DmcInputStreamIF dis) throws Exception {
     	return(nameHelper.deserializeValue(dis));
    }
    
	@Override
	public DmcTypeDmcObjectName<?> getNewNameHolder() {
		return(nameHelper.getNew());
	}

	@Override
	public String getNameClass() {
		return(nameClass);
	}
    
}

