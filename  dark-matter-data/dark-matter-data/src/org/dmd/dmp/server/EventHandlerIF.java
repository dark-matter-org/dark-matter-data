package org.dmd.dmp.server;

import org.dmd.dmp.server.extended.DMPEvent;

/**
 * The EventHandlerIF interface is implemented by entities that want to register
 * with an EventBusIF for DMPEvent notification.
 */
public interface EventHandlerIF {
	
	public InitiatorID getInitiatorID();

	public void handleEvent(DMPEvent event);
}
