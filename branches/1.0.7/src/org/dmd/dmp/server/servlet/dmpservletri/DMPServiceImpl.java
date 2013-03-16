//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmp.server.servlet.dmpservletri;

import java.io.File;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.client.DMPService;
import org.dmd.dmp.server.extended.ActionRequest;
import org.dmd.dmp.server.extended.ActionResponse;
import org.dmd.dmp.server.extended.CreateRequest;
import org.dmd.dmp.server.extended.CreateResponse;
import org.dmd.dmp.server.extended.DeleteRequest;
import org.dmd.dmp.server.extended.DeleteResponse;
import org.dmd.dmp.server.extended.DenotifyRequest;
import org.dmd.dmp.server.extended.GetRequest;
import org.dmd.dmp.server.extended.GetResponse;
import org.dmd.dmp.server.extended.LoginRequest;
import org.dmd.dmp.server.extended.LogoutRequest;
import org.dmd.dmp.server.extended.LogoutResponse;
import org.dmd.dmp.server.extended.NotifyRequest;
import org.dmd.dmp.server.extended.PreAuthRequest;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.extended.SetResponse;
import org.dmd.dmp.server.servlet.base.PluginManager;
import org.dmd.dmp.server.servlet.base.interfaces.SecurityManagerIF;
import org.dmd.dmp.server.servlet.extended.SessionRI;
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
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.novanic.eventservice.service.RemoteEventServiceServlet;

/**
 * The DMPServiceImpl is a reference implementation of a servlet that implements
 * the Dark Matter Protocol Service (DMPService). It is derived from the RemoteEventServiceServlet
 * that is provided by the GWTEventService project (http://code.google.com/p/gwteventservice/).
 * By deriving from this class, we get the ability to provide asynchronous responses
 * to Dark Matter Protocol (DMP) messages and to provide asynchronous event notification.
 * <p/>
 * This class is merely provided as an example of how you could make use of DMP in your
 * GWT web application; there is nothing stopping you from using Dark Matter Objects (DMOs)
 * without using the DMP mechanisms. However, there are significant benefits in using
 * these approaches.
 * <p/>
 * This class uses a simple PluginManager to dynamically load a set of plugins that provide
 * server-side behaviour. See that class for further details.
 */
@SuppressWarnings("serial")
public class DMPServiceImpl extends RemoteEventServiceServlet implements DMPService {
	
	// The plugin manager will load the various plugins that implement the servlet
	// behaviour. 
	PluginManager		pluginManager;
	
	// Convenience handle to the security manager
	SecurityManagerIF	securityManager;
		
    private Logger	logger = LoggerFactory.getLogger(getClass());

    ///////////////////////////////////////////////////////////////////////////////
	// GenericServlet
	
