package org.dmd.dmc.cache;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcObject;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;

/**
 * The DmoCacheIndexListenerIF is used primarily in client environments where
 * wrappers may/or may not be used on objects retrieved for a remote source.
 * It allows for components to listen for add/delete/modify events that impact
 * a set of cached objects.
 */
public interface DmoCacheIndexListenerIF {

	/**
	 * Called when an object is added to a cache.
	 * @param index the class of object for which an index is maintained.
	 * @param object the object that was added
	 * @param event the event from the server
	 */
	public void objectAdded(DmcClassInfo index, DmcObject object, DMPEventDMO event);
	
	/**
	 * Called when an object is deleted from a cache.
	 * @param index the class of object for which an index is maintained.
	 * @param object the object that was deleted
	 * @param event the event from the server
	 */
	public void objectDeleted(DmcClassInfo index, DmcObject object, DMPEventDMO event);
	
	/**
	 * Called when a cached object is modified.
	 * @param index the class of object for which an index is maintained.
	 * @param object the object that was modified
	 * @param event the event from the server
	 */
	public void objectModified(DmcClassInfo index, DmcObject object, DMPEventDMO event);

}
