package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class GetResponseCallback extends ResponseCallback implements AsyncCallback<GetResponseDMO>{
	
	public static final int ID = 3;
	
	public GetResponseCallback(GetRequestDMO req, ResponseHandlerIF h, CommsControllerIF cc, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		super(req,h,cc,ID,rpc,dmp);
	}

	public GetResponseCallback(GetRequestDMO req, ResponseHandlerIF h, EventHandlerIF eh, CommsControllerIF cc, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		super(req,h,eh,cc,ID,rpc,dmp);
	}

	@Override
	public void onFailure(Throwable caught) {
		rpcError(caught);
	}

	@Override
	public void onSuccess(GetResponseDMO response) {
		handleResponse(response);
	}

}
