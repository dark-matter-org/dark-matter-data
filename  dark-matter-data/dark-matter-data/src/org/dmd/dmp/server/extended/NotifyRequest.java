package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmp.server.generated.dmw.NotifyRequestDMW;
import org.dmd.dmp.shared.generated.dmo.NotifyRequestDMO;

public class NotifyRequest extends NotifyRequestDMW {

	public NotifyRequest(){
		super();
	}
	
	public NotifyRequest(NotifyRequestDMO obj, HttpServletRequest req){
		super(obj);
		request = req;
	}
	
	public NotifyResponse getResponse(){
		NotifyResponse response = new NotifyResponse();
		fillStandard(response);			
		return(response);
	}
	
	@Override
	public Response getErrorResponse(){
		NotifyResponse response = new NotifyResponse();
		fillError(response);
		return(response);
	}

}
