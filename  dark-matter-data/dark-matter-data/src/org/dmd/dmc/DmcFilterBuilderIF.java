package org.dmd.dmc;

import org.dmd.dmc.types.DmcTypeDmcFilter;

/**
 * The DmcFilterBuilderIF is used to identify singletons that are generated for filter types.
 */
public interface DmcFilterBuilderIF {
	
	/**
	 * The value returned here aligns with the getFilterClass() on a DmcObjectNameIF implementor.
	 * @return the name of the name type for which this is the builder.
	 */
	public String getFilterClass();

	/**
	 * @return the dmdID of the filter attribute.
	 */
	public int getFilterAttributeID();
	/**
	 * Requests that the filter builder construct an attribute of the appropriate type
	 * and set its value to be the specified name.
	 * @param filter the filter to be wrapped.
	 * @param ai the attribute info of the naming attribute associated with this type of name.
	 * @return a new holder of the appropriate type.
	 */
	public DmcTypeDmcFilter<?>	getNewFilterHolder(DmcFilter filter, DmcAttributeInfo ai);
}
