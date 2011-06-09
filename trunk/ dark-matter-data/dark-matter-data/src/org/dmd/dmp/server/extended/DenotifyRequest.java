package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmp.server.generated.dmw.DenotifyRequestDMW;
import org.dmd.dmp.shared.generated.dmo.DenotifyRequestDMO;

public class DenotifyRequest extends DenotifyRequestDMW {

	public DenotifyRequest(){
		super();
	}
	
	public DenotifyRequest(DenotifyRequestDMO obj, HttpServletRequest req){
		super(obj);
		request = req;
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
