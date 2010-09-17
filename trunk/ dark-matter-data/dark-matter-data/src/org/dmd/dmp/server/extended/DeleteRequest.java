package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.DeleteRequestDMW;

public class DeleteRequest extends DeleteRequestDMW {

	public DeleteRequest(){
		super();
	}
	
	public DeleteResponse getResponse() throws DmcValueException {
		DeleteResponse response = new DeleteResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
