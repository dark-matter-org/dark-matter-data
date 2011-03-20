package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.LoginRequestDMW;
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;

public class LoginRequest extends LoginRequestDMW {

	/**
	 * Constructs a new LoginRequest with the specified HTTP originating request.
	 * @param obj The request from a web client.
	 * @param req The request context.
	 */
	public LoginRequest(LoginRequestDMO obj, HttpServletRequest req) {
		super(obj);
		request = req;
	}
	
	public LoginResponse getResponse() throws DmcValueException {
		LoginResponse response = new LoginResponse();
		
		fillStandard(response);
		
		return(response);
	}
	
	@Override
	public Response getErrorResponse() throws DmcValueException {
		LoginResponse response = new LoginResponse();
		fillError(response);
		return(response);
	}

}