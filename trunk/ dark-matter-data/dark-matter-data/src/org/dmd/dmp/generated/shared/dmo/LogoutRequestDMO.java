package org.dmd.dmp.generated.shared.dmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeString;

import org.dmd.dmp.generated.dmo.RequestDMO;

@SuppressWarnings("serial")
/**
 * The LogoutRequest allows you to disconnect from your current session.
 * 
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:182)
 */
public class LogoutRequestDMO  extends RequestDMO  {

    public final static String _userName = "userName";
    public final static String _sessionID = "sessionID";

    public LogoutRequestDMO() {
    }

    public String getUserName(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_userName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setUserName(Object value) throws DmcValueException {
        DmcAttribute attr = attributes.get(_userName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_userName,attr);
    }

    public String getSessionID(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_sessionID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setSessionID(Object value) throws DmcValueException {
        DmcAttribute attr = attributes.get(_sessionID);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_sessionID,attr);
    }




}
