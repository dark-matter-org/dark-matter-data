package org.dmd.dmr.server.ldap.util;

import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmr.server.ldap.generated.auxw.LDAPAttributeAUX;
import org.dmd.dmr.server.ldap.generated.auxw.LDAPClassAUX;
import org.dmd.dmr.server.ldap.generated.auxw.LDAPSchemaAUX;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaExtensionIF;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.DataTypeEnum;
import org.dmd.util.exceptions.ResultException;

/**
 * The LDAPSchemaExtension class provides additional rule checking for
 * objects that you intend to store in an LDAP enabled directory server.
 * As well, it decorates attribute and class definitions with additional 
 * information required when storing objects in a directory server.
 */
public class LDAPSchemaExtension implements SchemaExtensionIF {
	
	SchemaManager		manager;
	SchemaDefinition	currSchema;
	boolean				payAttention;
	
	// The prefix that we'll used to create the reposName for all attributes
	// and classes.
	String				ldapIdPrefix;
	
	public LDAPSchemaExtension(){
		manager = null;
	}

	@Override
	public void addAction(ActionDefinition def) throws ResultException, DmcValueException {
		// We do nothing with actions
	}

	@Override
	public void addAttribute(AttributeDefinition def) throws ResultException, DmcValueException {
		if (payAttention){
			if (def.getDataType() == DataTypeEnum.PERSISTENT){
				LDAPAttributeAUX.addAux(def);
				LDAPAttributeAUX.setReposName(def, ldapIdPrefix + def.getName());
			}
		}
	}

	@Override
	public void addClass(ClassDefinition def) throws ResultException, DmcValueException {
		if (payAttention){
			if (LDAPClassAUX.hasAux(def)){
				// The class has been marked as being LDAP persistent, verify that it's
				// actually marked as persistent
				if (def.getDataType() != DataTypeEnum.PERSISTENT){
					// It's not persistent, but we'll mark it that way
					def.setDataType(DataTypeEnum.PERSISTENT);
				}
				
				// Verify that the class has a naming attribute
				if (LDAPClassAUX.getNamingAttribute(def) == null){
					ResultException ex = new ResultException();
					ex.addError("The " + def.getName() + " class has the LDAPClassAUX extension but doesn't specify a namingAttribute.");
					ex.setLocationInfo(def.getFile(), def.getLineNumber());
					throw(ex);
				}
			}
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
		currSchema 		= sd;
		
		// If this schema  has the LDAPSchemaAux, we need to pay attention to the 
		// definitions coming our way.
		payAttention 	= LDAPSchemaAUX.hasAux(sd);
		
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

}
