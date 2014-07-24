package org.dmd.dmc;

/**
* The DmcUniqueNameResolver is implemented by any type of storage
* mechanism that maintains a set of objects using a naming mechanism that
* is "fully qualified" i.e. that all accessible objects have a guaranteed
* unique name of some type.
*/
public interface DmcUniqueNameResolverIF {

	/**
	 * Implementing classes should overload this interface to return the 
	 * object based on the specified name if they have such an object.
	 * @param name the fully qualified name
	 * @return the object or null if it's not found
	 */
	public DmcObject findUniqueObject(DmcObjectName name);
}
