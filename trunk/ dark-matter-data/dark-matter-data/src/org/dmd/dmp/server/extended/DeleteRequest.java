package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.DeleteRequestDMW;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;
import org.dmd.dms.ClassDefinition;

public class DeleteRequest extends DeleteRequestDMW {

	public DeleteRequest(DeleteRequestDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	public DeleteResponse getResponse() throws DmcValueException {
		DeleteResponse response = new DeleteResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
