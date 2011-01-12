package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The GetResponseCallback class extends the standard AsynchCallback and adds hooks
 * for centralized request handling.
 */
public class GetResponseCallback implements AsyncCallback<GetResponseDMO> {
	
	// Where to send the response
	GetResponseHandlerIF 	handler;
	
	// The original request
	GetRequestDMO			request;
	
	// If a centralized handler has been specified, this will have a value.
	CentralizedHandlerIF	centralHandler;
	
	public GetResponseCallback(GetResponseHandlerIF h){
		handler = h;
	}

	public GetResponseCallback(GetResponseHandlerIF h, CentralizedHandlerIF ch){
		handler = h;
		centralHandler = ch;
	}

	@Override
	public void onFailure(Throwable caught) {
		if (centralHandler != null)
			centralHandler.requestFailed(caught, request);
		
		handler.handleGetFailure(caught, request);
	}

	@Override
	public void onSuccess(GetResponseDMO response) {
		if (centralHandler != null)
			centralHandler.requestComplete(request, response);
		
		handler.handleGetResponse(response);
	}

}
