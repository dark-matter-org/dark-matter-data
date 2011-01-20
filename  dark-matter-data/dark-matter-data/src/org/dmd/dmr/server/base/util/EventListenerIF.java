package org.dmd.dmr.server.base.util;

import org.dmd.dmp.server.extended.Event;

public interface EventListenerIF {

	public void objectCreated(Event e);
	
	public void objectDeleted(Event e);
	
	public void objectModified(Event e);
}
