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

public class DmrLdapSchemaAG extends SchemaDefinition {

    public static ClassDefinition _LDAPSchemaExtension;
    public static ClassDefinition _LDAPClassExtension;
    public static ClassDefinition _LDAPAttributeExtension;
    public static ClassDefinition _LDAPHierarchicObject;

    public static AttributeDefinition _ldapIdPrefix;
    public static AttributeDefinition _reposName;

    static DmrLdapSchemaAG instance;

    private DmrLdapSchemaAG() throws DmcValueException {
        SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
        me.setName("dmr.ldap");
        me.setSchemaPackage("org.dmd.dmr.shared.ldap");
        me.setDmwPackage("org.dmd.dmr.server.ldap");
        me.setFile("F:/AASoftDev/workspace/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/dmr.ldap.dms");

        ClassDefinitionDMO _LDAPSchemaExtensionOBJ = new ClassDefinitionDMO();
        _LDAPSchemaExtension = new ClassDefinition(_LDAPSchemaExtensionOBJ);
        _LDAPSchemaExtensionOBJ.setClassType("AUXILIARY");
        _LDAPSchemaExtension.setDefinedIn(this);
        _LDAPSchemaExtensionOBJ.setDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition class with information required to map objects onto an LDAP repository.");
        _LDAPSchemaExtensionOBJ.setFile("F:/AASoftDev/workspace/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
        _LDAPSchemaExtensionOBJ.addIntendedToExtend("SchemaDefinition");
        _LDAPSchemaExtensionOBJ.setLineNumber("8");
        _LDAPSchemaExtensionOBJ.addMay("ldapIdPrefix");
        _LDAPSchemaExtensionOBJ.setName("LDAPSchemaExtension");
        _LDAPSchemaExtensionOBJ.addObjectClass("ClassDefinition");
        addClassDefList(_LDAPSchemaExtension);

        ClassDefinitionDMO _LDAPClassExtensionOBJ = new ClassDefinitionDMO();
        _LDAPClassExtension = new ClassDefinition(_LDAPClassExtensionOBJ);
        _LDAPClassExtensionOBJ.setClassType("AUXILIARY");
        _LDAPClassExtension.setDefinedIn(this);
        _LDAPClassExtensionOBJ.setDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition class with information required to map objects onto an LDAP repository.");
        _LDAPClassExtensionOBJ.setFile("F:/AASoftDev/workspace/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
        _LDAPClassExtensionOBJ.addIntendedToExtend("ClassDefinition");
        _LDAPClassExtensionOBJ.setLineNumber("17");
        _LDAPClassExtensionOBJ.addMay("reposName");
        _LDAPClassExtensionOBJ.addMay("namingAttribute");
        _LDAPClassExtensionOBJ.setName("LDAPClassExtension");
        _LDAPClassExtensionOBJ.addObjectClass("ClassDefinition");
        addClassDefList(_LDAPClassExtension);

        ClassDefinitionDMO _LDAPAttributeExtensionOBJ = new ClassDefinitionDMO();
        _LDAPAttributeExtension = new ClassDefinition(_LDAPAttributeExtensionOBJ);
        _LDAPAttributeExtensionOBJ.setClassType("AUXILIARY");
        _LDAPAttributeExtension.setDefinedIn(this);
        _LDAPAttributeExtensionOBJ.setDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition class with information required to map objects onto an LDAP repository.");
        _LDAPAttributeExtensionOBJ.setFile("F:/AASoftDev/workspace/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
        _LDAPAttributeExtensionOBJ.addIntendedToExtend("AttributeDefinition");
        _LDAPAttributeExtensionOBJ.setLineNumber("25");
        _LDAPAttributeExtensionOBJ.addMay("reposName");
        _LDAPAttributeExtensionOBJ.setName("LDAPAttributeExtension");
        _LDAPAttributeExtensionOBJ.addObjectClass("ClassDefinition");
        addClassDefList(_LDAPAttributeExtension);

        ClassDefinitionDMO _LDAPHierarchicObjectOBJ = new ClassDefinitionDMO();
        _LDAPHierarchicObject = new ClassDefinition(_LDAPHierarchicObjectOBJ);
        _LDAPHierarchicObjectOBJ.setClassType("ABSTRACT");
        _LDAPHierarchicObject.setDefinedIn(this);
        _LDAPHierarchicObjectOBJ.setDerivedFrom("HierarchicObject");
        _LDAPHierarchicObjectOBJ.setDescription("The LDAPHierarchicObject provides some additional structure and conventions to the HierarchicObject to make it usable in conjunction with an LDAP enabled directory server. Classes derived from LDAPHierarchicObject must be defined in a schema that has been extended with the LDAPSchemaExtension auxiliary class and must themselves be extended with the LDAPClassExtension auxiliary class; the class must have a defined naming attribute. Furthermore, naming attributes should be unique for each defined class.");
        _LDAPHierarchicObjectOBJ.setFile("F:/AASoftDev/workspace/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
        _LDAPHierarchicObjectOBJ.setLineNumber("38");
        _LDAPHierarchicObjectOBJ.setName("LDAPHierarchicObject");
        _LDAPHierarchicObjectOBJ.addObjectClass("ClassDefinition");
        _LDAPHierarchicObjectOBJ.setUseWrapperType("EXTENDED");
        addClassDefList(_LDAPHierarchicObject);


        AttributeDefinitionDMO _ldapIdPrefixOBJ = new AttributeDefinitionDMO();
        _ldapIdPrefix = new AttributeDefinition(_ldapIdPrefixOBJ);
        _ldapIdPrefix.setDefinedIn(this);
        _ldapIdPrefixOBJ.setDescription("The ldapIdPrefix is defined for use against an entire schema. It indicates the prefix that will be added to all class and attribute definitions that are loaded into the directory as schema. Having a prefix prevents possible collisions with existing schema definitions. The prefix should be short, 2 or 3 characters.");
        _ldapIdPrefixOBJ.setFile("F:/AASoftDev/workspace/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/attributes.dmd");
        _ldapIdPrefixOBJ.setLineNumber("9");
        _ldapIdPrefixOBJ.setName("ldapIdPrefix");
        _ldapIdPrefixOBJ.addObjectClass("AttributeDefinition");
        _ldapIdPrefixOBJ.setType("String");
        addAttributeDefList(_ldapIdPrefix);

        AttributeDefinitionDMO _reposNameOBJ = new AttributeDefinitionDMO();
        _reposName = new AttributeDefinition(_reposNameOBJ);
        _reposName.setDefinedIn(this);
        _reposNameOBJ.setDescription("This attribute indicates the name of an attribute or class when it is stored in a repository and added to that repository's schema. Generally speaking, we will always use the standard prefix for all attribute and class names. Like all other name values, this one must be globally unique.");
        _reposNameOBJ.setFile("F:/AASoftDev/workspace/dark-matter-data/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/attributes.dmd");
        _reposNameOBJ.setLineNumber("16");
        _reposNameOBJ.setName("reposName");
        _reposNameOBJ.addObjectClass("AttributeDefinition");
        _reposNameOBJ.setType("String");
        addAttributeDefList(_reposName);



    }


    public static DmrLdapSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   instance = new DmrLdapSchemaAG();
    	   return(instance);
    }
}

