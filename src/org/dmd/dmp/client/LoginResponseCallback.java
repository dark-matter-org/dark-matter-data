package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class LoginResponseCallback extends ResponseCallback implements AsyncCallback<LoginResponseDMO>{
	
	public static final int ID = 1;
	
	public LoginResponseCallback(LoginRequestDMO req, ResponseHandlerIF h, CommsControllerIF cc, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		super(req,h,cc,ID,rpc,dmp);
	}

	@Override
	public void onFailure(Throwable caught) {
		rpcError(caught);
	}

	@Override
	public void onSuccess(LoginResponseDMO response) {
		handleResponse(response);
	}

}
