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
package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.RequestDMW;
import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;
import org.dmd.dms.ClassDefinition;

/**
 * The Request class is the base of all request messages. At this level we add
 * some additional hooks to provide access to session and user objects that
 * are generally useful when handling requests within the server.
 */
abstract public class Request extends RequestDMW {

	// The session info associated with the request - this is implementation specific
	Object	sessionInfo;
	
	// The user info associated with the request - this is implementation specific
	Object userInfo;
	
	protected Request(){
		super();
	}
	
	protected Request(RequestDMO obj, ClassDefinition cd) {
		super(obj,cd);
	}
	
	/**
	 * A convenience function to fill standard values in newly created response.
	 * @param response The response subclass.
	 * @throws DmcValueException
	 */
	protected void fillStandard(Response response) throws DmcValueException {
		response.setRequestID(getRequestID());
		response.setResponseType(ResponseTypeEnum.SUCCESS);
		if (getTimeMS() != null)
			response.setTimeMS(getTimeMS());
	}
	
	/**
	 * A convenience function to fill standard values in newly created response.
	 * @param response The response subclass.
	 * @throws DmcValueException
	 */
	protected void fillError(Response response) throws DmcValueException {
		response.setRequestID(getRequestID());
		response.setResponseType(ResponseTypeEnum.ERROR);
		if (getTimeMS() != null)
			response.setTimeMS(getTimeMS());
	}
	
	/**
	 * Derived classes must overload this method to return a new response of
	 * the appropriate type. This is a convenience method for creating basic
	 * error responses so that we don't have to concern ourselves with the
	 * exact type of request - we just want to fill in some error information
	 * and fire it back.
	 * @return A response with its response type set to ERROR.
	 * @throws DmcValueException 
	 */
	abstract public Response getErrorResponse() throws DmcValueException;

	public void setSessionInfo(Object s){
		sessionInfo = s;
	}
	
	public Object getUInfo(){
		return(sessionInfo);
	}

	public void setUserInfo(Object s){
		userInfo = s;
	}
	
	public Object getUserInfo(){
		return(userInfo);
	}
}
