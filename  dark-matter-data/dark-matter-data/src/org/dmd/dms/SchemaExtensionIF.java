package org.dmd.dms;

import org.dmd.dmc.DmcValueException;
import org.dmd.util.exceptions.ResultException;

/**
 * The SchemaExtensionIF interface should be implemented by classes that extend
 * the basic SchemaManager to provide additional functionality associated with
 * extensions to the basic Meta Schema. The intent of this mechanism is to prevent
 * constant additions to the Meta Schema and allow you extend schema related
 * information in any way you see fit.
 * <P>
 * Classes that implement this interface must have a zero argument constructor
 * since they will be instantiated by the SchemaManager.
 * <P>
 * To make use of a schema extension, simply specify it in the schema you're
 * defining, for example:
 * <PRE>
 * SchemaDefinition
 * name            someSchema
 * schemaExtension org.dmd.dmr.server.ldap.util.LDAPSchemaExtension
 * </PRE>
 * <P>
 * Whenever a definition is added to the SchemaManager, either via the SchemaParser
 * or when a schema is managed, all available schema extensions will be notified.
 * This allows them to perform any additional error checking, augmentation of the
 * definitions (for example via the addition of auxiliary classes) or any other
 * behaviour that's required.
 */
public interface SchemaExtensionIF {

	/**
	 * This method will be called when the implementing class is first instantiated
	 * so that it has a handle to the schema manager with which its associated.
	 * @param sm The schema manager.
	 */
	public void setManager(SchemaManager sm);
	
	/**
	 * This method will be called when an attribute is added to the schema manager.
	 * @param def The definition.
	 * @throws ResultException
	 * @throws DmcValueException
	 */
	public void addAttribute(AttributeDefinition def) throws ResultException, DmcValueException;
	
	/**
	 * This method will be called when a class is added to the schema manager.
	 * @param def The definition.
	 * @throws ResultException
	 * @throws DmcValueException
	 */
	public void addClass(ClassDefinition def) throws ResultException, DmcValueException;
	
	/**
	 * This method will be called when a type is added to the schema manager.
	 * @param def The definition.
	 * @throws ResultException
	 * @throws DmcValueException
	 */
	public void addType(TypeDefinition def) throws ResultException, DmcValueException;
	
	/**
	 * This method will be called when an action is added to the schema manager.
	 * @param def The definition.
	 * @throws ResultException
	 * @throws DmcValueException
	 */
	public void addAction(ActionDefinition def) throws ResultException, DmcValueException;
	
	/**
	 * This method will be called when an enum is added to the schema manager.
	 * @param def The definition.
	 * @throws ResultException
	 * @throws DmcValueException
	 */
	public void addEnum(EnumDefinition def) throws ResultException, DmcValueException;
	
	/**
	 * This method will be called when a schema is added to the schema manager.
	 * @param def The definition.
	 * @throws ResultException
	 * @throws DmcValueException
	 */
	public void addSchema(SchemaDefinition def) throws ResultException, DmcValueException;
	
	/**
	 * This method is called whenever we're about to start loading definitions from
	 * the specified schema. 
	 * @param sd The schema definition.
	 */
	public void schemaBeingLoaded(SchemaDefinition sd) throws ResultException;
	
}
