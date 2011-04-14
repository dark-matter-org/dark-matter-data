package org.dmd.dmc;

import org.dmd.dmc.types.DmcTypeDmcObjectName;

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
	 * @return a new holder of the appropriate type.
	 */
	public DmcTypeDmcObjectName<?>	getNewNameHolder();
}
