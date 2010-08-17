package org.dmd.dmp.generated.dmo;

import org.dmd.dmc.types.DmcTypeString;

import org.dmd.dmp.generated.dmo.ResponseDMO;

@SuppressWarnings("serial")
/**
 * The LogoutResponse will indicate that you have successfully terminated
 * your current session.
 * 
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:179)
 */
public class LogoutResponseDMO  extends ResponseDMO  {

    public final static String _sessionID = "sessionID";

    public LogoutResponseDMO() {
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
    public void setSessionID(Object value){
        try{
            set(_sessionID, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }




}
