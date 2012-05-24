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
package org.dmd.dmp.server.servlet.base.plugins;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Map.Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.Response;
import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.dmp.server.servlet.base.interfaces.DmpRequestProcessorIF;
import org.dmd.dmp.server.servlet.base.interfaces.DmpResponseHandlerIF;
import org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF;

/**
 * The RequestTrackerPlugin implements the RequestTrackerIF interface and provides a 
 * standard mechanism of handling both synchronous and asynchronous Dark Matter Protocol
 * Requests. 
 */
public class BasicRequestTrackerPlugin extends DmpServletPlugin implements RequestTrackerIF
{
	// The synch response handler is used to provide synchronized handling of responses
	// from a DmpRequestProcessorIF. 
    private SynchResponseHandler                                            		synchResponseHandler = new SynchResponseHandler();

    private HashMap<Class<? extends Request>, LinkedList<DmpRequestProcessorIF>> 	requestProcessors    = new HashMap<Class<? extends Request>, LinkedList<DmpRequestProcessorIF>>();
    private DmpRequestProcessorIF                                              		defaultRequestHandler;
    private int                                                             		nextRequestId        = 1;
    private HashMap<Integer, RequestInfo>                                   		outstandingRequests  = new HashMap<Integer, RequestInfo>();
    private HashMap<Integer, Response>                                      		pendingResponses     = new HashMap<Integer, Response>();
    private Timer                                                           		timer                = new Timer();

    private Logger 																	logger 				= LoggerFactory.getLogger(getClass());
    
    /**
     * The RequestTracker uses RequestInfo to allow it to map responses back to the appropriate 
     * response handler. There is a bit of trickery involved here in order to handle the fact
     * that HttpServletRequests i.e. Dark Matter Requests that arrive via GWT RPC must be 
     * handled synchronously. When a RequestInfo is created, it has two response handlers.
     * The firstResponseHandler is set to be the SynchResponseHandler in cases where we're 
     * handling DMP request from GWT RPC. Once the first response is sent back, we fall back
     * to use the asyncResponseHandler, which will send any further responses back on the 
     * GWT event channel. In this way, we achieve true asynchronous behaviour if we require it.
     * 
     * For normal asynchronous requests, the first and async handlers are actually the same handler.
     */
    private class RequestInfo
    {
        Request            		req;
        DmpResponseHandlerIF 	firstResponseHandler;
        DmpResponseHandlerIF 	asyncResponseHandler;
        DmpResponseHandlerIF 	responseHandler;
        long               		timeoutTime;

        RequestInfo(Request req, DmpResponseHandlerIF firstResponseHandler, DmpResponseHandlerIF asyncResponseHandler, long timeoutTime)
        {
            this.req					= req;
            this.firstResponseHandler 	= firstResponseHandler;
            this.asyncResponseHandler	= asyncResponseHandler;
            responseHandler 			= firstResponseHandler;
            this.timeoutTime 			= timeoutTime;
        }
    }
    
    /**
     * This task is called every second to check for timed out requests.
     */
    private class RequestTimeoutProcessor extends TimerTask
    {
        public void run()
        {
            synchronized (outstandingRequests)
            {
                long currentTime = System.currentTimeMillis();
                Collection<Entry<Integer, RequestInfo>> entries = new LinkedList<Entry<Integer, RequestInfo>>(outstandingRequests.entrySet());
                for (Entry<Integer, RequestInfo> entry : entries)
                {
                    RequestInfo ri = entry.getValue();
                    if (currentTime < ri.timeoutTime)
                    	continue;
                    Response resp = ri.req.getErrorResponse();
                    resp.setResponseText("Request Timed Out");
                    processResponse(resp);
                }
            }
        }
    }

    /**
     * Constructs a new RequestTrackerPlugin.
     */
    public BasicRequestTrackerPlugin(){
        timer.schedule(new RequestTimeoutProcessor(), 1000, 1000);    	
    }

    /**
     * This method allows you to bind a fall back request handler that will be called in
     * the case that no handler has been bound for a particular class of request.
     * @param requestHandler the handler to call when a Request doesn't have a bound handler
     */
    public void bindDefaultRequestHandler(DmpRequestProcessorIF requestHandler)
    {
        defaultRequestHandler = requestHandler;
    }

    /**
     * This method binds a request processor to a particular class that's derived from the 
     * the DMP Request class. Generally speaking, the plugin that implements the CacheIF will
     * register handlers for the Get, Set, Create and Delete requests; these are the standard CRUD
     * operations. However, since the Dark Matter Protocol is extensible, you may have to register
     * other handlers for new types of requests.
     * @param clazz The class of Request handled by the processor.
     * @param requestProcessor The request processor.
     */
    public void bindRequestProcessor(Class<? extends Request> clazz, DmpRequestProcessorIF requestProcessor)
    {
        synchronized (requestProcessors)
        {
            LinkedList<DmpRequestProcessorIF> procList = requestProcessors.get(clazz);
            if (procList == null)
            {
                procList = new LinkedList<DmpRequestProcessorIF>();
                requestProcessors.put(clazz, procList);
            }
            procList.add(requestProcessor);
        }
    }

