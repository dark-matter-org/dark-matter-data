package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.NotifyRequestDMW;

public class NotifyRequest extends NotifyRequestDMW {

	public NotifyRequest(){
		super();
	}
	
	public NotifyResponse getResponse() throws DmcValueException {
		NotifyResponse response = new NotifyResponse();
		fillStandard(response);			
		return(response);
	}
	
	@Override
	public Response getErrorResponse() throws DmcValueException {
		NotifyResponse response = new NotifyResponse();
		fillError(response);
		return(response);
	}

}
