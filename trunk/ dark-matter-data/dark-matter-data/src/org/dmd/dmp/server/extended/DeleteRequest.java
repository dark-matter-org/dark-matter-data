package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.DeleteRequestDMW;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;

public class DeleteRequest extends DeleteRequestDMW {

	/**
	 * Constructs a new DeleteRequest with the specified HTTP originating request.
	 * @param obj The request from a web client.
	 * @param req The request context.
	 */
	public DeleteRequest(DeleteRequestDMO obj, HttpServletRequest req){
		super(obj);
		request = req;
	}
	
	public DeleteRequest(DmcObjectNameIF on){
		super();
		try {
			setObjName(on);
		} catch (DmcValueException e) {
			throw(new IllegalStateException("Setting objName with DmcObjectNameIF shouldn't result in an exception.", e));
		}
	}
	
	public DeleteRequest(DmcAttribute<DmcObjectNameIF> on){
		super();
		setObjName(on);
	}
	
	public DeleteResponse getResponse() throws DmcValueException {
		DeleteResponse response = new DeleteResponse();
		
		fillStandard(response);
		
		return(response);
	}
	
	@Override
	public Response getErrorResponse() throws DmcValueException {
		DeleteResponse response = new DeleteResponse();
		fillError(response);
		return(response);
	}

	public DmcObjectNameIF getObjNameValue(){
		return(getObjName().getSV());
	}
}
