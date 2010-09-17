package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.LogoutRequestDMW;

public class LogoutRequest extends LogoutRequestDMW {

	public LogoutRequest(){
		super();
	}
	
	public LogoutResponse getResponse() throws DmcValueException {
		LogoutResponse response = new LogoutResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
