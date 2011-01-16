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
