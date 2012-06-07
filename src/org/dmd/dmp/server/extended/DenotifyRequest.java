//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

import org.dmd.dmp.server.generated.dmw.DenotifyRequestDMW;
import org.dmd.dmp.shared.generated.dmo.DenotifyRequestDMO;

public class DenotifyRequest extends DenotifyRequestDMW {

	public DenotifyRequest(){
		super();
	}
	
	public DenotifyRequest(DenotifyRequestDMO obj, HttpServletRequest req){
		super(obj);
		request = req;
	}
	
	public DenotifyResponse getResponse(){
		DenotifyResponse response = new DenotifyResponse();
		fillStandard(response);
		
		if (getTarget() != null)
			response.setTarget(getTarget());
		if (getScope() != null)
			response.setScope(getScope());
		if (getFilter() != null)
			response.setFilter(getFilter());
		
		return(response);
	}
	
	@Override
	public Response getErrorResponse(){
		DenotifyResponse response = new DenotifyResponse();
		fillError(response);
		return(response);
	}

}
