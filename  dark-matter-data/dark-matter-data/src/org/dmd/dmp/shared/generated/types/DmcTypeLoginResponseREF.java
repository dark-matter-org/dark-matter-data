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
package org.dmd.dmp.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.IntegerName;

import org.dmd.dmp.shared.generated.types.LoginResponseREF;

import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;

/**
 * This is the generated DmcAttribute derivative for values of type LoginResponse
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:495)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeLoginResponseREF extends DmcTypeNamedObjectREF<LoginResponseREF, IntegerName> {

    public DmcTypeLoginResponseREF(){
    
    }

    public DmcTypeLoginResponseREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected LoginResponseREF getNewHelper(){
        return(new LoginResponseREF());
    }

    @Override
    protected IntegerName getNewName(){
        return(new IntegerName());
    }

    @Override
    protected String getDMOClassName(){
        return( LoginResponseDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof LoginResponseDMO)
            return(true);
        return(false);
    }

    @Override
    protected LoginResponseREF typeCheck(Object value) throws DmcValueException {
        LoginResponseREF rc = null;

        if (value instanceof LoginResponseREF)
            rc = (LoginResponseREF)value;
        else if (value instanceof LoginResponseDMO)
            rc = new LoginResponseREF((LoginResponseDMO)value);
        else if (value instanceof String)
            rc = new LoginResponseREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with LoginResponseREF, LoginResponseDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, LoginResponseREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public LoginResponseREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        LoginResponseREF rc = new LoginResponseREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public LoginResponseREF cloneValue(LoginResponseREF value){
        return(new LoginResponseREF(value));
    }



}
