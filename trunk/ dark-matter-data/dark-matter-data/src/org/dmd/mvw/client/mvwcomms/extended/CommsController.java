package org.dmd.mvw.client.mvwcomms.extended;

import java.util.TreeMap;

import org.dmd.dmp.client.ActionResponseCallback;
import org.dmd.dmp.client.CentralDMPErrorHandlerIF;
import org.dmd.dmp.client.CentralRPCErrorHandlerIF;
import org.dmd.dmp.client.CommsControllerIF;
import org.dmd.dmp.client.CreateResponseCallback;
import org.dmd.dmp.client.DMPService;
import org.dmd.dmp.client.DMPServiceAsync;
import org.dmd.dmp.client.DeleteResponseCallback;
import org.dmd.dmp.client.ErrorOptionsEnum;
import org.dmd.dmp.client.GetResponseCallback;
import org.dmd.dmp.client.LoginResponseCallback;
import org.dmd.dmp.client.LogoutResponseCallback;
import org.dmd.dmp.client.ResponseCallback;
import org.dmd.dmp.client.ResponseHandlerIF;
import org.dmd.dmp.client.SetResponseCallback;
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;
import org.dmd.dmp.shared.generated.enums.ScopeEnum;
import org.dmd.dms.extended.ActionTriggerInfo;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;
import org.dmd.mvw.client.mvwcomms.generated.mvw.controllers.CommsControllerBaseImpl;

import com.google.gwt.core.client.GWT;

/**
 * The CommsController provides standardized access to the Dark Matter Protocol connection
 * to the server.
 */
public class CommsController extends CommsControllerBaseImpl implements CommsControllerIF {

	// Our global request identifier - this is incremented each time 
	// someone requests a new message
	int 						requestID;

	// The session identifier from the server. This is sent in the login response
	// and will be set automatically on all requests.
	String						sessionID;
	
	// Our handle to the server
	DMPServiceAsync				serverConnection;
	
	// Handle to the centralized Dark Matter Protocol error handler if one has been set
	CentralDMPErrorHandlerIF	DMPErrorHandler;
	
	// Handle to the centralized GWT RPC error handler if one has been set
	CentralRPCErrorHandlerIF	RPCErrorHandler;
	
	// Our currently outstanding requests. For most normal requests, they will be sent
	// and the last response will be sent back immediately and the request will be removed.
	// However, for long standing requests that may have multiple responses, the responses
	// will actually come back over the eventService. All events are examined to see if they
	// are events or responses; if they are responses, we will route them back to the
	// appropriate handler.
	// Key: requestID
	TreeMap<Integer, ResponseCallback>	requests;
	
	public CommsController(MvwRunContextIF rc) {
		super(rc);
		requestID			= 1;
		sessionID			= null;
		serverConnection	= GWT.create(DMPService.class);
		DMPErrorHandler		= null;
		RPCErrorHandler		= null;
		requests			= new TreeMap<Integer, ResponseCallback>();
	}
	

	////////////////////////////////////////////////////////////////////////////////
	// LOGIN
	
	public LoginRequestDMO getLoginRequest(){
		LoginRequestDMO request = new LoginRequestDMO();
		request.addRequestID(requestID++);
		
		return(request);
	}
	
