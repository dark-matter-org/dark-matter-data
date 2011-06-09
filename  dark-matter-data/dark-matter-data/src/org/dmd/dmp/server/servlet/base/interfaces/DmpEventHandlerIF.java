package org.dmd.dmp.server.servlet.base.interfaces;

import org.dmd.dmp.server.extended.DMPEvent;

/**
 * The DmpEventHandlerIF interface indicates a component that handles Dark Matter Protocol
 * events.
 */
public interface DmpEventHandlerIF {

	public void handleEvent(DMPEvent event);
	
}
