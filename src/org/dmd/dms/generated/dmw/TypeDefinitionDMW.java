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
 * The <code> TypeDefinition </code> is used to define the types of
 * attributes that can be used\n as the basis for attribute values. The name
 * of the type definition should be the same as the\n actual Java class that
 * is used to store the value of an attribute e.g. the name of the type\n
 * used to store strings is String. The <code> typeClassName </code> is the
 * fully qualified name of the class\n derived from <code>DmcAttribute</code>
 * that stores this type of value; they are always, by convention,\n named
 * <code>DmcTypeXXX</code>.\n <p/>\n <code> TypeDefinitions </code> are
 * automatically generated internally for <code>ClassDefinitions</code>, \n
 * <code>ComplexTypeDefinitions</code>,
 * <code>ExtendedReferenceTypeDefinitions</code> and\n
 * <code>EnumDefinitions</code> so that these objects can be referred to via
 * the <code>type</code> attribute of <code> AttributeDefinitions</code>.\n
 * These definitions are marked as <code> internallyGenerated </code>.\n
 * <p/>\n The simplest <code> TypeDefinition </code> would look something
 * like:\n <pre>\n TypeDefinition\n name           String\n typeClassName 
 * org.dmd.dmc.types.DmcTypeString\n description    Provides support for
 * String values.\n </pre>\n This form would be used for attribute types
 * whose base type originates in <code> java.lang</code>.\n The dark-matter
 * base types include: Boolean, Byte, Double, Float, Integer, Long, Short and
 * String.\n <p/>\n <code>TypeDefinitions</code> also support the concept of
 * specifying a <code> nullReturnValue </code>\n for the entire type i.e.
 * whenever an attribute of the specified type is accessed, it will return\n
 * that value when the attribute doesn't exist in the object. An example of
 * this is the <code> Boolean </code> type:\n <pre>\n TypeDefinition\n name  
 *          Boolean\n typeClassName   org.dmd.dmc.types.DmcTypeBoolean\n
 * nullReturnValue false\n description     Provides support for Boolean
 * values. This type makes use of the\n                 nullReturnValue flag
 * so that, even if there is no\n                 value for an attribute of
 * this type, a value of false will\n                 be returned.\n </pre>\n
 * <p/>\n The next most common form of <code> TypeDefinition </code> adds the
 * <code> primitiveType </code>\n attribute. This is required for code
 * generation so that we can import the appropriate type for\n use in the
 * various getter/setter methods. An example would be the <code> Date </code>
 * type.\n <pre>\n TypeDefinition\n name           Date\n typeClassName 
 * org.dmd.dmc.types.DmcTypeDate\n primitiveType  java.util.Date\n
 * description    Provides support for Date values.\n </pre>\n Another common
 * form of <code>TypeDefinition</code> is the definition of a name type.
 * Object\n naming is a fundamental aspect of DMOs, with all object names
 * being based on the <code>DmcObjectName</code>.\n Flagging a type as being
 * a name type also implies the definition of a designated naming attribute\n
 * associated with the type. This mechanism allows for the transport of names
 * that are self\n describing in terms of their implementation type. This
 * feature supports the <code>NameContainer</code>\n type that allows any
 * name to be transported in things like dark-matter protocol
 * <code>GetRequest</code>.\n An example of a naming type would be:\n <pre>\n
 * TypeDefinition\n name           CamelCaseName\n typeClassName 
 * org.dmd.dmc.types.DmcTypeCamelCaseName\n primitiveType 
 * org.dmd.dmc.types.CamelCaseName\n isNameType     true\n description    The
 * CamelCaseName is a string based name that must start with\n               
 * an alpha character which is followed by a mix of alphanumerics.\n </pre>\n
 * And its associated designated naming attribute would be:\n <pre>\n
 * AttributeDefinition\n name                     camelCaseName\n dmdID      
 *              116\n type                     CamelCaseName\n
 * designatedNameAttribute  true\n description              The camelCaseName
 * attribute is used to store a single camelCase\n                         
 * format name for something. The name starts with a single letter\n         
 *                 and can be followed by a mix of letters and numbers. No
 * spaces or \n                          other characters are allowed.\n
 * </pre>\n The last form of type definition is one that includes some
 * additional information to provide\n a convenient, alternate interface for
 * the generation of member functions associated with\n a container type;
 * this concept is pretty much limited to the meta-schema, so it is
 * unlikely\n that non-contributors to dark-matter will make use of this
 * concept. However, here is an example:\n <pre>\n TypeDefinition\n name     
 *      NameContainer\n typeClassName 
 * org.dmd.dmc.types.DmcTypeNameContainer\n primitiveType 
 * org.dmd.dmc.types.NameContainer\n altType        DmcObjectName\n
 * altTypeImport  org.dmd.dmc.DmcObjectName\n description    The
 * NameContainer type allows for the storage of object names of different
 * types...\n </pre> 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1643)
 */
