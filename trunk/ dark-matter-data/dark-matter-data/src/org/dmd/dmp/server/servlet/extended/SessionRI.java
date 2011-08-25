package org.dmd.dmp.server.servlet.extended;

import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.Response;
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
 */
public class SessionRI extends SessionRIDMW implements DmpResponseHandlerIF, DmpEventHandlerIF {
	
	// Our handle to the servlet which implements the GWT Event Service
	RemoteEventServiceServlet	servlet;
	
	Domain			domain;
	
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

}
