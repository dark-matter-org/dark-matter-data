package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.GetRequestDMW;

public class GetRequest extends GetRequestDMW {

	public GetRequest(){
		super();
	}
	
	public GetResponse getResponse() throws DmcValueException {
		GetResponse response = new GetResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
