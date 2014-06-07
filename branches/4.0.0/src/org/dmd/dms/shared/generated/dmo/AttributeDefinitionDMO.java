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
package org.dmd.dms.shared.generated.dmo;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.DmoFormatter.formatDMOForClass(DmoFormatter.java:100)
import java.io.Serializable;                         // Serializable marker interface - (DmoFormatter.java:58)
import java.util.*;                                  // Attribute info support - (DmoFormatter.java:59)
import org.dmd.core.*;                               // dark-matter core - (DmoFormatter.java:80)
import org.dmd.core.feedback.DMFeedbackSet;          // To allow error feedback - (DmoFormatter.java:79)
import org.dmd.core.schema.DmcAttributeInfo;         // To access attribute info - (DmoFormatter.java:81)
import org.dmd.core.schema.DmcSliceInfo;             // To allow object slicing - (DmoFormatter.java:82)
import org.dmd.dms.shared.generated.enums.*;         // Has enum attributes - (DmoFormatter.java:96)
import org.dmd.dms.shared.generated.types.*;         // Generated type access - (DmoFormatter.java:93)
import org.dmd.dms.shared.types.*;                   // For common types - (DmoFormatter.java:83)



/**
 * This class is used to define attributes to be used as part of a class
 * definition. 
 * Generated from: org.dmd.dms.tools.generation.meta.DmoFormatter.formatDMOForClass(DmoFormatter.java:108)
 */
