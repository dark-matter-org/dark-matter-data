package org.dmd.mvw.client.mvwcomms;

import org.dmd.dmp.shared.generated.dmo.RequestDMO;

public interface CentralRPCErrorHandlerIF {

	public void handleRPCFailure(Throwable caught, RequestDMO request);

}
