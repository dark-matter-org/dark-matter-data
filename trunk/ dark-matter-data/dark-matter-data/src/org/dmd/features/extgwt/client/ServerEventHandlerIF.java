package org.dmd.features.extgwt.client;

import org.dmd.dmp.shared.generated.dmo.EventDMO;

/**
 * The ServerEventHandlerIF is implemented by Controllers and Views that 
 * have indicated that they handle MvcServerEvents.
 */
public interface ServerEventHandlerIF {

	public void handleServerEvent(EventDMO event);
}
