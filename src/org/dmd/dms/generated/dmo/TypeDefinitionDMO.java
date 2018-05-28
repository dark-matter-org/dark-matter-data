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
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1944)
import java.io.Serializable;                            // Serializable marker interface - (MetaGenerator.java:1893)
import java.util.*;                                     // Attribute info support - (MetaGenerator.java:1895)
import org.dmd.dmc.*;                                   // Dark matter core - (MetaGenerator.java:1917)
import org.dmd.dmc.definitions.DmcDefinitionIF;         // This is a domain specific definition - (MetaGenerator.java:1930)
import org.dmd.dmc.types.*;                             // Basic type access - (MetaGenerator.java:1907)
import org.dmd.dms.generated.types.*;                   // Generated type access - (MetaGenerator.java:1933)



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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1954)
 */
@SuppressWarnings("serial")
public class TypeDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable, DmcDefinitionIF {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__typeClassName.id,MetaDMSAG.__typeClassName);
        _ImAp.put(MetaDMSAG.__altType.id,MetaDMSAG.__altType);
        _ImAp.put(MetaDMSAG.__altTypeImport.id,MetaDMSAG.__altTypeImport);
        _ImAp.put(MetaDMSAG.__comment.id,MetaDMSAG.__comment);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__dmoFromModule.id,MetaDMSAG.__dmoFromModule);
        _ImAp.put(MetaDMSAG.__dmwIteratorClass.id,MetaDMSAG.__dmwIteratorClass);
        _ImAp.put(MetaDMSAG.__dmwIteratorImport.id,MetaDMSAG.__dmwIteratorImport);
        _ImAp.put(MetaDMSAG.__dotName.id,MetaDMSAG.__dotName);
        _ImAp.put(MetaDMSAG.__enumName.id,MetaDMSAG.__enumName);
        _ImAp.put(MetaDMSAG.__example.id,MetaDMSAG.__example);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__filterAttributeDef.id,MetaDMSAG.__filterAttributeDef);
        _ImAp.put(MetaDMSAG.__genericArgs.id,MetaDMSAG.__genericArgs);
        _ImAp.put(MetaDMSAG.__helperClassName.id,MetaDMSAG.__helperClassName);
        _ImAp.put(MetaDMSAG.__hint.id,MetaDMSAG.__hint);
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
        _ImAp.put(MetaDMSAG.__nvp.id,MetaDMSAG.__nvp);
        _ImAp.put(MetaDMSAG.__obsolete.id,MetaDMSAG.__obsolete);
        _ImAp.put(MetaDMSAG.__optimize.id,MetaDMSAG.__optimize);
        _ImAp.put(MetaDMSAG.__originalClass.id,MetaDMSAG.__originalClass);
        _ImAp.put(MetaDMSAG.__primitiveType.id,MetaDMSAG.__primitiveType);
        _ImAp.put(MetaDMSAG.__question.id,MetaDMSAG.__question);
        _ImAp.put(MetaDMSAG.__relatedToConcept.id,MetaDMSAG.__relatedToConcept);
        _ImAp.put(MetaDMSAG.__relationship.id,MetaDMSAG.__relationship);
        _ImAp.put(MetaDMSAG.__searchable.id,MetaDMSAG.__searchable);
        _ImAp.put(MetaDMSAG.__skip.id,MetaDMSAG.__skip);
        _ImAp.put(MetaDMSAG.__sortName.id,MetaDMSAG.__sortName);
        _ImAp.put(MetaDMSAG.__tags.id,MetaDMSAG.__tags);
        _ImAp.put(MetaDMSAG.__version.id,MetaDMSAG.__version);
        _ImAp.put(MetaDMSAG.__why.id,MetaDMSAG.__why);
        _ImAp.put(MetaDMSAG.__wrapperClassName.id,MetaDMSAG.__wrapperClassName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__typeClassName.name,MetaDMSAG.__typeClassName);
        _SmAp.put(MetaDMSAG.__altType.name,MetaDMSAG.__altType);
        _SmAp.put(MetaDMSAG.__altTypeImport.name,MetaDMSAG.__altTypeImport);
        _SmAp.put(MetaDMSAG.__comment.name,MetaDMSAG.__comment);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__dmoFromModule.name,MetaDMSAG.__dmoFromModule);
        _SmAp.put(MetaDMSAG.__dmwIteratorClass.name,MetaDMSAG.__dmwIteratorClass);
        _SmAp.put(MetaDMSAG.__dmwIteratorImport.name,MetaDMSAG.__dmwIteratorImport);
        _SmAp.put(MetaDMSAG.__dotName.name,MetaDMSAG.__dotName);
        _SmAp.put(MetaDMSAG.__enumName.name,MetaDMSAG.__enumName);
        _SmAp.put(MetaDMSAG.__example.name,MetaDMSAG.__example);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__filterAttributeDef.name,MetaDMSAG.__filterAttributeDef);
        _SmAp.put(MetaDMSAG.__genericArgs.name,MetaDMSAG.__genericArgs);
        _SmAp.put(MetaDMSAG.__helperClassName.name,MetaDMSAG.__helperClassName);
        _SmAp.put(MetaDMSAG.__hint.name,MetaDMSAG.__hint);
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
        _SmAp.put(MetaDMSAG.__nvp.name,MetaDMSAG.__nvp);
        _SmAp.put(MetaDMSAG.__obsolete.name,MetaDMSAG.__obsolete);
        _SmAp.put(MetaDMSAG.__optimize.name,MetaDMSAG.__optimize);
        _SmAp.put(MetaDMSAG.__originalClass.name,MetaDMSAG.__originalClass);
        _SmAp.put(MetaDMSAG.__primitiveType.name,MetaDMSAG.__primitiveType);
        _SmAp.put(MetaDMSAG.__question.name,MetaDMSAG.__question);
        _SmAp.put(MetaDMSAG.__relatedToConcept.name,MetaDMSAG.__relatedToConcept);
        _SmAp.put(MetaDMSAG.__relationship.name,MetaDMSAG.__relationship);
        _SmAp.put(MetaDMSAG.__searchable.name,MetaDMSAG.__searchable);
        _SmAp.put(MetaDMSAG.__skip.name,MetaDMSAG.__skip);
        _SmAp.put(MetaDMSAG.__sortName.name,MetaDMSAG.__sortName);
        _SmAp.put(MetaDMSAG.__tags.name,MetaDMSAG.__tags);
        _SmAp.put(MetaDMSAG.__version.name,MetaDMSAG.__version);
        _SmAp.put(MetaDMSAG.__why.name,MetaDMSAG.__why);
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
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * This is the fully qualified name of the class derived from DmcAttribute
     * that provides management\n of a particular type of attribute value. For
     * instance, the type class that handles String attributes \n is
     * org.dmd.dmc.types.DmcTypeString 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setAltTypeImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__altTypeImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__altTypeImport);
        
        attr.set(value);
        set(MetaDMSAG.__altTypeImport,attr);
    }

    /**
     * A comment or note associated with the definition of something. For\n code
     * that's generated from a definition, comments may be added to the code, as
     * opposed to \n descriptions which are meant to assist in generating
     * documentation. In the end, it's up to\n the designer of a DSL to determine
     * how comments are used. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2548)
    public Iterator<String> getComment(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__comment);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another comment value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2653)
    public DmcAttribute<?> addComment(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__comment);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__comment);
        
        attr.add(value);
        add(MetaDMSAG.__comment,attr);
        return(attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2548)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2563)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2653)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        attr.add(value);
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * A bit of a hack to allow for creation of fully qualified dot names\n in
     * the DMODefinitionSet that's used for caching definitions in GWT. On the
     * DMW side, this\n is taken care of by overloading the
     * getNameOfModuleWhereThisCameFrom() to access the \n getDefinedInModule
     * attribute and getting the name of the module. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
    public String getDmoFromModule(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmoFromModule);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoFromModule to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setDmoFromModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmoFromModule);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmoFromModule);
        
        attr.set(value);
        set(MetaDMSAG.__dmoFromModule,attr);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a\n class
     * of object. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setDmwIteratorImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwIteratorImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwIteratorImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmwIteratorImport,attr);
    }

    /**
     * The dotName attribute is used to store dot separated names. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setDotName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * The original name of an enum as referred to in the internally generated
     * type for enums. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setEnumName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__enumName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__enumName);
        
        attr.set(value);
        set(MetaDMSAG.__enumName,attr);
    }

    /**
     * The example attribute is used to provide additional\n examples of how some
     * defined thing is to be used. 
     * @return An Iterator of Example objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2548)
    public Iterator<Example> getExample(){
        DmcTypeExampleMV attr = (DmcTypeExampleMV) get(MetaDMSAG.__example);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another example value.
     * @param value A value compatible with DmcTypeExampleMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2653)
    public DmcAttribute<?> addExample(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__example);
        if (attr == null)
            attr = new DmcTypeExampleMV(MetaDMSAG.__example);
        
        attr.add(value);
        add(MetaDMSAG.__example,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setHelperClassName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__helperClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__helperClassName);
        
        attr.set(value);
        set(MetaDMSAG.__helperClassName,attr);
    }

    /**
     * A short description of something that can be dumped as one line summary of
     * something.\n For longer explanations, use the description attribute. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
    public String getHint(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__hint);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets hint to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setHint(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__hint);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__hint);
        
        attr.set(value);
        set(MetaDMSAG.__hint,attr);
    }

    /**
     * This flag indicates if the associated definition was internally
     * generated.\n This is the case for TypeDefinitions generated for
     * ClassDefinitions and EnumDefinitions\n that allow for references to these
     * objects. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setNullReturnValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nullReturnValue);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__nullReturnValue);
        
        attr.set(value);
        set(MetaDMSAG.__nullReturnValue,attr);
    }

    /**
     * A set of additional name value pairs that can be associated with an
     * object. 
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2548)
    public Iterator<NameValuePair> getNvp(){
        DmcTypeNameValuePairMV attr = (DmcTypeNameValuePairMV) get(MetaDMSAG.__nvp);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another nvp value.
     * @param value A value compatible with DmcTypeNameValuePairMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2653)
    public DmcAttribute<?> addNvp(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nvp);
        if (attr == null)
            attr = new DmcTypeNameValuePairMV(MetaDMSAG.__nvp);
        
        attr.add(value);
        add(MetaDMSAG.__nvp,attr);
        return(attr);
    }

    /**
     * The version at which something became obsolete. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
    public String getObsolete(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__obsolete);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsolete to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setObsolete(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__obsolete);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__obsolete);
        
        attr.set(value);
        set(MetaDMSAG.__obsolete,attr);
    }

    /**
     * Depending on what you're modelling, you often come across\n places where
     * you can see an opportunity to optimize, streamline or improve something
     * e.g. merging\n concepts together, representing something differently,
     * adding a relationship - whatever.\n However, these ideas often get lost in
     * the shuffle or, if you add them into an overall\n description of
     * something, they don't stand out.\n <p/>\n Any dark-matter definition can
     * be decorated with optimize notes. These notes provide 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2548)
    public Iterator<String> getOptimize(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__optimize);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another optimize value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2653)
    public DmcAttribute<?> addOptimize(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__optimize);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__optimize);
        
        attr.add(value);
        add(MetaDMSAG.__optimize,attr);
        return(attr);
    }

    /**
     * Refers to the class that an internally generated type represents. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setPrimitiveType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__primitiveType);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__primitiveType);
        
        attr.set(value);
        set(MetaDMSAG.__primitiveType,attr);
    }

    /**
     * A question associated with the definition of something. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2548)
    public Iterator<String> getQuestion(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__question);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another question value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2653)
    public DmcAttribute<?> addQuestion(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__question);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__question);
        
        attr.add(value);
        add(MetaDMSAG.__question,attr);
        return(attr);
    }

    /**
     * Allows for references to base concepts that relate this\n definition to
     * another definition in the Concinnity domain. This mechanism is only used\n
     * in the domain of dark-matter schema definitions; other DSLs will allow for
     * direct\n reference to Concinnity concepts. 
     * @return An Iterator of ConcinnityDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2541)
    public Iterator<ConcinnityREF> getRelatedToConcept(){
        DmcTypeConcinnityREFMV attr = (DmcTypeConcinnityREFMV) get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another relatedToConcept value.
     * @param value A value compatible with DmcTypeConcinnityREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2653)
    public DmcAttribute<?> addRelatedToConcept(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            attr = new DmcTypeConcinnityREFMV(MetaDMSAG.__relatedToConcept);
        
        attr.add(value);
        add(MetaDMSAG.__relatedToConcept,attr);
        return(attr);
    }

    /**
     * The name of the relationship established via a reference to some other
     * named object.\n <p/>\n This is a minor hack to allow creation of named
     * relationships in graph databases. Eventually, relationships\n will become
     * first class objects to which you can refer. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
    public String getRelationship(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__relationship);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets relationship to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setRelationship(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__relationship);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__relationship);
        
        attr.set(value);
        set(MetaDMSAG.__relationship,attr);
    }

    /**
     * Indicates if something is searchable. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
    public Boolean getSearchable(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__searchable);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets searchable to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setSearchable(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__searchable);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__searchable);
        
        attr.set(value);
        set(MetaDMSAG.__searchable,attr);
    }

    /**
     * A version from which something should be excluded (even though it is
     * included\n in later versions). This is an unusual situation, and should be
     * approached with extreme caution! 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2548)
    public Iterator<String> getSkip(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__skip);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another skip value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2653)
    public DmcAttribute<?> addSkip(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__skip);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__skip);
        
        attr.add(value);
        add(MetaDMSAG.__skip,attr);
        return(attr);
    }

    /**
     * The sortName is used in siutations where we need a name\n for storage of a
     * definition that is globally unique but can be sorted on the basis\n of the
     * definition name, not the module name. The dotName for a definition is\n
     * module.definition...type, whereas the sortName would be
     * definition...module.type.\n So, for things like documentation generation,
     * the sortName provides a more \n natural ordering. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
    public DotName getSortName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__sortName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sortName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setSortName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__sortName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__sortName);
        
        attr.set(value);
        set(MetaDMSAG.__sortName,attr);
    }

    /**
     * A collection of tags that can facilitate searching for\n definitions. The
     * values are limited to a-zA-Z0-9 and the space character. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2548)
    public Iterator<String> getTags(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__tags);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another tags value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2653)
    public DmcAttribute<?> addTags(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__tags);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__tags);
        
        attr.add(value);
        add(MetaDMSAG.__tags,attr);
        return(attr);
    }

    /**
     * The version at which something was introduced. Version names\n are assumed
     * to be lexicographically sortable i.e. the name of a version must have a
     * nautral\n sort order that increases. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
    public String getVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__version);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets version to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setVersion(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__version);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__version);
        
        attr.set(value);
        set(MetaDMSAG.__version,attr);
    }

    /**
     * An indication of why something was added to a specification or a system.\n
     * This might be a reference to a requirement or feature concept. How this is
     * used will depend on context.\n Due to the fact that it is a weak
     * reference, you may also just put in free form text, since it\n will simply
     * be treated as an unresolved reference. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
    public ConcinnityREF getWhy(){
        DmcTypeConcinnityREFSV attr = (DmcTypeConcinnityREFSV) get(MetaDMSAG.__why);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets why to the specified value.
     * @param value A value compatible with DmcTypeConcinnityREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setWhy(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__why);
        if (attr == null)
            attr = new DmcTypeConcinnityREFSV(MetaDMSAG.__why);
        
        attr.set(value);
        set(MetaDMSAG.__why,attr);
    }

    /**
     * This is the fully qualified name of the wrapper class derived from
     * DmcWrapperBase that\n wraps a DMO. This is used when generating object
     * reference classes associated with ClassDefinitions\n This actually aligns
     * to the javaClass of the ClassDefinition for which we're generating the
     * reference\n classes. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2346)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2438)
    public void setWrapperClassName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__wrapperClassName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__wrapperClassName);
        
        attr.set(value);
        set(MetaDMSAG.__wrapperClassName,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:2137)

    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public DefinitionName getObjectName(){
        DmcTypeDefinitionName attr = (DmcTypeDefinitionName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> attr = (DmcTypeDefinitionName) get(MetaDMSAG.__name);
        return(attr);
    }

}
