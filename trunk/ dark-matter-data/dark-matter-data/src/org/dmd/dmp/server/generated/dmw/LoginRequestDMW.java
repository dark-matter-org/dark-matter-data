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

import org.dmd.dmc.DmcValueException;
// import 2
import org.dmd.dmc.DmcObject;

import org.dmd.dmp.server.extended.Request;
// import 4
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;

public class LoginRequestDMW extends Request {

    private LoginRequestDMO mycore;

    public LoginRequestDMW() {
        super(new LoginRequestDMO());
        mycore = (LoginRequestDMO) core;
        mycore.setContainer(this);
    }

    protected LoginRequestDMW(DmcObject obj) {
        super(obj);
        mycore = (LoginRequestDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.LoginRequest>());
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

    public String getPassword(){
        return(mycore.getPassword());
    }

    /**
     * Sets password to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setPassword(Object value) throws DmcValueException {
        mycore.setPassword(value);
    }


}