    /**
     * This method allows you to submit a request and receive asynchronous responses via the
     * response handler. In this case the default timeout of 2 seconds is applied to the request.
     * @param req The request.
     * @param responseHandler Where to send the responses.
     * @return the integer ID of this processing operation.
     */
    public int processRequest(Request req, DmpResponseHandlerIF responseHandler)
    {
        return processRequest(req, responseHandler, 2);
    }

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
    public Response processSynchronousRequest(Request req, DmpResponseHandlerIF asyncResponseHandler, int timeoutSeconds)
    {
        synchronized (req)
        {
            processRequest(req, synchResponseHandler, asyncResponseHandler, timeoutSeconds);
            try
            {
                req.wait();
            }
            catch (Exception e)
            {
                logger.error("Caught exception", e);
                return null;
            }
            return pendingResponses.remove(req.getLastRequestID());
        }
    }

    /**
     * This method allows you to submit a request with a specified timeout value.
     * @param req The request.
     * @param responseHandler Where to send the response.
     * @param timeoutSeconds The time out delay.
     */
    public int processRequest(Request req, DmpResponseHandlerIF responseHandler, int timeoutSeconds)
    {
        return processRequest(req, responseHandler, responseHandler, timeoutSeconds);
    }

    /**
     * When a request handler has a response available, it sends it back to the RequestTracker via this method.
     * @param resp A response for an outstanding request.
     */
    public void processResponse(Response resp)
    {
        if (resp.getRequestIDSize() == 0)
        {
            logger.debug("Got Response with no id: " + resp.toOIF());
            return;
        }
        
        int requestId = resp.getRequestIDSize() == 1 ? resp.getLastRequestID() : resp.removeLastRequestID();
        
        logger.debug("Handling response for tracking ID: " + requestId);
        
        DmpResponseHandlerIF responseHandler = null;
        RequestInfo ri = null;
        synchronized (outstandingRequests)
        {
            ri = resp.isLastResponse() ? outstandingRequests.remove(requestId) : outstandingRequests.get(requestId);
            if (ri == null)
            {
                logger.error("No record of request for " + resp.toOIF());
                return;
            }
            responseHandler = ri.responseHandler;
            if (ri.responseHandler == ri.firstResponseHandler) ri.responseHandler = ri.asyncResponseHandler;
        }
        responseHandler.handleResponse(ri.req, resp);
    }


    
    
    private int processRequest(Request req, DmpResponseHandlerIF firstResponseHandler, DmpResponseHandlerIF asyncResponseHandler, int timeoutSeconds)
    {
    	DmpRequestProcessorIF requestProcessor = defaultRequestHandler;
        synchronized (requestProcessors)
        {
            LinkedList<DmpRequestProcessorIF> procList = requestProcessors.get(req.getClass());
            if (procList != null)
            {
                for (DmpRequestProcessorIF processor : procList)
                    if (processor.acceptRequest(req)) requestProcessor = processor;
                
                if (requestProcessor == defaultRequestHandler)
                	logger.debug("None of the request processors bound for " + req.getClass().getSimpleName() + " accepted the request");
            }
        }
        
        if (requestProcessor == null)
        {
//            logger.error("No request processor found for " + req.toOIF());
            return -1;
        }
        
        return trackRequest(req, firstResponseHandler, asyncResponseHandler, timeoutSeconds, requestProcessor);
    }

//    private int trackRequest(Request req, DmpResponseHandlerIF responseHandler, DmpRequestProcessorIF requestProcessor)
//    {
//        return trackRequest(req, responseHandler, 2, requestProcessor);
//    }

//    private int trackRequest(Request req, DmpResponseHandlerIF responseHandler, int timeoutSeconds, DmpRequestProcessorIF requestProcessor)
//    {
//        return trackRequest(req, responseHandler, responseHandler, timeoutSeconds, requestProcessor);
//    }

    private int trackRequest(Request req, DmpResponseHandlerIF firstResponseHandler, DmpResponseHandlerIF asyncResponseHandler, int timeoutSeconds, DmpRequestProcessorIF requestProcessor)
    {
    	logger.debug("Tracking " + req.getConstructionClassName());
    	
        synchronized (outstandingRequests)
        {
            nextRequestId++;
            
        	logger.debug("Tracking " + req.getConstructionClassName() + " request with tracking ID " + nextRequestId);
        	
            req.addRequestID(nextRequestId);
            req.setTimeMS(System.currentTimeMillis());
            outstandingRequests.put(nextRequestId, new RequestInfo(req, firstResponseHandler, asyncResponseHandler, System.currentTimeMillis() + (timeoutSeconds * 1000)));
        }
        requestProcessor.processRequest(req);
        return req.getLastRequestID();
    }

    private class SynchResponseHandler implements DmpResponseHandlerIF
    {
        public void handleResponse(Request req, Response resp)
        {
            synchronized (req)
            {
                pendingResponses.put(req.getLastRequestID(), resp);
                req.notify();
            }
        }
    }

}
