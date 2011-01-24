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
 * The LoginRequest allows you to connect to connect to something and pass
 * along credentials.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:530)
 */
public class LoginRequestDMO  extends RequestDMO  {

    public final static String _userName = "userName";
    public final static String _password = "password";

    public LoginRequestDMO() {
        super("LoginRequest");
    }

    protected LoginRequestDMO(String oc) {
        super(oc);
    }

    public LoginRequestDMO(LoginRequestDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public LoginRequestDMO getOneOfMe() {
        LoginRequestDMO rc = new LoginRequestDMO(this.getConstructionClassName());
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

    public String getPassword(){
        DmcTypeString attr = (DmcTypeString) get(_password);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets password to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setPassword(Object value) throws DmcValueException {
        DmcAttribute attr = get(_password);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_password,attr);
    }

    /**
     * Removes the password attribute value.
     */
    public void remPassword(){
         rem(_password);
    }




}
