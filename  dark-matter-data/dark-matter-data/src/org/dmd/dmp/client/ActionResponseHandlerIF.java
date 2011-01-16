package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;
import org.dmd.dmp.shared.generated.dmo.ActionResponseDMO;

public interface ActionResponseHandlerIF {

	public void handleActionResponse(ActionResponseDMO response);
	
	public void handleActionFailure(Throwable caught, ActionRequestDMO request);
}
