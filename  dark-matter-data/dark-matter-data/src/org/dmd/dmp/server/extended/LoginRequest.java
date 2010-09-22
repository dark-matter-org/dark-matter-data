package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.LoginRequestDMW;
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;
import org.dmd.dms.ClassDefinition;

public class LoginRequest extends LoginRequestDMW {

	public LoginRequest(LoginRequestDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	public LoginResponse getResponse() throws DmcValueException {
		LoginResponse response = new LoginResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
