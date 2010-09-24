package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.GetRequestDMW;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;

public class GetRequest extends GetRequestDMW {

	/**
	 * Constructs a new GetRequest with the specified HTTP originating request.
	 * @param obj The request from a web client.
	 * @param req The request context.
	 */
	public GetRequest(GetRequestDMO obj, HttpServletRequest req) {
		super(obj);
		request = req;
	}
	
	public GetResponse getResponse() throws DmcValueException {
		GetResponse response = new GetResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
