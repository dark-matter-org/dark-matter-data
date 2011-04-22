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

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.ActionRequestDMW;
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;

public class ActionRequest extends ActionRequestDMW {

	public ActionRequest(){
		super();
	}
	
	/**
	 * Constructs a new ActionRequest with the specified HTTP originating request.
	 * @param obj The request from a web client.
	 * @param req The request context.
	 */
	public ActionRequest(ActionRequestDMO obj, HttpServletRequest req) {
		super(obj);
		request = req;
	}
	
	public ActionResponse getResponse() throws DmcValueException {
		ActionResponse response = new ActionResponse();
		
		fillStandard(response);
		response.setActionName(getActionName());
		
		return(response);
	}

	@Override
	public Response getErrorResponse(){
		ActionResponse response = new ActionResponse();
		fillError(response);
		return(response);
	}
	
}
