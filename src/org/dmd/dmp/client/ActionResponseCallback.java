package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;
import org.dmd.dmp.shared.generated.dmo.ActionResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class ActionResponseCallback extends ResponseCallback implements AsyncCallback<ActionResponseDMO>{
	
	public static final int ID = 7;
	
	public ActionResponseCallback(ActionRequestDMO req, ResponseHandlerIF h, CommsControllerIF cc, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		super(req,h,cc,ID,rpc,dmp);
	}

	@Override
	public void onFailure(Throwable caught) {
		rpcError(caught);
	}

	@Override
	public void onSuccess(ActionResponseDMO response) {
		handleResponse(response);
	}

}
