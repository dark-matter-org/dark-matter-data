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
import org.dmd.dmp.shared.generated.dmo.RequestDMO;

@SuppressWarnings("serial")
/**
 * The LogoutRequest allows you to disconnect from your current session.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:530)
 */
public class LogoutRequestDMO  extends RequestDMO  {

    public final static String _userName = "userName";
    public final static String _sessionID = "sessionID";

    public LogoutRequestDMO() {
        super("LogoutRequest");
    }

    protected LogoutRequestDMO(String oc) {
        super(oc);
    }

    public LogoutRequestDMO(LogoutRequestDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public LogoutRequestDMO getOneOfMe() {
        LogoutRequestDMO rc = new LogoutRequestDMO(this.getConstructionClassName());
        return(rc);
    }

    public String getUserName(){
        DmcTypeString attr = (DmcTypeString) get(_userName);
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
        DmcAttribute attr = get(_userName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_userName,attr);
    }

    /**
     * Removes the userName attribute value.
     */
    public void remUserName(){
         rem(_userName);
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

    /**
     * Removes the sessionID attribute value.
     */
    public void remSessionID(){
         rem(_sessionID);
    }




}
