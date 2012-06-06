package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.RequestDMO;

/**
 * The CentralRPCErrorHandlerIF is implemented by a component that provides a single
 * location to handle GWT RPC errors. Generally speaking, an RPC error is a show stopper
 * and will likely require drastic action e.g. reporting the error and gracefully 
 * shutting down.
 */
public interface CentralRPCErrorHandlerIF {

	/**
	 * Overload this method to perform whatever error handling is required.
	 * @param caught the RPC error information.
	 * @param request the original request.
	 */
	public void handleRPCFailureCentrally(Throwable caught, RequestDMO request);
}
