//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

/**
 * The ResponseCallback class provides a common base for asynchronous 
 * callback handlers that handle each type of Dark Matter Protocol message.
 * This mechanism funnels all responses back through a centralized communications
 * controller, that decides how to route the responses/errors.
 */
public class ResponseCallback {
	
	// Where to send the responses
	ResponseHandlerIF 		handler;
	
	EventHandlerIF			eventHandler;
	
	// The original request
	RequestDMO				request;
	
	// The comms controller that will handle our responses
	CommsControllerIF		commsController;
	
	// The request type identifier that's used to determine
	int						callbackID;
	
	ErrorOptionsEnum		RPC;
	
	ErrorOptionsEnum		DMP;
	
	protected ResponseCallback(RequestDMO req, ResponseHandlerIF h, CommsControllerIF cc, int cbid, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		request			= req;
		handler 		= h;
		eventHandler	= null;
		commsController	= cc;
		callbackID		= cbid;
		RPC				= rpc;
		DMP				= dmp;
	}
	
	protected ResponseCallback(RequestDMO req, ResponseHandlerIF h, EventHandlerIF eh, CommsControllerIF cc, int cbid, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		request			= req;
		handler 		= h;
		eventHandler	= eh;
		commsController	= cc;
		callbackID		= cbid;
		RPC				= rpc;
		DMP				= dmp;
	}
	
	public int getCallbackID(){
		return(callbackID);
	}
	
	protected void handleResponse(ResponseDMO response){
		commsController.handleResponse(this, response);
	}

	protected void rpcError(Throwable caught){
		commsController.handleFailure(this, caught);
	}
	
	public ResponseHandlerIF getHandler(){
		return(handler);
	}
	
	public EventHandlerIF getEventHandler(){
		return(eventHandler);
	}
	
	public RequestDMO getRequest(){
		return(request);
	}
	
	public Integer getRequestID(){
		return(request.getNthRequestID(0));
	}
	
	public ErrorOptionsEnum	rpcErrorOption(){
		return(RPC);
	}
	
	public ErrorOptionsEnum	dmpErrorOption(){
		return(DMP);
	}
	

}
