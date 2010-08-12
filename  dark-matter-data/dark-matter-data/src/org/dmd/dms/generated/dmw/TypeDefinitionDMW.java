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
package org.dmd.dms.generated.dmw;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * The TypeDefinition is used to define the types of attributes that can be
 * used as the basis for attribute values. The name of the type definition
 * should be the same as the actual Java class that is used to store the
 * value of an attribute e.g. the name of the type used to store strings is
 * String. If the type is not part of java.lang, you must also specify the
 * valuePackage attribute which is the fully qualified package name where the
 * type is defined. TypeDefinition are automatically generated internally for
 * ClassDefinitions and EnumDefinitions so that these objects can be referred
 * to via the type attribute of AttributeDefinitions. These definitions are
 * named <Class|Enum>Reference and are flagged with internallyGenerated =
 * true.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDefClasses(MetaGenerator.java:792)
 */
@SuppressWarnings("unused")
public class TypeDefinitionDMW extends org.dmd.dms.DmsDefinition {

    private TypeDefinitionDMO mycore;

    protected TypeDefinitionDMW() {
        super(new TypeDefinitionDMO());
        mycore = (TypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected TypeDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (TypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected TypeDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected TypeDefinitionDMW(String mn) {
        super(new TypeDefinitionDMO());
        mycore = (TypeDefinitionDMO) core;
        mycore.setContainer(this);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    public String getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value){
        mycore.setName(value);
    }

    /**
     * This is the fully qualified name of the class derived from DmcAttribute
     * that provides management of a particular type of attribute value. For
     * instance, the type class that handles String attributes  is
     * org.dmd.dmc.types.DmcTypeString
     */
    public String getTypeClass(){
        return(mycore.getTypeClass());
    }

    /**
     * Sets typeClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setTypeClass(Object value){
        mycore.setTypeClass(value);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDescription(Object value){
        mycore.setDescription(value);
    }

    /**
     * The fully qualified package name of where a value class used by a
     * TypeDefinition is defined. For example, we use EnumValue to store the
     * value of individual enumerated values, and its valuePackage is org.dmd.dms.
     */
    public String getValuePackage(){
        return(mycore.getValuePackage());
    }

    /**
     * Sets valuePackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setValuePackage(Object value){
        mycore.setValuePackage(value);
    }

    /**
     * The primitiveType indicates that we need to support a primitive set
     * interface that takes the primitive type. We will construct an object from
     * the primitive before using it in any of the attribute operations. For
     * example, for the Integer, we would generate interfaces that look like
     * set(int val), set(Integer val) and (by default) set(String val). The
     * get[attrname] function always returns the base type i.e. if we have an
     * attribute named counter, there would be a public Integer getCounter();
     * method.
     */
    public String getPrimitiveType(){
        return(mycore.getPrimitiveType());
    }

    /**
     * Sets primitiveType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setPrimitiveType(Object value){
        mycore.setPrimitiveType(value);
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to provide a default value for non-existent attribute values.
     */
    public String getNullReturnValue(){
        return(mycore.getNullReturnValue());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setNullReturnValue(Object value){
        mycore.setNullReturnValue(value);
    }

    /**
     * This flag indicates if the associated definition was internally generated.
     * This is the case for TypeDefinitions generated for ClassDefinitions and
     * EnumDefinitions that allow for references to these objects.
     */
    public Boolean getInternallyGenerated(){
        return(mycore.getInternallyGenerated());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setInternallyGenerated(Object value){
        mycore.setInternallyGenerated(value);
    }

    /**
     * This flag is set to true for type definitions that define eneumerations.
     */
    public Boolean getIsEnumType(){
        return(mycore.getIsEnumType());
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setIsEnumType(Object value){
        mycore.setIsEnumType(value);
    }


}
