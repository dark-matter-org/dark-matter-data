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
import org.dmd.dmp.server.servlet.extended.SessionRI;
import org.dmd.dmp.server.servlet.generated.dmw.SessionFolderRIDMW;
import org.dmd.dmp.server.servlet.generated.dmw.UserFolderRIDMW;
import org.dmd.dmp.server.servlet.generated.dmw.UserRIDMW;
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The BasicSecurityPlugin provides basic security mechanisms for an example application.
 * It defines two users: user1 and user2 whose passwords are the same as the user name.
 */
public class BasicSecurityPlugin extends DmpServletPlugin implements SecurityManagerIF {
	
	HashMap<String,UserRIDMW>	users;
	
	HashMap<String,SessionRI>	sessions;

	public BasicSecurityPlugin(){
		super();
	}
	
	@Override
	public void init() throws ResultException, DmcValueException {
		users 		= new HashMap<String, UserRIDMW>();
		sessions	= new HashMap<String, SessionRI>();
		
		UserFolderRIDMW	uf = new UserFolderRIDMW();
		uf.setDotName(new DotName("uf"));
		cache.addObject(uf);
		
		UserRIDMW		user1 = new UserRIDMW();
		user1.setDotName(new DotName("uf.1"));
		user1.setUserName("user1");
		user1.setPassword("user1");
		cache.addObject(user1);
		users.put(user1.getUserName(), user1);
		
		UserRIDMW		user2 = new UserRIDMW();
		user2.setDotName(new DotName("uf.2"));
		user2.setUserName("user2");
		user2.setPassword("user2");
		cache.addObject(user2);
		users.put(user1.getUserName(), user1);
		
		SessionFolderRIDMW	sf = new SessionFolderRIDMW();
		sf.setDotName(new DotName("sf"));
		cache.addObject(sf);
		
	}

	@Override
	public LoginResponse login(LoginRequest request){
		LoginResponse response = request.getResponse();
		
		synchronized (sessions) {
			UserRIDMW user = users.get(request.getUserName());
			
			if (user == null){
				// Just indicate that there was an error, don't provide additional info
				response.setResponseType(ResponseTypeEnum.ERROR);
			}
			else{
				if (!user.getPassword().equals(request.getPassword()))
					response.setResponseType(ResponseTypeEnum.ERROR);
				else{
					SessionRI session = new SessionRI();
					session.setDotName(new DotName("sf." + request.getServletRequest().getSession().getId()));
					session.setSessionIDRI(request.getServletRequest().getSession().getId());
					session.setSessionHostRI(request.getServletRequest().getRemoteHost());
					session.setUserRefRI(user);
					
					// This will create a new GWT Event Service Domain that's named by the session identifier
					// The session will be used to forward events and asynchronous responses back to the client
					// via this mechanism.
					session.initializeEventChannel(servlet);
					
					sessions.put(session.getSessionIDRI(), session);
					
					response.setSessionID(session.getSessionIDRI());
					
					// TODO: proper addition of the entry to the cache
					try {
						cache.addObject(session);
					} catch (ResultException e) {
						DebugInfo.debug(e.toString());
					}
				}
			}
		}
		
		return response;
	}

	@Override
	public LogoutResponse logout(LogoutRequest request) {
		LogoutResponse response = request.getResponse();
		
		synchronized (sessions) {
			SessionRI session = sessions.get(request.getSessionID());
			if (session == null){
				response.setResponseType(ResponseTypeEnum.ERROR);
			}
			else{
				sessions.remove(session.getSessionIDRI());
				
				// TODO: remove it from the cache
			}
		}
		
		return response;
	}

	/**
	 * All requests sent to the servlet via the Dark Matter Protocol must be associated
	 * with a valid session; all DMP Requests should have the session identifier set.
	 * @param request the request whose session will be validated.
	 * @return null if the session is okay and an error response otherwise.
	 */
	@Override
	public Response validateSession(Request request) throws DmcValueException {
		Response rc = null;
		
		synchronized (sessions) {
			SessionRI session = sessions.get(request.getSessionID());
			
			if (request instanceof LoginRequest){
				if (session != null){
					rc = request.getErrorResponse();
					rc.setResponseText("User already logged in.");
				}
			}
			else{
				if (session == null){
					rc = request.getErrorResponse();
					rc.setResponseText("No existing session");
				}
			}
			
		}
		
		return(rc);
	}
	
	
}
