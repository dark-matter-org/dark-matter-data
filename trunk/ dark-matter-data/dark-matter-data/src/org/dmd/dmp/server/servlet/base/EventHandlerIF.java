package org.dmd.dmp.server.servlet.base;

import org.dmd.dmp.server.InitiatorID;
import org.dmd.dmp.server.extended.DMPEvent;

/**
 * The EventHandlerIF interface is implemented by entities that want to register
 * with an EventBusIF for DMPEvent notification.
 */
public interface EventHandlerIF {
	
	public InitiatorID getInitiatorID();

	public void handleEvent(DMPEvent event);
}
