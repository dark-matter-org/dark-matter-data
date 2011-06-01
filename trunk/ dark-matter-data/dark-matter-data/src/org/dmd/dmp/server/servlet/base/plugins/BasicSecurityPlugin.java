package org.dmd.dmp.server.servlet.base.plugins;

import java.util.HashMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.extended.LoginRequest;
import org.dmd.dmp.server.extended.LoginResponse;
import org.dmd.dmp.server.extended.LogoutRequest;
import org.dmd.dmp.server.extended.LogoutResponse;
import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.Response;
import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.dmp.server.servlet.base.interfaces.SecurityManagerIF;
import org.dmd.dmp.server.servlet.generated.dmo.SessionRIDMO;
import org.dmd.dmp.server.servlet.generated.dmo.UserRIDMO;
import org.dmd.util.exceptions.ResultException;

public class BasicSecurityPlugin extends DmpServletPlugin implements SecurityManagerIF {
	
	HashMap<String,UserRIDMO>		users;
	
	HashMap<String,SessionRIDMO>	sessions;

	public BasicSecurityPlugin(){
		super();
	}
	
	@Override
	public void init() throws ResultException {
		
	}

	@Override
	public LoginResponse login(LoginRequest request) throws DmcValueException,
			ResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LogoutResponse logout(LogoutRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response validateSession(Request request) throws DmcValueException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
