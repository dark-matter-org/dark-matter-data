package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.LoginRequestDMW;

public class LoginRequest extends LoginRequestDMW {

	public LoginRequest(){
		super();
	}
	
	public LoginResponse getResponse() throws DmcValueException {
		LoginResponse response = new LoginResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
