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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1023)
 */
@SuppressWarnings({"unused", "serial"})
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
    public final static DmcAttributeInfo __isRefType = new DmcAttributeInfo("isRefType",14,"Boolean",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __helperClassName = new DmcAttributeInfo("helperClassName",47,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __originalClass = new DmcAttributeInfo("originalClass",83,"ClassDefinition",ValueTypeEnum.SINGLE,true);

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
        _ImAp.put(__isRefType.id,__isRefType);
        _ImAp.put(__helperClassName.id,__helperClassName);
        _ImAp.put(__originalClass.id,__originalClass);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__typeClassName.name,__typeClassName);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__nullReturnValue.name,__nullReturnValue);
        _SmAp.put(__wrapperClassName.name,__wrapperClassName);
        _SmAp.put(__primitiveType.name,__primitiveType);
        _SmAp.put(__internallyGenerated.name,__internallyGenerated);
        _SmAp.put(__isEnumType.name,__isEnumType);
        _SmAp.put(__isRefType.name,__isRefType);
        _SmAp.put(__helperClassName.name,__helperClassName);
        _SmAp.put(__originalClass.name,__originalClass);
    }


    public TypeDefinitionDMO(){
        super("TypeDefinition",_ImAp,_SmAp);
    }

    public TypeDefinitionDMO(String oc){
        super(oc);
    }

    public TypeDefinitionDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    @Override
    public TypeDefinitionDMO getOneOfMe(){
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
    public StringName getName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringName(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * This is the fully qualified name of the class derived from DmcAttribute
     * that provides management of a particular type of attribute value. For
     * instance, the type class that handles String attributes  is
     * org.dmd.dmc.types.DmcTypeString
     */
    public String getTypeClassName(){
        DmcTypeString attr = (DmcTypeString) get(__typeClassName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets typeClassName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setTypeClassName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__typeClassName);
        if (attr == null)
            attr = new DmcTypeString(__typeClassName);
        
        attr.set(value);
        set(__typeClassName,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(__description);
        if (attr == null)
            attr = new DmcTypeString(__description);
        
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
    public String getNullReturnValue(){
        DmcTypeString attr = (DmcTypeString) get(__nullReturnValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setNullReturnValue(Object value) throws DmcValueException {
        DmcAttribute attr = get(__nullReturnValue);
        if (attr == null)
            attr = new DmcTypeString(__nullReturnValue);
        
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
    public String getWrapperClassName(){
        DmcTypeString attr = (DmcTypeString) get(__wrapperClassName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets wrapperClassName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setWrapperClassName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__wrapperClassName);
        if (attr == null)
            attr = new DmcTypeString(__wrapperClassName);
        
        attr.set(value);
        set(__wrapperClassName,attr);
    }

    /**
     * The primitiveType indicates the underlying type of a DmcType.
     */
    public String getPrimitiveType(){
        DmcTypeString attr = (DmcTypeString) get(__primitiveType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets primitiveType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setPrimitiveType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__primitiveType);
        if (attr == null)
            attr = new DmcTypeString(__primitiveType);
        
        attr.set(value);
        set(__primitiveType,attr);
    }

    /**
     * This flag indicates if the associated definition was internally generated.
     * This is the case for TypeDefinitions generated for ClassDefinitions and
     * EnumDefinitions that allow for references to these objects.
     */
    public Boolean getInternallyGenerated(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(__internallyGenerated);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setInternallyGenerated(Object value) throws DmcValueException {
        DmcAttribute attr = get(__internallyGenerated);
        if (attr == null)
            attr = new DmcTypeBoolean(__internallyGenerated);
        
        attr.set(value);
        set(__internallyGenerated,attr);
    }

    /**
     * This flag is set to true for type definitions that define eneumerations.
     */
    public Boolean getIsEnumType(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(__isEnumType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setIsEnumType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__isEnumType);
        if (attr == null)
            attr = new DmcTypeBoolean(__isEnumType);
        
        attr.set(value);
        set(__isEnumType,attr);
    }

    /**
     * This flag is set to true for type definitions that refer to other objects.
     */
    public Boolean getIsRefType(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(__isRefType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isRefType to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setIsRefType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__isRefType);
        if (attr == null)
            attr = new DmcTypeBoolean(__isRefType);
        
        attr.set(value);
        set(__isRefType,attr);
    }

    /**
     * This attribute indicates the full name of the generated helper class for 
     * object references i.e. if you had a ClassDefinition X, the framework
     * generates a  types/XREF class which is subsequently used by the
     * DmcTypeXREF class to store references to objects of the defined class.
     */
    public String getHelperClassName(){
        DmcTypeString attr = (DmcTypeString) get(__helperClassName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets helperClassName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setHelperClassName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__helperClassName);
        if (attr == null)
            attr = new DmcTypeString(__helperClassName);
        
        attr.set(value);
        set(__helperClassName,attr);
    }

    /**
     * Refers to the class that an internally generated type represents.
     */
    public ClassDefinitionREF getOriginalClass(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(__originalClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets originalClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setOriginalClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__originalClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF(__originalClass);
        
        attr.set(value);
        set(__originalClass,attr);
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

}