@SuppressWarnings("serial")
public class AttributeDefinitionDMO extends org.dmd.dms.shared.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaCompactSchema.__definedInDmsModule.id,MetaCompactSchema.__definedInDmsModule);
        _ImAp.put(MetaCompactSchema.__name.id,MetaCompactSchema.__name);
        _ImAp.put(MetaCompactSchema.__type.id,MetaCompactSchema.__type);
        _ImAp.put(MetaCompactSchema.__abbrev.id,MetaCompactSchema.__abbrev);
        _ImAp.put(MetaCompactSchema.__codeComment.id,MetaCompactSchema.__codeComment);
        _ImAp.put(MetaCompactSchema.__comment.id,MetaCompactSchema.__comment);
        _ImAp.put(MetaCompactSchema.__dataType.id,MetaCompactSchema.__dataType);
        _ImAp.put(MetaCompactSchema.__description.id,MetaCompactSchema.__description);
        _ImAp.put(MetaCompactSchema.__designatedFilterAttribute.id,MetaCompactSchema.__designatedFilterAttribute);
        _ImAp.put(MetaCompactSchema.__designatedNameAttribute.id,MetaCompactSchema.__designatedNameAttribute);
        _ImAp.put(MetaCompactSchema.__dmdID.id,MetaCompactSchema.__dmdID);
        _ImAp.put(MetaCompactSchema.__dotName.id,MetaCompactSchema.__dotName);
        _ImAp.put(MetaCompactSchema.__example.id,MetaCompactSchema.__example);
        _ImAp.put(MetaCompactSchema.__file.id,MetaCompactSchema.__file);
        _ImAp.put(MetaCompactSchema.__genericArgs.id,MetaCompactSchema.__genericArgs);
        _ImAp.put(MetaCompactSchema.__genericArgsImport.id,MetaCompactSchema.__genericArgsImport);
        _ImAp.put(MetaCompactSchema.__hint.id,MetaCompactSchema.__hint);
        _ImAp.put(MetaCompactSchema.__indexSize.id,MetaCompactSchema.__indexSize);
        _ImAp.put(MetaCompactSchema.__internalUse.id,MetaCompactSchema.__internalUse);
        _ImAp.put(MetaCompactSchema.__lineNumber.id,MetaCompactSchema.__lineNumber);
        _ImAp.put(MetaCompactSchema.__nullReturnValue.id,MetaCompactSchema.__nullReturnValue);
        _ImAp.put(MetaCompactSchema.__nvp.id,MetaCompactSchema.__nvp);
        _ImAp.put(MetaCompactSchema.__obsolete.id,MetaCompactSchema.__obsolete);
        _ImAp.put(MetaCompactSchema.__obsoleteVersion.id,MetaCompactSchema.__obsoleteVersion);
        _ImAp.put(MetaCompactSchema.__optimize.id,MetaCompactSchema.__optimize);
        _ImAp.put(MetaCompactSchema.__preserveNewlines.id,MetaCompactSchema.__preserveNewlines);
        _ImAp.put(MetaCompactSchema.__question.id,MetaCompactSchema.__question);
        _ImAp.put(MetaCompactSchema.__relatedToConcept.id,MetaCompactSchema.__relatedToConcept);
        _ImAp.put(MetaCompactSchema.__secure.id,MetaCompactSchema.__secure);
        _ImAp.put(MetaCompactSchema.__skip.id,MetaCompactSchema.__skip);
        _ImAp.put(MetaCompactSchema.__sortName.id,MetaCompactSchema.__sortName);
        _ImAp.put(MetaCompactSchema.__tags.id,MetaCompactSchema.__tags);
        _ImAp.put(MetaCompactSchema.__valueType.id,MetaCompactSchema.__valueType);
        _ImAp.put(MetaCompactSchema.__version.id,MetaCompactSchema.__version);
        _ImAp.put(MetaCompactSchema.__weakReference.id,MetaCompactSchema.__weakReference);
        _ImAp.put(MetaCompactSchema.__why.id,MetaCompactSchema.__why);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaCompactSchema.__definedInDmsModule.name,MetaCompactSchema.__definedInDmsModule);
        _SmAp.put(MetaCompactSchema.__name.name,MetaCompactSchema.__name);
        _SmAp.put(MetaCompactSchema.__type.name,MetaCompactSchema.__type);
        _SmAp.put(MetaCompactSchema.__abbrev.name,MetaCompactSchema.__abbrev);
        _SmAp.put(MetaCompactSchema.__codeComment.name,MetaCompactSchema.__codeComment);
        _SmAp.put(MetaCompactSchema.__comment.name,MetaCompactSchema.__comment);
        _SmAp.put(MetaCompactSchema.__dataType.name,MetaCompactSchema.__dataType);
        _SmAp.put(MetaCompactSchema.__description.name,MetaCompactSchema.__description);
        _SmAp.put(MetaCompactSchema.__designatedFilterAttribute.name,MetaCompactSchema.__designatedFilterAttribute);
        _SmAp.put(MetaCompactSchema.__designatedNameAttribute.name,MetaCompactSchema.__designatedNameAttribute);
        _SmAp.put(MetaCompactSchema.__dmdID.name,MetaCompactSchema.__dmdID);
        _SmAp.put(MetaCompactSchema.__dotName.name,MetaCompactSchema.__dotName);
        _SmAp.put(MetaCompactSchema.__example.name,MetaCompactSchema.__example);
        _SmAp.put(MetaCompactSchema.__file.name,MetaCompactSchema.__file);
        _SmAp.put(MetaCompactSchema.__genericArgs.name,MetaCompactSchema.__genericArgs);
        _SmAp.put(MetaCompactSchema.__genericArgsImport.name,MetaCompactSchema.__genericArgsImport);
        _SmAp.put(MetaCompactSchema.__hint.name,MetaCompactSchema.__hint);
        _SmAp.put(MetaCompactSchema.__indexSize.name,MetaCompactSchema.__indexSize);
        _SmAp.put(MetaCompactSchema.__internalUse.name,MetaCompactSchema.__internalUse);
        _SmAp.put(MetaCompactSchema.__lineNumber.name,MetaCompactSchema.__lineNumber);
        _SmAp.put(MetaCompactSchema.__nullReturnValue.name,MetaCompactSchema.__nullReturnValue);
        _SmAp.put(MetaCompactSchema.__nvp.name,MetaCompactSchema.__nvp);
        _SmAp.put(MetaCompactSchema.__obsolete.name,MetaCompactSchema.__obsolete);
        _SmAp.put(MetaCompactSchema.__obsoleteVersion.name,MetaCompactSchema.__obsoleteVersion);
        _SmAp.put(MetaCompactSchema.__optimize.name,MetaCompactSchema.__optimize);
        _SmAp.put(MetaCompactSchema.__preserveNewlines.name,MetaCompactSchema.__preserveNewlines);
        _SmAp.put(MetaCompactSchema.__question.name,MetaCompactSchema.__question);
        _SmAp.put(MetaCompactSchema.__relatedToConcept.name,MetaCompactSchema.__relatedToConcept);
        _SmAp.put(MetaCompactSchema.__secure.name,MetaCompactSchema.__secure);
        _SmAp.put(MetaCompactSchema.__skip.name,MetaCompactSchema.__skip);
        _SmAp.put(MetaCompactSchema.__sortName.name,MetaCompactSchema.__sortName);
        _SmAp.put(MetaCompactSchema.__tags.name,MetaCompactSchema.__tags);
        _SmAp.put(MetaCompactSchema.__valueType.name,MetaCompactSchema.__valueType);
        _SmAp.put(MetaCompactSchema.__version.name,MetaCompactSchema.__version);
        _SmAp.put(MetaCompactSchema.__weakReference.name,MetaCompactSchema.__weakReference);
        _SmAp.put(MetaCompactSchema.__why.name,MetaCompactSchema.__why);
    }


    public AttributeDefinitionDMO(){
        super("AttributeDefinition");
    }

    public AttributeDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public AttributeDefinitionDMO getNew(){
        AttributeDefinitionDMO rc = new AttributeDefinitionDMO();
        return(rc);
    }

    @Override
    public AttributeDefinitionDMO getSlice(DmcSliceInfo info){
        AttributeDefinitionDMO rc = new AttributeDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The dark-matter schema module (DmsModule) in which something is defined. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public DmsModuleREF getDefinedInDmsModule(){
        DmcTypeDmsModuleREFSV attr = (DmcTypeDmsModuleREFSV) get(MetaCompactSchema.__definedInDmsModule);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedInDmsModule to the specified value.
     * @param value A value compatible with DmcTypeDmsModuleREFSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setDefinedInDmsModule(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__definedInDmsModule);
        if (attr == null)
            attr = new DmcTypeDmsModuleREFSV(MetaCompactSchema.__definedInDmsModule);
        
        attr.set(value);
        set(MetaCompactSchema.__definedInDmsModule,attr);
    }

    /**
     * How a name is composed will depend on the context in which it used. For
     * instance, the names of definitions specified as part of a dark-matter
     * schema will conform to conventions of naming classes and or attributes in
     * Java. <p/> The generated documentation for a set of Domain Specific
     * Language (DSL) concepts will indicate the rules that apply to a name in
     * that DSL. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaCompactSchema.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setName(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaCompactSchema.__name);
        
        attr.set(value);
        set(MetaCompactSchema.__name,attr);
    }

    /**
     * Indicates the type of an attribute. The value is the name of any
     * previously defined TypeDefinition, ClassDefinition, EnumDefinition or
     * ComplexTypeDefinition. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public TypeDefinitionREF getType(){
        DmcTypeTypeDefinitionREFSV attr = (DmcTypeTypeDefinitionREFSV) get(MetaCompactSchema.__type);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets type to the specified value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setType(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__type);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFSV(MetaCompactSchema.__type);
        
        attr.set(value);
        set(MetaCompactSchema.__type,attr);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This concept is borrowed from directory technology where shortened
     * name forms are often used as part of distinguished names (DNs). 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getAbbrev(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__abbrev);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setAbbrev(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__abbrev);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__abbrev);
        
        attr.set(value);
        set(MetaCompactSchema.__abbrev,attr);
    }

    /**
     * A brief comment that will be included in generated code to give users a
     * basic idea of what the purpose of something like an attribute or class or
     * type is for. For more long winded explanations, you should use the
     * description attribute whose contents are used as the basis for HTML based
     * documentation. <p/> By convention, generated HTML will have the code
     * comments followed by the description followed by any examples you've
     * provided. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getCodeComment(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__codeComment);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another codeComment value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addCodeComment(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__codeComment);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__codeComment);
        
        attr.add(value);
        add(MetaCompactSchema.__codeComment,attr);
        return(attr);
    }

    /**
     * A comment or note associated with the definition of something. For code
     * that's generated from a definition, comments may be added to the code, as
     * opposed to  descriptions which are meant to assist in generating
     * documentation. In the end, it's up to the designer of a DSL to determine
     * how comments are used. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getComment(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__comment);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another comment value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addComment(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__comment);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__comment);
        
        attr.add(value);
        add(MetaCompactSchema.__comment,attr);
        return(attr);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or class of object. How this information is used is application dependent. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnumSV attr = (DmcTypeDataTypeEnumSV) get(MetaCompactSchema.__dataType);
        if (attr == null)
            return(DataTypeEnum.PERSISTENT);

        return(attr.getSV());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnumSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setDataType(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__dataType);
        if (attr == null)
            attr = new DmcTypeDataTypeEnumSV(MetaCompactSchema.__dataType);
        
        attr.set(value);
        set(MetaCompactSchema.__dataType,attr);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:279)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__description);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addDescription(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__description);
        
        attr.add(value);
        add(MetaCompactSchema.__description,attr);
        return(attr);
    }

    /**
     * The designatedFilterAttribute flag is used to identify the attribute
     * designated as the standard wrapper for filters of a particular type.  One,
     * and only one, attribute definition can be the designatedFilterAttribute
     * for a  TypeDefinition that is identified as isFilterType. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Boolean getDesignatedFilterAttribute(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaCompactSchema.__designatedFilterAttribute);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets designatedFilterAttribute to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setDesignatedFilterAttribute(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__designatedFilterAttribute);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaCompactSchema.__designatedFilterAttribute);
        
        attr.set(value);
        set(MetaCompactSchema.__designatedFilterAttribute,attr);
    }

    /**
     * The designatedNameAttribute flag is used to identify the attribute
     * designated as the standard wrapper for names of a particular type. One,
     * and only one, attribute definition can be the designatedNameAttribute for
     * a TypeDefinition that has isNameType true. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Boolean getDesignatedNameAttribute(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaCompactSchema.__designatedNameAttribute);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets designatedNameAttribute to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setDesignatedNameAttribute(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__designatedNameAttribute);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaCompactSchema.__designatedNameAttribute);
        
        attr.set(value);
        set(MetaCompactSchema.__designatedNameAttribute,attr);
    }

    /**
     * Dark-matter identifiers facilitate the compact serialization of
     * dark-matter objects (DMOs); see the serializeIt() and deserializeIt()
     * methods of the DmcObject. <p/> This mechanism also allows for compact
     * transport of dark-matter objects when used with Google Web Toolkit (GWT)
     * RPC mechanisms. When objects are passed back and forth via RPC, the
     * dark-matter identifiers are used instead of the string-based attribute
     * names, which are usually much more lengthy. This optimization is
     * transparently supported by the  DmcObject; you don't need to worry about
     * how it's achieved. <p/> However, if you're curious, have a look at the
     * Compact Schema documentation. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Integer getDmdID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaCompactSchema.__dmdID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setDmdID(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__dmdID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaCompactSchema.__dmdID);
        
        attr.set(value);
        set(MetaCompactSchema.__dmdID,attr);
    }

    /**
     * The dotName attribute is used to store dot separated names. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaCompactSchema.__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setDotName(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaCompactSchema.__dotName);
        
        attr.set(value);
        set(MetaCompactSchema.__dotName,attr);
    }

    /**
     * The example attribute is used to provide additional examples of how some
     * defined thing is to be used. 
     * @return An Iterator of Example objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<Example> getExample(){
        DmcTypeExampleMV attr = (DmcTypeExampleMV) get(MetaCompactSchema.__example);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another example value.
     * @param value A value compatible with DmcTypeExampleMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addExample(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__example);
        if (attr == null)
            attr = new DmcTypeExampleMV(MetaCompactSchema.__example);
        
        attr.add(value);
        add(MetaCompactSchema.__example,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setFile(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__file);
        
        attr.set(value);
        set(MetaCompactSchema.__file,attr);
    }

    /**
     * This attribute indicates the generic arguments to be supplied in the use
     * of a class in an autogenerated Iterable. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getGenericArgs(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__genericArgs);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genericArgs to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setGenericArgs(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__genericArgs);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__genericArgs);
        
        attr.set(value);
        set(MetaCompactSchema.__genericArgs,attr);
    }

    /**
     * Indicates the import required to support a genericArgs specification i.e.
     * if you're not specifying something like <?>, an additional import may be
     * required. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getGenericArgsImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__genericArgsImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genericArgsImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setGenericArgsImport(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__genericArgsImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__genericArgsImport);
        
        attr.set(value);
        set(MetaCompactSchema.__genericArgsImport,attr);
    }

    /**
     * A short description of something that can be dumped as one line summary of
     * something. For longer explanations, use the description attribute. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getHint(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__hint);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets hint to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setHint(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__hint);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__hint);
        
        attr.set(value);
        set(MetaCompactSchema.__hint,attr);
    }

    /**
     * The indexSize is used in conjunction with the MULTI valueType to indicate
     * that the attribute may have the specified number of values and is integer
     * indexed. Indexed attributes may be thought of as having a predetermined
     * number of slots into which values may be stored. When indexed, an
     * attribute has values added to it using the setMVnth() interface, not the
     * usual add() interface. If you attempt to use add() with an indexed
     * attribute, an exception will be thrown. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Integer getIndexSize(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaCompactSchema.__indexSize);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets indexSize to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setIndexSize(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__indexSize);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaCompactSchema.__indexSize);
        
        attr.set(value);
        set(MetaCompactSchema.__indexSize,attr);
    }

    /**
     * Indicates if an attribute is used and set within the Dark Matter Data code
     * generation mechanisms. In the documentation generation code, attributes
     * marked as internalUse WILL NOT be displayed unless you set the
     * -internalUse flag is indicated. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Boolean getInternalUse(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaCompactSchema.__internalUse);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets internalUse to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setInternalUse(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__internalUse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaCompactSchema.__internalUse);
        
        attr.set(value);
        set(MetaCompactSchema.__internalUse,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaCompactSchema.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setLineNumber(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaCompactSchema.__lineNumber);
        
        attr.set(value);
        set(MetaCompactSchema.__lineNumber,attr);
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to provide a default value for non-existent attribute values. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getNullReturnValue(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__nullReturnValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setNullReturnValue(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__nullReturnValue);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__nullReturnValue);
        
        attr.set(value);
        set(MetaCompactSchema.__nullReturnValue,attr);
    }

    /**
     * A set of additional name value pairs that can be associated with an
     * object. 
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<NameValuePair> getNvp(){
        DmcTypeNameValuePairMV attr = (DmcTypeNameValuePairMV) get(MetaCompactSchema.__nvp);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another nvp value.
     * @param value A value compatible with DmcTypeNameValuePairMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addNvp(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__nvp);
        if (attr == null)
            attr = new DmcTypeNameValuePairMV(MetaCompactSchema.__nvp);
        
        attr.add(value);
        add(MetaCompactSchema.__nvp,attr);
        return(attr);
    }

    /**
     * The version at which something became obsolete. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getObsolete(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__obsolete);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsolete to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setObsolete(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__obsolete);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__obsolete);
        
        attr.set(value);
        set(MetaCompactSchema.__obsolete,attr);
    }

    /**
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getObsoleteVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setObsoleteVersion(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__obsoleteVersion);
        
        attr.set(value);
        set(MetaCompactSchema.__obsoleteVersion,attr);
    }

    /**
     * Depending on what you're modelling, you often come across places where you
     * can see an opportunity to optimize, streamline or improve something e.g.
     * merging concepts together, representing something differently, adding a
     * relationship - whatever. However, these ideas often get lost in the
     * shuffle or, if you add them into an overall description of something, they
     * don't stand out. <p/> Any dark-matter definition can be decorated with
     * optimize notes. These notes provide 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getOptimize(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__optimize);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another optimize value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addOptimize(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__optimize);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__optimize);
        
        attr.add(value);
        add(MetaCompactSchema.__optimize,attr);
        return(attr);
    }

    /**
     * Indicates that newline characters should be preserved when an attribute is
     * parsed by the DmcUncheckedOIFParser. This is useful for certain attributes
     * when newlines are required to properly format the contents of the
     * attribute at a later time. For example, the description attribute is later
     * dumped as part of  HTML documentation and, if the newlines are stripped,
     * it won't be properly formatted. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Boolean getPreserveNewlines(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaCompactSchema.__preserveNewlines);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets preserveNewlines to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setPreserveNewlines(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__preserveNewlines);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaCompactSchema.__preserveNewlines);
        
        attr.set(value);
        set(MetaCompactSchema.__preserveNewlines,attr);
    }

    /**
     * A question associated with the definition of something. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getQuestion(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__question);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another question value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addQuestion(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__question);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__question);
        
        attr.add(value);
        add(MetaCompactSchema.__question,attr);
        return(attr);
    }

    /**
     * Allows for references to base concepts that relate this definition to
     * another definition in the Concinnity domain. This mechanism is only used
     * in the domain of dark-matter schema definitions; other DSLs will allow for
     * direct reference to Concinnity concepts. 
     * @return An Iterator of ConcinnityDMO objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<ConcinnityREF> getRelatedToConcept(){
        DmcTypeConcinnityREFMV attr = (DmcTypeConcinnityREFMV) get(MetaCompactSchema.__relatedToConcept);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another relatedToConcept value.
     * @param value A value compatible with DmcTypeConcinnityREFMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addRelatedToConcept(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__relatedToConcept);
        if (attr == null)
            attr = new DmcTypeConcinnityREFMV(MetaCompactSchema.__relatedToConcept);
        
        attr.add(value);
        add(MetaCompactSchema.__relatedToConcept,attr);
        return(attr);
    }

    /**
     * This attribute indicates whether or not the attribute should be encrypted
     * before being transported over the wire or stored in a file or repository 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Boolean getSecure(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaCompactSchema.__secure);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets secure to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setSecure(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__secure);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaCompactSchema.__secure);
        
        attr.set(value);
        set(MetaCompactSchema.__secure,attr);
    }

    /**
     * A version from which something should be excluded (even though it is
     * included in later versions). This is an unusual situation, and should be
     * approached with extreme caution! 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getSkip(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__skip);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another skip value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addSkip(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__skip);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__skip);
        
        attr.add(value);
        add(MetaCompactSchema.__skip,attr);
        return(attr);
    }

    /**
     * The sortName is used in siutations where we need a name for storage of a
     * definition that is globally unique but can be sorted on the basis of the
     * definition name, not the module name. The dotName for a definition is
     * module.definition...type, whereas the sortName would be
     * definition...module.type. So, for things like documentation generation,
     * the sortName provides a more  natural ordering. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public DotName getSortName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaCompactSchema.__sortName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sortName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setSortName(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__sortName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaCompactSchema.__sortName);
        
        attr.set(value);
        set(MetaCompactSchema.__sortName,attr);
    }

    /**
     * A collection of tags that can facilitate searching for definitions. The
     * values are limited to a-zA-Z0-9 and the space character. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getTags(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__tags);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another tags value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addTags(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__tags);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__tags);
        
        attr.add(value);
        add(MetaCompactSchema.__tags,attr);
        return(attr);
    }

    /**
     * This attribute indicates the cardinality and storage mechanism for an
     * attribute. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public ValueTypeEnum getValueType(){
        DmcTypeValueTypeEnumSV attr = (DmcTypeValueTypeEnumSV) get(MetaCompactSchema.__valueType);
        if (attr == null)
            return(ValueTypeEnum.SINGLE);

        return(attr.getSV());
    }

    /**
     * Sets valueType to the specified value.
     * @param value A value compatible with DmcTypeValueTypeEnumSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setValueType(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__valueType);
        if (attr == null)
            attr = new DmcTypeValueTypeEnumSV(MetaCompactSchema.__valueType);
        
        attr.set(value);
        set(MetaCompactSchema.__valueType,attr);
    }

    /**
     * The version at which something was introduced. Version names are assumed
     * to be lexicographically sortable i.e. the name of a version must have a
     * nautral sort order that increases. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__version);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets version to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setVersion(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__version);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__version);
        
        attr.set(value);
        set(MetaCompactSchema.__version,attr);
    }

    /**
     * A flag to indicate that a reference attribute is weak i.e.  if the object
     * can't be resolved, no exception is thrown. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Boolean getWeakReference(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaCompactSchema.__weakReference);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets weakReference to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setWeakReference(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__weakReference);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaCompactSchema.__weakReference);
        
        attr.set(value);
        set(MetaCompactSchema.__weakReference,attr);
    }

    /**
     * An indication of why something was added to a specification or a system.
     * This might be a reference to a requirement or feature concept. How this is
     * used will depend on context. Due to the fact that it is a weak reference,
     * you may also just put in free form text, since it will simply be treated
     * as an unresolved reference. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public ConcinnityREF getWhy(){
        DmcTypeConcinnityREFSV attr = (DmcTypeConcinnityREFSV) get(MetaCompactSchema.__why);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets why to the specified value.
     * @param value A value compatible with DmcTypeConcinnityREFSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setWhy(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__why);
        if (attr == null)
            attr = new DmcTypeConcinnityREFSV(MetaCompactSchema.__why);
        
        attr.set(value);
        set(MetaCompactSchema.__why,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.tools.generation.meta.DmoFormatter.formatDMOForClass(DmoFormatter.java:249)

    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public DefinitionName getObjectName(){
        DmcTypeDefinitionName attr = (DmcTypeDefinitionName) get(MetaCompactSchema.__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> attr = (DmcTypeDefinitionName) get(MetaCompactSchema.__name);
        return(attr);
    }

}
