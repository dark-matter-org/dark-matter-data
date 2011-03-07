//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmr.server.ldap.generated;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;


/**
 * The dmrldap schema defines classes that allow for the storage of Dark
 * Matter Objects in LDAP enabled Directory Servers.
 * <P>
 * Generated from the dmr.ldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:127)
 */
public class DmrLdapSchemaAG extends SchemaDefinition {

    public static ClassDefinition _LDAPSchemaAUX;
    public static ClassDefinition _LDAPClassAUX;
    public static ClassDefinition _LDAPAttributeAUX;
    public static ClassDefinition _LDAPHierarchicObject;

    public static AttributeDefinition _ldapIdPrefix;
    public static AttributeDefinition _reposName;

    static DmrLdapSchemaAG instance;

    public DmrLdapSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG";

        dependsOnSchemaClasses.put("dmr.base","org.dmd.dmr.server.base.generated.DmrBaseSchemaAG");

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmr.ldap");
            me.setSchemaPackage("org.dmd.dmr.shared.ldap");
            me.setDmwPackage("org.dmd.dmr.server.ldap");
            me.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/dmr.ldap.dms");


            me.addDependsOn("dmr.base");
            dependsOnSchemaClasses.put("dmr.base","org.dmd.dmr.server.base.generated.DmrBaseSchemaAG");


            ClassDefinitionDMO _LDAPSchemaAUXOBJ = new ClassDefinitionDMO();
            _LDAPSchemaAUX = new ClassDefinition(_LDAPSchemaAUXOBJ);
            _LDAPSchemaAUXOBJ.setName("LDAPSchemaAUX");
            _LDAPSchemaAUXOBJ.setClassType("AUXILIARY");
            _LDAPSchemaAUXOBJ.setDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition class with information required to map objects onto an LDAP repository.");
            _LDAPSchemaAUXOBJ.addIntendedToExtend("SchemaDefinition");
            _LDAPSchemaAUXOBJ.addMay("ldapIdPrefix");
            _LDAPSchemaAUXOBJ.setDmoAuxClass("LDAPSchemaAUXDMO");
            _LDAPSchemaAUXOBJ.setDmoAuxClassImport("org.dmd.dmr.shared.ldap.generated.auxw.LDAPSchemaAUXDMO");
            _LDAPSchemaAUXOBJ.setDmwAuxClass("LDAPSchemaAUX");
            _LDAPSchemaAUXOBJ.setDmwAuxClassImport("org.dmd.dmr.server.ldap.generated.auxw.LDAPSchemaAUX");
            _LDAPSchemaAUX.setDefinedIn(this);
            _LDAPSchemaAUXOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPSchemaAUXOBJ.setLineNumber("8");
            addClassDefList(_LDAPSchemaAUX);

            ClassDefinitionDMO _LDAPClassAUXOBJ = new ClassDefinitionDMO();
            _LDAPClassAUX = new ClassDefinition(_LDAPClassAUXOBJ);
            _LDAPClassAUXOBJ.setName("LDAPClassAUX");
            _LDAPClassAUXOBJ.setClassType("AUXILIARY");
            _LDAPClassAUXOBJ.setDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition class with information required to map objects onto an LDAP repository.");
            _LDAPClassAUXOBJ.addIntendedToExtend("ClassDefinition");
            _LDAPClassAUXOBJ.addMay("reposName");
            _LDAPClassAUXOBJ.addMay("namingAttribute");
            _LDAPClassAUXOBJ.setDmoAuxClass("LDAPClassAUXDMO");
            _LDAPClassAUXOBJ.setDmoAuxClassImport("org.dmd.dmr.shared.ldap.generated.auxw.LDAPClassAUXDMO");
            _LDAPClassAUXOBJ.setDmwAuxClass("LDAPClassAUX");
            _LDAPClassAUXOBJ.setDmwAuxClassImport("org.dmd.dmr.server.ldap.generated.auxw.LDAPClassAUX");
            _LDAPClassAUX.setDefinedIn(this);
            _LDAPClassAUXOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPClassAUXOBJ.setLineNumber("17");
            addClassDefList(_LDAPClassAUX);

