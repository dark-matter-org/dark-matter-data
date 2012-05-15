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
package org.dmd.dmp.server.servlet.base.interfaces;

import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.Response;

/**
 * The RequestTrackerIF defines a component that decouples the handling of incoming
 * Dark Matter Protocol Requests from the various components that service those
 * Requests. 
 */
public interface RequestTrackerIF {

	/**
	 * If you bind a default request handler, any requests that aren't handled
	 * by your class specific request processors will be sent to this handler.
	 * @param requestProcessor
	 */
	public void bindDefaultRequestHandler(DmpRequestProcessorIF requestProcessor);
	
    /**
     * This method binds a request processor to a particular class that's derived from the 
     * the DMP Request class. Generally speaking, the plugin that implements the CacheIF will
     * register handlers for the Get, Set, Create and Delete requests; these are the standard CRUD
     * operations. However, since the Dark Matter Protocol is extensible, you may have to register
     * other handlers for new types of requests.
     * @param clazz The class of Request handled by the processor.
     * @param requestProcessor The request processor.
     */
	public void bindRequestProcessor(Class<? extends Request> clazz, DmpRequestProcessorIF requestProcessor);
	
    /**
     * This method allows you to submit a request and receive asynchronous responses via the
     * response handler. In this case the default timeout of 2 seconds is applied to the request.
     * @param req The request.
     * @param responseHandler Where to send the responses.
     * @return the integer ID of this processing operation.
     */
    public int processRequest(Request req, DmpResponseHandlerIF responseHandler);
    
    /**
     * This method allows you to submit a request with a specified timeout value.
     * @param request The request.
     * @param handler Where to send the response.
     * @param timeoutSeconds The time out delay.
     */
	public int  processRequest(Request request, DmpResponseHandlerIF handler, int timeoutSeconds);
	
    /**
     * This method allows for synchronous processing of a request; this is generally used when
     * service DMP requests that arrive via GWT RPC. Most operations will have a single response,
     * but, in cases where asynchronous responses can occur e.g. when a GetRequest has a blockingFactor
     * specified or for ActionRequests, the subsequent responses will be relayed via the event 
     * channel for the client.
     * @param req The request.
     * @param asyncResponseHandler The handler that will handle any responses beyond the first one.
     * @param timeoutSeconds The timeout. This should be less than the standard HTTP session timeout.
     * @return The initial response. If there are any others, they will be sent to the response handler.
     */
    public Response processSynchronousRequest(Request req, DmpResponseHandlerIF asyncResponseHandler, int timeoutSeconds);

    /**
     * This method forwards the specified response back to the appropriate response handler.
     * @param response the response to be forwarded.
     */
	public void processResponse(Response response);
}
