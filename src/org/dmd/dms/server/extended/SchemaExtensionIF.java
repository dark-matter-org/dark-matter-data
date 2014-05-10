//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dms.server.extended;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.util.DMUncheckedObject;


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
	 * This methods allows the schema manager to access and manage the schema of the 
	 * the schema extension.
	 * @return The schema extension's schema.
	 */
	public SchemaDefinition getExtensionSchema();
	
	/**
	 * This method will be called when an attribute is added to the schema manager.
	 * @param def The definition.
	 * @throws DMFeedbackSet
	 */
	public void addAttribute(AttributeDefinition def) throws DMFeedbackSet;
	
	/**
	 * This method will be called when a class is added to the schema manager.
	 * @param def The definition.
	 * @throws DMFeedbackSet
	 * @throws DmcValueException
	 */
	public void addClass(ClassDefinition def) throws DMFeedbackSet;
	
	/**
	 * This method will be called when a type is added to the schema manager.
	 * @param def The definition.
	 * @throws DMFeedbackSet
	 * @throws DmcValueException
	 */
	public void addType(TypeDefinition def) throws DMFeedbackSet;
	
	/**
	 * This method will be called when an action is added to the schema manager.
	 * @param def The definition.
	 * @throws DMFeedbackSet
	 * @throws DmcValueException
	 */
	public void addAction(ActionDefinition def) throws DMFeedbackSet;
	
	/**
	 * This method will be called when an enum is added to the schema manager.
	 * @param def The definition.
	 * @throws DMFeedbackSet
	 * @throws DmcValueException
	 */
	public void addEnum(EnumDefinition def) throws DMFeedbackSet;
	
	/**
	 * This method will be called when a schema is added to the schema manager.
	 * @param def The definition.
	 * @throws DMFeedbackSet
	 * @throws DmcValueException
	 */
	public void addSchema(SchemaDefinition def) throws DMFeedbackSet;
	
	/**
	 * This method is called whenever we're about to start loading definitions from
	 * the specified schema. 
	 * @param sd The schema definition.
	 */
	public void schemaBeingLoaded(SchemaDefinition sd) throws DMFeedbackSet;
	
	/**
	 * This method is called whenever we're about to add the specified definition
	 * to a schema. This gives us the opportunity to decorate the definition with
	 * the appropriate auxiliary classes for the definition in question. This
	 * prevents having to explicitly add the AUX classes to our schema definitions.
	 * They are added for us automatically by the schema extension.
	 * @param uco
	 * @throws DMFeedbackSet 
	 */
	public void definitionPreAdd(DMUncheckedObject uco) throws DMFeedbackSet;
	
}
