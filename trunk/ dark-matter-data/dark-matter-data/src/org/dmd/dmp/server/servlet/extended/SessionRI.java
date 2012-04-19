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
import org.dmd.dmp.server.servlet.base.cache.CacheIF;
import org.dmd.dmp.server.servlet.base.cache.CacheRegistration;
import org.dmd.dmp.server.servlet.base.interfaces.DmpEventHandlerIF;
import org.dmd.dmp.server.servlet.base.interfaces.DmpResponseHandlerIF;
import org.dmd.dmp.server.servlet.generated.dmw.SessionRIDMW;

import de.novanic.eventservice.client.event.domain.Domain;
import de.novanic.eventservice.client.event.domain.DomainFactory;
import de.novanic.eventservice.service.RemoteEventServiceServlet;

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
	RemoteEventServiceServlet	servlet;
	
	// The event Domain required to publish events to a particular client session. This
	// is unique for each session and is named by the session identifier.
	Domain						domain;
	
	// Our unique registration with the cache against which we will operate
	CacheRegistration		cacheRegistration;
	
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
	public SessionRI(CacheIF c){
		cacheRegistration = c.register();
	}
	
	/**
	 * Initializes the GWT Event Service mechanisms so that the session can handle events
	 * and asynchronous responses.
	 * @param s the handle to the servlet derived from RemoteEventServiceServlet.
	 */
	public void initializeEventChannel(RemoteEventServiceServlet s){
		servlet	= s;
		domain 	= DomainFactory.getDomain(getSessionIDRI());
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
		servlet.addEvent(domain, response.getDMO());
	}

	/**
	 * Sends the specified event back to the client.
	 * @param event The event to be sent.
	 */
	@Override
	public void handleEvent(DMPEvent event) {
		// Fire the event on our session based domain
		servlet.addEvent(domain, event.getDMO());
	}

	///////////////////////////////////////////////////////////////////////////
	// Request handling methods
	
	public GetResponse handleGetRequest(GetRequest request){
		GetResponse rc = null;
		
		return(rc);
	}
	
	public SetResponse handleSetRequest(SetRequest request){
		SetResponse rc = null;
		
		return(rc);
	}
	
	public CreateResponse handleCreateRequest(CreateRequest request){
		CreateResponse rc = null;
		
		return(rc);
	}
	
	public DeleteResponse handleDeleteRequest(DeleteRequest request){
		DeleteResponse rc = null;
		
		return(rc);
	}
	
	public ActionResponse handleActionRequest(ActionRequest request){
		ActionResponse rc = null;
		
		return(rc);
	}

	///////////////////////////////////////////////////////////////////////////
	// DmpPipeIF implementation
	
	@Override
	public void sendMessage(DMPMessage msg) {
		servlet.addEvent(domain, msg.getDMO());
	}

	@Override
	public String getName() {
		return(getSessionIDRI());
	}
}
