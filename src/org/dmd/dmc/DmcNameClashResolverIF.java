package org.dmd.dmc;

/**
 * The DmcClashResolverIF defines an entity that can attempt to resolve a clash between
 * colliding object names in a particular namespace. An example usage of this can be seen
 * in the dark-matter schema (DMS) mechanisms. Naming of definitions takes place in
 * a flat namespace, but, internally, definitions have a fully qualified name based on the
 * schema of which they are a part. Generally, you can use the flat namespace name for a
 * definition, it's just more convenient. If there are clashing definition names 
 * across schemas, the schema manager maintains a set of the definitions with matching
 * names. When object reference resolution takes place, a DmcClashResolverIF can be
 * used to determine, based on context, which of the objects that map to the name
 * should be used.
 */
public interface DmcNameClashResolverIF {

	/**
	 * The clash resolver will overload this method to attempt to resolve the name clash.
	 * @param obj the object on which resolveReferences() has been called
	 * @param attr the attribute being resolved
	 * @param ex the clas exception thrown form the name resolver. This will contain the
	 * set of objects with the given name. 
	 * @return the appropriate object
	 * @throws DmcValueException if the appropriate can't be determined
	 */
	public DmcObject resolveClash(DmcObject obj, DmcAttribute<?> attr, DmcNameClashException ex) throws DmcValueException;
	
	
}
