package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.RequestDMO;

public interface CentralRPCErrorHandlerIF {

	public void handleRPCFailure(Throwable caught, RequestDMO request);
}
