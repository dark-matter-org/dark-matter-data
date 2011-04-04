package org.dmd.dmc;

import java.util.Iterator;

/**
 * The DmcAttributeSchemaIF defines an entity that understands how to 
 * get DmcAttributeInfo on the basis of an Integer identifier. The interface
 * is implemented by the <schema>AttributeSchemaAG classes taht are generated
 * as part of the DMO generation process.
 */
public interface DmcAttributeSchemaIF {

	/**
	 * @return an Iterator over the attribute info for all attributes defined by a schema.
	 */
	public Iterator<DmcAttributeInfo>	getInfo();
}
