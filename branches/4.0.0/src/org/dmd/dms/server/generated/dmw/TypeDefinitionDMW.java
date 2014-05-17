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
package org.dmd.dms.server.generated.dmw;


// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:105)
import java.util.*;                                     // To support access functions - (DmwFormatter.java:75)
import org.dmd.core.*;                                  // Basic dark-matter infrastructure - (DmwFormatter.java:77)
import org.dmd.core.feedback.*;                         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:83)
import org.dmd.core.interfaces.DmcDefinitionIF;         // Because this is a DS definition - (DmwFormatter.java:91)
import org.dmd.dms.server.extended.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:79)
import org.dmd.dms.shared.generated.dmo.*;              // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:80)
import org.dmd.dms.shared.generated.enums.*;            // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:81)
import org.dmd.dms.shared.generated.types.*;            // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:82)
import org.dmd.dms.shared.types.*;                      // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:76)
import org.dmd.dmw.*;                                   // Base wrapper capabilities - (DmwFormatter.java:78)

/**
 * The <code> TypeDefinition </code> is used to define the types of
 * attributes that can be used as the basis for attribute values. The name of
 * the type definition should be the same as the actual Java class that is
 * used to store the value of an attribute e.g. the name of the type used to
 * store strings is String. The <code> typeClassName </code> is the fully
 * qualified name of the class derived from <code>DmcAttribute</code> that
 * stores this type of value; they are always, by convention, named
 * <code>DmcTypeXXX</code>. <p/> <code> TypeDefinitions </code> are
 * automatically generated internally for <code>ClassDefinitions</code>, 
 * <code>ComplexTypeDefinitions</code>,
 * <code>ExtendedReferenceTypeDefinitions</code> and
 * <code>EnumDefinitions</code> so that these objects can be referred to via
 * the <code>type</code> attribute of <code> AttributeDefinitions</code>.
 * These definitions are marked as <code> internallyGenerated </code>. <p/>
 * The simplest <code> TypeDefinition </code> would look something like:
 * <pre> TypeDefinition name           String typeClassName 
 * org.dmd.dmc.types.DmcTypeString description    Provides support for String
 * values. </pre> This form would be used for attribute types whose base type
 * originates in <code> java.lang</code>. The dark-matter base types include:
 * Boolean, Byte, Double, Float, Integer, Long, Short and String. <p/>
 * <code>TypeDefinitions</code> also support the concept of specifying a
 * <code> nullReturnValue </code> for the entire type i.e. whenever an
 * attribute of the specified type is accessed, it will return that value
 * when the attribute doesn't exist in the object. An example of this is the
 * <code> Boolean </code> type: <pre> TypeDefinition name            Boolean
 * typeClassName   org.dmd.dmc.types.DmcTypeBoolean nullReturnValue false
 * description     Provides support for Boolean values. This type makes use
 * of the                 nullReturnValue flag so that, even if there is no  
 *               value for an attribute of this type, a value of false will  
 *               be returned. </pre> <p/> The next most common form of <code>
 * TypeDefinition </code> adds the <code> primitiveType </code> attribute.
 * This is required for code generation so that we can import the appropriate
 * type for use in the various getter/setter methods. An example would be the
 * <code> Date </code> type. <pre> TypeDefinition name           Date
 * typeClassName  org.dmd.dmc.types.DmcTypeDate primitiveType  java.util.Date
 * description    Provides support for Date values. </pre> Another common
 * form of <code>TypeDefinition</code> is the definition of a name type.
 * Object naming is a fundamental aspect of DMOs, with all object names being
 * based on the <code>DmcObjectName</code>. Flagging a type as being a name
 * type also implies the definition of a designated naming attribute
 * associated with the type. This mechanism allows for the transport of names
 * that are self describing in terms of their implementation type. This
 * feature supports the <code>NameContainer</code> type that allows any name
 * to be transported in things like dark-matter protocol
 * <code>GetRequest</code>. An example of a naming type would be: <pre>
 * TypeDefinition name           CamelCaseName typeClassName 
 * org.dmd.dmc.types.DmcTypeCamelCaseName primitiveType 
 * org.dmd.dmc.types.CamelCaseName isNameType     true description    The
 * CamelCaseName is a string based name that must start with               
 * an alpha character which is followed by a mix of alphanumerics. </pre> And
 * its associated designated naming attribute would be: <pre>
 * AttributeDefinition name                     camelCaseName dmdID          
 *          116 type                     CamelCaseName
 * designatedNameAttribute  true description              The camelCaseName
 * attribute is used to store a single camelCase                         
 * format name for something. The name starts with a single letter           
 *               and can be followed by a mix of letters and numbers. No
 * spaces or                           other characters are allowed. </pre>
 * The last form of type definition is one that includes some additional
 * information to provide a convenient, alternate interface for the
 * generation of member functions associated with a container type; this
 * concept is pretty much limited to the meta-schema, so it is unlikely that
 * non-contributors to dark-matter will make use of this concept. However,
 * here is an example: <pre> TypeDefinition name           NameContainer
 * typeClassName  org.dmd.dmc.types.DmcTypeNameContainer primitiveType 
 * org.dmd.dmc.types.NameContainer altType        DmcObjectName altTypeImport
 *  org.dmd.dmc.DmcObjectName description    The NameContainer type allows
 * for the storage of object names of different types... </pre> 
 * @author Auto Generated
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:113)
 */
