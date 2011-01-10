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
package org.dmd.dmp.server.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;


// import 8
import org.dmd.dmp.server.extended.Request;
// import 9
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;

abstract public class LogoutRequestDMW extends Request {

    private LogoutRequestDMO mycore;

    public LogoutRequestDMW() {
        super(new LogoutRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LogoutRequest);
        mycore = (LogoutRequestDMO) core;
        mycore.setContainer(this);
    }

    public LogoutRequestDMW(LogoutRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LogoutRequest);
        mycore = (LogoutRequestDMO) core;
        mycore.setContainer(this);
    }

    protected LogoutRequestDMW(LogoutRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (LogoutRequestDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.LogoutRequest>());
    }

    public String getUserName(){
        return(mycore.getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setUserName(Object value) throws DmcValueException {
        mycore.setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    public void remUserName(){
        mycore.remUserName();
    }

    public String getSessionID(){
        return(mycore.getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setSessionID(Object value) throws DmcValueException {
        mycore.setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    public void remSessionID(){
        mycore.remSessionID();
    }


}
