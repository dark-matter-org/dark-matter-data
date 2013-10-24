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
package org.dmd.dmp.server.servlet.base.interfaces;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.extended.LoginRequest;
import org.dmd.dmp.server.extended.LoginResponse;
import org.dmd.dmp.server.extended.LogoutRequest;
import org.dmd.dmp.server.extended.LogoutResponse;
import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.Response;
import org.dmd.dmp.server.servlet.extended.SessionRI;
import org.dmd.util.exceptions.ResultException;

/**
 * The SecurityManagerIF interface defines an object that can perform
 * authentication of user connection attempts via the LoginRequest, can allow
 * for termination of a session via the LogoutRequest and can verify that
 * any other request is allowable for a given user.
 * <P>
 * The SecurityManager implementation is usually the manager of session information
 * associated with authenticated users as well.
 */
public interface SecurityManagerIF {
	
	/**
	 * This method should be overloaded to perform whatever authentication is
	 * required to determine that a user is allowed to connect.
	 * @param request The login request.
	 * @return A login response that indicates success or failure.
	 * @throws DmcValueException
	 * @throws ResultException 
	 */
//	public LoginResponse login(LoginRequest request) throws DmcValueException, ResultException;
	public LoginResponse login(LoginRequest request);
	
	/**
	 * Terminates the associated session with the server. Any subsequent transactions
	 * that use the related session identifier will be rejected.
	 * @param request
	 * @return a logout response.
	 */
	public LogoutResponse logout(LogoutRequest request);
	
	/**
	 * This method should be overloaded to perform validation of the session identifier
	 * associated with the request as well as any additional security checks required.
	 * For example, if security groups have been implemented and the associated user
	 * doesn't have sufficient privileges to perform an operation, the request should be
	 * denied.
	 * @param request the request to be checked.
	 * @return An error response if any problems are found and null if everything is okay.
	 * @throws DmcValueException 
	 */
	public Response validateSession(Request request) throws DmcValueException;
	
	/**
	 * @param request The request for which we require the session handle.
	 * @return the session object associated with a request.
	 */
	public SessionRI getSession(Request request);

}
