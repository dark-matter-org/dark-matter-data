package org.dmd.mvw.client.gxt.cache;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;

/**
 * The GxtCacheHierarchyListenerIF interface should be implemented by classes that
 * want to listen for events related to object hierarchies.
 */
public interface GxtCacheHierarchyListenerIF {

	public void hierarchyObjectAdded(DmcClassInfo index, GxtWrapper object, DMPEventDMO event);
	
	public void hierarchyObjectDeleted(DmcClassInfo index, GxtWrapper object, DMPEventDMO event);
	
	public void hierarchyObjectModified(DmcClassInfo index, GxtWrapper object, DMPEventDMO event);
	
	public void hierarchyAvailable(DmcClassInfo index, GxtWrapper object);
	
	
}