            ClassDefinitionDMO _LDAPAttributeAUXOBJ = new ClassDefinitionDMO();
            _LDAPAttributeAUX = new ClassDefinition(_LDAPAttributeAUXOBJ);
            _LDAPAttributeAUXOBJ.setName("LDAPAttributeAUX");
            _LDAPAttributeAUXOBJ.setClassType("AUXILIARY");
            _LDAPAttributeAUXOBJ.setDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition class with information required to map objects onto an LDAP repository.");
            _LDAPAttributeAUXOBJ.addIntendedToExtend("AttributeDefinition");
            _LDAPAttributeAUXOBJ.addMay("reposName");
            _LDAPAttributeAUXOBJ.setDmoAuxClass("LDAPAttributeAUXDMO");
            _LDAPAttributeAUXOBJ.setDmoAuxClassImport("org.dmd.dmr.shared.ldap.generated.auxw.LDAPAttributeAUXDMO");
            _LDAPAttributeAUXOBJ.setDmwAuxClass("LDAPAttributeAUX");
            _LDAPAttributeAUXOBJ.setDmwAuxClassImport("org.dmd.dmr.server.ldap.generated.auxw.LDAPAttributeAUX");
            _LDAPAttributeAUX.setDefinedIn(this);
            _LDAPAttributeAUXOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPAttributeAUXOBJ.setLineNumber("25");
            addClassDefList(_LDAPAttributeAUX);

            ClassDefinitionDMO _LDAPHierarchicObjectOBJ = new ClassDefinitionDMO();
            _LDAPHierarchicObject = new ClassDefinition(_LDAPHierarchicObjectOBJ);
            _LDAPHierarchicObjectOBJ.setName("LDAPHierarchicObject");
            _LDAPHierarchicObjectOBJ.setClassType("STRUCTURAL");
            _LDAPHierarchicObjectOBJ.setDataType("PERSISTENT");
            _LDAPHierarchicObjectOBJ.setDescription("The LDAPHierarchicObject provides some additional structure and conventions to the HierarchicObject to make it usable in conjunction with an LDAP enabled directory server. Classes derived from LDAPHierarchicObject must be defined in a schema that has been extended with the LDAPSchemaExtension auxiliary class and must themselves be extended with the LDAPClassExtension auxiliary class; the class must have a defined naming attribute. Furthermore, naming attributes should be unique for each defined class.");
            _LDAPHierarchicObjectOBJ.setDerivedFrom("HierarchicObject");
            _LDAPHierarchicObjectOBJ.addMust("FQN");
            _LDAPHierarchicObject.setDefinedIn(this);
            _LDAPHierarchicObjectOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPHierarchicObjectOBJ.setLineNumber("44");
            _LDAPHierarchicObjectOBJ.setIsNamedBy("FQN");
            _LDAPHierarchicObjectOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_LDAPHierarchicObject);


            AttributeDefinitionDMO _ldapIdPrefixOBJ = new AttributeDefinitionDMO();
            _ldapIdPrefix = new AttributeDefinition(_ldapIdPrefixOBJ);
            _ldapIdPrefixOBJ.setName("ldapIdPrefix");
            _ldapIdPrefixOBJ.setDmdID("450");
            _ldapIdPrefixOBJ.setDescription("The ldapIdPrefix is defined for use against an entire schema. It indicates the prefix that will be added to all class and attribute definitions that are loaded into the directory as schema. Having a prefix prevents possible collisions with existing schema definitions. The prefix should be short, 2 or 3 characters.");
            _ldapIdPrefixOBJ.setType("String");
            _ldapIdPrefix.setDefinedIn(this);
            _ldapIdPrefixOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/attributes.dmd");
            _ldapIdPrefixOBJ.setLineNumber("10");
            addAttributeDefList(_ldapIdPrefix);

            AttributeDefinitionDMO _reposNameOBJ = new AttributeDefinitionDMO();
            _reposName = new AttributeDefinition(_reposNameOBJ);
            _reposNameOBJ.setName("reposName");
            _reposNameOBJ.setDmdID("451");
            _reposNameOBJ.setDescription("This attribute indicates the name of an attribute or class when it is stored in a repository and added to that repository's schema. Generally speaking, we will always use the standard prefix for all attribute and class names. Like all other name values, this one must be globally unique.");
            _reposNameOBJ.setType("String");
            _reposName.setDefinedIn(this);
            _reposNameOBJ.setFile("/Users/peter/softdev/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/attributes.dmd");
            _reposNameOBJ.setLineNumber("18");
            addAttributeDefList(_reposName);


        }
    }


    @Override
    public DmrLdapSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

