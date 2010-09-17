package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.GetRequestDMW;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;

public class GetRequest extends GetRequestDMW {

	public GetRequest(GetRequestDMO obj){
		super(obj);
	}
	
	public GetResponse getResponse() throws DmcValueException {
		GetResponse response = new GetResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
