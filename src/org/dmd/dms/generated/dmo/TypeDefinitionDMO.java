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
package org.dmd.dms.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1837)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1790)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1792)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1814)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1804)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1826)


/**
 * The <code> TypeDefinition </code> is used to define the types of
 * attributes that can be used\n as the basis for attribute values. The name
 * of the type definition should be the same as the\n actual Java class that
 * is used to store the value of an attribute e.g. the name of the type\n
 * used to store strings is String. The <code> typeClassName </code> is the
 * fully qualified name of the class\n derived from <code>DmcAttribute</code>
 * that stores this type of value; they are always, by convention,\n named
 * <code>DmcTypeXXX</code>.\n <p/>\n <code> TypeDefinitions </code> are
 * automatically generated internally for <code>ClassDefinitions</code> and\n
 * <code> EnumDefinitions </code> so that these objects can be referred to
 * via the <code>type</code> attribute of <code>
 * AttributeDefinitions</code>.\n These definitions are marked as <code>
 * internallyGenerated </code>.\n <p/>\n The simplest <code> TypeDefinition
 * </code> would look something like:\n <pre>\n TypeDefinition\n name        
 *   String\n typeClassName  org.dmd.dmc.types.DmcTypeString\n description   
 * Provides support for String values.\n </pre>\n This form would be used for
 * attribute types whose base type originates in <code> java.lang</code>.\n
 * The dark-matter base types include: Boolean, Byte, Double, Float, Integer,
 * Long, Short and String.\n <p/>\n <code>TypeDefinitions</code> also support
 * the concept of specifying a <code> nullReturnValue </code>\n for the
 * entire type i.e. whenever an attribute of the specified type is accessed,
 * it will return\n that value when the attribute doesn't exist in the
 * object. An example of this is the <code> Boolean </code> type:\n <pre>\n
 * TypeDefinition\n name            Boolean\n typeClassName  
 * org.dmd.dmc.types.DmcTypeBoolean\n nullReturnValue false\n description    
 * Provides support for Boolean values. This type makes use of the\n         
 *        nullReturnValue flag so that, even if there is no\n                
 * value for an attribute of this type, a value of false will\n              
 *   be returned.\n </pre>\n <p/>\n The next most common form of <code>
 * TypeDefinition </code> adds the <code> primitiveType </code>\n attribute.
 * This is required for code generation so that we can import the appropriate
 * type for\n use in the various getter/setter methods. An example would be
 * the <code> Date </code> type.\n <pre>\n TypeDefinition\n name          
 * Date\n typeClassName  org.dmd.dmc.types.DmcTypeDate\n primitiveType 
 * java.util.Date\n description    Provides support for Date values.\n
 * </pre>\n Another common form of <code>TypeDefinition</code> is the
 * definition of a name type. Object\n naming is a fundamental aspect of
 * DMOs, with all object names being based on the
 * <code>DmcObjectName</code>.\n Flagging a type as being a name type also
 * implies the definition of a designated naming attribute\n associated with
 * the type. This mechanism allows for the transport of names that are self\n
 * describing in terms of their implementation type. This feature supports
 * the <code>NameContainer</code>\n type that allows any name to be
 * transported in things like dark-matter protocol <code>GetRequest</code>.\n
 * An example of a naming type would be:\n <pre>\n TypeDefinition\n name     
 *      CamelCaseName\n typeClassName 
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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1847)
 */
