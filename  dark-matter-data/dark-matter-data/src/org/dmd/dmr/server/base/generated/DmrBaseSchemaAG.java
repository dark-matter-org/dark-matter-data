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

    public static AttributeDefinition _namingAttribute;
    public static AttributeDefinition _parentFQN;
    public static AttributeDefinition _allowedParents;
    public static AttributeDefinition _allowedChildren;

    static DmrBaseSchemaAG instance;

    private DmrBaseSchemaAG() throws DmcValueException {
        SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
        me.setName("dmr.base");
        me.setSchemaPackage("org.dmd.dmr.shared.base");
        me.setDmwPackage("org.dmd.dmr.server.base");
        me.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/dmr.base.dms");

        ClassDefinitionDMO _HierarchicObjectOBJ = new ClassDefinitionDMO();
        _HierarchicObject = new ClassDefinition(_HierarchicObjectOBJ);
        _HierarchicObjectOBJ.setClassType("ABSTRACT");
        _HierarchicObject.setDefinedIn(this);
        _HierarchicObjectOBJ.setDescription("A HierarchicObject is meant to represent any object that can be identified with a Fully Qualified Name (FQN) and exists in a containment relationship with other objects. The exact implementation of a HierarchicObject is application specific.");
        _HierarchicObjectOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/classes.dmd");
        _HierarchicObjectOBJ.setLineNumber("11");
        _HierarchicObjectOBJ.addMay("parentFQN");
        _HierarchicObjectOBJ.addMust("FQN");
        _HierarchicObjectOBJ.setName("HierarchicObject");
        _HierarchicObjectOBJ.addObjectClass("ClassDefinition");
        _HierarchicObjectOBJ.setUseWrapperType("EXTENDED");
        addClassDefList(_HierarchicObject);


        AttributeDefinitionDMO _namingAttributeOBJ = new AttributeDefinitionDMO();
        _namingAttribute = new AttributeDefinition(_namingAttributeOBJ);
        _namingAttribute.setDefinedIn(this);
        _namingAttributeOBJ.setDescription("This attribute indicates the attribute that is used to name an object instance. When a hierarchic name is composed for an object, the class name plus the value of the naming attribute (type:value) is used to create the name of an object. It is best if the naming attribute value is created by the application; it shouldn't be based on any user configurable value.");
        _namingAttributeOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/attributes.dmd");
        _namingAttributeOBJ.setLineNumber("9");
        _namingAttributeOBJ.setName("namingAttribute");
        _namingAttributeOBJ.addObjectClass("AttributeDefinition");
        _namingAttributeOBJ.setType("AttributeDefinition");
        addAttributeDefList(_namingAttribute);

        AttributeDefinitionDMO _parentFQNOBJ = new AttributeDefinitionDMO();
        _parentFQN = new AttributeDefinition(_parentFQNOBJ);
        _parentFQN.setDefinedIn(this);
        _parentFQNOBJ.setDescription("The name of a hierarchic object's parent.");
        _parentFQNOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/attributes.dmd");
        _parentFQNOBJ.setLineNumber("20");
        _parentFQNOBJ.setName("parentFQN");
        _parentFQNOBJ.addObjectClass("AttributeDefinition");
        _parentFQNOBJ.setType("String");
        addAttributeDefList(_parentFQN);

        AttributeDefinitionDMO _allowedParentsOBJ = new AttributeDefinitionDMO();
        _allowedParents = new AttributeDefinition(_allowedParentsOBJ);
        _allowedParents.setDefinedIn(this);
        _allowedParentsOBJ.setDescription("Indicates the classes of object that may be parents of the current class when objects are created in an instance hierarchy.");
        _allowedParentsOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/attributes.dmd");
        _allowedParentsOBJ.setIsMultiValued("true");
        _allowedParentsOBJ.setLineNumber("27");
        _allowedParentsOBJ.setName("allowedParents");
        _allowedParentsOBJ.addObjectClass("AttributeDefinition");
        _allowedParentsOBJ.setType("ClassDefinition");
        addAttributeDefList(_allowedParents);

        AttributeDefinitionDMO _allowedChildrenOBJ = new AttributeDefinitionDMO();
        _allowedChildren = new AttributeDefinition(_allowedChildrenOBJ);
        _allowedChildren.setDefinedIn(this);
        _allowedChildrenOBJ.setDescription("Indicates the classes of object that may be children of the current class when objects are created in an instance hierarchy.");
        _allowedChildrenOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmr/shared/base/dmdconfig/v0dot1/attributes.dmd");
        _allowedChildrenOBJ.setIsMultiValued("true");
        _allowedChildrenOBJ.setLineNumber("34");
        _allowedChildrenOBJ.setName("allowedChildren");
        _allowedChildrenOBJ.addObjectClass("AttributeDefinition");
        _allowedChildrenOBJ.setType("ClassDefinition");
        addAttributeDefList(_allowedChildren);



    }


    public static DmrBaseSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   instance = new DmrBaseSchemaAG();
    	   return(instance);
    }
}

