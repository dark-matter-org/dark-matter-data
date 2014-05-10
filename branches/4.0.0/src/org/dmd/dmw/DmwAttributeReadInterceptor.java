package org.dmd.dmw;

import org.dmd.core.DmcAttribute;
import org.dmd.core.interfaces.DmcInputStreamIF;

/**
 * The DmwAttributeReadInterceptor allows for the insertion of attribute level
 * data conversion. For instance, let's say you have an attribute that changes type from
 * one version of the schema to another. When converting the existing data, you have
 * to read the attribute as the original type and store it as the new type. 
 */
public interface DmwAttributeReadInterceptor {

	/**
	 * Derived classes should perform whatever conversion logic is required
	 * on the specified attribute.
	 * <p/>
	 * For instance if the attribute changed from a float to a double, you would
	 * want to read a float from the input stream and write it into the attribute
	 * (making it a double). 
	 * <p/>
	 * Exactly what you do in this process will dictated by the schema changes you've made.
	 * @param dis the input stream.
	 * @param attr the attribute container that was constructed at the current version
	 * of the schema.
	 */
	abstract public void handleAttribute(DmcInputStreamIF dis, DmcAttribute<?> attr);
}
