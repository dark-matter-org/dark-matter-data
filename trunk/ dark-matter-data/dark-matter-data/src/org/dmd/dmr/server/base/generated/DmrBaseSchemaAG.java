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

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;


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
            me.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/dmr.base.dms");

            ClassDefinitionDMO _HierarchicObjectOBJ = new ClassDefinitionDMO();
            _HierarchicObject = new ClassDefinition(_HierarchicObjectOBJ);
            _HierarchicObjectOBJ.setClassType("STRUCTURAL");
            _HierarchicObject.setDefinedIn(this);
            _HierarchicObjectOBJ.setDescription("A HierarchicObject is meant to represent any object that can be identified with a Fully Qualified Name (FQN) and exists in a containment relationship with other objects. The exact implementation of a HierarchicObject is application specific.");
            _HierarchicObjectOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/classes.dmd");
            _HierarchicObjectOBJ.setIsNamedBy("FQN");
            _HierarchicObjectOBJ.setLineNumber("14");
            _HierarchicObjectOBJ.addMay("parentFQN");
            _HierarchicObjectOBJ.addMay("lineNumber");
            _HierarchicObjectOBJ.addMay("file");
            _HierarchicObjectOBJ.addMust("FQN");
            _HierarchicObjectOBJ.setName("HierarchicObject");
            _HierarchicObjectOBJ.addObjectClass("ClassDefinition");
            _HierarchicObjectOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_HierarchicObject);

            ClassDefinitionDMO _DotNamedObjectOBJ = new ClassDefinitionDMO();
            _DotNamedObject = new ClassDefinition(_DotNamedObjectOBJ);
            _DotNamedObjectOBJ.setClassType("STRUCTURAL");
            _DotNamedObject.setDefinedIn(this);
            _DotNamedObjectOBJ.setDerivedFrom("HierarchicObject");
            _DotNamedObjectOBJ.setDescription("A DotNamedObject is a hierarchic object whose fully qualified name is composed of naming attributes separated by periods. For example  grandparent.parent.child. <p> The naming attribute of a DotNamedObject is name. Unlike LDAP objects,  we don't bother making this configurable. When a DotNamedObject is parsed from a file, we check to see if the name attribute has a value; if not, we take the last portion of the FQN as the name. For example, if the FQN is x.y.z, the name of the object would be 'z'.");
            _DotNamedObjectOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/classes.dmd");
            _DotNamedObjectOBJ.setIsNamedBy("FQN");
            _DotNamedObjectOBJ.setLineNumber("32");
            _DotNamedObjectOBJ.addMust("FQN");
            _DotNamedObjectOBJ.addMust("name");
            _DotNamedObjectOBJ.setName("DotNamedObject");
            _DotNamedObjectOBJ.addObjectClass("ClassDefinition");
            _DotNamedObjectOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_DotNamedObject);


            AttributeDefinitionDMO _userNameOBJ = new AttributeDefinitionDMO();
            _userName = new AttributeDefinition(_userNameOBJ);
            _userNameOBJ.setDataType("PERSISTENT");
            _userName.setDefinedIn(this);
            _userNameOBJ.setDescription("The name of a user.");
            _userNameOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/attributes.dmd");
            _userNameOBJ.setLineNumber("46");
            _userNameOBJ.setName("userName");
            _userNameOBJ.addObjectClass("AttributeDefinition");
            _userNameOBJ.setType("String");
            addAttributeDefList(_userName);

            AttributeDefinitionDMO _passwordOBJ = new AttributeDefinitionDMO();
            _password = new AttributeDefinition(_passwordOBJ);
            _passwordOBJ.setDataType("PERSISTENT");
            _password.setDefinedIn(this);
            _passwordOBJ.setDescription("A user's password.");
            _passwordOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/attributes.dmd");
            _passwordOBJ.setLineNumber("52");
            _passwordOBJ.setName("password");
            _passwordOBJ.addObjectClass("AttributeDefinition");
            _passwordOBJ.setType("String");
            addAttributeDefList(_password);


        }
    }


    @Override
    public DmrBaseSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