@SuppressWarnings("unused")
public class TypeDefinitionDMW extends org.dmd.dms.DmsDefinition implements DmcDefinitionIF {

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

    public  TypeDefinitionDMO getDMO() {
        return(mycore);
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
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * This is the fully qualified name of the class derived from DmcAttribute
     * that provides management\n of a particular type of attribute value. For
     * instance, the type class that handles String attributes \n is
     * org.dmd.dmc.types.DmcTypeString 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getTypeClassName(){
        return(mycore.getTypeClassName());
    }

    /**
     * Sets typeClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setTypeClassName(Object value) throws DmcValueException {
        mycore.setTypeClassName(value);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2591)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2605)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DmcValueException e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2671)
    public void addDescription(Object value) throws DmcValueException {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2684)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The primitiveType indicates the underlying type of a DmcType. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getPrimitiveType(){
        return(mycore.getPrimitiveType());
    }

    /**
     * Sets primitiveType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setPrimitiveType(Object value) throws DmcValueException {
        mycore.setPrimitiveType(value);
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when\n an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined\n to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to\n provide a default value for non-existent attribute values. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getNullReturnValue(){
        return(mycore.getNullReturnValue());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setNullReturnValue(Object value) throws DmcValueException {
        mycore.setNullReturnValue(value);
    }

    /**
     * The altType indicates an alternate type for a value. For instance\n when
     * dealing with NameContainers, the value interface is obviously
     * NameContainer, but\n the secret sauce of NameContainers is that they also
     * take any DmcObjectName derivative.\n Specifying the altType on the
     * NameContainer TypeDefinition allows for generation of \n the DmcObjectName
     * interface as well. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getAltType(){
        return(mycore.getAltType());
    }

    /**
     * Sets altType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setAltType(Object value) throws DmcValueException {
        mycore.setAltType(value);
    }

    /**
     * An additional import (if required) by the altType attribute value. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getAltTypeImport(){
        return(mycore.getAltTypeImport());
    }

    /**
     * Sets altTypeImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setAltTypeImport(Object value) throws DmcValueException {
        mycore.setAltTypeImport(value);
    }

    /**
     * This attribute indicates the class of the key used for types that
     * support\n storage in a MAP. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getKeyClass(){
        return(mycore.getKeyClass());
    }

    /**
     * Sets keyClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setKeyClass(Object value) throws DmcValueException {
        mycore.setKeyClass(value);
    }

    /**
     * Indicates the import for a keyClass. this is required if the keyClass\n is
     * NOT a primitive java type e.g. Integer, String etc. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getKeyImport(){
        return(mycore.getKeyImport());
    }

    /**
     * Sets keyImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setKeyImport(Object value) throws DmcValueException {
        mycore.setKeyImport(value);
    }

    /**
     * This is the fully qualified name of the wrapper class derived from
     * DmcWrapperBase that\n wraps a DMO. This is used when generating object
     * reference classes associated with ClassDefinitions\n This actually aligns
     * to the javaClass of the ClassDefinition for which we're generating the
     * reference\n classes. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getWrapperClassName(){
        return(mycore.getWrapperClassName());
    }

    /**
     * Sets wrapperClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setWrapperClassName(Object value) throws DmcValueException {
        mycore.setWrapperClassName(value);
    }

    /**
     * This flag indicates if the associated definition was internally
     * generated.\n This is the case for TypeDefinitions generated for
     * ClassDefinitions and EnumDefinitions\n that allow for references to these
     * objects. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public Boolean getInternallyGenerated(){
        return(mycore.getInternallyGenerated());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setInternallyGenerated(Object value) throws DmcValueException {
        mycore.setInternallyGenerated(value);
    }

    /**
     * This attribute indicates the full name of the generated helper class for
     * \n object references i.e. if you had a ClassDefinition X, the framework
     * generates a \n types/XREF class which is subsequently used by the
     * DmcTypeXREF class to store references\n to objects of the defined class. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getHelperClassName(){
        return(mycore.getHelperClassName());
    }

    /**
     * Sets helperClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setHelperClassName(Object value) throws DmcValueException {
        mycore.setHelperClassName(value);
    }

    /**
     * This attribute indicates the full name of the DmcContainerIterator \n
     * derived class that allows us to iterate over a set of object references
     * and get back\n the DMW wrapper object instead of the DMO. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getDmwIteratorImport(){
        return(mycore.getDmwIteratorImport());
    }

    /**
     * Sets dmwIteratorImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setDmwIteratorImport(Object value) throws DmcValueException {
        mycore.setDmwIteratorImport(value);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a\n class
     * of object. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getDmwIteratorClass(){
        return(mycore.getDmwIteratorClass());
    }

    /**
     * Sets dmwIteratorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setDmwIteratorClass(Object value) throws DmcValueException {
        mycore.setDmwIteratorClass(value);
    }

    /**
     * This flag is set to true for type definitions that define enumerations. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public Boolean getIsEnumType(){
        return(mycore.getIsEnumType());
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setIsEnumType(Object value) throws DmcValueException {
        mycore.setIsEnumType(value);
    }

    /**
     * This attribute indicates if a defined type is used for naming purposes.\n
     * This allows us to automatically add attributes of this type to the
     * AttributeFactories. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public Boolean getIsNameType(){
        return(mycore.getIsNameType());
    }

    /**
     * Sets isNameType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setIsNameType(Object value) throws DmcValueException {
        mycore.setIsNameType(value);
    }

    /**
     * Indicates if a name type is for hierarchic objects. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public Boolean getIsHierarchicName(){
        return(mycore.getIsHierarchicName());
    }

    /**
     * Sets isHierarchicName to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setIsHierarchicName(Object value) throws DmcValueException {
        mycore.setIsHierarchicName(value);
    }

    /**
     * Indicates that a type is derived from DmcFilter. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public Boolean getIsFilterType(){
        return(mycore.getIsFilterType());
    }

    /**
     * Sets isFilterType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setIsFilterType(Object value) throws DmcValueException {
        mycore.setIsFilterType(value);
    }

    /**
     * This flag is used to indicate taht an internally generated type\n is an
     * extended reference type. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public Boolean getIsExtendedRefType(){
        return(mycore.getIsExtendedRefType());
    }

    /**
     * Sets isExtendedRefType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setIsExtendedRefType(Object value) throws DmcValueException {
        mycore.setIsExtendedRefType(value);
    }

    /**
     * This flag is set to true for type definitions that refer to other\n
     * objects. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public Boolean getIsRefType(){
        return(mycore.getIsRefType());
    }

    /**
     * Sets isRefType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setIsRefType(Object value) throws DmcValueException {
        mycore.setIsRefType(value);
    }

    /**
     * The original name of an enum as referred to in the internally generated
     * type for enums. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getEnumName(){
        return(mycore.getEnumName());
    }

    /**
     * Sets enumName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setEnumName(Object value) throws DmcValueException {
        mycore.setEnumName(value);
    }

    /**
     * Refers to the class that an internally generated type represents. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public ClassDefinition getOriginalClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) mycore.get(MetaDMSAG.__originalClass);
        if (attr == null)
            return(null);
        ClassDefinitionDMO obj = attr.getSV().getObject();
        return((ClassDefinition)obj.getContainer());
    }

    /**
     * Sets originalClass to the specified value.
     * @param value A value compatible with ClassDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2447)
    public void setOriginalClass(ClassDefinition value) throws DmcValueException {
        mycore.setOriginalClass(value.getDmcObject());
    }

    /**
     * The nameAttributeDef is a reference to the attribute that is locked\n to a
     * TypeDefinition. This mechanism is used to create the correct type of
     * DmcType[NAMETYPE]*\n derivative for a value of type DmcObjectName. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public AttributeDefinition getNameAttributeDef(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) mycore.get(MetaDMSAG.__nameAttributeDef);
        if (attr == null)
            return(null);
        AttributeDefinitionDMO obj = attr.getSV().getObject();
        return((AttributeDefinition)obj.getContainer());
    }

    /**
     * Sets nameAttributeDef to the specified value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2447)
    public void setNameAttributeDef(AttributeDefinition value) throws DmcValueException {
        mycore.setNameAttributeDef(value.getDmcObject());
    }

    /**
     * The filterAttributeDef is a reference to the attribute that is locked\n to
     * a TypeDefinition that is flagged as filterType. This mechanism is used to
     * create the\n correct type of DmcType[FILTERTYPE]SV derivative for a value
     * of type DmcFilter. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public AttributeDefinition getFilterAttributeDef(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) mycore.get(MetaDMSAG.__filterAttributeDef);
        if (attr == null)
            return(null);
        AttributeDefinitionDMO obj = attr.getSV().getObject();
        return((AttributeDefinition)obj.getContainer());
    }

    /**
     * Sets filterAttributeDef to the specified value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2447)
    public void setFilterAttributeDef(AttributeDefinition value) throws DmcValueException {
        mycore.setFilterAttributeDef(value.getDmcObject());
    }

    /**
     * This attribute indicates the generic arguments to be supplied in the\n use
     * of a class in an autogenerated Iterable. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2387)
    public String getGenericArgs(){
        return(mycore.getGenericArgs());
    }

    /**
     * Sets genericArgs to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setGenericArgs(Object value) throws DmcValueException {
        mycore.setGenericArgs(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1804)

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
