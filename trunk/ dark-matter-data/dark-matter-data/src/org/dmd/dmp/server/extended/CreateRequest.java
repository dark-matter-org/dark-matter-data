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
import org.dmd.dmp.server.generated.dmw.CreateRequestDMW;
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;

public class CreateRequest extends CreateRequestDMW {
	
	/**
	 * Constructs a new CreateRequest with the specified HTTP originating request.
	 * @param obj The request from a web client.
	 * @param req The request context.
	 */
	public CreateRequest(CreateRequestDMO obj, HttpServletRequest req){
		super(obj);
		request = req;
	}
	
	public CreateResponse getResponse() throws DmcValueException {
		CreateResponse response = new CreateResponse();
		
		fillStandard(response);
		
		return(response);
	}

	@Override
	public Response getErrorResponse() throws DmcValueException {
		CreateResponse response = new CreateResponse();
		fillError(response);
		return(response);
	}

}
