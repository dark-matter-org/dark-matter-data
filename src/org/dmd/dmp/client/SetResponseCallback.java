package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class SetResponseCallback extends ResponseCallback implements AsyncCallback<SetResponseDMO>{
	
	public static final int ID = 4;
	
	public SetResponseCallback(SetRequestDMO req, ResponseHandlerIF h, CommsControllerIF cc, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		super(req,h,cc,ID,rpc,dmp);
	}

	@Override
	public void onFailure(Throwable caught) {
		rpcError(caught);
	}

	@Override
	public void onSuccess(SetResponseDMO response) {
		handleResponse(response);
	}

}
