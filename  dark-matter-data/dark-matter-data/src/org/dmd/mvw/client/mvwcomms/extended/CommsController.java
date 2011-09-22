package org.dmd.mvw.client.mvwcomms.extended;

import java.util.TreeMap;

import org.dmd.dmp.client.ActionResponseCallback;
import org.dmd.dmp.client.CentralDMPErrorHandlerIF;
import org.dmd.dmp.client.CentralRPCErrorHandlerIF;
import org.dmd.dmp.client.CommsControllerIF;
import org.dmd.dmp.client.CreateResponseCallback;
import org.dmd.dmp.client.DeleteResponseCallback;
import org.dmd.dmp.client.ErrorOptionsEnum;
import org.dmd.dmp.client.EventHandlerIF;
import org.dmd.dmp.client.GetResponseCallback;
import org.dmd.dmp.client.LoginResponseCallback;
import org.dmd.dmp.client.LogoutResponseCallback;
import org.dmd.dmp.client.ResponseCallback;
import org.dmd.dmp.client.ResponseHandlerIF;
import org.dmd.dmp.client.SetResponseCallback;
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;
import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;
import org.dmd.dmp.shared.generated.enums.ScopeEnum;
import org.dmd.dms.extended.ActionTriggerInfo;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;
import org.dmd.mvw.client.mvwcomms.generated.mvw.controllers.CommsControllerBaseImpl;

