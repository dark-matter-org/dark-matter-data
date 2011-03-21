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
 * String. The typeClassName is the fully qualified name of the class derived
 * from DmcAttribute that stores this type of value; they are always, by
 * conventional, named DmcTypeXXX. <P> TypeDefinitions are automatically
 * generated internally for ClassDefinitions and EnumDefinitions so that
 * these objects can be referred to via the type attribute of
 * AttributeDefinitions. These definitions are marked as internallyGenerated.
 * @author Auto Generated
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:850)
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

    protected TypeDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (TypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<TypeDefinition>());
    }

    protected TypeDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected TypeDefinitionDMW(String mn) throws DmcValueException {
        super(new TypeDefinitionDMO());
        mycore = (TypeDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * This is the fully qualified name of the class derived from DmcAttribute
     * that provides management of a particular type of attribute value. For
     * instance, the type class that handles String attributes  is
     * org.dmd.dmc.types.DmcTypeString
     */
    public String getTypeClassName(){
        return(mycore.getTypeClassName());
    }

    /**
     * Sets typeClassName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setTypeClassName(Object value) throws DmcValueException {
        mycore.setTypeClassName(value);
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
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
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
    public void setNullReturnValue(Object value) throws DmcValueException {
        mycore.setNullReturnValue(value);
    }

    /**
     * This is the fully qualified name of the wrapper class derived from
     * DmcWrapperBase that wraps a DMO. This is used when generating object
     * reference classes associated with ClassDefinitions This actually aligns to
     * the javaClass of the ClassDefinition for which we're generating the
     * reference classes.
     */
    public String getWrapperClassName(){
        return(mycore.getWrapperClassName());
    }

    /**
     * Sets wrapperClassName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setWrapperClassName(Object value) throws DmcValueException {
        mycore.setWrapperClassName(value);
    }

    /**
     * The primitiveType indicates the underlying type of a DmcType.
     */
    public String getPrimitiveType(){
        return(mycore.getPrimitiveType());
    }

    /**
     * Sets primitiveType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setPrimitiveType(Object value) throws DmcValueException {
        mycore.setPrimitiveType(value);
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
    public void setInternallyGenerated(Object value) throws DmcValueException {
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
    public void setIsEnumType(Object value) throws DmcValueException {
        mycore.setIsEnumType(value);
    }

    /**
     * This flag is set to true for type definitions that refer to other objects.
     */
    public Boolean getIsRefType(){
        return(mycore.getIsRefType());
    }

    /**
     * Sets isRefType to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setIsRefType(Object value) throws DmcValueException {
        mycore.setIsRefType(value);
    }

    /**
     * This attribute indicates the full name of the generated helper class for 
     * object references i.e. if you had a ClassDefinition X, the framework
     * generates a  types/XREF class which is subsequently used by the
     * DmcTypeXREF class to store references to objects of the defined class.
     */
    public String getHelperClassName(){
        return(mycore.getHelperClassName());
    }

    /**
     * Sets helperClassName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setHelperClassName(Object value) throws DmcValueException {
        mycore.setHelperClassName(value);
    }

    /**
     * Refers to the class that an internally generated type represents.
     */
    public ClassDefinition getOriginalClass(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) mycore.get(TypeDefinitionDMO.__originalClass);
        if (attr == null)
            return(null);
        ClassDefinitionDMO obj = attr.getSV().getObject();
        return((ClassDefinition)obj.getContainer());
    }

    /**
     * Sets originalClass to the specified value.
     * @param value A value compatible with ClassDefinition
     */
    public void setOriginalClass(ClassDefinition value) throws DmcValueException {
        mycore.setOriginalClass(value.getDmcObject());
    }

    /**
     * This attribute indicates the full name of the DmcContainerIterator 
     * derived class that allows us to iterate over a set of object references
     * and get back the DMW wrapper object instead of the DMO.
     */
    public String getDmwIteratorImport(){
        return(mycore.getDmwIteratorImport());
    }

    /**
     * Sets dmwIteratorImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmwIteratorImport(Object value) throws DmcValueException {
        mycore.setDmwIteratorImport(value);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a class of
     * object.
     */
    public String getDmwIteratorClass(){
        return(mycore.getDmwIteratorClass());
    }

    /**
     * Sets dmwIteratorClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmwIteratorClass(Object value) throws DmcValueException {
        mycore.setDmwIteratorClass(value);
    }

    /**
     * This attribute indicates the generic arguments to be supplied in the use
     * of a class in an autogenerated Iterable.
     */
    public String getGenericArgs(){
        return(mycore.getGenericArgs());
    }

    /**
     * Sets genericArgs to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setGenericArgs(Object value) throws DmcValueException {
        mycore.setGenericArgs(value);
    }

    /**
     * This attribute indicates if a defined type is used for naming purposes.
     * This allows us to automatically add attributes of this type to the
     * AttributeFactories.
     */
    public Boolean getIsNameType(){
        return(mycore.getIsNameType());
    }

    /**
     * Sets isNameType to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setIsNameType(Object value) throws DmcValueException {
        mycore.setIsNameType(value);
    }

    /**
     * This attribute indicates the class of the key used for types that support
     * storage in a MAP.
     */
    public String getKeyClass(){
        return(mycore.getKeyClass());
    }

    /**
     * Sets keyClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setKeyClass(Object value) throws DmcValueException {
        mycore.setKeyClass(value);
    }

    /**
     * Indicates the import for a keyClass. this is required if the keyClass is
     * NOT a primitive java type e.g. Integer, String etc.
     */
    public String getKeyImport(){
        return(mycore.getKeyImport());
    }

    /**
     * Sets keyImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setKeyImport(Object value) throws DmcValueException {
        mycore.setKeyImport(value);
    }


}
