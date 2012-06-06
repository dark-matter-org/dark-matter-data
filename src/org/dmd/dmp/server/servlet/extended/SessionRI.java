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
package org.dmd.dmp.server.servlet.extended;

import java.util.Timer;
import java.util.TimerTask;

import org.dmd.dmp.server.DmpPipeIF;
import org.dmd.dmp.server.extended.ActionRequest;
import org.dmd.dmp.server.extended.ActionResponse;
import org.dmd.dmp.server.extended.CreateRequest;
import org.dmd.dmp.server.extended.CreateResponse;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.extended.DMPMessage;
import org.dmd.dmp.server.extended.DeleteRequest;
import org.dmd.dmp.server.extended.DeleteResponse;
import org.dmd.dmp.server.extended.GetRequest;
import org.dmd.dmp.server.extended.GetResponse;
import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.Response;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.extended.SetResponse;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.server.servlet.base.GetRequestProcessor;
import org.dmd.dmp.server.servlet.base.cache.CacheIF;
import org.dmd.dmp.server.servlet.base.cache.CacheRegistration;
import org.dmd.dmp.server.servlet.base.interfaces.DmpEventHandlerIF;
import org.dmd.dmp.server.servlet.base.interfaces.DmpResponseHandlerIF;
import org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF;
import org.dmd.dmp.server.servlet.generated.dmw.SessionRIDMW;

import de.novanic.eventservice.client.event.domain.Domain;
import de.novanic.eventservice.client.event.domain.DomainFactory;
import de.novanic.eventservice.service.RemoteEventServiceServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The SessionRI class represents an authenticated user session. All requests
 * are verified by the security manager to ensure that they have a valid session.
 * Sessions also create the named event channel for the GWT Event Service through
 * which we send DMPEvents and asynchronous responses.
 * <p/>
 * The SessionRI is at the heart of all interactions between the client and the server.
 * Each session has a unique registration with the cache so that all operations
 * performed against the data can be uniquely identified as coming from a particular
 * cache registrant. This allows us to distinguish who did what to the data. On the
 * client, this mechanism can be used to determine whether events coming from the
 * server were caused by you or by some other client.
 */
public class SessionRI extends SessionRIDMW implements DmpResponseHandlerIF, DmpPipeIF, DmpEventHandlerIF {
	
	// Our handle to the servlet which implements the GWT Event Service
	RemoteEventServiceServlet	eventChannel;
	
	// The event Domain required to publish events to a particular client session. This
	// is unique for each session and is named by the session identifier.
	Domain						domain;
	
	// Our unique registration with the cache against which we will operate
	CacheRegistration			cacheRegistration;
	
	// The entity that coordinates our object retrieval
	GetRequestProcessor			getRequestProcessor;
	
	// Our handle to the request tracker that provides asynchronous handling of 
	// requests and their associated responses.
	private	RequestTrackerIF	requestTracker;
	
    private Logger              logger = LoggerFactory.getLogger(getClass());

    /**
	 * The empty constructor required for compatibility with the modification recorder mechanisms.
	 * This is never used to create an actual session for use within the DMP reference implementation.
	 */
	public SessionRI(){
		
	}
	
	/**
	 * Instantiates a new session against the specified cache.
	 * @param c the cache.
	 */
	public SessionRI(CacheIF c, RequestTrackerIF rt){
		cacheRegistration 	= c.register();
		getRequestProcessor = new GetRequestProcessor(this, cacheRegistration);
		requestTracker		= rt;
	}
	
	/**
	 * Initializes the GWT Event Service mechanisms so that the session can handle events
	 * and asynchronous responses.
	 * @param s the handle to the servlet derived from RemoteEventServiceServlet.
	 */
	public void initializeEventChannel(RemoteEventServiceServlet s){
		eventChannel	= s;
		domain 	= DomainFactory.getDomain(getSessionIDRI());
	}
	
	/**
	 * @return the unique ID associated with our cache registration.
	 */
	public int getOriginatorID(){
		return(cacheRegistration.getID());
	}

	/**
	 * If there have been any operations that have multiple responses e.g. GetRequests with a 
	 * blocking factor or ActionRequests etc., the first response goes back via the usual 
	 * mechanisms. Subsequent responses are sent back asynchronously as events. The 
	 * org.dmd.mvw.client.mvwcomms.extended.CommsController knows how to route these 
	 * asynchronous responses back to the appropriate component.
	 * @param request The original request, which in this case isn't used.
	 * @param response The asynchronous response.
	 */
	@Override
	public void handleResponse(Request request, Response response) {
		eventChannel.addEvent(domain, response.getDMO());
	}

	///////////////////////////////////////////////////////////////////////////
	// Request handling methods
	
	public GetResponse handleGetRequest(GetRequest request){
		GetResponse rc = request.getResponse();
		rc.setLastResponse(false);
		
		request.setOriginatorID(cacheRegistration.getID());
				
		logger.trace("Passing request to get processor");

		getRequestProcessor.processRequest(request);
		
		logger.trace("Get processor has returned");

		return(rc);
	}
	
	public SetResponse handleSetRequest(SetRequest request){
		request.setOriginatorID(cacheRegistration.getID());

		SetResponse rc = request.getResponse();
		rc.setLastResponse(false);
		
		requestTracker.processRequest(request, this);
		
		return(rc);
	}
	
	public CreateResponse handleCreateRequest(CreateRequest request){
		request.setOriginatorID(cacheRegistration.getID());
		
		CreateResponse rc = request.getResponse();
		rc.setLastResponse(false);
		
		requestTracker.processRequest(request, this);
		
		logger.debug("Sending synchronous response for CreateRequest: " + rc);
		
		return(rc);
	}
	
	public DeleteResponse handleDeleteRequest(DeleteRequest request){
		request.setOriginatorID(cacheRegistration.getID());

		DeleteResponse rc = request.getResponse();
		rc.setLastResponse(false);
		
		requestTracker.processRequest(request, this);
		
		return(rc);
	}
	
	public ActionResponse handleActionRequest(ActionRequest request){
		ActionResponse rc = null;
		request.setOriginatorID(cacheRegistration.getID());
		
		if (request.getActionName().equals(DmpSchemaAG._primeEventChannel.getName().getNameString())){
			logger.debug("Received asynch priming request...");
			final ActionRequest primeRequest = request;
			rc = request.getResponse();
			rc.setLastResponse(false);
			
			Timer timer = new Timer(){};
			timer.schedule(new TimerTask() {
				
				@Override
				public void run() {
					logger.debug("Sending asynch priming response...");
					
					ActionResponse response = primeRequest.getResponse();
					response.setLastResponse(true);
					
					sendMessage(response);
				}
			}, 300);
		}
		
		logger.debug("Sending synchronous priming response...");
		
//		if (request.isTrackingEnabled())
//			logger.debug(request.toOIF());
		
		return(rc);
	}

	///////////////////////////////////////////////////////////////////////////
	// DmpPipeIF implementation
	
	@Override
	public void sendMessage(DMPMessage msg) {
		logger.trace("Sending message...");
		eventChannel.addEvent(domain, msg.getDMO());
	}

	@Override
	public String getName() {
		return(getSessionIDRI());
	}
	
	///////////////////////////////////////////////////////////////////////////
	// DmpEventHandlerIF implementation
	
	/**
	 * Sends the specified event back to the client.
	 * @param event The event to be sent.
	 */
	@Override
	public void handleEvent(DMPEvent event) {
		logger.trace("Sending event...");
		// Fire the event on our session based domain
		eventChannel.addEvent(domain, event.getDMO());
	}


}
