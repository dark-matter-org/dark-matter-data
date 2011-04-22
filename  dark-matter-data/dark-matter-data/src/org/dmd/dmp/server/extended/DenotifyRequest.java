package org.dmd.dmp.server.extended;

import org.dmd.dmp.server.generated.dmw.DenotifyRequestDMW;

public class DenotifyRequest extends DenotifyRequestDMW {

	public DenotifyRequest(){
		
	}
	
	public DenotifyResponse getResponse(){
		DenotifyResponse response = new DenotifyResponse();
		fillStandard(response);
		
		if (getTarget() != null)
			response.setTarget(getTarget());
		if (getScope() != null)
			response.setScope(getScope());
		if (getFilter() != null)
			response.setFilter(getFilter());
		
		return(response);
	}
	
	@Override
	public Response getErrorResponse(){
		DenotifyResponse response = new DenotifyResponse();
		fillError(response);
		return(response);
	}

}
