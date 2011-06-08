package org.dmd.dmp.server.servlet.base.interfaces;

import org.dmd.dmp.server.extended.Request;

/**
 * The RequestProcessorIF defines an entity that can process a Dark Matter Protocol (DMP)
 * Request message. RequestProcessors are bound to the the entity that implements the 
 * RequestTrackerIF for each of the various types of DMP Request, or for other types 
 * of requests that you've added to the protocol.
 */
public interface RequestProcessorIF {

	/**
	 * This method is called by the RequestTracker when it receives a new 
	 * request for processing.
	 * @param request The request to be checked.
	 * @return true if you can handle the request and false otherwise.
	 */
	public boolean acceptRequest(Request request);
	
	/**
	 * This method is called once it has been established that the processor can
	 * handle the the request.
	 * <p />
	 * Now, you may be wondering how the response gets back to whoever wants it; that's
	 * a fair question. It gets back through whatever component implements the 
	 * RequestTrackerIF and is registered with the PluginManager.  Just call 
	 * getPluginManager().getRequestTracker().handleResponse(request,response);
	 * @param request the request to be processed.
	 */
	public void processRequest(Request request);
}
