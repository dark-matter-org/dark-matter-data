package org.dmd.dmp.generated.dmo;

import org.dmd.dmc.types.DmcTypeString;

import org.dmd.dmp.generated.dmo.ResponseDMO;

@SuppressWarnings("serial")
/**
 * The Login request allows you to connect to something and pass along
 * credentials. If the login is successful, a session ID will be assigned and
 *  a request root will be given. All subsequent requests must contain the
 * session ID and all requests will be checked to ensure that they pertain to
 * objects at or below the request root.
 * 
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:165)
 */
public class LoginResponseDMO  extends ResponseDMO  {
    public final static String _sessionID = "sessionID";
    public final static String _requestRoot = "requestRoot";


}
