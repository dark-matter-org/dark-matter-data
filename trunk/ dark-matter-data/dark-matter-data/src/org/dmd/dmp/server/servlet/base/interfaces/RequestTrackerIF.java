package org.dmd.dmp.server.servlet.base.interfaces;

import org.dmd.dmp.server.extended.Request;

/**
 * The RequestTrackerIF defines a component that decouples the handling of incoming
 * Dark Matter Protocol Requests from the various components that service those
 * Requests. 
 */
public interface RequestTrackerIF extends ResponseHandlerIF {

	/**
	 * If you bind a default request handler, any requests that aren't handled
	 * by your class specific request processors will be sent to this handler.
	 * @param requestProcessor
	 */
	public void bindDefaultRequestHandler(RequestProcessorIF requestProcessor);
	
	/**
	 * 
	 * @param clazz the class of request that this processor handles.
	 * @param requestProcessor
	 */
	public void bindRequestProcessor(Class<? extends Request> clazz, RequestProcessorIF requestProcessor);
	
	public int  processRequest(Request request, ResponseHandlerIF handler, int timeoutSeconds);
	
	
}
