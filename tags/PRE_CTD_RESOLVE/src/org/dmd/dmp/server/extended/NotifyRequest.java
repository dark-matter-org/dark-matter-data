package org.dmd.dmp.server.extended;

import org.dmd.dmp.server.generated.dmw.NotifyRequestDMW;

public class NotifyRequest extends NotifyRequestDMW {

	public NotifyRequest(){
		super();
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
