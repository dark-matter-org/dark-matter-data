package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;

public interface CentralEventHandlerIF {

	public void handleEventCentrally(DMPEventDMO event);
}
