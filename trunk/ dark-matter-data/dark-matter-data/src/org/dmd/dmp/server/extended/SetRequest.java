package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.SetRequestDMW;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;

public class SetRequest extends SetRequestDMW {

	/**
	 * Constructs a new SetRequest with the specified HTTP originating request.
	 * @param obj The request from a web client.
	 * @param req The request context.
	 */
	public SetRequest(SetRequestDMO obj, HttpServletRequest req) {
		super(obj);
		request = req;
	}
	
	public SetResponse getResponse() throws DmcValueException {
		SetResponse response = new SetResponse();
		
		fillStandard(response);
		
		return(response);
	}
	
	@Override
	public Response getErrorResponse() throws DmcValueException {
		SetResponse response = new SetResponse();
		fillError(response);
		return(response);
	}

}
