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

/**
 * The SliceDefinition class is used to define a named set of attributes

 * that are used to retrieve a slice of an object i.e. an abbreviated set of

 * values. These are used in the generation of static, named DmcSliceInfo
 * instances.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1561)
 */
@SuppressWarnings("unused")
public class SliceDefinitionDMW extends org.dmd.dms.DmsDefinition {

    private SliceDefinitionDMO mycore;

    protected SliceDefinitionDMW() {
        super(new SliceDefinitionDMO());
        mycore = (SliceDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected SliceDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (SliceDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected SliceDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (SliceDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  SliceDefinitionDMO getDMO() {
        return(mycore);
    }

    protected SliceDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected SliceDefinitionDMW(String mn) throws DmcValueException {
        super(new SliceDefinitionDMO());
        mycore = (SliceDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name
 for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace
 characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2255)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2318)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The selectAttribute indicates an attribute to be used in the definition

     * of a Slice.
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2406)
    public AttributeDefinitionIterableDMW getSelectAttribute(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__selectAttribute);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another selectAttribute value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2465)
    public DmcAttribute<?> addSelectAttribute(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addSelectAttribute(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of selectAttribute values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2491)
    public int getSelectAttributeSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__selectAttribute);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The description attribute is used to provide descriptive
 documentation
     * for schema related definitions. The text provided should conform
 to XHTML
     * concepts since it will be dumped in the context of the generated HTML

     * documentation.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2255)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2318)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
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