	@Override
	public void init(){
		try {
			pluginManager = new PluginManager(this);
			
			File here = new File(".");
			logger.debug("Running here: " + here.getAbsolutePath());
			
			// Load the plugin definition from file
			pluginManager.loadPlugins("dmpServletPlugins.oif");
			
			// Call the pre-init method on all plugins - this allows plugins to
			// load their required schemas and request that the cache maintain
			// indices of various objects
			pluginManager.preInit();
			
			// The plugins are initialized. The cache plugin will load the existing
			// persisted objects and then the other plugins can make use of persisted
			// data or make required additions to the cache.
			pluginManager.init();
			
			// The plugins are informed that we're starting - after this we'll be able
			// to service user requests.
			pluginManager.start();
			
			securityManager	= pluginManager.getSecurityManager();
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
		// The plugins are informed that we're shutting down. This allows for
		// graceful shutdown handling.
		pluginManager.shutdown();
	}

	///////////////////////////////////////////////////////////////////////////////
	// DMPService
	
	@Override
	public ActionResponseDMO action(ActionRequestDMO actionRequest) {
		// All requests are immediately wrapped for use on the server. This includes
		// associating the request with the originating HttpServletRequest.
		ActionRequest 	request 	= new ActionRequest(actionRequest, getThreadLocalRequest());
		ActionResponse	response 	= null;
		
		if (request.isTrackingEnabled())
			logger.trace("Received by DMP servlet:\n" + request.toOIF());
		
		try {
			response = (ActionResponse) pluginManager.getSecurityManager().validateSession(request);
			
			if (response == null){
				SessionRI session = pluginManager.getSecurityManager().getSession(request);

				response = session.handleActionRequest(request);
			}
		} catch (DmcValueException e) {
			response = request.getResponse();
			response.setResponseType(ResponseTypeEnum.ERROR);
			response.setResponseText(e.toString());
			
			e.printStackTrace();
		}
		
		return(response.getDMO());
	}

	@Override
	public CreateResponseDMO create(CreateRequestDMO createRequest) {
		// All requests are immediately wrapped for use on the server. This includes
		// associating the request with the originating HttpServletRequest.
		CreateRequest 	request		= new CreateRequest(createRequest, getThreadLocalRequest());
		CreateResponse	response 	= null;
		
		if (request.isTrackingEnabled())
			logger.trace("Received by DMP servlet:\n" + request.toOIF());
		
		try {
			response = (CreateResponse) pluginManager.getSecurityManager().validateSession(request);
			
			if (response == null){
				SessionRI session = pluginManager.getSecurityManager().getSession(request);

				response = session.handleCreateRequest(request);
			}
		} catch (DmcValueException e) {
			response = (CreateResponse) request.getErrorResponse();
			response.setResponseText(e.toString());
			
			e.printStackTrace();
		}		

		return(response.getDMO());
	}

	@Override
	public DeleteResponseDMO delete(DeleteRequestDMO deleteRequest) {
		// All requests are immediately wrapped for use on the server. This includes
		// associating the request with the originating HttpServletRequest.
		DeleteRequest 	request 	= new DeleteRequest(deleteRequest, getThreadLocalRequest());
		DeleteResponse	response 	= null;
		
		if (request.isTrackingEnabled())
			logger.trace("Received by DMP servlet:\n" + request.toOIF());

		try {
			response = (DeleteResponse) pluginManager.getSecurityManager().validateSession(request);
			
			if (response == null){
				SessionRI session = pluginManager.getSecurityManager().getSession(request);

				response = session.handleDeleteRequest(request);
			}
		} catch (DmcValueException e) {
			response = (DeleteResponse) request.getErrorResponse();
			response.setResponseText(e.toString());
			
			logger.error(e.toString());
		}		

		return(response.getDMO());
	}

	@Override
	public GetResponseDMO get(GetRequestDMO getRequest) {
		// All requests are immediately wrapped for use on the server. This includes
		// associating the request with the originating HttpServletRequest.
		GetRequest	request = new GetRequest(getRequest, getThreadLocalRequest());
		GetResponse response = null;
		
		// If tracking is enabled dump a trace log
		if (request.isTrackingEnabled())
			logger.trace("Received by DMP servlet:\n" + request.toOIF());
		
		try {
			// Ensure that the session is valid - if it isn't, an error reponse
			// will be returned.
			response = (GetResponse) securityManager.validateSession(request);
			if (response == null){
				// All activity takes place against the session
				SessionRI session = securityManager.getSession(request);
				response = session.handleGetRequest(request);
				
//				response = request.getResponse();
//				response.setLastResponse(true);
			}
		} catch (DmcValueException e) {
			response = (GetResponse) request.getErrorResponse();
			response.setResponseText(e.toString());
			logger.error(e.toString());
		} catch (Exception ex){
			logger.error(DebugInfo.extractTheStack(ex));
			response = (GetResponse) request.getErrorResponse();
			response.setResponseText(DebugInfo.extractTheStack(ex));
		}
		
		logger.trace("Sending single response to original get request");

		return(response.getDMO());
	}

	@Override
	public LoginResponseDMO login(LoginRequestDMO loginRequest) {
		// All requests are immediately wrapped for use on the server. This includes
		// associating the request with the originating HttpServletRequest.
		LoginRequest request = new LoginRequest(loginRequest, getThreadLocalRequest());
		
		if (request.isTrackingEnabled())
			logger.trace("Received by DMP servlet:\n" + request.toOIF());
		
		return(pluginManager.getSecurityManager().login(request).getDMO());
	}

	@Override
	public LogoutResponseDMO logout(LogoutRequestDMO logoutRequest) {
		// All requests are immediately wrapped for use on the server. This includes
		// associating the request with the originating HttpServletRequest.
		LogoutRequest request = new LogoutRequest(logoutRequest, getThreadLocalRequest());
		LogoutResponse response = null;
		
		if (request.isTrackingEnabled())
			logger.trace("Received by DMP servlet:\n" + request.toOIF());
		
		try {
			// Ensure that the session is valid - if it isn't, an error reponse
			// will be returned.
			response = (LogoutResponse) securityManager.validateSession(request);
			if (response == null){
				// All activity takes place against the session
//				SessionRI session = securityManager.getSession(request);
				response = securityManager.logout(request);
				
			}
		} catch (DmcValueException e) {
			response = (LogoutResponse) request.getErrorResponse();
			response.setResponseText(e.toString());
			logger.error(e.toString());
		} catch (Exception ex){
			logger.error(DebugInfo.extractTheStack(ex));
			response = (LogoutResponse) request.getErrorResponse();
			response.setResponseText(DebugInfo.extractTheStack(ex));
		}

		return(response.getDMO());
	}

	@Override
	public NotifyResponseDMO notify(NotifyRequestDMO notifyRequest) {
		// All requests are immediately wrapped for use on the server. This includes
		// associating the request with the originating HttpServletRequest.
		NotifyRequest request = new NotifyRequest(notifyRequest, getThreadLocalRequest());
		
		if (request.isTrackingEnabled())
			logger.trace("Received by DMP servlet:\n" + request.toOIF());

		return null;
	}

	@Override
	public SetResponseDMO set(SetRequestDMO setRequest) {
		// All requests are immediately wrapped for use on the server. This includes
		// associating the request with the originating HttpServletRequest.
		SetRequest request = new SetRequest(setRequest, getThreadLocalRequest());
		SetResponse response = null;
		
		if (request.isTrackingEnabled())
			logger.trace("Received by DMP servlet:\n" + request.toOIF());
		
		if (request.getModifyIsEmpty()){
			// There aren't any modifications in the request - that's an error
			response = (SetResponse) request.getErrorResponse();
			response.setResponseText("No modifications were found in the SetRequest");
		}
		else{

			try {
				response = (SetResponse) pluginManager.getSecurityManager().validateSession(request);
				
				if (response == null){
					SessionRI session = pluginManager.getSecurityManager().getSession(request);
	
					response = session.handleSetRequest(request);
				}
			} catch (DmcValueException e) {
				response = (SetResponse) request.getErrorResponse();
				response.setResponseText(e.toString());
				
				logger.error(e.toString());
			}	
		}
		return(response.getDMO());
	}

	@Override
	public DenotifyResponseDMO denotify(DenotifyRequestDMO notifyRequest) {
		// All requests are immediately wrapped for use on the server. This includes
		// associating the request with the originating HttpServletRequest.
		DenotifyRequest request = new DenotifyRequest(notifyRequest, getThreadLocalRequest());

		if (request.isTrackingEnabled())
			logger.trace("Received by DMP servlet:\n" + request.toOIF());

		return null;
	}

	@Override
	public ResponseDMO otherRequest(RequestDMO request) {
		// All requests are immediately wrapped for use on the server. This includes
		// associating the request with the originating HttpServletRequest.
		
		return null;
	}

	@Override
	public PreAuthResponseDMO preauth(PreAuthRequestDMO preAuthRequest) {
		// All requests are immediately wrapped for use on the server. This includes
		// associating the request with the originating HttpServletRequest.
		PreAuthRequest request = new PreAuthRequest(preAuthRequest, getThreadLocalRequest());
		
		if (request.isTrackingEnabled())
			logger.trace("Received by DMP servlet:\n" + request.toOIF());

		return null;
	}
	
	

}
