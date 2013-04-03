//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
import org.dmd.dmc.definitions.DmcDefinitionIF;

/**
 * The ExtendedReferenceTypeDefinition provides a mechanism for extending \n
 * the automatically generated named object reference attribute types with
 * additional\n information. This can be seen as adding additional
 * information to the relationship\n between two objects.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1585)
 */
@SuppressWarnings("unused")
public class ExtendedReferenceTypeDefinitionDMW extends org.dmd.dms.ComplexTypeDefinition implements DmcDefinitionIF {

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
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2333)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2406)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Indicates the class of object to which an \n
     * ExtendedReferenceTypeDefinition refers.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2333)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public void setExtendedReferenceClass(ClassDefinition value) throws DmcValueException {
        mycore.setExtendedReferenceClass(value.getDmcObject());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1748)

    /**
     * @return The name of this object from the name attribute.
     */
    public DefinitionName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
