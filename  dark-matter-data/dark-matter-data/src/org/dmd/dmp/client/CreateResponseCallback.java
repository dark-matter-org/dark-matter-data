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
