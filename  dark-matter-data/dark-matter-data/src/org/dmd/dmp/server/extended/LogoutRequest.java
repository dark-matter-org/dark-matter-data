package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmp.server.generated.dmw.LogoutRequestDMW;
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;

public class LogoutRequest extends LogoutRequestDMW {

	public LogoutRequest(){
		super();
	}
	
	/**
	 * Constructs a new LogoutRequest with the specified HTTP originating request.
	 * @param obj The request from a web client.
	 * @param req The request context.
	 */
	public LogoutRequest(LogoutRequestDMO obj, HttpServletRequest req) {
		super(obj);
		request = req;
	}
	
	public LogoutResponse getResponse(){
		LogoutResponse response = new LogoutResponse();
		
		fillStandard(response);
		
		return(response);
	}
	
	@Override
	public Response getErrorResponse(){
		LogoutResponse response = new LogoutResponse();
		fillError(response);
		return(response);
	}

}