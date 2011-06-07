package org.dmd.dmp.server.servlet.base.plugins;

import java.util.HashMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DotName;
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
import org.dmd.dmp.server.servlet.generated.dmw.UserFolderRIDMW;
import org.dmd.dmp.server.servlet.generated.dmw.UserRIDMW;
import org.dmd.util.exceptions.ResultException;

/**
 * The BasicSecurityPlugin provides basic security mechanisms for an an example application.
 * It defines two users: user1 and user2 whose passwords are the same as the user name.
 */
public class BasicSecurityPlugin extends DmpServletPlugin implements SecurityManagerIF {
	
	HashMap<String,UserRIDMO>		users;
	
	HashMap<String,SessionRIDMO>	sessions;

	public BasicSecurityPlugin(){
		super();
	}
	
	@Override
	public void init() throws ResultException, DmcValueException {
		UserFolderRIDMW	uf = new UserFolderRIDMW();
		uf.setDotName(new DotName("uf"));
		getCache().addObject(uf);
		
		UserRIDMW		user1 = new UserRIDMW();
		user1.setDotName(new DotName("uf.1"));
		user1.setUserName("user1");
		user1.setPassword("user1");
		getCache().addObject(user1);
		
		UserRIDMW		user2 = new UserRIDMW();
		user2.setDotName(new DotName("uf.2"));
		user2.setUserName("user2");
		user2.setPassword("user2");
		getCache().addObject(user2);
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
