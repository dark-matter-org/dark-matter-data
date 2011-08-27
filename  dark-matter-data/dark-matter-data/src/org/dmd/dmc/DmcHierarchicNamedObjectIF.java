package org.dmd.dmc;

/**
 * This is a marker interface for objects that are named hierarchically.
 */
public interface DmcHierarchicNamedObjectIF extends DmcNamedObjectIF {

	public DmcHierarchicObjectName getHierarchicObjectName();
	
}
