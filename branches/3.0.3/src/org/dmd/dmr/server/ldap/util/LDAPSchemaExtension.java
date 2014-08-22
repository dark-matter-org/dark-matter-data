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
package org.dmd.dmr.server.ldap.util;

import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dmr.server.ldap.generated.DmrldapSchemaAG;
import org.dmd.dmr.server.ldap.generated.dmw.LDAPAttributeAUX;
import org.dmd.dmr.server.ldap.generated.dmw.LDAPClassAUX;
import org.dmd.dmr.server.ldap.generated.dmw.LDAPSchemaAUX;
import org.dmd.dmr.shared.ldap.generated.dmo.LDAPClassAUXDMO;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.MetaSchema;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaExtensionIF;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.DataTypeEnum;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The LDAPSchemaExtension class provides additional rule checking for
 * objects that you intend to store in an LDAP enabled directory server.
 * As well, it decorates attribute and class definitions with additional 
 * information required when storing objects in a directory server.
 */
public class LDAPSchemaExtension implements SchemaExtensionIF {
	
	// The schema manager that is loading a schema with the LDAP schema extension
	SchemaManager		manager;
	
	// Our own schema
	DmrldapSchemaAG		ourSchema;
	
	SchemaDefinition	currSchema;
	boolean				payAttention;
	
	// The prefix that we'll used to create the reposName for all attributes
	// and classes.
	String				ldapIdPrefix;
	
	public LDAPSchemaExtension(){
		manager 	= null;
		try {
			ourSchema 	= new DmrldapSchemaAG().getInstance();
		} catch (DmcValueException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addAction(ActionDefinition def) throws ResultException, DmcValueException {
		// We do nothing with actions
	}

	@Override
	public void addAttribute(AttributeDefinition def) throws ResultException, DmcValueException {
		if (payAttention){
			if (def.getDataType() == DataTypeEnum.PERSISTENT){
//				LDAPAttributeAUX.addAux(def);
				LDAPAttributeAUX.setReposName(def, ldapIdPrefix + def.getName());
			}
		}
	}

	@Override
	public void addClass(ClassDefinition def) throws ResultException, DmcValueException {
		DebugInfo.debug(def.getName().getNameString());
		
		if (payAttention){
			DebugInfo.debug("paying attention: " + def.getName());
			
// NOTE: removed the check for PERSISTENT to allow for non-persistent objects in the hierarchy
// However, we should check that persistent objects can only have persistent parents.
//			if (def.getDataType() == DataTypeEnum.PERSISTENT){
			if (def.getDerivedFrom() == DmrldapSchemaAG._LDAPHierarchicObject){
//				DebugInfo.debug(def.toOIF(20));
				if (!LDAPClassAUX.hasAux(def)){
					// It doesn't have the aux class yet, add it
					
					def.addAux(DmrldapSchemaAG._LDAPClassAUX);
//					LDAPClassAUX.addAux(def);
				}
				
				// It's persistent, it should have a naming attribute
				if (LDAPClassAUXDMO.getNamingAttribute(def.getDmcObject()) == null){
					ResultException ex = new ResultException();
					ex.addError("The " + def.getName() + " class has the LDAPClassAUX extension but doesn't specify a namingAttribute.");
					ex.setLocationInfo(def.getFile(), def.getLineNumber());
					throw(ex);
				}
			}
//			}
		}
	}

	@Override
	public void addEnum(EnumDefinition def) throws ResultException, DmcValueException {
		// We do nothing with enums
	}

	@Override
	public void addSchema(SchemaDefinition def) throws ResultException, DmcValueException {
		// We're now adding the entire schema and so, at this point we have to check
		// a variety of things.
		
	}

	@Override
	public void addType(TypeDefinition def) throws ResultException, DmcValueException {
		// We do nothing with types
	}

	@Override
	public void setManager(SchemaManager sm) {
		manager = sm;
	}

	@Override
	public void schemaBeingLoaded(SchemaDefinition sd) throws ResultException {
//		DebugInfo.debug("\n" + sd.toOIF(20) + "\n");
		
		currSchema 		= sd;
		
		// If this schema  has the LDAPSchemaAux, we need to pay attention to the 
		// definitions coming our way.
		payAttention 	= LDAPSchemaAUX.hasAux(sd);
		
//		DebugInfo.debug(sd.getName());
		
		if (payAttention){
			// We have the aux class, so we should have the prefix
			ldapIdPrefix = LDAPSchemaAUX.getLdapIdPrefix(sd);
			
			if (ldapIdPrefix == null){
				ResultException ex = new ResultException();
				ex.addError("The " + sd.getName() + " schema has the LDAPSchemaAUX extension but doesn't specify the ldapIdPrefix attribute.");
				ex.setLocationInfo(sd.getFile(), 0);
				throw(ex);
			}
		}
		else{
			// One other check to perform - if someone has specified the LDAPSchemaExtension
			// but forgot to add the LDAPSchemaAUX, we'll remind them
			Iterator<String> extList = sd.getSchemaExtension();
			if (extList != null){
				while(extList.hasNext()){
					if (extList.next().equals("org.dmd.dmr.server.ldap.util.LDAPSchemaExtension")){
						ResultException ex = new ResultException();
						ex.addError("The " + sd.getName() + " schema specifies the LDAPSchemaExtension but doesn't have the LDAPSchemaAUX class.");
						ex.result.lastResult().moreMessages("You must decorate the SchemaDefinition with LDAPSchemaAUX and specify the ldapIdPrefix.");
						ex.setLocationInfo(sd.getFile(), 0);
						throw(ex);
					}
				}
			}
		}
	}

	@Override
	public void definitionPreAdd(DmcUncheckedObject uco) throws DmcValueException {
		String ccn = uco.classes.get(0);
//		DebugInfo.debug(ccn);
		
		if (ccn.equals(MetaSchema._AttributeDefinition.getName())){
			
		}
		else if (ccn.equals(MetaSchema._ClassDefinition.getName())){
			
		}
		else if (ccn.equals(MetaSchema._SchemaDefinition.getName())){
			uco.addAux(DmrldapSchemaAG._LDAPSchemaAUX.getName().getNameString());
		}
		
	}

	@Override
	public SchemaDefinition getExtensionSchema() {
		return(ourSchema);
	}

}
