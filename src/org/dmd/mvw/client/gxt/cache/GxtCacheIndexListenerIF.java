package org.dmd.mvw.client.gxt.cache;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;

/**
 * The GxtCacheIndexListenerIF should be implemented by classes that want to listen
 * to cache events regarding the creation, deletion and modification of GXT wrapped
 * DMOs.
 */
public interface GxtCacheIndexListenerIF {

	public void objectAdded(DmcClassInfo index, GxtWrapper object, DMPEventDMO event);
	
	public void objectDeleted(DmcClassInfo index, GxtWrapper object, DMPEventDMO event);
	
	public void objectModified(DmcClassInfo index, GxtWrapper object, DMPEventDMO event);
	
	
}

