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
package org.dmd.dms.generated.dmo;

import java.io.Serializable;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;

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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1248)
 */
@SuppressWarnings("serial")
public class TypeDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__typeClassName.id,MetaDMSAG.__typeClassName);
        _ImAp.put(MetaDMSAG.__altType.id,MetaDMSAG.__altType);
        _ImAp.put(MetaDMSAG.__altTypeImport.id,MetaDMSAG.__altTypeImport);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__dmwIteratorClass.id,MetaDMSAG.__dmwIteratorClass);
        _ImAp.put(MetaDMSAG.__dmwIteratorImport.id,MetaDMSAG.__dmwIteratorImport);
        _ImAp.put(MetaDMSAG.__enumName.id,MetaDMSAG.__enumName);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__filterAttributeDef.id,MetaDMSAG.__filterAttributeDef);
        _ImAp.put(MetaDMSAG.__genericArgs.id,MetaDMSAG.__genericArgs);
        _ImAp.put(MetaDMSAG.__helperClassName.id,MetaDMSAG.__helperClassName);
        _ImAp.put(MetaDMSAG.__internallyGenerated.id,MetaDMSAG.__internallyGenerated);
        _ImAp.put(MetaDMSAG.__isEnumType.id,MetaDMSAG.__isEnumType);
        _ImAp.put(MetaDMSAG.__isExtendedRefType.id,MetaDMSAG.__isExtendedRefType);
        _ImAp.put(MetaDMSAG.__isFilterType.id,MetaDMSAG.__isFilterType);
        _ImAp.put(MetaDMSAG.__isHierarchicName.id,MetaDMSAG.__isHierarchicName);
        _ImAp.put(MetaDMSAG.__isNameType.id,MetaDMSAG.__isNameType);
        _ImAp.put(MetaDMSAG.__isRefType.id,MetaDMSAG.__isRefType);
        _ImAp.put(MetaDMSAG.__keyClass.id,MetaDMSAG.__keyClass);
        _ImAp.put(MetaDMSAG.__keyImport.id,MetaDMSAG.__keyImport);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__nameAttributeDef.id,MetaDMSAG.__nameAttributeDef);
        _ImAp.put(MetaDMSAG.__nameType.id,MetaDMSAG.__nameType);
        _ImAp.put(MetaDMSAG.__nullReturnValue.id,MetaDMSAG.__nullReturnValue);
        _ImAp.put(MetaDMSAG.__originalClass.id,MetaDMSAG.__originalClass);
        _ImAp.put(MetaDMSAG.__primitiveType.id,MetaDMSAG.__primitiveType);
        _ImAp.put(MetaDMSAG.__wrapperClassName.id,MetaDMSAG.__wrapperClassName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__typeClassName.name,MetaDMSAG.__typeClassName);
        _SmAp.put(MetaDMSAG.__altType.name,MetaDMSAG.__altType);
        _SmAp.put(MetaDMSAG.__altTypeImport.name,MetaDMSAG.__altTypeImport);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__dmwIteratorClass.name,MetaDMSAG.__dmwIteratorClass);
        _SmAp.put(MetaDMSAG.__dmwIteratorImport.name,MetaDMSAG.__dmwIteratorImport);
        _SmAp.put(MetaDMSAG.__enumName.name,MetaDMSAG.__enumName);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__filterAttributeDef.name,MetaDMSAG.__filterAttributeDef);
        _SmAp.put(MetaDMSAG.__genericArgs.name,MetaDMSAG.__genericArgs);
        _SmAp.put(MetaDMSAG.__helperClassName.name,MetaDMSAG.__helperClassName);
        _SmAp.put(MetaDMSAG.__internallyGenerated.name,MetaDMSAG.__internallyGenerated);
        _SmAp.put(MetaDMSAG.__isEnumType.name,MetaDMSAG.__isEnumType);
        _SmAp.put(MetaDMSAG.__isExtendedRefType.name,MetaDMSAG.__isExtendedRefType);
        _SmAp.put(MetaDMSAG.__isFilterType.name,MetaDMSAG.__isFilterType);
        _SmAp.put(MetaDMSAG.__isHierarchicName.name,MetaDMSAG.__isHierarchicName);
        _SmAp.put(MetaDMSAG.__isNameType.name,MetaDMSAG.__isNameType);
        _SmAp.put(MetaDMSAG.__isRefType.name,MetaDMSAG.__isRefType);
        _SmAp.put(MetaDMSAG.__keyClass.name,MetaDMSAG.__keyClass);
        _SmAp.put(MetaDMSAG.__keyImport.name,MetaDMSAG.__keyImport);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__nameAttributeDef.name,MetaDMSAG.__nameAttributeDef);
        _SmAp.put(MetaDMSAG.__nameType.name,MetaDMSAG.__nameType);
        _SmAp.put(MetaDMSAG.__nullReturnValue.name,MetaDMSAG.__nullReturnValue);
        _SmAp.put(MetaDMSAG.__originalClass.name,MetaDMSAG.__originalClass);
        _SmAp.put(MetaDMSAG.__primitiveType.name,MetaDMSAG.__primitiveType);
        _SmAp.put(MetaDMSAG.__wrapperClassName.name,MetaDMSAG.__wrapperClassName);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String ,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }


    public TypeDefinitionDMO(){
        super("TypeDefinition");
    }

    public TypeDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public TypeDefinitionDMO getNew(){
        TypeDefinitionDMO rc = new TypeDefinitionDMO();
        return(rc);
    }

    @Override
    public TypeDefinitionDMO getSlice(DmcSliceInfo info){
        TypeDefinitionDMO rc = new TypeDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * This is the fully qualified name of the class derived from DmcAttribute
     * that provides management of a particular type of attribute value. For
     * instance, the type class that handles String attributes  is
     * org.dmd.dmc.types.DmcTypeString
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getTypeClassName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__typeClassName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets typeClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setTypeClassName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__typeClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__typeClassName);
        
        attr.set(value);
        set(MetaDMSAG.__typeClassName,attr);
    }

    /**
     * The altType indicates an alternate type for a value. For instance when
     * dealing with NameContainers, the value interface is obviously
     * NameContainer, but the secret sauce of NameContainers is that they also
     * take any DmcObjectName derivative. Specifying the altType on the
     * NameContainer TypeDefinition allows for generation of  the DmcObjectName
     * interface as well.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getAltType(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__altType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets altType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setAltType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__altType);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__altType);
        
        attr.set(value);
        set(MetaDMSAG.__altType,attr);
    }

    /**
     * An additional import (if required) by the altType attribute value.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getAltTypeImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__altTypeImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets altTypeImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setAltTypeImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__altTypeImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__altTypeImport);
        
        attr.set(value);
        set(MetaDMSAG.__altTypeImport,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a class of
     * object.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getDmwIteratorClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwIteratorClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwIteratorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setDmwIteratorClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwIteratorClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwIteratorClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmwIteratorClass,attr);
    }

    /**
     * This attribute indicates the full name of the DmcContainerIterator 
     * derived class that allows us to iterate over a set of object references
     * and get back the DMW wrapper object instead of the DMO.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getDmwIteratorImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwIteratorImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwIteratorImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setDmwIteratorImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwIteratorImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwIteratorImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmwIteratorImport,attr);
    }

    /**
     * The original name of an enum as referred to in the internally generated
     * type for enums.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getEnumName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__enumName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets enumName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setEnumName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__enumName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__enumName);
        
        attr.set(value);
        set(MetaDMSAG.__enumName,attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * The filterAttributeDef is a reference to the attribute that is locked to a
     * TypeDefinition that is flagged as filterType. This mechanism is used to
     * create the correct type of DmcType[FILTERTYPE]SV derivative for a value of
     * type DmcFilter.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public AttributeDefinitionREF getFilterAttributeDef(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__filterAttributeDef);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets filterAttributeDef to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setFilterAttributeDef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__filterAttributeDef);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__filterAttributeDef);
        
        attr.set(value);
        set(MetaDMSAG.__filterAttributeDef,attr);
    }

    /**
     * This attribute indicates the generic arguments to be supplied in the use
     * of a class in an autogenerated Iterable.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getGenericArgs(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__genericArgs);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genericArgs to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setGenericArgs(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__genericArgs);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__genericArgs);
        
        attr.set(value);
        set(MetaDMSAG.__genericArgs,attr);
    }

    /**
     * This attribute indicates the full name of the generated helper class for 
     * object references i.e. if you had a ClassDefinition X, the framework
     * generates a  types/XREF class which is subsequently used by the
     * DmcTypeXREF class to store references to objects of the defined class.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getHelperClassName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__helperClassName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets helperClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setHelperClassName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__helperClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__helperClassName);
        
        attr.set(value);
        set(MetaDMSAG.__helperClassName,attr);
    }

    /**
     * This flag indicates if the associated definition was internally generated.
     * This is the case for TypeDefinitions generated for ClassDefinitions and
     * EnumDefinitions that allow for references to these objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public Boolean getInternallyGenerated(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__internallyGenerated);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setInternallyGenerated(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__internallyGenerated);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__internallyGenerated);
        
        attr.set(value);
        set(MetaDMSAG.__internallyGenerated,attr);
    }

    /**
     * This flag is set to true for type definitions that define eneumerations.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public Boolean getIsEnumType(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__isEnumType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setIsEnumType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isEnumType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isEnumType);
        
        attr.set(value);
        set(MetaDMSAG.__isEnumType,attr);
    }

    /**
     * This flag is used to indicate taht an internally generated type is an
     * extended reference type.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public Boolean getIsExtendedRefType(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__isExtendedRefType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isExtendedRefType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setIsExtendedRefType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isExtendedRefType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isExtendedRefType);
        
        attr.set(value);
        set(MetaDMSAG.__isExtendedRefType,attr);
    }

    /**
     * Indicates that a type is derived from DmcFilter.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public Boolean getIsFilterType(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__isFilterType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isFilterType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setIsFilterType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isFilterType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isFilterType);
        
        attr.set(value);
        set(MetaDMSAG.__isFilterType,attr);
    }

    /**
     * Indicates if a name type is for hierarchic objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public Boolean getIsHierarchicName(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__isHierarchicName);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isHierarchicName to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setIsHierarchicName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isHierarchicName);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isHierarchicName);
        
        attr.set(value);
        set(MetaDMSAG.__isHierarchicName,attr);
    }

    /**
     * This attribute indicates if a defined type is used for naming purposes.
     * This allows us to automatically add attributes of this type to the
     * AttributeFactories.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public Boolean getIsNameType(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__isNameType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isNameType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setIsNameType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isNameType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isNameType);
        
        attr.set(value);
        set(MetaDMSAG.__isNameType,attr);
    }

    /**
     * This flag is set to true for type definitions that refer to other objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public Boolean getIsRefType(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__isRefType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isRefType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setIsRefType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isRefType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isRefType);
        
        attr.set(value);
        set(MetaDMSAG.__isRefType,attr);
    }

    /**
     * This attribute indicates the class of the key used for types that support
     * storage in a MAP.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getKeyClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__keyClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets keyClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setKeyClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__keyClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__keyClass);
        
        attr.set(value);
        set(MetaDMSAG.__keyClass,attr);
    }

    /**
     * Indicates the import for a keyClass. this is required if the keyClass is
     * NOT a primitive java type e.g. Integer, String etc.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getKeyImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__keyImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets keyImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setKeyImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__keyImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__keyImport);
        
        attr.set(value);
        set(MetaDMSAG.__keyImport,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * The nameAttributeDef is a reference to the attribute that is locked to a
     * TypeDefinition that is flagged as nameType STRUCTURAL. This mechanism is
     * used to create the correct type of DmcType[NAMETYPE]SV derivative for a
     * value of type DmcObjectName.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public AttributeDefinitionREF getNameAttributeDef(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__nameAttributeDef);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nameAttributeDef to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setNameAttributeDef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nameAttributeDef);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__nameAttributeDef);
        
        attr.set(value);
        set(MetaDMSAG.__nameAttributeDef,attr);
    }

    /**
     * The type of an object name type. See the NameTypeEnum for a  detailed
     * description of what this means.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public NameTypeEnum getNameType(){
        DmcTypeNameTypeEnumSV attr = (DmcTypeNameTypeEnumSV) get(MetaDMSAG.__nameType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nameType to the specified value.
     * @param value A value compatible with DmcTypeNameTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setNameType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nameType);
        if (attr == null)
            attr = new DmcTypeNameTypeEnumSV(MetaDMSAG.__nameType);
        
        attr.set(value);
        set(MetaDMSAG.__nameType,attr);
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to provide a default value for non-existent attribute values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getNullReturnValue(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__nullReturnValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setNullReturnValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nullReturnValue);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__nullReturnValue);
        
        attr.set(value);
        set(MetaDMSAG.__nullReturnValue,attr);
    }

    /**
     * Refers to the class that an internally generated type represents.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public ClassDefinitionREF getOriginalClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(MetaDMSAG.__originalClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets originalClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setOriginalClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__originalClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(MetaDMSAG.__originalClass);
        
        attr.set(value);
        set(MetaDMSAG.__originalClass,attr);
    }

    /**
     * The primitiveType indicates the underlying type of a DmcType.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getPrimitiveType(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__primitiveType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets primitiveType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setPrimitiveType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__primitiveType);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__primitiveType);
        
        attr.set(value);
        set(MetaDMSAG.__primitiveType,attr);
    }

    /**
     * This is the fully qualified name of the wrapper class derived from
     * DmcWrapperBase that wraps a DMO. This is used when generating object
     * reference classes associated with ClassDefinitions This actually aligns to
     * the javaClass of the ClassDefinition for which we're generating the
     * reference classes.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public String getWrapperClassName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__wrapperClassName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets wrapperClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1640)
    public void setWrapperClassName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__wrapperClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__wrapperClassName);
        
        attr.set(value);
        set(MetaDMSAG.__wrapperClassName,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public StringName getObjectName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcTypeStringName getObjectNameAttribute(){
        DmcTypeStringName attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr);
    }

}
