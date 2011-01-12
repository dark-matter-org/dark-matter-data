package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

/**
 * The CentralizedHandlerIF interface allows you to coordinate handling of requests
 * and their responses through a centralized communications manager. When creating
 * the callback for a particular type of request, simply use the constructor that
 * takes this interface as argument. The implementing class will be notified as 
 * requests complete or if they fail.
 */
public interface CentralizedHandlerIF {

	public void requestComplete(RequestDMO request, ResponseDMO response);
	
	public void requestFailed(Throwable caught, RequestDMO request);
}
