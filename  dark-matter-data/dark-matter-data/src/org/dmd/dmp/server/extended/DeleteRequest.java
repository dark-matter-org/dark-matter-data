package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmc.DmcObjectName;
import org.dmd.dmp.server.generated.dmw.DeleteRequestDMW;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;

public class DeleteRequest extends DeleteRequestDMW {

	public DeleteRequest(){
		super();
	}
	
	/**
	 * Constructs a new DeleteRequest with the specified HTTP originating request.
	 * @param obj The request from a web client.
	 * @param req The request context.
	 */
	public DeleteRequest(DeleteRequestDMO obj, HttpServletRequest req){
		super(obj);
		request = req;
	}
	
	public DeleteRequest(DmcObjectName on){
		super();
		addTargets(on);
	}
	
	public DeleteResponse getResponse(){
		DeleteResponse response = new DeleteResponse();
		
		fillStandard(response);
		
		return(response);
	}
	
	@Override
	public Response getErrorResponse(){
		DeleteResponse response = new DeleteResponse();
		fillError(response);
		return(response);
	}

//	public DmcObjectName getTargetName(){
//		if (getTarget() == null)
//			return(null);
//		
//		return(getTarget().getName());
//	}
}
