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
package org.dmd.dms.generated.dmw;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dmw.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * The ExtendedReferenceTypeDefinition provides a mechanism for extending 
 * the automatically generated named object reference attribute types with
 * additional information. This can be seen as adding additional information
 * to the relationship between two objects.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:986)
 */
@SuppressWarnings("unused")
public class ExtendedReferenceTypeDefinitionDMW extends org.dmd.dms.ComplexTypeDefinition {

    private ExtendedReferenceTypeDefinitionDMO mycore;

    protected ExtendedReferenceTypeDefinitionDMW() {
        super(new ExtendedReferenceTypeDefinitionDMO());
        mycore = (ExtendedReferenceTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected ExtendedReferenceTypeDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (ExtendedReferenceTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected ExtendedReferenceTypeDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ExtendedReferenceTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  ExtendedReferenceTypeDefinitionDMO getDMO() {
        return(mycore);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1573)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1625)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Indicates the class of object to which an  ExtendedReferenceTypeDefinition
     * refers.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1573)
    public ClassDefinition getExtendedReferenceClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) mycore.get(MetaDMSAG.__extendedReferenceClass);
        if (attr == null)
            return(null);
        ClassDefinitionDMO obj = attr.getSV().getObject();
        return((ClassDefinition)obj.getContainer());
    }

    /**
     * Sets extendedReferenceClass to the specified value.
     * @param value A value compatible with ClassDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1615)
    public void setExtendedReferenceClass(ClassDefinition value) throws DmcValueException {
        mycore.setExtendedReferenceClass(value.getDmcObject());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    public StringName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