	public void sendLoginRequest(LoginRequestDMO request, ResponseHandlerIF handler, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		if (sessionID == null){
			LoginResponseCallback cb = new LoginResponseCallback(request, handler, this, rpc, dmp);
			requests.put(request.getNthRequestID(0), cb);
			serverConnection.login((LoginRequestDMO)request, cb);
		}
		else{
			throw(new IllegalStateException("Attempted to send login request even though we have a session ID."));
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// LOGOUT

	public LogoutRequestDMO getLogoutRequest(){
		LogoutRequestDMO request = new LogoutRequestDMO();
		request.addRequestID(requestID++);
		request.setSessionID(sessionID);
		
		return(request);
	}
	
	public void sendLogoutRequest(LogoutRequestDMO request, ResponseHandlerIF handler, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		if (sessionID == null){
			throw(new IllegalStateException("Attempted to send logout request but we're not logged in."));
		}
		else{
			LogoutResponseCallback cb = new LogoutResponseCallback(request, handler, this, rpc, dmp);
			requests.put(request.getNthRequestID(0), cb);
			serverConnection.logout(request, cb);
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	// GET

	public GetRequestDMO getGetRequest(){
		GetRequestDMO request = new GetRequestDMO();
		request.addRequestID(requestID++);
		request.setSessionID(sessionID);
		request.setScope(ScopeEnum.BASE);
		
		return(request);
	}
	
	public void sendGetRequest(GetRequestDMO request, ResponseHandlerIF handler, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		if (sessionID == null){
			throw(new IllegalStateException("Attempted to send get request but we're not logged in."));
		}
		else{
			GetResponseCallback cb = new GetResponseCallback(request, handler, this, rpc, dmp);
			requests.put(request.getNthRequestID(0), cb);
			serverConnection.get(request, cb);
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// SET

	public SetRequestDMO getSetRequest(){
		SetRequestDMO request = new SetRequestDMO();
		request.addRequestID(requestID++);
		request.setSessionID(sessionID);
		return(request);
	}
	
	public void sendSetRequest(SetRequestDMO request, ResponseHandlerIF handler, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		if (sessionID == null){
			throw(new IllegalStateException("Attempted to send set request but we're not logged in."));
		}
		else{
			SetResponseCallback cb = new SetResponseCallback(request, handler, this, rpc, dmp);
			requests.put(request.getNthRequestID(0), cb);
			serverConnection.set(request, cb);
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// CREATE

	public CreateRequestDMO getCreateRequest(){
		CreateRequestDMO request = new CreateRequestDMO();
		request.addRequestID(requestID++);
		request.setSessionID(sessionID);

		return(request);
	}
	
	public void sendCreateRequest(CreateRequestDMO request, ResponseHandlerIF handler, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		if (sessionID == null){
			throw(new IllegalStateException("Attempted to send create request but we're not logged in."));
		}
		else{
			CreateResponseCallback cb = new CreateResponseCallback(request, handler, this, rpc, dmp);
			requests.put(request.getNthRequestID(0), cb);
			serverConnection.create(request, cb);
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// DELETE

	public DeleteRequestDMO getDeleteRequest(){
		DeleteRequestDMO request = new DeleteRequestDMO();
		request.addRequestID(requestID++);
		request.setSessionID(sessionID);

		return(request);
	}
	
	public void sendDeleteRequest(DeleteRequestDMO request, ResponseHandlerIF handler, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		if (sessionID == null){
			throw(new IllegalStateException("Attempted to send delete request but we're not logged in."));
		}
		else{
			DeleteResponseCallback cb = new DeleteResponseCallback(request, handler, this, rpc, dmp);
			requests.put(request.getNthRequestID(0), cb);
			serverConnection.delete(request, cb);
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// ACTION

	/**
	 * This method returns a new action request that has its request ID, session and 
	 * action name initialized. The action name is taken from the action trigger.
	 * The actionTrigger is also set on the ActionRequest
	 */
	public ActionRequestDMO getActionRequest(ActionTriggerInfo ati){
		ActionRequestDMO request = new ActionRequestDMO();
		request.addRequestID(requestID++);
		request.setSessionID(sessionID);
		request.setActionName(ati.getActionName());
		request.setActionTrigger(ati);

		return(request);
	}

	public void sendActionRequest(ActionRequestDMO request, ResponseHandlerIF handler, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		if (sessionID == null){
			throw(new IllegalStateException("Attempted to send action request but we're not logged in."));
		}
		else{
			ActionResponseCallback cb = new ActionResponseCallback(request, handler, this, rpc, dmp);
			requests.put(request.getNthRequestID(0), cb);
			serverConnection.action(request, cb);
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	// CommsControllerIF implementation

	@Override
	public void handleFailure(ResponseCallback cb, Throwable caught) {
		switch(cb.rpcErrorOption()){
		case LOCAL:
			cb.getHandler().handleRPCFailure(caught, cb.getRequest());
			break;
		case CENTRAL:
			if (DMPErrorHandler == null)
				throw(new IllegalStateException("Central RPC error handling requested but no central handler is set."));
			RPCErrorHandler.handleRPCFailure(caught, cb.getRequest());
			break;
		case CENTRALANDLOCAL:
			if (DMPErrorHandler == null)
				throw(new IllegalStateException("Central RPC error handling requested but no central handler is set."));
			RPCErrorHandler.handleRPCFailure(caught, cb.getRequest());
			cb.getHandler().handleRPCFailure(caught, cb.getRequest());
			break;
		}		
	}


	@Override
	public void handleResponse(ResponseCallback cb, ResponseDMO response) {
		if (response.getResponseType() == ResponseTypeEnum.ERROR){
			switch(cb.dmpErrorOption()){
			case LOCAL:
				cb.getHandler().handleResponse(response);
				break;
			case CENTRAL:
				if (DMPErrorHandler == null)
					throw(new IllegalStateException("Central DMP error handling requested but no central handler is set."));
				DMPErrorHandler.handleErrorResponse(response);
				break;
			case CENTRALANDLOCAL:
				if (DMPErrorHandler == null)
					throw(new IllegalStateException("Central DMP error handling requested but no central handler is set."));
				DMPErrorHandler.handleErrorResponse(response);
				cb.getHandler().handleResponse(response);
				break;
			}
		}
		else if (response.getResponseType() == ResponseTypeEnum.SUCCESS){
			if (cb.getCallbackID() == LoginResponseCallback.ID){
				// We've logged in successfully - now establish our event channel
				
			}
			else if (cb.getCallbackID() == LogoutResponseCallback.ID){
				
			}
			
			cb.getHandler().handleResponse(response);
		}
		else{
			cb.getHandler().handleResponse(response);
		}
	}


	@Override
	public void useCentralDMPErrorHandler(CentralDMPErrorHandlerIF handler) {
		DMPErrorHandler = handler;
	}


	@Override
	public void useCentralRPCErrorHandler(CentralRPCErrorHandlerIF handler) {
		RPCErrorHandler = handler;
	}


}
