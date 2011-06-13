package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class DeleteResponseCallback extends ResponseCallback implements AsyncCallback<DeleteResponseDMO>{
	
	public static final int ID = 6;
	
	public DeleteResponseCallback(DeleteRequestDMO req, ResponseHandlerIF h, CommsControllerIF cc, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		super(req,h,cc,ID,rpc,dmp);
	}

	@Override
	public void onFailure(Throwable caught) {
		rpcError(caught);
	}

	@Override
	public void onSuccess(DeleteResponseDMO response) {
		handleResponse(response);
	}

}
