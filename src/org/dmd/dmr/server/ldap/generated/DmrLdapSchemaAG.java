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

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmr.shared.ldap.generated.dmo.DmrLdapDMSAG;


/**
 * The dmrldap schema defines classes that allow for the storage\n of Dark
 * Matter Objects in LDAP enabled Directory Servers.
 * <P>
 * Generated from the dmr.ldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:169)
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
            me.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/dmr.ldap.dms");


            me.addDependsOn("dmr.base");
            dependsOnSchemaClasses.put("dmr.base","org.dmd.dmr.server.base.generated.DmrBaseSchemaAG");


            initClasses();
            initAttributes1();
            initTypes();
            initActions();
            initEnums();
            initRules();
            DmcOmni.instance().addCompactSchema(DmrLdapDMSAG.instance());
        }
    }

    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:520)
            ClassDefinitionDMO _LDAPSchemaAUXOBJ = new ClassDefinitionDMO();
            _LDAPSchemaAUX = new ClassDefinition(_LDAPSchemaAUXOBJ,DmrLdapDMSAG.__LDAPSchemaAUX);
            _LDAPSchemaAUXOBJ.setName("LDAPSchemaAUX");
            _LDAPSchemaAUXOBJ.setDmdID("451");
            _LDAPSchemaAUXOBJ.setClassType("AUXILIARY");
            _LDAPSchemaAUXOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPSchemaAUXOBJ.setLineNumber("9");
            _LDAPSchemaAUXOBJ.setDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition\n class with information required to map objects onto an LDAP repository.");
            _LDAPSchemaAUXOBJ.addIntendedToExtend("SchemaDefinition");
            _LDAPSchemaAUXOBJ.setDmtREFImport("org.dmd.dmr.shared.ldap.generated.types.LDAPSchemaAUXREF");
            _LDAPSchemaAUXOBJ.setDmwIteratorClass("LDAPSchemaAUXIterableDMW");
            _LDAPSchemaAUXOBJ.addMay("ldapIdPrefix");
            _LDAPSchemaAUXOBJ.setDmwIteratorImport("org.dmd.dmr.server.ldap.generated.dmw.LDAPSchemaAUXIterableDMW");
            _LDAPSchemaAUXOBJ.setDmoAuxClassImport("org.dmd.dmr.shared.ldap.generated.auxw.LDAPSchemaAUXDMO");
            _LDAPSchemaAUXOBJ.setDmwAuxClass("LDAPSchemaAUX");
            _LDAPSchemaAUXOBJ.setDmoAuxClass("LDAPSchemaAUXDMO");
            _LDAPSchemaAUXOBJ.setDmwAuxClassImport("org.dmd.dmr.server.ldap.generated.auxw.LDAPSchemaAUX");
            _LDAPSchemaAUX.setDefinedIn(this);
            addClassDefList(_LDAPSchemaAUX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:520)
            ClassDefinitionDMO _LDAPClassAUXOBJ = new ClassDefinitionDMO();
            _LDAPClassAUX = new ClassDefinition(_LDAPClassAUXOBJ,DmrLdapDMSAG.__LDAPClassAUX);
            _LDAPClassAUXOBJ.setName("LDAPClassAUX");
            _LDAPClassAUXOBJ.setDmdID("452");
            _LDAPClassAUXOBJ.setClassType("AUXILIARY");
            _LDAPClassAUXOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPClassAUXOBJ.setLineNumber("19");
            _LDAPClassAUXOBJ.setDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition\n class with information required to map objects onto an LDAP repository.");
            _LDAPClassAUXOBJ.addIntendedToExtend("ClassDefinition");
            _LDAPClassAUXOBJ.setDmtREFImport("org.dmd.dmr.shared.ldap.generated.types.LDAPClassAUXREF");
            _LDAPClassAUXOBJ.setDmwIteratorClass("LDAPClassAUXIterableDMW");
            _LDAPClassAUXOBJ.addMay("reposName");
            _LDAPClassAUXOBJ.addMay("namingAttribute");
            _LDAPClassAUXOBJ.setDmwIteratorImport("org.dmd.dmr.server.ldap.generated.dmw.LDAPClassAUXIterableDMW");
            _LDAPClassAUXOBJ.setDmoAuxClassImport("org.dmd.dmr.shared.ldap.generated.auxw.LDAPClassAUXDMO");
            _LDAPClassAUXOBJ.setDmwAuxClass("LDAPClassAUX");
            _LDAPClassAUXOBJ.setDmoAuxClass("LDAPClassAUXDMO");
            _LDAPClassAUXOBJ.setDmwAuxClassImport("org.dmd.dmr.server.ldap.generated.auxw.LDAPClassAUX");
            _LDAPClassAUX.setDefinedIn(this);
            addClassDefList(_LDAPClassAUX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:520)
            ClassDefinitionDMO _LDAPAttributeAUXOBJ = new ClassDefinitionDMO();
            _LDAPAttributeAUX = new ClassDefinition(_LDAPAttributeAUXOBJ,DmrLdapDMSAG.__LDAPAttributeAUX);
            _LDAPAttributeAUXOBJ.setName("LDAPAttributeAUX");
            _LDAPAttributeAUXOBJ.setDmdID("453");
            _LDAPAttributeAUXOBJ.setClassType("AUXILIARY");
            _LDAPAttributeAUXOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPAttributeAUXOBJ.setLineNumber("28");
            _LDAPAttributeAUXOBJ.setDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition\n class with information required to map objects onto an LDAP repository.");
            _LDAPAttributeAUXOBJ.addIntendedToExtend("AttributeDefinition");
            _LDAPAttributeAUXOBJ.setDmtREFImport("org.dmd.dmr.shared.ldap.generated.types.LDAPAttributeAUXREF");
            _LDAPAttributeAUXOBJ.setDmwIteratorClass("LDAPAttributeAUXIterableDMW");
            _LDAPAttributeAUXOBJ.addMay("reposName");
            _LDAPAttributeAUXOBJ.setDmwIteratorImport("org.dmd.dmr.server.ldap.generated.dmw.LDAPAttributeAUXIterableDMW");
            _LDAPAttributeAUXOBJ.setDmoAuxClassImport("org.dmd.dmr.shared.ldap.generated.auxw.LDAPAttributeAUXDMO");
            _LDAPAttributeAUXOBJ.setDmwAuxClass("LDAPAttributeAUX");
            _LDAPAttributeAUXOBJ.setDmoAuxClass("LDAPAttributeAUXDMO");
            _LDAPAttributeAUXOBJ.setDmwAuxClassImport("org.dmd.dmr.server.ldap.generated.auxw.LDAPAttributeAUX");
            _LDAPAttributeAUX.setDefinedIn(this);
            addClassDefList(_LDAPAttributeAUX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:520)
            ClassDefinitionDMO _LDAPHierarchicObjectOBJ = new ClassDefinitionDMO();
            _LDAPHierarchicObject = new ClassDefinition(_LDAPHierarchicObjectOBJ,DmrLdapDMSAG.__LDAPHierarchicObject);
            _LDAPHierarchicObjectOBJ.setName("LDAPHierarchicObject");
            _LDAPHierarchicObjectOBJ.setDmdID("454");
            _LDAPHierarchicObjectOBJ.setClassType("STRUCTURAL");
            _LDAPHierarchicObjectOBJ.setDataType("PERSISTENT");
            _LDAPHierarchicObjectOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPHierarchicObjectOBJ.setLineNumber("48");
            _LDAPHierarchicObjectOBJ.setDescription("The LDAPHierarchicObject provides some additional structure and\n conventions to the HierarchicObject to make it usable in conjunction with an LDAP\n enabled directory server. Classes derived from LDAPHierarchicObject must be defined\n in a schema that has been extended with the LDAPSchemaExtension auxiliary class and\n must themselves be extended with the LDAPClassExtension auxiliary class; the class\n must have a defined naming attribute. Furthermore, naming attributes should be\n unique for each defined class.");
            _LDAPHierarchicObjectOBJ.setDerivedFrom("HierarchicObject");
            _LDAPHierarchicObjectOBJ.setIsNamedBy("FQN");
            _LDAPHierarchicObjectOBJ.setUseWrapperType("EXTENDED");
            _LDAPHierarchicObjectOBJ.setDmtREFImport("org.dmd.dmr.shared.ldap.generated.types.LDAPHierarchicObjectREF");
            _LDAPHierarchicObjectOBJ.setDmwIteratorClass("LDAPHierarchicObjectIterableDMW");
            _LDAPHierarchicObjectOBJ.addMust("FQN");
            _LDAPHierarchicObjectOBJ.setDmwIteratorImport("org.dmd.dmr.server.ldap.generated.dmw.LDAPHierarchicObjectIterableDMW");
            _LDAPHierarchicObject.setDefinedIn(this);
            addClassDefList(_LDAPHierarchicObject);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:520)
            AttributeDefinitionDMO _ldapIdPrefixOBJ = new AttributeDefinitionDMO();
            _ldapIdPrefix = new AttributeDefinition(_ldapIdPrefixOBJ);
            _ldapIdPrefixOBJ.setType("String");
            _ldapIdPrefixOBJ.setName("ldapIdPrefix");
            _ldapIdPrefixOBJ.setDmdID("450");
            _ldapIdPrefixOBJ.setDescription("The ldapIdPrefix is defined for use against an entire schema. It\n indicates the prefix that will be added to all class and attribute definitions\n that are loaded into the directory as schema. Having a prefix prevents possible\n collisions with existing schema definitions. The prefix should be short, 2 or 3\n characters.");
            _ldapIdPrefix.setDefinedIn(this);
            _ldapIdPrefixOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/attributes.dmd");
            _ldapIdPrefixOBJ.setLineNumber("10");
            addAttributeDefList(_ldapIdPrefix);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:520)
            AttributeDefinitionDMO _reposNameOBJ = new AttributeDefinitionDMO();
            _reposName = new AttributeDefinition(_reposNameOBJ);
            _reposNameOBJ.setType("String");
            _reposNameOBJ.setName("reposName");
            _reposNameOBJ.setDmdID("451");
            _reposNameOBJ.setDescription("This attribute indicates the name of an attribute or class when\n it is stored in a repository and added to that repository's schema. Generally\n speaking, we will always use the standard prefix for all attribute and class\n names. Like all other name values, this one must be globally unique.");
            _reposName.setDefinedIn(this);
            _reposNameOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/attributes.dmd");
            _reposNameOBJ.setLineNumber("18");
            addAttributeDefList(_reposName);

    }

    private void initTypes() throws DmcValueException {
    }

    private void initActions() throws DmcValueException {
    }

    private void initEnums() throws DmcValueException {
    }

    private void initRules() throws DmcValueException {
    }


    @Override
    public synchronized DmrLdapSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

