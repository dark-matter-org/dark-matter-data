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

import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;
import org.dmd.dmp.shared.generated.dmo.ActionResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The ActionResponseCallback class extends the standard AsynchCallback and adds hooks
 * for centralized request handling.
 */
public class ActionResponseCallback implements AsyncCallback<ActionResponseDMO> {
	
	// Where to send the response
	ActionResponseHandlerIF 	handler;
	
	// The original request
	ActionRequestDMO			request;
	
	// If a centralized handler has been specified, this will have a value.
	CentralizedHandlerIF	centralHandler;
	
	public ActionResponseCallback(ActionResponseHandlerIF h){
		handler = h;
	}

	public ActionResponseCallback(ActionResponseHandlerIF h, CentralizedHandlerIF ch){
		handler = h;
		centralHandler = ch;
	}

	@Override
	public void onFailure(Throwable caught) {
		if (centralHandler != null)
			centralHandler.requestFailed(caught, request);
		
		handler.handleActionFailure(caught, request);
	}

	@Override
	public void onSuccess(ActionResponseDMO response) {
		if (centralHandler != null)
			centralHandler.requestComplete(request, response);
		
		handler.handleActionResponse(response);
	}

}
