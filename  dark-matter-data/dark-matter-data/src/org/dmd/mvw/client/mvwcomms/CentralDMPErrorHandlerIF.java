package org.dmd.mvw.client.mvwcomms;

import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

public interface CentralDMPErrorHandlerIF {

	public void handleDMPError(ResponseDMO response);
}
