package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;

public interface GetResponseHandlerIF {

	public void handleGetResponse(GetResponseDMO response);
	
	public void handleGetFailure(Throwable caught, GetRequestDMO request);
}
