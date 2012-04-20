package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmp.server.generated.dmw.PreAuthRequestDMW;
import org.dmd.dmp.shared.generated.dmo.PreAuthRequestDMO;

public class PreAuthRequest extends PreAuthRequestDMW {

	public PreAuthRequest(){
		super();
	}
	
	public PreAuthRequest(PreAuthRequestDMO obj, HttpServletRequest req){
		super(obj);
		request = req;
	}
	
	public PreAuthResponse getResponse(){
		PreAuthResponse response = new PreAuthResponse();
		fillStandard(response);
		return(response);
	}
	
	@Override
	public Response getErrorResponse() {
		PreAuthResponse response = new PreAuthResponse();
		fillError(response);
		return(response);
	}

}
