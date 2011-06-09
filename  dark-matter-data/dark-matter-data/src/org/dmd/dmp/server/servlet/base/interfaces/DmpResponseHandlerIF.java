package org.dmd.dmp.server.servlet.base.interfaces;

import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.Response;

/**
 * The ResponseHandlerIF interface defines a component that can handle the 
 * response that results when a RequestProcessorIF has finished its processing.
 */
public interface DmpResponseHandlerIF {

	/**
	 * This is called when a response is ready for handling. This method may be
	 * called multiple times, depending on the nature of the original request.
	 * @param request the original request.
	 * @param response the resulting response.
	 */
	public void handleResponse(Request request, Response response);
}
