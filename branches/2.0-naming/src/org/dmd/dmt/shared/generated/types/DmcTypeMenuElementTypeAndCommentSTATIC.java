package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmt.shared.generated.types.MenuElementTypeAndComment;    // base type import

/**
 * The DmcTypeMenuElementTypeAndCommentSTATIC provides static access to functions used to manage values of type MenuElementTypeAndComment
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2137)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2052)
 */
public class DmcTypeMenuElementTypeAndCommentSTATIC {
    
    public static DmcTypeMenuElementTypeAndCommentSTATIC instance;
    static DmcTypeMenuElementTypeAndCommentSV typeHelper;
    
    static {
        instance = new DmcTypeMenuElementTypeAndCommentSTATIC();
    }
    
    protected DmcTypeMenuElementTypeAndCommentSTATIC() {
        typeHelper = new DmcTypeMenuElementTypeAndCommentSV();
    }
    
    public MenuElementTypeAndComment typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public MenuElementTypeAndComment cloneValue(MenuElementTypeAndComment value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, MenuElementTypeAndComment value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public MenuElementTypeAndComment deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

