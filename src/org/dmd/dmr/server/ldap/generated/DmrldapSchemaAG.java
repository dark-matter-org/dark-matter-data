//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010-2021 dark-matter-data committers
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
import org.dmd.dmr.shared.ldap.generated.dmo.DmrldapDMSAG;


/**
 * The dmrldap schema defines classes that allow for the storage\n of Dark
 * Matter Objects in LDAP enabled Directory Servers.
 * <P>
 * Generated from the dmrldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:182)
 */
public class DmrldapSchemaAG extends SchemaDefinition {

    public static ClassDefinition _LDAPSchemaAUX;
    public static ClassDefinition _LDAPClassAUX;
    public static ClassDefinition _LDAPAttributeAUX;
    public static ClassDefinition _LDAPHierarchicObject;

    public static AttributeDefinition _ldapIdPrefix;
    public static AttributeDefinition _reposName;







    static DmrldapSchemaAG instance;

    public DmrldapSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmr.server.ldap.generated.DmrldapSchemaAG";

        dependsOnSchemaClasses.put("dmrbase","org.dmd.dmr.server.base.generated.DmrbaseSchemaAG");

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:208)
    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmrldap");
            me.setDotName("dmrldap");
            me.setSchemaPackage("org.dmd.dmr.shared.ldap");
            me.setDmwPackage("org.dmd.dmr.server.ldap");
            me.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/dmrldap.dms");


            me.addDependsOn("dmrbase");
            dependsOnSchemaClasses.put("dmrbase","org.dmd.dmr.server.base.generated.DmrbaseSchemaAG");


            initClasses();
            initAttributes1();
            initTypes();
            initComplexTypes();
            initActions();
            initEnums();
            initRules();
            initDSDModules();
            DmcOmni.instance().addCompactSchema(DmrldapDMSAG.instance());
        }
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _LDAPSchemaAUXOBJ = new ClassDefinitionDMO();
            _LDAPSchemaAUX = new ClassDefinition(_LDAPSchemaAUXOBJ,DmrldapDMSAG.__LDAPSchemaAUX);
            _LDAPSchemaAUXOBJ.setName("LDAPSchemaAUX");
            _LDAPSchemaAUXOBJ.setDmdID("901");
            _LDAPSchemaAUXOBJ.setClassType("AUXILIARY");
            _LDAPSchemaAUXOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPSchemaAUXOBJ.setLineNumber("1");
            _LDAPSchemaAUXOBJ.addDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition\n class with information required to map objects onto an LDAP repository.");
            _LDAPSchemaAUXOBJ.addIntendedToExtend("meta.SchemaDefinition");
            _LDAPSchemaAUXOBJ.addMay("dmrldap.ldapIdPrefix");
            _LDAPSchemaAUXOBJ.setDmwIteratorImport("org.dmd.dmr.server.ldap.generated.dmw.LDAPSchemaAUXIterableDMW");
            _LDAPSchemaAUXOBJ.setDmwIteratorClass("LDAPSchemaAUXIterableDMW");
            _LDAPSchemaAUXOBJ.setDmtREFImport("org.dmd.dmr.shared.ldap.generated.types.LDAPSchemaAUXREF");
            _LDAPSchemaAUXOBJ.setDmoAuxClass("LDAPSchemaAUXDMO");
            _LDAPSchemaAUXOBJ.setDmoAuxClassImport("org.dmd.dmr.shared.ldap.generated.auxw.LDAPSchemaAUXDMO");
            _LDAPSchemaAUXOBJ.setDmwAuxClass("LDAPSchemaAUX");
            _LDAPSchemaAUXOBJ.setDmwAuxClassImport("org.dmd.dmr.server.ldap.generated.auxw.LDAPSchemaAUX");
            _LDAPSchemaAUXOBJ.setDotName("dmrldap.LDAPSchemaAUX.ClassDefinition");
            _LDAPSchemaAUX.setDefinedIn(this);
            addClassDefList(_LDAPSchemaAUX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _LDAPClassAUXOBJ = new ClassDefinitionDMO();
            _LDAPClassAUX = new ClassDefinition(_LDAPClassAUXOBJ,DmrldapDMSAG.__LDAPClassAUX);
            _LDAPClassAUXOBJ.setName("LDAPClassAUX");
            _LDAPClassAUXOBJ.setDmdID("902");
            _LDAPClassAUXOBJ.setClassType("AUXILIARY");
            _LDAPClassAUXOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPClassAUXOBJ.setLineNumber("10");
            _LDAPClassAUXOBJ.addDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition\n class with information required to map objects onto an LDAP repository.");
            _LDAPClassAUXOBJ.addIntendedToExtend("meta.ClassDefinition");
            _LDAPClassAUXOBJ.addMay("dmrldap.reposName");
            _LDAPClassAUXOBJ.addMay("meta.namingAttribute");
            _LDAPClassAUXOBJ.setDmwIteratorImport("org.dmd.dmr.server.ldap.generated.dmw.LDAPClassAUXIterableDMW");
            _LDAPClassAUXOBJ.setDmwIteratorClass("LDAPClassAUXIterableDMW");
            _LDAPClassAUXOBJ.setDmtREFImport("org.dmd.dmr.shared.ldap.generated.types.LDAPClassAUXREF");
            _LDAPClassAUXOBJ.setDmoAuxClass("LDAPClassAUXDMO");
            _LDAPClassAUXOBJ.setDmoAuxClassImport("org.dmd.dmr.shared.ldap.generated.auxw.LDAPClassAUXDMO");
            _LDAPClassAUXOBJ.setDmwAuxClass("LDAPClassAUX");
            _LDAPClassAUXOBJ.setDmwAuxClassImport("org.dmd.dmr.server.ldap.generated.auxw.LDAPClassAUX");
            _LDAPClassAUXOBJ.setDotName("dmrldap.LDAPClassAUX.ClassDefinition");
            _LDAPClassAUX.setDefinedIn(this);
            addClassDefList(_LDAPClassAUX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _LDAPAttributeAUXOBJ = new ClassDefinitionDMO();
            _LDAPAttributeAUX = new ClassDefinition(_LDAPAttributeAUXOBJ,DmrldapDMSAG.__LDAPAttributeAUX);
            _LDAPAttributeAUXOBJ.setName("LDAPAttributeAUX");
            _LDAPAttributeAUXOBJ.setDmdID("903");
            _LDAPAttributeAUXOBJ.setClassType("AUXILIARY");
            _LDAPAttributeAUXOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPAttributeAUXOBJ.setLineNumber("20");
            _LDAPAttributeAUXOBJ.addDescription("The LDAPSchemaExtension class is used to extend the basic SchemaDefinition\n class with information required to map objects onto an LDAP repository.");
            _LDAPAttributeAUXOBJ.addIntendedToExtend("meta.AttributeDefinition");
            _LDAPAttributeAUXOBJ.addMay("dmrldap.reposName");
            _LDAPAttributeAUXOBJ.setDmwIteratorImport("org.dmd.dmr.server.ldap.generated.dmw.LDAPAttributeAUXIterableDMW");
            _LDAPAttributeAUXOBJ.setDmwIteratorClass("LDAPAttributeAUXIterableDMW");
            _LDAPAttributeAUXOBJ.setDmtREFImport("org.dmd.dmr.shared.ldap.generated.types.LDAPAttributeAUXREF");
            _LDAPAttributeAUXOBJ.setDmoAuxClass("LDAPAttributeAUXDMO");
            _LDAPAttributeAUXOBJ.setDmoAuxClassImport("org.dmd.dmr.shared.ldap.generated.auxw.LDAPAttributeAUXDMO");
            _LDAPAttributeAUXOBJ.setDmwAuxClass("LDAPAttributeAUX");
            _LDAPAttributeAUXOBJ.setDmwAuxClassImport("org.dmd.dmr.server.ldap.generated.auxw.LDAPAttributeAUX");
            _LDAPAttributeAUXOBJ.setDotName("dmrldap.LDAPAttributeAUX.ClassDefinition");
            _LDAPAttributeAUX.setDefinedIn(this);
            addClassDefList(_LDAPAttributeAUX);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _LDAPHierarchicObjectOBJ = new ClassDefinitionDMO();
            _LDAPHierarchicObject = new ClassDefinition(_LDAPHierarchicObjectOBJ,DmrldapDMSAG.__LDAPHierarchicObject);
            _LDAPHierarchicObjectOBJ.setName("LDAPHierarchicObject");
            _LDAPHierarchicObjectOBJ.setDmdID("904");
            _LDAPHierarchicObjectOBJ.setClassType("STRUCTURAL");
            _LDAPHierarchicObjectOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/classes.dmd");
            _LDAPHierarchicObjectOBJ.setDataType("PERSISTENT");
            _LDAPHierarchicObjectOBJ.setLineNumber("29");
            _LDAPHierarchicObjectOBJ.setIsNamedBy("meta.FQN");
            _LDAPHierarchicObjectOBJ.addDescription("Way too long!");
            _LDAPHierarchicObjectOBJ.setUseWrapperType("EXTENDED");
            _LDAPHierarchicObjectOBJ.setDerivedFrom("dmrbase.HierarchicObject");
            _LDAPHierarchicObjectOBJ.addMust("meta.FQN");
            _LDAPHierarchicObjectOBJ.setDmwIteratorImport("org.dmd.dmr.server.ldap.generated.dmw.LDAPHierarchicObjectIterableDMW");
            _LDAPHierarchicObjectOBJ.setDmwIteratorClass("LDAPHierarchicObjectIterableDMW");
            _LDAPHierarchicObjectOBJ.setDmtREFImport("org.dmd.dmr.shared.ldap.generated.types.LDAPHierarchicObjectREF");
            _LDAPHierarchicObjectOBJ.setDotName("dmrldap.LDAPHierarchicObject.ClassDefinition");
            _LDAPHierarchicObject.setDefinedIn(this);
            addClassDefList(_LDAPHierarchicObject);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _ldapIdPrefixOBJ = new AttributeDefinitionDMO();
            _ldapIdPrefix = new AttributeDefinition(_ldapIdPrefixOBJ);
            _ldapIdPrefixOBJ.addDescription("The ldapIdPrefix is defined for use against an entire schema. It\n indicates the prefix that will be added to all class and attribute definitions\n that are loaded into the directory as schema. Having a prefix prevents possible\n collisions with existing schema definitions. The prefix should be short, 2 or 3\n characters.");
            _ldapIdPrefixOBJ.setName("ldapIdPrefix");
            _ldapIdPrefixOBJ.setDmdID("450");
            _ldapIdPrefixOBJ.setType("meta.String");
            _ldapIdPrefixOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/attributes.dmd");
            _ldapIdPrefixOBJ.setDotName("dmrldap.ldapIdPrefix.AttributeDefinition");
            _ldapIdPrefixOBJ.setLineNumber("1");
            _ldapIdPrefix.setDefinedIn(this);
            addAttributeDefList(_ldapIdPrefix);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _reposNameOBJ = new AttributeDefinitionDMO();
            _reposName = new AttributeDefinition(_reposNameOBJ);
            _reposNameOBJ.addDescription("This attribute indicates the name of an attribute or class when\n it is stored in a repository and added to that repository's schema. Generally\n speaking, we will always use the standard prefix for all attribute and class\n names. Like all other name values, this one must be globally unique.");
            _reposNameOBJ.setName("reposName");
            _reposNameOBJ.setDmdID("451");
            _reposNameOBJ.setType("meta.String");
            _reposNameOBJ.setFile("/src/org/dmd/dmr/shared/ldap/dmdconfig/v0dot1/attributes.dmd");
            _reposNameOBJ.setDotName("dmrldap.reposName.AttributeDefinition");
            _reposNameOBJ.setLineNumber("11");
            _reposName.setDefinedIn(this);
            addAttributeDefList(_reposName);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initTypes() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initComplexTypes() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initActions() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initEnums() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initRules() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initDSDModules() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:272)

    @Override
    public synchronized DmrldapSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

