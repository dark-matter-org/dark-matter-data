package org.dmd.dmp.server.servlet.base;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmp.server.extended.SetRequest;

/**
 * The EventManagerIF interface defines an entity that acts as an event bus
 * within the web server. 
 */
public interface EventBusIF {

	/**
	 * Fires an event that indicates that an object has been created. This
	 * is only valid for named objects.
	 * @param object the object that was created. 
	 */
	public void fireCreateEvent(DmcNamedObjectIF object);
	
	/**
	 * Fires an event that indicates that the specified object has been deleted.
	 * @param object the object that was deleted.
	 */
	public void fireDeleteEvent(DmcNamedObjectIF object);
	
	/**
	 * Fires an event that indicates that an object has been modified by the 
	 * specified SetRequest. 
	 * @param request The request that modified the object.
	 */
	public void fireModifiedEvent(SetRequest request);
	
	/**
	 * Fires an event that indicates that an object has been modified, usually by 
	 * some mechanism within the server itself. The specified object MUST have
	 * a modifier associated with it e.g. the object is a modification recorder.
	 * @param object The modified object.
	 */
	public void fireModifiedEvent(DmcObject object);
}
