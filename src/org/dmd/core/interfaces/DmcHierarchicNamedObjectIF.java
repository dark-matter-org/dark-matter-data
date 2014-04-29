package org.dmd.core.interfaces;

import org.dmd.core.DmcHierarchicObjectName;

/**
 * This is a marker interface for objects that are named hierarchically.
 */
public interface DmcHierarchicNamedObjectIF extends DmcNamedObjectIF {

	public DmcHierarchicObjectName getHierarchicObjectName();
	
}
