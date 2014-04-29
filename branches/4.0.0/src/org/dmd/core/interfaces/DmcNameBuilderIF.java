package org.dmd.core.interfaces;

import org.dmd.core.DmcObjectName;
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.dms.shared.types.DmcTypeDmcObjectName;

/**
 * The DmcNameBuilderIF is used to identify singletons that are generated for name types.
 */
public interface DmcNameBuilderIF {
	
	/**
	 * The value returned here aligns with the getNameClass() on a DmcObjectNameIF implementor.
	 * @return the name of the name type for which this is the builder.
	 */
	public String getNameClass();

	/**
	 * @return the dmdID of the naming attribute.
	 */
	public int getNameAttributeID();
	/**
	 * Requests that the name builder construct an attribute of the appropriate type
	 * and set its value to be the specified name.
	 * @param name the name to be wrapped.
	 * @param ai the attribute info of the naming attribute associated with this type of name.
	 * @return a new holder of the appropriate type.
	 */
	public DmcTypeDmcObjectName<?>	getNewNameHolder(DmcObjectName name, DmcAttributeInfo ai);
}
