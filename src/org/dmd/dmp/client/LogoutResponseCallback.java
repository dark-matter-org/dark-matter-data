package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class LogoutResponseCallback extends ResponseCallback implements AsyncCallback<LogoutResponseDMO>{
	
	public static final int ID = 2;
	
	public LogoutResponseCallback(LogoutRequestDMO req, ResponseHandlerIF h, CommsControllerIF cc, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		super(req,h,cc,ID,rpc,dmp);
	}

	@Override
	public void onFailure(Throwable caught) {
		rpcError(caught);
	}

	@Override
	public void onSuccess(LogoutResponseDMO response) {
		handleResponse(response);
	}

}
