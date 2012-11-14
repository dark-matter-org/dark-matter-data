package org.dmd.dmc;

/**
 * The DmcHierarchicObjectName class provides a common base for names that imply
 * hierarchic relationships between objects. 
 */
@SuppressWarnings("serial")
abstract public class DmcHierarchicObjectName extends DmcObjectName {

	/**
	 * Returns the name of the parent implied by this hierarchic name.
	 * @return A hierarchic name or null if the name has no parent.
	 */
	abstract public DmcHierarchicObjectName getParentName();
	

}
