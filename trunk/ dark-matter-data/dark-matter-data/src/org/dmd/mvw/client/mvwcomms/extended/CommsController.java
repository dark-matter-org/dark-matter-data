package org.dmd.mvw.client.mvwcomms.extended;

import org.dmd.dmp.client.ActionResponseCallback;
import org.dmd.dmp.client.ActionResponseHandlerIF;
import org.dmd.dmp.client.CentralizedHandlerIF;
import org.dmd.dmp.client.CreateResponseCallback;
import org.dmd.dmp.client.CreateResponseHandlerIF;
import org.dmd.dmp.client.GetResponseCallback;
import org.dmd.dmp.client.GetResponseHandlerIF;
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;
import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dmp.shared.generated.enums.ScopeEnum;
import org.dmd.dms.extended.ActionTriggerInfo;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;
import org.dmd.mvw.client.mvwcomms.generated.mvw.controllers.CommsControllerBaseImpl;

/**
 * The CommsController provides standardized access to the Dark Matter Protocol connection
 * to the server.
 */
public class CommsController extends CommsControllerBaseImpl implements CentralizedHandlerIF {

	// Our global request identifier - this is incremented each time 
	// someone requests a new message
	int requestID;

	// The session identifier from the server. This is sent in the login response
	// and will be set automatically on all requests.
	String	sessionID;
	
	public CommsController(MvwRunContextIF rc) {
		super(rc);
	}

	public LoginRequestDMO getLoginRequest(){
		LoginRequestDMO request = new LoginRequestDMO();
		request.addRequestID(requestID++);
		
		return(request);
	}
	
	public LogoutRequestDMO getLogoutRequest(){
		LogoutRequestDMO request = new LogoutRequestDMO();
		request.addRequestID(requestID++);
		request.setSessionID(sessionID);
		
		return(request);
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
	
	public void sendGetRequest(GetRequestDMO request, GetResponseHandlerIF handler){
			dmpConnection.get(request, new GetResponseCallback(handler,this));
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// SET

	public SetRequestDMO getSetRequest(){
		SetRequestDMO request = new SetRequestDMO();
		request.addRequestID(requestID++);
		request.setSessionID(sessionID);
		return(request);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// CREATE

	public CreateRequestDMO getCreateRequest(){
		CreateRequestDMO request = new CreateRequestDMO();
		request.addRequestID(requestID++);
		request.setSessionID(sessionID);

		return(request);
	}
	
	public void sendCreateRequest(CreateRequestDMO request, CreateResponseHandlerIF handler){
		dmpConnection.create(request, new CreateResponseCallback(handler,this));
	}

	////////////////////////////////////////////////////////////////////////////////
	// DELETE

	public DeleteRequestDMO getDeleteRequest(){
		DeleteRequestDMO request = new DeleteRequestDMO();
		request.addRequestID(requestID++);
		request.setSessionID(sessionID);

		return(request);
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

	public void sendActionRequest(ActionRequestDMO request, ActionResponseHandlerIF handler){
		dmpConnection.action(request, new ActionResponseCallback(handler, this));
	}

	////////////////////////////////////////////////////////////////////////////////
	// CentralizedHandlerIF
	@Override
	public void requestComplete(RequestDMO request, ResponseDMO response) {
		if (response instanceof LoginResponseDMO){
			LoginResponseDMO lr = (LoginResponseDMO) response;
			if (lr.getSessionID() == null){
				throw new IllegalStateException("No session identifier returned in LoginResponse.");
			}
			else{
				sessionID = lr.getSessionID();
			}
		}
	}

	@Override
	public void requestFailed(Throwable caught, RequestDMO request) {
		// TODO Auto-generated method stub
		
	}

}
