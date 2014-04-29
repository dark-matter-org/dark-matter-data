package org.dmd.core.schema;

import java.util.Iterator;

import org.dmd.core.interfaces.DmcNameBuilderIF;

/**
 * The DmcAttributeSchemaIF defines an entity that understands how to 
 * get DmcAttributeInfo on the basis of an Integer identifier. The interface
 * is implemented by the <schema>AttributeSchemaAG classes taht are generated
 * as part of the DMO generation process.
 */
public interface DmcAttributeSchemaIF {

	/**
	 * @return The name of the schema associated with these attributes.
	 */
	public String getSchemaName();
	
	/**
	 * @return an Iterator over the attribute info for all attributes defined by a schema.
	 */
	public Iterator<DmcAttributeInfo>	getInfo();
	
	/**
	 * @return an Iterator over the name builders for name types associated with the schema.
	 */
	public Iterator<DmcNameBuilderIF>	getNameBuilders();
	
	/**
	 * @return an Iterator over the attribute slices associated with the schema.
	 */
	public Iterator<DmcSliceInfo>		getSliceInfo();
}
