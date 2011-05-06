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
package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dmp.shared.generated.dmo.CreateResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The CreateResponseCallback class extends the standard AsynchCallback and adds hooks
 * for centralized request handling.
 */
public class CreateResponseCallback implements AsyncCallback<CreateResponseDMO> {
	
	// Where to send the response
	CreateResponseHandlerIF 	handler;
	
	// The original request
	CreateRequestDMO			request;
	
	// If a centralized handler has been specified, this will have a value.
	CentralizedHandlerIF	centralHandler;
	
	public CreateResponseCallback(CreateResponseHandlerIF h){
		handler = h;
	}

	public CreateResponseCallback(CreateResponseHandlerIF h, CentralizedHandlerIF ch){
		handler = h;
		centralHandler = ch;
	}

	@Override
	public void onFailure(Throwable caught) {
		if (centralHandler != null)
			centralHandler.requestFailed(caught, request);
		
		handler.handleCreateFailure(caught, request);
	}

	@Override
	public void onSuccess(CreateResponseDMO response) {
		if (centralHandler != null)
			centralHandler.requestComplete(request, response);
		
		handler.handleCreateResponse(response);
	}

}