@SuppressWarnings("unused")
public class TypeDefinitionDMW extends org.dmd.dms.server.extended.DmsDefinition implements DmcDefinitionIF  {

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

    protected TypeDefinitionDMW(String mn) throws DMFeedbackSet {
        super(new TypeDefinitionDMO());
        mycore = (TypeDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * How a name is composed will depend on the context in which it used. For
     * instance, the names of definitions specified as part of a dark-matter
     * schema will conform to conventions of naming classes and or attributes in
     * Java. <p/> The generated documentation for a set of Domain Specific
     * Language (DSL) concepts will indicate the rules that apply to a name in
     * that DSL. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setName(Object value) throws DMFeedbackSet {
        mycore.setName(value);
    }

    /**
     * This is the fully qualified name of the class derived from DmcAttribute
     * that provides management of a particular type of attribute value. For
     * instance, the type class that handles String attributes  is
     * org.dmd.dms.shared.types.DmcTypeString 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getTypeClassName(){
        return(mycore.getTypeClassName());
    }

    /**
     * Sets typeClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setTypeClassName(Object value) throws DMFeedbackSet {
        mycore.setTypeClassName(value);
    }

    /**
     * The detailed description of some concept definition. The description is
     * multi-valued and is used in the generation of documentation. By
     * convention, it should follow XHTML guidelines in terms of its content. 
     * <p/> Also by convention, the first element of the description should be a
     * short, simple indication of the concept that is suitable for inclusion as
     * a code comment; this is primarily used in dark-matter schema (DMS)
     * specifications since dark-matter object (DMO) and dark-matter wrapper
     * (DMW) Java code is generated from these specifications. <p/> When defining
     * your own Domain Specific Languages (DSLs), feel free to follow whatever
     * conventions make sense for your purposes. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
    public StringIterableDMW getDescriptionIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:357)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DMFeedbackSet e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addDescription(Object value) throws DMFeedbackSet {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if description has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getDescriptionHasValue(){
        return(getDescriptionSize() > 0);
    }

    /**
     * The primitiveType indicates the underlying type of a DmcType. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getPrimitiveType(){
        return(mycore.getPrimitiveType());
    }

    /**
     * Sets primitiveType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setPrimitiveType(Object value) throws DMFeedbackSet {
        mycore.setPrimitiveType(value);
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to provide a default value for non-existent attribute values. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getNullReturnValue(){
        return(mycore.getNullReturnValue());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setNullReturnValue(Object value) throws DMFeedbackSet {
        mycore.setNullReturnValue(value);
    }

    /**
     * The altType indicates an alternate type for a value. For instance when
     * dealing with NameContainers, the value interface is obviously
     * NameContainer, but the secret sauce of NameContainers is that they also
     * take any DmcObjectName derivative. Specifying the altType on the
     * NameContainer TypeDefinition allows for generation of  the DmcObjectName
     * interface as well. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getAltType(){
        return(mycore.getAltType());
    }

    /**
     * Sets altType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setAltType(Object value) throws DMFeedbackSet {
        mycore.setAltType(value);
    }

    /**
     * An additional import (if required) by the altType attribute value. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getAltTypeImport(){
        return(mycore.getAltTypeImport());
    }

    /**
     * Sets altTypeImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setAltTypeImport(Object value) throws DMFeedbackSet {
        mycore.setAltTypeImport(value);
    }

    /**
     * This attribute indicates the class of the key used for types that support
     * storage in a MAP. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getKeyClass(){
        return(mycore.getKeyClass());
    }

    /**
     * Sets keyClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setKeyClass(Object value) throws DMFeedbackSet {
        mycore.setKeyClass(value);
    }

    /**
     * Indicates the import for a keyClass. this is required if the keyClass is
     * NOT a primitive java type e.g. Integer, String etc. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getKeyImport(){
        return(mycore.getKeyImport());
    }

    /**
     * Sets keyImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setKeyImport(Object value) throws DMFeedbackSet {
        mycore.setKeyImport(value);
    }

    /**
     * This is the fully qualified name of the wrapper class derived from
     * DmcWrapperBase that wraps a DMO. This is used when generating object
     * reference classes associated with ClassDefinitions This actually aligns to
     * the javaClass of the ClassDefinition for which we're generating the
     * reference classes. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getWrapperClassName(){
        return(mycore.getWrapperClassName());
    }

    /**
     * Sets wrapperClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setWrapperClassName(Object value) throws DMFeedbackSet {
        mycore.setWrapperClassName(value);
    }

    /**
     * This flag indicates if the associated definition was internally generated.
     * This is the case for TypeDefinitions generated for ClassDefinitions and
     * EnumDefinitions that allow for references to these objects. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Boolean getInternallyGenerated(){
        return(mycore.getInternallyGenerated());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setInternallyGenerated(Object value) throws DMFeedbackSet {
        mycore.setInternallyGenerated(value);
    }

    /**
     * This attribute indicates the full name of the generated helper class for 
     * object references i.e. if you had a ClassDefinition X, the framework
     * generates a  types/XREF class which is subsequently used by the
     * DmcTypeXREF class to store references to objects of the defined class. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getHelperClassName(){
        return(mycore.getHelperClassName());
    }

    /**
     * Sets helperClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setHelperClassName(Object value) throws DMFeedbackSet {
        mycore.setHelperClassName(value);
    }

    /**
     * This attribute indicates the full name of the DmcContainerIterator 
     * derived class that allows us to iterate over a set of object references
     * and get back the DMW wrapper object instead of the DMO. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getDmwIteratorImport(){
        return(mycore.getDmwIteratorImport());
    }

    /**
     * Sets dmwIteratorImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setDmwIteratorImport(Object value) throws DMFeedbackSet {
        mycore.setDmwIteratorImport(value);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a class of
     * object. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getDmwIteratorClass(){
        return(mycore.getDmwIteratorClass());
    }

    /**
     * Sets dmwIteratorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setDmwIteratorClass(Object value) throws DMFeedbackSet {
        mycore.setDmwIteratorClass(value);
    }

    /**
     * This flag is set to true for type definitions that define enumerations. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Boolean getIsEnumType(){
        return(mycore.getIsEnumType());
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setIsEnumType(Object value) throws DMFeedbackSet {
        mycore.setIsEnumType(value);
    }

    /**
     * This attribute indicates if a defined type is used for naming purposes.
     * This allows us to automatically add attributes of this type to the
     * AttributeFactories. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Boolean getIsNameType(){
        return(mycore.getIsNameType());
    }

    /**
     * Sets isNameType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setIsNameType(Object value) throws DMFeedbackSet {
        mycore.setIsNameType(value);
    }

    /**
     * Indicates if a name type is for hierarchic objects. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Boolean getIsHierarchicName(){
        return(mycore.getIsHierarchicName());
    }

    /**
     * Sets isHierarchicName to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setIsHierarchicName(Object value) throws DMFeedbackSet {
        mycore.setIsHierarchicName(value);
    }

    /**
     * Indicates that a type is derived from DmcFilter. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Boolean getIsFilterType(){
        return(mycore.getIsFilterType());
    }

    /**
     * Sets isFilterType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setIsFilterType(Object value) throws DMFeedbackSet {
        mycore.setIsFilterType(value);
    }

    /**
     * This flag is used to indicate taht an internally generated type is an
     * extended reference type. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Boolean getIsExtendedRefType(){
        return(mycore.getIsExtendedRefType());
    }

    /**
     * Sets isExtendedRefType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setIsExtendedRefType(Object value) throws DMFeedbackSet {
        mycore.setIsExtendedRefType(value);
    }

    /**
     * This flag is set to true for type definitions that refer to other objects. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Boolean getIsRefType(){
        return(mycore.getIsRefType());
    }

    /**
     * Sets isRefType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setIsRefType(Object value) throws DMFeedbackSet {
        mycore.setIsRefType(value);
    }

    /**
     * The original name of an enum as referred to in the internally generated
     * type for enums. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getEnumName(){
        return(mycore.getEnumName());
    }

    /**
     * Sets enumName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setEnumName(Object value) throws DMFeedbackSet {
        mycore.setEnumName(value);
    }

    /**
     * Refers to the class that an internally generated type represents. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:193)
    public void setOriginalClass(ClassDefinition value) throws DMFeedbackSet {
        mycore.setOriginalClass(value.getDmcObject());
    }

    /**
     * The nameAttributeDef is a reference to the attribute that is locked to a
     * TypeDefinition. This mechanism is used to create the correct type of
     * DmcType[NAMETYPE]* derivative for a value of type DmcObjectName. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:193)
    public void setNameAttributeDef(AttributeDefinition value) throws DMFeedbackSet {
        mycore.setNameAttributeDef(value.getDmcObject());
    }

    /**
     * The filterAttributeDef is a reference to the attribute that is locked to a
     * TypeDefinition that is flagged as filterType. This mechanism is used to
     * create the correct type of DmcType[FILTERTYPE]SV derivative for a value of
     * type DmcFilter. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:193)
    public void setFilterAttributeDef(AttributeDefinition value) throws DMFeedbackSet {
        mycore.setFilterAttributeDef(value.getDmcObject());
    }

    /**
     * This attribute indicates the generic arguments to be supplied in the use
     * of a class in an autogenerated Iterable. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getGenericArgs(){
        return(mycore.getGenericArgs());
    }

    /**
     * Sets genericArgs to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setGenericArgs(Object value) throws DMFeedbackSet {
        mycore.setGenericArgs(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:271)

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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperFunctions(MetaDSDHelper.java:907)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        DmsModuleREF ref = ((TypeDefinitionDMO) core).getDefinedInDmsModule();
        return(ref.getName().getNameString());
    }

}
