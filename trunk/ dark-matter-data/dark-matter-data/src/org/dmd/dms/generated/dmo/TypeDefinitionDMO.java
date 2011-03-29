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

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
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
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1044)
 */
@SuppressWarnings("serial")
public class TypeDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __typeClassName = new DmcAttributeInfo("typeClassName",5,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __nullReturnValue = new DmcAttributeInfo("nullReturnValue",7,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __wrapperClassName = new DmcAttributeInfo("wrapperClassName",6,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __primitiveType = new DmcAttributeInfo("primitiveType",8,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __internallyGenerated = new DmcAttributeInfo("internallyGenerated",77,"Boolean",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __isEnumType = new DmcAttributeInfo("isEnumType",16,"Boolean",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __enumName = new DmcAttributeInfo("enumName",99,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __isRefType = new DmcAttributeInfo("isRefType",14,"Boolean",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __helperClassName = new DmcAttributeInfo("helperClassName",47,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __originalClass = new DmcAttributeInfo("originalClass",83,"ClassDefinition",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmwIteratorImport = new DmcAttributeInfo("dmwIteratorImport",91,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmwIteratorClass = new DmcAttributeInfo("dmwIteratorClass",92,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __genericArgs = new DmcAttributeInfo("genericArgs",94,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __isNameType = new DmcAttributeInfo("isNameType",95,"Boolean",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __keyClass = new DmcAttributeInfo("keyClass",96,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __keyImport = new DmcAttributeInfo("keyImport",97,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __nameAttributeDef = new DmcAttributeInfo("nameAttributeDef",90,"AttributeDefinition",ValueTypeEnum.SINGLE,true);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__typeClassName.id,__typeClassName);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__nullReturnValue.id,__nullReturnValue);
        _ImAp.put(__wrapperClassName.id,__wrapperClassName);
        _ImAp.put(__primitiveType.id,__primitiveType);
        _ImAp.put(__internallyGenerated.id,__internallyGenerated);
        _ImAp.put(__isEnumType.id,__isEnumType);
        _ImAp.put(__enumName.id,__enumName);
        _ImAp.put(__isRefType.id,__isRefType);
        _ImAp.put(__helperClassName.id,__helperClassName);
        _ImAp.put(__originalClass.id,__originalClass);
        _ImAp.put(__dmwIteratorImport.id,__dmwIteratorImport);
        _ImAp.put(__dmwIteratorClass.id,__dmwIteratorClass);
        _ImAp.put(__genericArgs.id,__genericArgs);
        _ImAp.put(__isNameType.id,__isNameType);
        _ImAp.put(__keyClass.id,__keyClass);
        _ImAp.put(__keyImport.id,__keyImport);
        _ImAp.put(__nameAttributeDef.id,__nameAttributeDef);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__typeClassName.name,__typeClassName);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__nullReturnValue.name,__nullReturnValue);
        _SmAp.put(__wrapperClassName.name,__wrapperClassName);
        _SmAp.put(__primitiveType.name,__primitiveType);
        _SmAp.put(__internallyGenerated.name,__internallyGenerated);
        _SmAp.put(__isEnumType.name,__isEnumType);
        _SmAp.put(__enumName.name,__enumName);
        _SmAp.put(__isRefType.name,__isRefType);
        _SmAp.put(__helperClassName.name,__helperClassName);
        _SmAp.put(__originalClass.name,__originalClass);
        _SmAp.put(__dmwIteratorImport.name,__dmwIteratorImport);
        _SmAp.put(__dmwIteratorClass.name,__dmwIteratorClass);
        _SmAp.put(__genericArgs.name,__genericArgs);
        _SmAp.put(__isNameType.name,__isNameType);
        _SmAp.put(__keyClass.name,__keyClass);
        _SmAp.put(__keyImport.name,__keyImport);
        _SmAp.put(__nameAttributeDef.name,__nameAttributeDef);
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

    @Override
    public TypeDefinitionDMO getNew(){
        TypeDefinitionDMO rc = new TypeDefinitionDMO();
        return(rc);
    }

     public String getConstructionClassName(){
         return("TypeDefinition");
     }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * This is the fully qualified name of the class derived from DmcAttribute
     * that provides management of a particular type of attribute value. For
     * instance, the type class that handles String attributes  is
     * org.dmd.dmc.types.DmcTypeString
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getTypeClassName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__typeClassName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets typeClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setTypeClassName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__typeClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(__typeClassName);
        
        attr.set(value);
        set(__typeClassName,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to provide a default value for non-existent attribute values.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getNullReturnValue(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__nullReturnValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setNullReturnValue(Object value) throws DmcValueException {
        DmcAttribute attr = get(__nullReturnValue);
        if (attr == null)
            attr = new DmcTypeStringSV(__nullReturnValue);
        
        attr.set(value);
        set(__nullReturnValue,attr);
    }

    /**
     * This is the fully qualified name of the wrapper class derived from
     * DmcWrapperBase that wraps a DMO. This is used when generating object
     * reference classes associated with ClassDefinitions This actually aligns to
     * the javaClass of the ClassDefinition for which we're generating the
     * reference classes.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getWrapperClassName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__wrapperClassName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets wrapperClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setWrapperClassName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__wrapperClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(__wrapperClassName);
        
        attr.set(value);
        set(__wrapperClassName,attr);
    }

    /**
     * The primitiveType indicates the underlying type of a DmcType.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getPrimitiveType(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__primitiveType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets primitiveType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setPrimitiveType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__primitiveType);
        if (attr == null)
            attr = new DmcTypeStringSV(__primitiveType);
        
        attr.set(value);
        set(__primitiveType,attr);
    }

    /**
     * This flag indicates if the associated definition was internally generated.
     * This is the case for TypeDefinitions generated for ClassDefinitions and
     * EnumDefinitions that allow for references to these objects.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public Boolean getInternallyGenerated(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__internallyGenerated);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setInternallyGenerated(Object value) throws DmcValueException {
        DmcAttribute attr = get(__internallyGenerated);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__internallyGenerated);
        
        attr.set(value);
        set(__internallyGenerated,attr);
    }

    /**
     * This flag is set to true for type definitions that define eneumerations.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public Boolean getIsEnumType(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__isEnumType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setIsEnumType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__isEnumType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__isEnumType);
        
        attr.set(value);
        set(__isEnumType,attr);
    }

    /**
     * The original name of an enum as referred to in the internally generated
     * type for enums.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getEnumName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__enumName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets enumName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setEnumName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__enumName);
        if (attr == null)
            attr = new DmcTypeStringSV(__enumName);
        
        attr.set(value);
        set(__enumName,attr);
    }

    /**
     * This flag is set to true for type definitions that refer to other objects.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public Boolean getIsRefType(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__isRefType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isRefType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setIsRefType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__isRefType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__isRefType);
        
        attr.set(value);
        set(__isRefType,attr);
    }

    /**
     * This attribute indicates the full name of the generated helper class for 
     * object references i.e. if you had a ClassDefinition X, the framework
     * generates a  types/XREF class which is subsequently used by the
     * DmcTypeXREF class to store references to objects of the defined class.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getHelperClassName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__helperClassName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets helperClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setHelperClassName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__helperClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(__helperClassName);
        
        attr.set(value);
        set(__helperClassName,attr);
    }

    /**
     * Refers to the class that an internally generated type represents.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public ClassDefinitionREF getOriginalClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(__originalClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets originalClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setOriginalClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__originalClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(__originalClass);
        
        attr.set(value);
        set(__originalClass,attr);
    }

    /**
     * This attribute indicates the full name of the DmcContainerIterator 
     * derived class that allows us to iterate over a set of object references
     * and get back the DMW wrapper object instead of the DMO.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getDmwIteratorImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmwIteratorImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwIteratorImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setDmwIteratorImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmwIteratorImport);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmwIteratorImport);
        
        attr.set(value);
        set(__dmwIteratorImport,attr);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a class of
     * object.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getDmwIteratorClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmwIteratorClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwIteratorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setDmwIteratorClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmwIteratorClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmwIteratorClass);
        
        attr.set(value);
        set(__dmwIteratorClass,attr);
    }

    /**
     * This attribute indicates the generic arguments to be supplied in the use
     * of a class in an autogenerated Iterable.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getGenericArgs(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__genericArgs);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genericArgs to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setGenericArgs(Object value) throws DmcValueException {
        DmcAttribute attr = get(__genericArgs);
        if (attr == null)
            attr = new DmcTypeStringSV(__genericArgs);
        
        attr.set(value);
        set(__genericArgs,attr);
    }

    /**
     * This attribute indicates if a defined type is used for naming purposes.
     * This allows us to automatically add attributes of this type to the
     * AttributeFactories.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public Boolean getIsNameType(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__isNameType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isNameType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setIsNameType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__isNameType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__isNameType);
        
        attr.set(value);
        set(__isNameType,attr);
    }

    /**
     * This attribute indicates the class of the key used for types that support
     * storage in a MAP.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getKeyClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__keyClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets keyClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setKeyClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__keyClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__keyClass);
        
        attr.set(value);
        set(__keyClass,attr);
    }

    /**
     * Indicates the import for a keyClass. this is required if the keyClass is
     * NOT a primitive java type e.g. Integer, String etc.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public String getKeyImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__keyImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets keyImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setKeyImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(__keyImport);
        if (attr == null)
            attr = new DmcTypeStringSV(__keyImport);
        
        attr.set(value);
        set(__keyImport,attr);
    }

    /**
     * The nameAttributeDef is a reference to the attribute that is locked to a
     * TypeDefinition that is flagged as isNameType. This mechanism is used to
     * create the correct type of DmcType[NAMETYPE]SV derivative for a value of
     * type DmcObjectNameIF.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1333)
    public AttributeDefinitionREF getNameAttributeDef(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(__nameAttributeDef);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nameAttributeDef to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1379)
    @SuppressWarnings("unchecked")
    public void setNameAttributeDef(Object value) throws DmcValueException {
        DmcAttribute attr = get(__nameAttributeDef);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(__nameAttributeDef);
        
        attr.set(value);
        set(__nameAttributeDef,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public StringName getObjectName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcTypeStringName getObjectNameAttribute(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);
        return(attr);
    }

}
