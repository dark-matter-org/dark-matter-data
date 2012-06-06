package org.dmd.mvw.client.mvwcomms.extended;

import java.util.TreeMap;
import java.util.logging.Logger;

import org.dmd.dmp.client.ActionResponseCallback;
import org.dmd.dmp.client.CentralDMPErrorHandlerIF;
import org.dmd.dmp.client.CentralEventHandlerIF;
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
import org.dmd.dmp.shared.generated.dmo.ActionResponseDMO;
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;
import org.dmd.dmp.shared.generated.dmo.PrimeEventChannelATI;
import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;
import org.dmd.dmp.shared.generated.enums.ScopeEnum;
import org.dmd.dms.extended.ActionTriggerInfo;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;
import org.dmd.mvw.client.mvwcomms.generated.mvw.controllers.CommsControllerBaseImpl;

import com.google.gwt.user.client.Timer;

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
	int 								requestID;

	// The session identifier from the server. This is sent in the login response
	// and will be set automatically on all requests.
	String								sessionID;
	
	// Some systems will assign a unique identifier that will be used to stamp
	// all incoming requests and, subsequently, all events that are generated from
	// those requests. This will allow us to determine if an event resulted from
	// something we did or a request from a different client.
	Integer								originatorID;
	
	// Handle to the centralized Dark Matter Protocol error handler if one has been set
	CentralDMPErrorHandlerIF			DMPErrorHandler;
	
	// Handle to the centralized GWT RPC error handler if one has been set
	CentralRPCErrorHandlerIF			RPCErrorHandler;
	
	// Handle to a centralized event handler that handles events that are not 
	// routed directly back to a known component
	CentralEventHandlerIF				centralEventHandler;
	
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
	TreeMap<Long, ResponseCallback>		eventHandlers;
	
	// The time at which the last request (of any type) was sent
	long								lastRequestTime;
	
	// Our event domain for use with the gwteventservice
	Domain								eventDomain;
	
	// All DMP messages have the trackingEnabled attribute that allows for tracking
	// of the message through the various components of the system. This is a global
	// flag that can be set so that all messages are tracked - this should be used
	// with caution, but it's useful for training/example purposes. Individual messages
	// can, of course, have their tracking turned on.
	boolean								trackAllMessages;
	
	// A flag to indicate if we want to see message tracing within the CommsController
	boolean								controllerTracing;
	
	// The timer used to delay attempts to prime the event channel
	Timer								primingTimer;
	
	// Indicates if the event channel has been primed
	boolean								eventChannelReady;
	
	// Set true when we've received the response that indicates that we've primed
	// the event channel
	boolean								havePrimingResponse;
	
	// Set to true when we're logged in
	private	boolean						loggedIn;
	
	Logger logger = Logger.getLogger("CommsController");

	public CommsController(MvwRunContextIF rc) {
		super(rc);
		requestID			= 1;
		sessionID			= null;
		originatorID		= null;
		DMPErrorHandler		= null;
		RPCErrorHandler		= null;
		centralEventHandler	= null;
		requests			= new TreeMap<Integer, ResponseCallback>();
		eventHandlers		= new TreeMap<Long, ResponseCallback>();
		lastRequestTime		= -1;
		trackAllMessages	= false;
		controllerTracing	= false;
		loggedIn			= false;
	}
	
	/**
	 * Reset to a known starting state.
	 */
	private void reset(){
		requestID			= 1;
		sessionID			= null;
		originatorID		= null;
		requests			= new TreeMap<Integer, ResponseCallback>();
		eventHandlers		= new TreeMap<Long, ResponseCallback>();
		eventDomain			= null;
		eventChannelReady	= false;
		havePrimingResponse	= false;
		loggedIn			= false;
		logger.fine("Reset complete");
	}
	
	/**
	 * Sets tracing of messages through the CommsController on/off. The GWT logging level must be
	 * set to FINEST in order for the logs to be seen.
	 * @param f set to true if you want to see tracing of message handling through the controller.
	 */
	public void setControllerTracing(boolean f){
		controllerTracing = f;
	}
	
	/**
	 * Sets a flag that will turn global message tracking on/off.
	 * @param f set to true if you want all message handling tracking
	 */
	public void setGlobalMessageTracking(boolean f){
		trackAllMessages = f;
	}
	
	public void setCentralEventHandler(CentralEventHandlerIF eh){
		if (centralEventHandler == null)
			centralEventHandler = eh;
		else
			throw(new IllegalStateException("You should only register one central event handler."));
	}
	
	/**
	 * @return the time at which the last request was sent.
	 */
	public long getLastRequestTime(){
		return(lastRequestTime);
	}
	
	/**
	 * Convenience method to set the tracking flag on a request.
	 * @param request the request.
	 */
	void setTracking(RequestDMO request){
		if (trackAllMessages)
			request.setTrackingEnabled(true);
	}
	
	/**
	 * @return true if we've gone through the login process.
	 */
	public boolean isLoggedIn(){
		return(loggedIn);
	}

	////////////////////////////////////////////////////////////////////////////////
	// LOGIN
	
	public LoginRequestDMO getLoginRequest(){
		LoginRequestDMO request = new LoginRequestDMO();
		setTracking(request);
		
		request.addRequestID(requestID++);
		
		return(request);
	}
	
	public void sendLoginRequest(LoginRequestDMO request, ResponseHandlerIF handler, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		if (sessionID == null){
			LoginResponseCallback cb = new LoginResponseCallback(request, handler, this, rpc, dmp);
			checkRequestID(request);
			requests.put(request.getNthRequestID(0), cb);
			dmpConnection.login((LoginRequestDMO)request, cb);
			lastRequestTime = System.currentTimeMillis();
		}
		else{
			throw(new IllegalStateException("Attempted to send login request even though we have a session ID."));
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// LOGOUT

	public LogoutRequestDMO getLogoutRequest(){
		LogoutRequestDMO request = new LogoutRequestDMO();
		setTracking(request);
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
			lastRequestTime = System.currentTimeMillis();
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	// GET

	public GetRequestDMO getGetRequest(){
		GetRequestDMO request = new GetRequestDMO();
		setTracking(request);
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
			lastRequestTime = System.currentTimeMillis();
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
			lastRequestTime = System.currentTimeMillis();
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// SET

	public SetRequestDMO getSetRequest(){
		SetRequestDMO request = new SetRequestDMO();
		setTracking(request);
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
			lastRequestTime = System.currentTimeMillis();
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// CREATE

	public CreateRequestDMO getCreateRequest(){
		CreateRequestDMO request = new CreateRequestDMO();
		setTracking(request);
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
			lastRequestTime = System.currentTimeMillis();
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// DELETE

	public DeleteRequestDMO getDeleteRequest(){
		DeleteRequestDMO request = new DeleteRequestDMO();
		setTracking(request);
		request.addRequestID(requestID++);
		request.setSessionID(sessionID);

		return(request);
	}
	
	/**
	 * Sends a delete request and associates the specified response handler. The request is stored in our
	 * outstanding requests collection based on its unique request ID. The callback associated with the
	 * request has a handle to the response handler and indicates how RPC and Dark Matter Protocol (DMP)
	 * errors are to be handled.
	 * @param request the request to be sent
	 * @param handler handle to entity that will handle the response
	 * @param rpc how RPC errors should be handled
	 * @param dmp hom DMP errors should be handled
	 */
	public void sendDeleteRequest(DeleteRequestDMO request, ResponseHandlerIF handler, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		if (sessionID == null){
			throw(new IllegalStateException("Attempted to send delete request but we're not logged in."));
		}
		else{
			DeleteResponseCallback cb = new DeleteResponseCallback(request, handler, this, rpc, dmp);
			checkRequestID(request);
			requests.put(request.getNthRequestID(0), cb);
			dmpConnection.delete(request, cb);
			lastRequestTime = System.currentTimeMillis();
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
		setTracking(request);
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
			lastRequestTime = System.currentTimeMillis();
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	// CommsControllerIF implementation

	@Override
	public void handleFailure(ResponseCallback cb, Throwable caught) {
		if (controllerTracing)
			logger.finest("A GWT RPC error occurred: " + caught.toString());
		
		switch(cb.rpcErrorOption()){
		case LOCAL:
			cb.getHandler().handleRPCFailure(caught, cb.getRequest());
			break;
		case CENTRAL:
			if (DMPErrorHandler == null)
				throw(new IllegalStateException("Central RPC error handling requested but no central handler is set."));
			RPCErrorHandler.handleRPCFailureCentrally(caught, cb.getRequest());
			break;
		case CENTRALANDLOCAL:
			if (DMPErrorHandler == null)
				throw(new IllegalStateException("Central RPC error handling requested but no central handler is set."));
			RPCErrorHandler.handleRPCFailureCentrally(caught, cb.getRequest());
			cb.getHandler().handleRPCFailure(caught, cb.getRequest());
			break;
		}		
	}


	@Override
	public void handleResponse(ResponseCallback cb, ResponseDMO response) {
		if (controllerTracing)
			logger.finest(response.toOIF());

		if (response.getResponseType() == ResponseTypeEnum.ERROR){
			switch(cb.dmpErrorOption()){
			case LOCAL:
				cb.getHandler().handleResponse(response);
				break;
			case CENTRAL:
				if (DMPErrorHandler == null)
					throw(new IllegalStateException("Central DMP error handling requested but no central handler is set."));
				DMPErrorHandler.handleErrorResponseCentrally(response, cb.getRequest());
				break;
			case CENTRALANDLOCAL:
				if (DMPErrorHandler == null)
					throw(new IllegalStateException("Central DMP error handling requested but no central handler is set."));
				DMPErrorHandler.handleErrorResponseCentrally(response, cb.getRequest());
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
				
				loggedIn = true;
				fireLoginCompleteEvent();
				
				// And now make sure that the event channel is up and working
				primeTheEventChannel();
			}
			else if (cb.getCallbackID() == LogoutResponseCallback.ID){
				if (eventDomain != null){
					eventService.removeListeners(eventDomain);
					eventDomain = null;
				}
				
				loggedIn = false;
				fireLogoutCompleteEvent();
				
				reset();
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
				if (controllerTracing)
					logger.finest("registerEventHandler() - registering event handler for listenerID: " + getResponse.getListenerID());
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
			
			if (controllerTracing)
				logger.finest("handleAsynchronousInfo() got event:\n\n" + event.toOIF() + "\n\n");

			if (event.getListenerID() == null){
				if (centralEventHandler != null)
					centralEventHandler.handleEventCentrally(event);
				
				logger.severe("handleAsynchronousInfo() - received event with no listenerID: " + event.toOIF());
				return;
			}
			
			ResponseCallback cb = eventHandlers.get(event.getListenerID());
			
			if (cb == null){
				logger.severe("handleAsynchronousInfo() - couldn't get callback for event with listenerID: " + event.getListenerID());
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
			
			if (controllerTracing)
				logger.finest("handleAsynchronousInfo() - got response:\n\n" + response.toOIF() + "\n\n");

			ResponseCallback cb = requests.get(response.getNthRequestID(0));

			if (cb == null){
				logger.severe("handleAsynchronousInfo() - couldn't get callback for response: " + response.toOIF());
			}
			else{
				if (cb.getCallbackID() == GetResponseCallback.ID)
					registerEventHandler(cb, (GetResponseDMO) response);					
				
				cb.getHandler().handleResponse(response);
				if (response.isLastResponse()){
					if (controllerTracing)
						logger.finest("handleAsynchronousInfo() is last response...");

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
	
	///////////////////////////////////////////////////////////////////////////
	// Event channel priming
	
	/**
	 * The length of time that it takes for the gwteventservice to establish itself
	 * is nondeterministic and we have to be sure that it's up and running before
	 * we start relying on it to send back asynchronous message responses and events.
	 * The mechanism we use is to send an ActionRequest to the server every half second
	 * until we actually receive the response via the gwteventservice. We can distinguish
	 * these responses because they will be marked as being the last response for one
	 * of our action requests.
	 * <p/>
	 * The server side of this is handled in the SessionRI class. When the action request
	 * is received, it send the synchronous response immediately and sends the asynchronous
	 * response 300ms later.
	 */
	void primeTheEventChannel(){
		eventChannelReady 	= false;
		havePrimingResponse	= false;
		primingTimer = new Timer(){

			@Override
			public void run() {
				if (havePrimingResponse){
					if (controllerTracing)
						logger.finest("Having event channel priming response - cancelling timer.");
					
					primingTimer.cancel();
				}
				else{
					ActionRequestDMO request = getPrimeEventChannelRequest(new PrimeEventChannelATI());
					sendPrimeEventChannelRequest(request);
					
					if (controllerTracing)
						logger.finest("Event channel priming request sent...");
				}
				
			}
		};
		primingTimer.scheduleRepeating(500);
	}

	@Override
	protected void handlePrimeEventChannelResponseError(ActionResponseDMO response) {
		logger.severe("An error occurred while priming the event channel:\n\n" + response.toOIF());
		
		// We set this to true to cancel the priming process
		havePrimingResponse = true;
		
		// How the application handles this is up to the application
		fireCommsSessionFailed(response.getResponseText());
	}

	@Override
	protected void handlePrimeEventChannelResponse(ActionResponseDMO response) {
		if (controllerTracing)
			logger.finest("Event channel priming response:\n\n" + response.toOIF());
		
		if (response.isLastResponse()){
			logger.finest("Event channel is operational...");

			// The last response is always sent on the event channel, so we're 
			// good to go
			havePrimingResponse = true;
			eventChannelReady	= true;
			fireCommsSessionReady();
		}
		
	}
	
	@Override
    protected ActionRequestDMO getPrimeEventChannelRequest(ActionTriggerInfo ati){
        ActionRequestDMO request = this.getActionRequest(ati);
        request.setHandlerID(0);
        request.setNotifyOriginator(true);
        return(request);
    }
	
    @Override
    protected void sendPrimeEventChannelRequest(ActionRequestDMO request){
        this.sendActionRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    /**
     * Something has gone wrong from which the application can't recover, so all bets are off.
     * This can happen in the case of RPC errors or when a logout fails and the application
     * just wants to reset things to a known state.
     */
	@Override
	protected void onForceCommsReset() {
		reset();
	}


}
