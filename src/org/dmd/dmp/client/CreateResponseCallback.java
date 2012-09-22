package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dmp.shared.generated.dmo.CreateResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class CreateResponseCallback extends ResponseCallback implements AsyncCallback<CreateResponseDMO>{
	
	public static final int ID = 5;
	
	public CreateResponseCallback(CreateRequestDMO req, ResponseHandlerIF h, CommsControllerIF cc, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		super(req,h,cc,ID,rpc,dmp);
	}

	@Override
	public void onFailure(Throwable caught) {
		rpcError(caught);
	}

	@Override
	public void onSuccess(CreateResponseDMO response) {
		handleResponse(response);
	}

}