import de.novanic.eventservice.client.event.Event;
import de.novanic.eventservice.client.event.domain.Domain;
import de.novanic.eventservice.client.event.domain.DomainFactory;
import de.novanic.eventservice.client.event.listener.RemoteEventListener;

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
	
	// Some systems will assign a unique identifier that will be used to stamp
	// all incoming requests and, subsequently, all events that are generated from
	// those requests. This will allow us to determine if an event resulted from
	// something we did or a request from a different client.
	Integer						originatorID;
	
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
	
	// When we send a GetRequest with registerForEvents, we will receive a GetResponse that
	// has a unique listenerID. When we receive event notifications, we'll forward those events
	// back to the component that made the original GetRequest.
	// Key: listenerID
	TreeMap<Long, ResponseCallback>	eventHandlers;
	
	// Our event domain for use with the gwteventservice
	Domain						eventDomain;
	
	public CommsController(MvwRunContextIF rc) {
		super(rc);
		requestID			= 1;
		sessionID			= null;
		originatorID		= null;
		DMPErrorHandler		= null;
		RPCErrorHandler		= null;
		requests			= new TreeMap<Integer, ResponseCallback>();
		eventHandlers		= new TreeMap<Long, ResponseCallback>();
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
			checkRequestID(request);
			requests.put(request.getNthRequestID(0), cb);
			dmpConnection.login((LoginRequestDMO)request, cb);
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
			checkRequestID(request);
			requests.put(request.getNthRequestID(0), cb);
			dmpConnection.logout(request, cb);
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
			checkRequestID(request);
			requests.put(request.getNthRequestID(0), cb);
			dmpConnection.get(request, cb);
		}
	}
	
	public void sendGetRequest(GetRequestDMO request, ResponseHandlerIF handler, EventHandlerIF eh, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		if (sessionID == null){
			throw(new IllegalStateException("Attempted to send get request but we're not logged in."));
		}
		else{
			GetResponseCallback cb = new GetResponseCallback(request, handler, eh, this, rpc, dmp);
			checkRequestID(request);
			requests.put(request.getNthRequestID(0), cb);
			dmpConnection.get(request, cb);
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
			checkRequestID(request);
			requests.put(request.getNthRequestID(0), cb);
			dmpConnection.set(request, cb);
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
			checkRequestID(request);
			requests.put(request.getNthRequestID(0), cb);
			dmpConnection.create(request, cb);
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
			checkRequestID(request);
			requests.put(request.getNthRequestID(0), cb);
			dmpConnection.delete(request, cb);
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
			checkRequestID(request);
			requests.put(request.getNthRequestID(0), cb);
			dmpConnection.action(request, cb);
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
				// We've logged in successfully - now establish our event channel. Each client
				// gets its own event channel, which is named based on its session identifier.
				LoginResponseDMO lr = (LoginResponseDMO) response;
				eventDomain = DomainFactory.getDomain(lr.getSessionID());
				
				// Hang on to the session identifier
				sessionID = lr.getSessionID();
				originatorID = lr.getOriginatorID();
			
				eventService.addListener(eventDomain, new RemoteEventListener() {
			        public void apply(Event anEvent) {
			        	handleAsynchronousInfo(anEvent);
			        }
			    });
				
				fireLoginCompleteEvent();
			}
			else if (cb.getCallbackID() == LogoutResponseCallback.ID){
				if (eventDomain != null){
					eventService.removeListeners(eventDomain);
					eventDomain = null;
				}
				
				fireLogoutCompleteEvent();
				
				requestID			= 1;
				sessionID			= null;
				originatorID		= null;
				requests			= new TreeMap<Integer, ResponseCallback>();
				eventHandlers		= new TreeMap<Long, ResponseCallback>();
			}
			else if (cb.getCallbackID() == GetResponseCallback.ID)
				registerEventHandler(cb, (GetResponseDMO) response);
			
			cb.getHandler().handleResponse(response);
		}
		else{
			cb.getHandler().handleResponse(response);
		}
	}
	
	/**
	 * Checks to see if the callback has an event handler and thens verifies that we've registered
	 * the event handler with the listenerID.
	 * @param cb
	 * @param getResponse
	 */
	void registerEventHandler(ResponseCallback cb, GetResponseDMO getResponse){
		if (cb.getEventHandler() == null)
			return;
		
		if (getResponse.getListenerID() != null){
			if (eventHandlers.get(getResponse.getListenerID()) == null){
				System.out.println("CommsController.registerEventHandler: registering event handler for listenerID: " + getResponse.getListenerID());
				eventHandlers.put(getResponse.getListenerID(), cb);
			}
		}
	}

	/**
	 * Here we handle asynchronous information coming from the server. This may be a DMPEvent or 
	 * a Response. 
	 * @param event
	 */
	void handleAsynchronousInfo(Object async){
		if (async instanceof DMPEventDMO){
			DMPEventDMO event = (DMPEventDMO) async;
			System.out.println("CommsController.handleAsynchronousInfo got event:\n\n" + event.toOIF() + "\n\n");
			
			ResponseCallback cb = eventHandlers.get(event.getListenerID());
			
			if (cb == null){
				System.out.println("CommsController.handleAsynchronousInfo couldn't get callback for event with listenerID: " + event.getListenerID());
			}
			else{
				// Set the handleID on the event so that the callback will know how to route the event
				event.setHandlerID(cb.getRequest().getHandlerID());
				
				if ( (originatorID != null) && (event.getOriginatorID() != null)){
					if (originatorID == event.getOriginatorID())
						event.setMyOwnEvent(true);
				}
				
				cb.getEventHandler().handleEvent(event);
			}
		}
		else if (async instanceof ResponseDMO){
			ResponseDMO response = (ResponseDMO) async;
			System.out.println("CommsController.handleAsynchronousInfo got response:\n\n" + response.toOIF() + "\n\n");
			
			ResponseCallback cb = requests.get(response.getNthRequestID(0));

			if (cb == null){
				System.out.println("CommsController.handleAsynchronousInfo couldn't get callback");
			}
			else{
				if (cb.getCallbackID() == GetResponseCallback.ID)
					registerEventHandler(cb, (GetResponseDMO) response);					
				
				cb.getHandler().handleResponse(response);
				if (response.isLastResponse()){
					System.out.println("CommsController.handleAsynchronousInfo is last response...");
					requests.remove(response.getNthRequestID(0));
				}
			}
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

	/**
	 * A convenience method to check whether the request has a requestID. If not,
	 * we throw an exception. All requests should be constructed using the autogenerated
	 * methods that automatically fill in the requestID with a unique value.
	 * @param request
	 */
	void checkRequestID(RequestDMO request){
		if (request.getNthRequestID(0) == null)
			throw(new IllegalStateException("This request has no requestID value; you should use the getNewXXXRequest() method to construct requests that are sent via the MVW CommsController\n" + request.toOIF() ));
	}
}
