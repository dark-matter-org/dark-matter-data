//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dmp.server.servlet.security;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.extended.LoginRequest;
import org.dmd.dmp.server.extended.LoginResponse;
import org.dmd.dmp.server.extended.LogoutRequest;
import org.dmd.dmp.server.extended.LogoutResponse;
import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.Response;
import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.dmp.server.servlet.base.interfaces.SecurityManagerIF;
import org.dmd.dmp.server.servlet.extended.SessionRI;
import org.dmd.util.exceptions.ResultException;

/**
 * This is an example implementation of a plugin that implements the role of SecurityManager.
 * When initialized, it creates the UserFolderRI and a single UserRI as follows:
 * 
 * UserFolderRI
 * dotName uf
 * 
 * UserRI
 * dotName  uf.1
 * userName example
 * password example
 * 
 */
public class SecurityPlugin extends DmpServletPlugin implements SecurityManagerIF {
	
	public static String PLUGINNAME = "security";
	
	public SecurityPlugin(){
		
	}
	
	@Override
	protected void init() throws ResultException {
		
	}

	@Override
	public LoginResponse login(LoginRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LogoutResponse logout(LogoutRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response validateSession(Request request) throws DmcValueException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionRI getSession(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

}
