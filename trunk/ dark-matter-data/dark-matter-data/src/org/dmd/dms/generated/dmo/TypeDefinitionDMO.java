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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1069)
 */
@SuppressWarnings({"unused", "serial"})
public class TypeDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {

     public TypeDefinitionDMO(){
         super("TypeDefinition");
     }

     public TypeDefinitionDMO(String oc){
         super(oc);
     }

    @Override
    public TypeDefinitionDMO getOneOfMe(){
        TypeDefinitionDMO rc = new TypeDefinitionDMO();
        return(rc);
    }

     public final static String _name = "name";
     public final static String _typeClassName = "typeClassName";
     public final static String _description = "description";
     public final static String _nullReturnValue = "nullReturnValue";
     public final static String _wrapperClassName = "wrapperClassName";
     public final static String _primitiveType = "primitiveType";
     public final static String _internallyGenerated = "internallyGenerated";
     public final static String _isEnumType = "isEnumType";
     public final static String _isRefType = "isRefType";
     public final static String _helperClassName = "helperClassName";
     public final static String _originalClass = "originalClass";


     public String getConstructionClassName(){
         return("TypeDefinition");
     }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    public String getName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_name,attr);
    }

    /**
     * This is the fully qualified name of the class derived from DmcAttribute
     * that provides management of a particular type of attribute value. For
     * instance, the type class that handles String attributes  is
     * org.dmd.dmc.types.DmcTypeString
     */
    public String getTypeClassName(){
        DmcTypeString attr = (DmcTypeString) get(_typeClassName);
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
        DmcAttribute attr = get(_typeClassName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_typeClassName,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) get(_description);
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
        DmcAttribute attr = get(_description);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_description,attr);
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to provide a default value for non-existent attribute values.
     */
    public String getNullReturnValue(){
        DmcTypeString attr = (DmcTypeString) get(_nullReturnValue);
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
        DmcAttribute attr = get(_nullReturnValue);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_nullReturnValue,attr);
    }

    /**
     * This is the fully qualified name of the wrapper class derived from
     * DmcWrapperBase that wraps a DMO. This is used when generating object
     * reference classes associated with ClassDefinitions This actually aligns to
     * the javaClass of the ClassDefinition for which we're generating the
     * reference classes.
     */
    public String getWrapperClassName(){
        DmcTypeString attr = (DmcTypeString) get(_wrapperClassName);
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
        DmcAttribute attr = get(_wrapperClassName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_wrapperClassName,attr);
    }

    /**
     * The primitiveType indicates the underlying type of a DmcType.
     */
    public String getPrimitiveType(){
        DmcTypeString attr = (DmcTypeString) get(_primitiveType);
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
        DmcAttribute attr = get(_primitiveType);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_primitiveType,attr);
    }

    /**
     * This flag indicates if the associated definition was internally generated.
     * This is the case for TypeDefinitions generated for ClassDefinitions and
     * EnumDefinitions that allow for references to these objects.
     */
    public Boolean getInternallyGenerated(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_internallyGenerated);
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
        DmcAttribute attr = get(_internallyGenerated);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_internallyGenerated,attr);
    }

    /**
     * This flag is set to true for type definitions that define eneumerations.
     */
    public Boolean getIsEnumType(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_isEnumType);
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
        DmcAttribute attr = get(_isEnumType);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_isEnumType,attr);
    }

    /**
     * This flag is set to true for type definitions that refer to other objects.
     */
    public Boolean getIsRefType(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_isRefType);
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
        DmcAttribute attr = get(_isRefType);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_isRefType,attr);
    }

    /**
     * This attribute indicates the full name of the generated helper class for 
     * object references i.e. if you had a ClassDefinition X, the framework
     * generates a  types/XREF class which is subsequently used by the
     * DmcTypeXREF class to store references to objects of the defined class.
     */
    public String getHelperClassName(){
        DmcTypeString attr = (DmcTypeString) get(_helperClassName);
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
        DmcAttribute attr = get(_helperClassName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_helperClassName,attr);
    }

    /**
     * Refers to the class that an internally generated type represents.
     */
    public ClassDefinitionREF getOriginalClass(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_originalClass);
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
        DmcAttribute attr = get(_originalClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.set(value);
        set(_originalClass,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public String getObjectName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }

}
