package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.GetRequestDMW;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dms.ClassDefinition;

public class GetRequest extends GetRequestDMW {

	public GetRequest(GetRequestDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	public GetResponse getResponse() throws DmcValueException {
		GetResponse response = new GetResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
