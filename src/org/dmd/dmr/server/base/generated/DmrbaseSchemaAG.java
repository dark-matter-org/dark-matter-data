//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmr.server.base.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmr.shared.base.generated.dmo.DmrbaseDMSAG;


/**
 * The dmrbase schema defines classes that provide base support\n for the
 * Dark Matter Repository (DMR) concepts.
 * <P>
 * Generated from the dmrbase schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:182)
 */
public class DmrbaseSchemaAG extends SchemaDefinition {

    public static ClassDefinition _HierarchicObject;
    public static ClassDefinition _DotNamedObject;

    public static AttributeDefinition _userName;
    public static AttributeDefinition _password;







    static DmrbaseSchemaAG instance;

    public DmrbaseSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmr.server.base.generated.DmrbaseSchemaAG";

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:208)
    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmrbase");
            me.setDotName("dmrbase");
            me.setSchemaPackage("org.dmd.dmr.shared.base");
            me.setDmwPackage("org.dmd.dmr.server.base");
            me.setFile("/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/dmrbase.dms");

            initClasses();
            initAttributes1();
            initTypes();
            initComplexTypes();
            initActions();
            initEnums();
            initRules();
            initDSDModules();
            DmcOmni.instance().addCompactSchema(DmrbaseDMSAG.instance());
        }
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _HierarchicObjectOBJ = new ClassDefinitionDMO();
            _HierarchicObject = new ClassDefinition(_HierarchicObjectOBJ,DmrbaseDMSAG.__HierarchicObject);
            _HierarchicObjectOBJ.setName("HierarchicObject");
            _HierarchicObjectOBJ.setDmdID("401");
            _HierarchicObjectOBJ.setClassType("STRUCTURAL");
            _HierarchicObjectOBJ.setFile("/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/classes.dmd");
            _HierarchicObjectOBJ.setLineNumber("15");
            _HierarchicObjectOBJ.setDescription("A HierarchicObject is meant to represent any object that can\n be identified with a Fully Qualified Name (FQN) and exists in a containment\n relationship with other objects. The exact implementation of a HierarchicObject\n is application specific.");
            _HierarchicObjectOBJ.setIsNamedBy("meta.FQN");
            _HierarchicObjectOBJ.setUseWrapperType("EXTENDED");
            _HierarchicObjectOBJ.setDmtREFImport("org.dmd.dmr.shared.base.generated.types.HierarchicObjectREF");
            _HierarchicObjectOBJ.setDmwIteratorClass("HierarchicObjectIterableDMW");
            _HierarchicObjectOBJ.addMay("meta.lineNumber");
            _HierarchicObjectOBJ.addMay("meta.file");
            _HierarchicObjectOBJ.addMust("meta.FQN");
            _HierarchicObjectOBJ.setDmwIteratorImport("org.dmd.dmr.server.base.generated.dmw.HierarchicObjectIterableDMW");
            _HierarchicObjectOBJ.setDotName("dmrbase.HierarchicObject.ClassDefinition");
            _HierarchicObject.setDefinedIn(this);
            addClassDefList(_HierarchicObject);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _DotNamedObjectOBJ = new ClassDefinitionDMO();
            _DotNamedObject = new ClassDefinition(_DotNamedObjectOBJ,DmrbaseDMSAG.__DotNamedObject);
            _DotNamedObjectOBJ.setName("DotNamedObject");
            _DotNamedObjectOBJ.setDmdID("402");
            _DotNamedObjectOBJ.setClassType("STRUCTURAL");
            _DotNamedObjectOBJ.setFile("/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/classes.dmd");
            _DotNamedObjectOBJ.setLineNumber("33");
            _DotNamedObjectOBJ.setDescription("A DotNamedObject is a hierarchic object whose fully qualified\n name is composed of naming attributes separated by periods. For example \n grandparent.parent.child.\n <p>\n The naming attribute of a DotNamedObject is name. Unlike LDAP objects, \n we don't bother making this configurable. When a DotNamedObject is parsed\n from a file, we check to see if the name attribute has a value; if not,\n we take the last portion of the FQN as the name. For example, if the FQN\n is x.y.z, the name of the object would be 'z'.");
            _DotNamedObjectOBJ.setDerivedFrom("dmrbase.HierarchicObject");
            _DotNamedObjectOBJ.setIsNamedBy("meta.FQN");
            _DotNamedObjectOBJ.setUseWrapperType("EXTENDED");
            _DotNamedObjectOBJ.setDmtREFImport("org.dmd.dmr.shared.base.generated.types.DotNamedObjectREF");
            _DotNamedObjectOBJ.setDmwIteratorClass("DotNamedObjectIterableDMW");
            _DotNamedObjectOBJ.addMust("meta.FQN");
            _DotNamedObjectOBJ.setDmwIteratorImport("org.dmd.dmr.server.base.generated.dmw.DotNamedObjectIterableDMW");
            _DotNamedObjectOBJ.setDotName("dmrbase.DotNamedObject.ClassDefinition");
            _DotNamedObject.setDefinedIn(this);
            addClassDefList(_DotNamedObject);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _userNameOBJ = new AttributeDefinitionDMO();
            _userName = new AttributeDefinition(_userNameOBJ);
            _userNameOBJ.setType("meta.String");
            _userNameOBJ.setName("userName");
            _userNameOBJ.setDmdID("400");
            _userNameOBJ.setDescription("The name of a user.");
            _userNameOBJ.setDataType("PERSISTENT");
            _userNameOBJ.setDotName("dmrbase.userName.AttributeDefinition");
            _userName.setDefinedIn(this);
            _userNameOBJ.setFile("/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/attributes.dmd");
            _userNameOBJ.setLineNumber("47");
            addAttributeDefList(_userName);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _passwordOBJ = new AttributeDefinitionDMO();
            _password = new AttributeDefinition(_passwordOBJ);
            _passwordOBJ.setType("meta.String");
            _passwordOBJ.setName("password");
            _passwordOBJ.setDmdID("401");
            _passwordOBJ.setDescription("A user's password.");
            _passwordOBJ.setDataType("PERSISTENT");
            _passwordOBJ.setDotName("dmrbase.password.AttributeDefinition");
            _password.setDefinedIn(this);
            _passwordOBJ.setFile("/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/attributes.dmd");
            _passwordOBJ.setLineNumber("54");
            addAttributeDefList(_password);

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
    public synchronized DmrbaseSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

