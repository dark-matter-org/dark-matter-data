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

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeLoginRequestREFSTATIC provides static access to functions used to manage values of type LoginRequestREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1455)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1392)
 */
public class DmcTypeLoginRequestREFSTATIC {
    
    static DmcTypeLoginRequestREFSV instance;
    
    static public LoginRequestREF typeCheckSTATIC(Object value) throws DmcValueException {
    	   if (instance == null)
    		   instance = new DmcTypeLoginRequestREFSV();
    	   return(instance.typeCheck(value));
    }
    
    static public LoginRequestREF cloneValueSTATIC(LoginRequestREF value) throws DmcValueException {
    	if (instance == null)
    		instance = new DmcTypeLoginRequestREFSV();
    	return(instance.cloneValue(value));
    }
    
    static public void serializeValueSTATIC(DmcOutputStreamIF dos, LoginRequestREF value) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeLoginRequestREFSV();
    	instance.serializeValue(dos, value);
    }
    
    static public LoginRequestREF deserializeValueSTATIC(DmcInputStreamIF dis) throws Exception {
    	if (instance == null)
    		instance = new DmcTypeLoginRequestREFSV();
    	return(instance.deserializeValue(dis));
    }
    
}

