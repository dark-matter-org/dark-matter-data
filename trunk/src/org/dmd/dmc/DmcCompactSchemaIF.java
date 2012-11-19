package org.dmd.dmc;

import java.util.Iterator;

import org.dmd.dmc.rules.RuleIF;

/**
 * The DmcCompactSchemaIF defines an entity that stores a variety of information
 * derived from Dark Matter Schema definitions in a way that is compatible with
 * restricted Java environments such as GWT.
 * <p />
 * This interface is implemented by the [schemaname]DMSAG classes that are generated
 * as part of the DMO generation process. DMSAG info is loaded into the DmcOmni
 * singleton and used by a variety of Dark Matter components that require access
 * to schema related information.
 */
public interface DmcCompactSchemaIF {

	/**
	 * @return The name of the schema associated with these attributes.
	 */
	public String getSchemaName();
	
	/**
	 * @return an Iterator over the class info for all classes defined by a schema.
	 */
	public Iterator<DmcClassInfo>	getClassInfo();
	
	/**
	 * @return an Iterator over the attribute info for all attributes defined by a schema.
	 */
	public Iterator<DmcAttributeInfo>	getAttributeInfo();
	
	/**
	 * @return an Iterator over the name builders for name types associated with the schema.
	 */
	public Iterator<DmcNameBuilderIF>	getNameBuilders();
	
	/**
	 * @return an Iterator over the filter builders for filter types associated with the schema.
	 */
	public Iterator<DmcFilterBuilderIF>	getFilterBuilders();
	
	/**
	 * @return an Iterator over the attribute slices associated with the schema.
	 */
	public Iterator<DmcSliceInfo>		getSliceInfo();
	
	/**
	 * @return an Iterator over the rules that are applicable in a DMO context.
	 */
	public Iterator<RuleIF>				getRules();
	
	public Iterator<DmcTypeInfo>		getTypeInfo();
	
}
