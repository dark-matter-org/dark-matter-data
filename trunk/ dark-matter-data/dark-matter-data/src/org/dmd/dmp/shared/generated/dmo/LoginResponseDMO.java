//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmp.shared.generated.dmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

@SuppressWarnings("serial")
/**
 * The LoginResponse is returned after a Login request is received. If the
 * login is successful, a session ID will be assigned and a request root will
 * be given. All subsequent requests must contain the session ID and all
 * requests will be checked to ensure that they pertain to objects at or
 * below the request root.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:440)
 */
public class LoginResponseDMO  extends ResponseDMO  {

    public final static String _sessionID = "sessionID";
    public final static String _requestRoot = "requestRoot";

    public LoginResponseDMO() {
        super("LoginResponse");
    }

    protected LoginResponseDMO(String oc) {
        super(oc);
    }

    public String getSessionID(){
        DmcTypeString attr = (DmcTypeString) get(_sessionID);
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
        DmcAttribute attr = get(_sessionID);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_sessionID,attr);
    }

    public String getRequestRoot(){
        DmcTypeString attr = (DmcTypeString) get(_requestRoot);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets requestRoot to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setRequestRoot(Object value) throws DmcValueException {
        DmcAttribute attr = get(_requestRoot);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_requestRoot,attr);
    }




}
