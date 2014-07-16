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
 * The ComplexTypeDefinition provides a mechanism for defining the structure
 * of\n a complex type composed of other types. From this definition, a new
 * DmcType is generated that\n has all of the required methods automatically
 * defined.\n <p/>\n An example definition is the RuleParam:\n <pre>\n
 * ComplexTypeDefinition\n name			RuleParam\n fieldSeparator :\n field String
 * importStatement The import for the type of parameter\n field String
 * genericArgs     The generic arguments associated with this parameter\n
 * field String name            The name of the parameter\n field String
 * description     A description of the parameter\n description The RuleParam
 * type is used to succintly describe a parameter\n  to be supplied to a rule
 * when it is executed.\n </pre>\n In this case, the type has four fields,
 * all of String type. An example of the String\n format of the field might
 * be: <pre> org.dmc.DmcObject::obj:The object to be validated</pre> In
 * this\n case, the generic args field isn't available and will be the empty
 * string. When a field\n seperator is specified, all fields are, more or
 * less optional, but the underlying type\n must be able to handle the empty
 * string as a valid value. This wouldn't work with Integer.\n <p/>\n If no
 * field separator is specified, the separator is assumed to be whitespace
 * and additional\n whitespace is consumed during the parsing.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1561)
 */
@SuppressWarnings("unused")
public class ComplexTypeDefinitionDMW extends org.dmd.dms.DmsDefinition {

    private ComplexTypeDefinitionDMO mycore;

    protected ComplexTypeDefinitionDMW() {
        super(new ComplexTypeDefinitionDMO());
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected ComplexTypeDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected ComplexTypeDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  ComplexTypeDefinitionDMO getDMO() {
        return(mycore);
    }

    protected ComplexTypeDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected ComplexTypeDefinitionDMW(String mn) throws DmcValueException {
        super(new ComplexTypeDefinitionDMO());
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace\n characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2286)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2359)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The field indicates a type and name for a field in a ComplexType.
     * @return An Iterator of Field objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2465)
    public Iterator<Field> getField(){
        DmcTypeFieldMV attr = (DmcTypeFieldMV) mycore.get(MetaDMSAG.__field);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another field value.
     * @param value A value compatible with DmcTypeFieldMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2520)
    public DmcAttribute<?> addField(Object value) throws DmcValueException {
        return(mycore.addField(value));
    }

    /**
     * Returns the number of field values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2532)
    public int getFieldSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__field);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The fieldSeparator is used to indicate the separation character used\n
     * when a ComplexType is represented as a String. If a fieldSeparator isn't
     * specified, it is\n assumed to be a space.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2286)
    public String getFieldSeparator(){
        return(mycore.getFieldSeparator());
    }

    /**
     * Sets fieldSeparator to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2359)
    public void setFieldSeparator(Object value) throws DmcValueException {
        mycore.setFieldSeparator(value);
    }

    /**
     * The extendedClass indicates the fully qualified name of the class\n that
     * is derived from the generated ComplexType to provide additional behaviour.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2286)
    public String getExtendedClass(){
        return(mycore.getExtendedClass());
    }

    /**
     * Sets extendedClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2359)
    public void setExtendedClass(Object value) throws DmcValueException {
        mycore.setExtendedClass(value);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2286)
    public String getDescription(){
        return(mycore.getDescription());
    }

    public String getDescriptionWithNewlines(){
        return(mycore.getDescriptionWithNewlines());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2359)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1712)

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
