package org.dmd.mvw.client.mvwcomms;

import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;

public interface CentralEventHandlerIF {

	public void handleEvent(DMPEventDMO event);
}
