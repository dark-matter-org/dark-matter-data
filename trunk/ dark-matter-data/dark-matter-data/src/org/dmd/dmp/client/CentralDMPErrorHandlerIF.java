package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

public interface CentralDMPErrorHandlerIF {

	public void handleErrorResponse(ResponseDMO response);
}
