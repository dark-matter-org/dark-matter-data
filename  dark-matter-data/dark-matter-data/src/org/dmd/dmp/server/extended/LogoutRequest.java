package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.LogoutRequestDMW;
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;

public class LogoutRequest extends LogoutRequestDMW {

	public LogoutRequest(LogoutRequestDMO obj){
		super();
	}
	
	public LogoutResponse getResponse() throws DmcValueException {
		LogoutResponse response = new LogoutResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
