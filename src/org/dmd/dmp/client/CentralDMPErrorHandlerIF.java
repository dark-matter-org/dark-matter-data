package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

/**
 * The CentralDMPErrorHandlerIF is implemented by a component that provides a single
 * location to handle Dark Matter Protocol errors. Generally speaking, most components
 * handle their own DMP errors, but there may be circumstances where you want to
 * have central access to DMP errors e.g. for logging purposes etc.
 */
public interface CentralDMPErrorHandlerIF {

	/**
	 * Overload this method to handle the error as appropriate.
	 * @param response the error response.
	 * @param request the original request that caused the error.
	 */
	public void handleErrorResponseCentrally(ResponseDMO response, RequestDMO request);
}
