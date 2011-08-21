package org.dmd.dmp.server.servlet.dmpservletri;

import java.io.File;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.client.DMPService;
import org.dmd.dmp.server.extended.ActionRequest;
import org.dmd.dmp.server.extended.CreateRequest;
import org.dmd.dmp.server.extended.DeleteRequest;
import org.dmd.dmp.server.extended.GetRequest;
import org.dmd.dmp.server.extended.LoginRequest;
import org.dmd.dmp.server.extended.LogoutRequest;
import org.dmd.dmp.server.extended.NotifyRequest;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.servlet.base.PluginManager;
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;
import org.dmd.dmp.shared.generated.dmo.ActionResponseDMO;
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dmp.shared.generated.dmo.CreateResponseDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;
import org.dmd.dmp.shared.generated.dmo.DenotifyRequestDMO;
import org.dmd.dmp.shared.generated.dmo.DenotifyResponseDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO;
import org.dmd.dmp.shared.generated.dmo.NotifyRequestDMO;
import org.dmd.dmp.shared.generated.dmo.NotifyResponseDMO;
import org.dmd.dmp.shared.generated.dmo.PreAuthRequestDMO;
import org.dmd.dmp.shared.generated.dmo.PreAuthResponseDMO;
import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

import de.novanic.eventservice.service.RemoteEventServiceServlet;

/**
 * The DMPServlet is a reference implementation of a servlet that implements
 * the Dark Matter Protocol Service.
 */
@SuppressWarnings("serial")
public class DMPServiceImpl extends RemoteEventServiceServlet implements DMPService {
	
	// The plugin manager will load the various plugins that implement the servlet
	// behaviour. 
	PluginManager	pluginManager;
		
	///////////////////////////////////////////////////////////////////////////////
	// GenericServlet
	
	@Override
	public void init(){
		try {
			pluginManager = new PluginManager(this);
			
			File here = new File(".");
			DebugInfo.debug("Running here: " + here.getAbsolutePath());
			
			pluginManager.loadPlugins("dmpServletPlugins.oif");
			pluginManager.start();
		} catch (ResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void destroy(){
		pluginManager.shutdown();
	}

	///////////////////////////////////////////////////////////////////////////////
	// DMPService
	
	@Override
	public ActionResponseDMO action(ActionRequestDMO actionRequest) {
		ActionRequest request = new ActionRequest(actionRequest, getThreadLocalRequest());
		return null;
	}

	@Override
	public CreateResponseDMO create(CreateRequestDMO createRequest) {
		CreateRequest request = new CreateRequest(createRequest, getThreadLocalRequest());
		return null;
	}

	@Override
	public DeleteResponseDMO delete(DeleteRequestDMO deleteRequest) {
		DeleteRequest request = new DeleteRequest(deleteRequest, getThreadLocalRequest());
		return null;
	}

	@Override
	public GetResponseDMO get(GetRequestDMO getRequest) {
		GetRequest request = new GetRequest(getRequest, getThreadLocalRequest());
		
		DebugInfo.debug("Got get request.\n\n" + request.toOIF());
		
		try {
			if (pluginManager.getSecurityManager().validateSession(request) == null){
				
			}
			else{
				
			}
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public LoginResponseDMO login(LoginRequestDMO loginRequest) {
		LoginRequest request = new LoginRequest(loginRequest, getThreadLocalRequest());
		
		DebugInfo.debug("Got login request.\n\n" + loginRequest.toOIF());
		
		return(pluginManager.getSecurityManager().login(request).getDMO());
	}

	@Override
	public LogoutResponseDMO logout(LogoutRequestDMO logoutRequest) {
		LogoutRequest request = new LogoutRequest(logoutRequest, getThreadLocalRequest());
		return null;
	}

	@Override
	public NotifyResponseDMO notify(NotifyRequestDMO notifyRequest) {
		NotifyRequest request = new NotifyRequest(notifyRequest, getThreadLocalRequest());
		return null;
	}

	@Override
	public SetResponseDMO set(SetRequestDMO setRequest) {
		SetRequest request = new SetRequest(setRequest, getThreadLocalRequest());
		return null;
	}

	@Override
	public DenotifyResponseDMO denotify(DenotifyRequestDMO notifyRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseDMO otherRequest(RequestDMO request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreAuthResponseDMO preauth(PreAuthRequestDMO request) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
