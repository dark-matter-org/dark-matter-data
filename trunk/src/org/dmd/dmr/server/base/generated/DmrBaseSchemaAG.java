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
import org.dmd.dmr.shared.base.generated.dmo.DmrBaseDMSAG;


/**
 * The dmrbase schema defines classes that provide base support for the Dark
 * Matter Repository (DMR) concepts.
 * <P>
 * Generated from the dmr.base schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:169)
 */
public class DmrBaseSchemaAG extends SchemaDefinition {

    public static ClassDefinition _HierarchicObject;
    public static ClassDefinition _DotNamedObject;

    public static AttributeDefinition _userName;
    public static AttributeDefinition _password;





    static DmrBaseSchemaAG instance;

    public DmrBaseSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmr.server.base.generated.DmrBaseSchemaAG";

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmr.base");
            me.setSchemaPackage("org.dmd.dmr.shared.base");
            me.setDmwPackage("org.dmd.dmr.server.base");
            me.setFile("/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/dmr.base.dms");

            initClasses();
            initAttributes1();
            initTypes();
            initActions();
            initEnums();
            initRules();
            DmcOmni.instance().addCompactSchema(DmrBaseDMSAG.instance());
        }
    }

    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:520)
            ClassDefinitionDMO _HierarchicObjectOBJ = new ClassDefinitionDMO();
            _HierarchicObject = new ClassDefinition(_HierarchicObjectOBJ,DmrBaseDMSAG.__HierarchicObject);
            _HierarchicObjectOBJ.setName("HierarchicObject");
            _HierarchicObjectOBJ.setDmdID("401");
            _HierarchicObjectOBJ.setClassType("STRUCTURAL");
            _HierarchicObjectOBJ.setFile("/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/classes.dmd");
            _HierarchicObjectOBJ.setLineNumber("15");
            _HierarchicObjectOBJ.setDescription("A HierarchicObject is meant to represent any object that can be identified with a Fully Qualified Name (FQN) and exists in a containment relationship with other objects. The exact implementation of a HierarchicObject is application specific.");
            _HierarchicObjectOBJ.setIsNamedBy("FQN");
            _HierarchicObjectOBJ.setUseWrapperType("EXTENDED");
            _HierarchicObjectOBJ.setDmtREFImport("org.dmd.dmr.shared.base.generated.types.HierarchicObjectREF");
            _HierarchicObjectOBJ.setDmwIteratorClass("HierarchicObjectIterableDMW");
            _HierarchicObjectOBJ.addMay("lineNumber");
            _HierarchicObjectOBJ.addMay("file");
            _HierarchicObjectOBJ.addMust("FQN");
            _HierarchicObjectOBJ.setDmwIteratorImport("org.dmd.dmr.server.base.generated.dmw.HierarchicObjectIterableDMW");
            _HierarchicObject.setDefinedIn(this);
            addClassDefList(_HierarchicObject);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:520)
            ClassDefinitionDMO _DotNamedObjectOBJ = new ClassDefinitionDMO();
            _DotNamedObject = new ClassDefinition(_DotNamedObjectOBJ,DmrBaseDMSAG.__DotNamedObject);
            _DotNamedObjectOBJ.setName("DotNamedObject");
            _DotNamedObjectOBJ.setDmdID("402");
            _DotNamedObjectOBJ.setClassType("STRUCTURAL");
            _DotNamedObjectOBJ.setFile("/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/classes.dmd");
            _DotNamedObjectOBJ.setLineNumber("33");
            _DotNamedObjectOBJ.setDescription("A DotNamedObject is a hierarchic object whose fully qualified name is composed of naming attributes separated by periods. For example  grandparent.parent.child. <p> The naming attribute of a DotNamedObject is name. Unlike LDAP objects,  we don't bother making this configurable. When a DotNamedObject is parsed from a file, we check to see if the name attribute has a value; if not, we take the last portion of the FQN as the name. For example, if the FQN is x.y.z, the name of the object would be 'z'.");
            _DotNamedObjectOBJ.setDerivedFrom("HierarchicObject");
            _DotNamedObjectOBJ.setIsNamedBy("FQN");
            _DotNamedObjectOBJ.setUseWrapperType("EXTENDED");
            _DotNamedObjectOBJ.setDmtREFImport("org.dmd.dmr.shared.base.generated.types.DotNamedObjectREF");
            _DotNamedObjectOBJ.setDmwIteratorClass("DotNamedObjectIterableDMW");
            _DotNamedObjectOBJ.addMust("FQN");
            _DotNamedObjectOBJ.setDmwIteratorImport("org.dmd.dmr.server.base.generated.dmw.DotNamedObjectIterableDMW");
            _DotNamedObject.setDefinedIn(this);
            addClassDefList(_DotNamedObject);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:520)
            AttributeDefinitionDMO _userNameOBJ = new AttributeDefinitionDMO();
            _userName = new AttributeDefinition(_userNameOBJ);
            _userNameOBJ.setType("String");
            _userNameOBJ.setName("userName");
            _userNameOBJ.setDmdID("400");
            _userNameOBJ.setDescription("The name of a user.");
            _userNameOBJ.setDataType("PERSISTENT");
            _userName.setDefinedIn(this);
            _userNameOBJ.setFile("/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/attributes.dmd");
            _userNameOBJ.setLineNumber("47");
            addAttributeDefList(_userName);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:520)
            AttributeDefinitionDMO _passwordOBJ = new AttributeDefinitionDMO();
            _password = new AttributeDefinition(_passwordOBJ);
            _passwordOBJ.setType("String");
            _passwordOBJ.setName("password");
            _passwordOBJ.setDmdID("401");
            _passwordOBJ.setDescription("A user's password.");
            _passwordOBJ.setDataType("PERSISTENT");
            _password.setDefinedIn(this);
            _passwordOBJ.setFile("/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/attributes.dmd");
            _passwordOBJ.setLineNumber("54");
            addAttributeDefList(_password);

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
    public synchronized DmrBaseSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

