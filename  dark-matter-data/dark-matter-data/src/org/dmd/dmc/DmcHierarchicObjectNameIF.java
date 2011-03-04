package org.dmd.dmc;

public interface DmcHierarchicObjectNameIF extends DmcObjectNameIF {

	/**
	 * Returns the name of the parent implied by this hierarchic name.
	 * @return A hierarchic name.
	 */
	public DmcHierarchicObjectNameIF getParentName();
	
	
}