@SuppressWarnings("serial")
public class TypeDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


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
        _SmAp.put(MetaDMSAG.__nullReturnValue.name,MetaDMSAG.__nullReturnValue);
        _SmAp.put(MetaDMSAG.__originalClass.name,MetaDMSAG.__originalClass);
        _SmAp.put(MetaDMSAG.__primitiveType.name,MetaDMSAG.__primitiveType);
        _SmAp.put(MetaDMSAG.__wrapperClassName.name,MetaDMSAG.__wrapperClassName);
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

    @Override
    public TypeDefinitionDMO getSlice(DmcSliceInfo info){
        TypeDefinitionDMO rc = new TypeDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace\n characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * This is the fully qualified name of the class derived from DmcAttribute
     * that provides management\n of a particular type of attribute value. For
     * instance, the type class that handles String attributes \n is
     * org.dmd.dmc.types.DmcTypeString
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setTypeClassName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__typeClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__typeClassName);
        
        attr.set(value);
        set(MetaDMSAG.__typeClassName,attr);
    }

    /**
     * The altType indicates an alternate type for a value. For instance\n when
     * dealing with NameContainers, the value interface is obviously
     * NameContainer, but\n the secret sauce of NameContainers is that they also
     * take any DmcObjectName derivative.\n Specifying the altType on the
     * NameContainer TypeDefinition allows for generation of \n the DmcObjectName
     * interface as well.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2265)
    public String getDescriptionWithNewlines(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV().replaceAll("\\\\n","\\\n"));
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a\n class
     * of object.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setDmwIteratorClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwIteratorClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwIteratorClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmwIteratorClass,attr);
    }

    /**
     * This attribute indicates the full name of the DmcContainerIterator \n
     * derived class that allows us to iterate over a set of object references
     * and get back\n the DMW wrapper object instead of the DMO.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * The filterAttributeDef is a reference to the attribute that is locked\n to
     * a TypeDefinition that is flagged as filterType. This mechanism is used to
     * create the\n correct type of DmcType[FILTERTYPE]SV derivative for a value
     * of type DmcFilter.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setFilterAttributeDef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__filterAttributeDef);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__filterAttributeDef);
        
        attr.set(value);
        set(MetaDMSAG.__filterAttributeDef,attr);
    }

    /**
     * This attribute indicates the generic arguments to be supplied in the\n use
     * of a class in an autogenerated Iterable.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setGenericArgs(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__genericArgs);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__genericArgs);
        
        attr.set(value);
        set(MetaDMSAG.__genericArgs,attr);
    }

    /**
     * This attribute indicates the full name of the generated helper class for
     * \n object references i.e. if you had a ClassDefinition X, the framework
     * generates a \n types/XREF class which is subsequently used by the
     * DmcTypeXREF class to store references\n to objects of the defined class.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setHelperClassName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__helperClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__helperClassName);
        
        attr.set(value);
        set(MetaDMSAG.__helperClassName,attr);
    }

    /**
     * This flag indicates if the associated definition was internally
     * generated.\n This is the case for TypeDefinitions generated for
     * ClassDefinitions and EnumDefinitions\n that allow for references to these
     * objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setInternallyGenerated(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__internallyGenerated);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__internallyGenerated);
        
        attr.set(value);
        set(MetaDMSAG.__internallyGenerated,attr);
    }

    /**
     * This flag is set to true for type definitions that define enumerations.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setIsEnumType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isEnumType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isEnumType);
        
        attr.set(value);
        set(MetaDMSAG.__isEnumType,attr);
    }

    /**
     * This flag is used to indicate taht an internally generated type\n is an
     * extended reference type.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setIsHierarchicName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isHierarchicName);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isHierarchicName);
        
        attr.set(value);
        set(MetaDMSAG.__isHierarchicName,attr);
    }

    /**
     * This attribute indicates if a defined type is used for naming purposes.\n
     * This allows us to automatically add attributes of this type to the
     * AttributeFactories.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setIsNameType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isNameType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isNameType);
        
        attr.set(value);
        set(MetaDMSAG.__isNameType,attr);
    }

    /**
     * This flag is set to true for type definitions that refer to other\n
     * objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setIsRefType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isRefType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isRefType);
        
        attr.set(value);
        set(MetaDMSAG.__isRefType,attr);
    }

    /**
     * This attribute indicates the class of the key used for types that
     * support\n storage in a MAP.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setKeyClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__keyClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__keyClass);
        
        attr.set(value);
        set(MetaDMSAG.__keyClass,attr);
    }

    /**
     * Indicates the import for a keyClass. this is required if the keyClass\n is
     * NOT a primitive java type e.g. Integer, String etc.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * The nameAttributeDef is a reference to the attribute that is locked\n to a
     * TypeDefinition. This mechanism is used to create the correct type of
     * DmcType[NAMETYPE]*\n derivative for a value of type DmcObjectName.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setNameAttributeDef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nameAttributeDef);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__nameAttributeDef);
        
        attr.set(value);
        set(MetaDMSAG.__nameAttributeDef,attr);
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when\n an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined\n to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to\n provide a default value for non-existent attribute values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setPrimitiveType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__primitiveType);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__primitiveType);
        
        attr.set(value);
        set(MetaDMSAG.__primitiveType,attr);
    }

    /**
     * This is the fully qualified name of the wrapper class derived from
     * DmcWrapperBase that\n wraps a DMO. This is used when generating object
     * reference classes associated with ClassDefinitions\n This actually aligns
     * to the javaClass of the ClassDefinition for which we're generating the
     * reference\n classes.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2232)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public void setWrapperClassName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__wrapperClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__wrapperClassName);
        
        attr.set(value);
        set(MetaDMSAG.__wrapperClassName,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:2026)

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
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        return(attr);
    }

}
