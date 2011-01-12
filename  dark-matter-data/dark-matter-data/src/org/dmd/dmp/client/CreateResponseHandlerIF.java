package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dmp.shared.generated.dmo.CreateResponseDMO;

public interface CreateResponseHandlerIF {

	public void handleCreateResponse(CreateResponseDMO response);
	
	public void handleCreateFailure(Throwable caught, CreateRequestDMO request);
}
