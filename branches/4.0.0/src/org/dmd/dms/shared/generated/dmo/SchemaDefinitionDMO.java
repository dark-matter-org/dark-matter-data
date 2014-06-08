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
// Called from: org.dmd.dms.tools.meta.DmoFormatter.formatDMOForClass(DmoFormatter.java:100)
import java.io.Serializable;                         // Serializable marker interface - (DmoFormatter.java:58)
import java.util.*;                                  // Attribute info support - (DmoFormatter.java:59)
import org.dmd.core.*;                               // dark-matter core - (DmoFormatter.java:80)
import org.dmd.core.feedback.DMFeedbackSet;          // To allow error feedback - (DmoFormatter.java:79)
import org.dmd.core.schema.DmcAttributeInfo;         // To access attribute info - (DmoFormatter.java:81)
import org.dmd.core.schema.DmcSliceInfo;             // To allow object slicing - (DmoFormatter.java:82)
import org.dmd.dms.shared.generated.types.*;         // Generated type access - (DmoFormatter.java:93)
import org.dmd.dms.shared.types.*;                   // For common types - (DmoFormatter.java:83)



/**
 * This class is used to define a schema as a discrete, nameable entity. 
 * Generated from: org.dmd.dms.tools.meta.DmoFormatter.formatDMOForClass(DmoFormatter.java:108)
 */
@SuppressWarnings("serial")
public class SchemaDefinitionDMO extends org.dmd.dms.shared.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaCompactSchema.__definedInDmsModule.id,MetaCompactSchema.__definedInDmsModule);
        _ImAp.put(MetaCompactSchema.__name.id,MetaCompactSchema.__name);
        _ImAp.put(MetaCompactSchema.__schemaBaseID.id,MetaCompactSchema.__schemaBaseID);
        _ImAp.put(MetaCompactSchema.__schemaIDRange.id,MetaCompactSchema.__schemaIDRange);
        _ImAp.put(MetaCompactSchema.__schemaPackage.id,MetaCompactSchema.__schemaPackage);
        _ImAp.put(MetaCompactSchema.__actionDefList.id,MetaCompactSchema.__actionDefList);
        _ImAp.put(MetaCompactSchema.__attributeDefList.id,MetaCompactSchema.__attributeDefList);
        _ImAp.put(MetaCompactSchema.__classDefList.id,MetaCompactSchema.__classDefList);
        _ImAp.put(MetaCompactSchema.__codeComment.id,MetaCompactSchema.__codeComment);
        _ImAp.put(MetaCompactSchema.__comment.id,MetaCompactSchema.__comment);
        _ImAp.put(MetaCompactSchema.__complexTypeDefList.id,MetaCompactSchema.__complexTypeDefList);
        _ImAp.put(MetaCompactSchema.__createAttributeFactory.id,MetaCompactSchema.__createAttributeFactory);
        _ImAp.put(MetaCompactSchema.__defFiles.id,MetaCompactSchema.__defFiles);
        _ImAp.put(MetaCompactSchema.__dependsOn.id,MetaCompactSchema.__dependsOn);
        _ImAp.put(MetaCompactSchema.__dependsOnRef.id,MetaCompactSchema.__dependsOnRef);
        _ImAp.put(MetaCompactSchema.__description.id,MetaCompactSchema.__description);
        _ImAp.put(MetaCompactSchema.__dmwPackage.id,MetaCompactSchema.__dmwPackage);
        _ImAp.put(MetaCompactSchema.__dmwTypeToPackage.id,MetaCompactSchema.__dmwTypeToPackage);
        _ImAp.put(MetaCompactSchema.__dotName.id,MetaCompactSchema.__dotName);
        _ImAp.put(MetaCompactSchema.__dsdModuleList.id,MetaCompactSchema.__dsdModuleList);
        _ImAp.put(MetaCompactSchema.__enumDefList.id,MetaCompactSchema.__enumDefList);
        _ImAp.put(MetaCompactSchema.__example.id,MetaCompactSchema.__example);
        _ImAp.put(MetaCompactSchema.__extendedReferenceTypeDefList.id,MetaCompactSchema.__extendedReferenceTypeDefList);
        _ImAp.put(MetaCompactSchema.__file.id,MetaCompactSchema.__file);
        _ImAp.put(MetaCompactSchema.__generatedFileHeader.id,MetaCompactSchema.__generatedFileHeader);
        _ImAp.put(MetaCompactSchema.__hint.id,MetaCompactSchema.__hint);
        _ImAp.put(MetaCompactSchema.__internalTypeDefList.id,MetaCompactSchema.__internalTypeDefList);
        _ImAp.put(MetaCompactSchema.__lineNumber.id,MetaCompactSchema.__lineNumber);
        _ImAp.put(MetaCompactSchema.__nvp.id,MetaCompactSchema.__nvp);
        _ImAp.put(MetaCompactSchema.__obsolete.id,MetaCompactSchema.__obsolete);
        _ImAp.put(MetaCompactSchema.__optimize.id,MetaCompactSchema.__optimize);
        _ImAp.put(MetaCompactSchema.__question.id,MetaCompactSchema.__question);
        _ImAp.put(MetaCompactSchema.__relatedToConcept.id,MetaCompactSchema.__relatedToConcept);
        _ImAp.put(MetaCompactSchema.__ruleCategoryList.id,MetaCompactSchema.__ruleCategoryList);
        _ImAp.put(MetaCompactSchema.__ruleDataList.id,MetaCompactSchema.__ruleDataList);
        _ImAp.put(MetaCompactSchema.__ruleDefinitionList.id,MetaCompactSchema.__ruleDefinitionList);
        _ImAp.put(MetaCompactSchema.__schemaExtension.id,MetaCompactSchema.__schemaExtension);
        _ImAp.put(MetaCompactSchema.__skip.id,MetaCompactSchema.__skip);
        _ImAp.put(MetaCompactSchema.__sliceDefList.id,MetaCompactSchema.__sliceDefList);
        _ImAp.put(MetaCompactSchema.__sortName.id,MetaCompactSchema.__sortName);
        _ImAp.put(MetaCompactSchema.__tags.id,MetaCompactSchema.__tags);
        _ImAp.put(MetaCompactSchema.__typeDefList.id,MetaCompactSchema.__typeDefList);
        _ImAp.put(MetaCompactSchema.__version.id,MetaCompactSchema.__version);
        _ImAp.put(MetaCompactSchema.__why.id,MetaCompactSchema.__why);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaCompactSchema.__definedInDmsModule.name,MetaCompactSchema.__definedInDmsModule);
        _SmAp.put(MetaCompactSchema.__name.name,MetaCompactSchema.__name);
        _SmAp.put(MetaCompactSchema.__schemaBaseID.name,MetaCompactSchema.__schemaBaseID);
        _SmAp.put(MetaCompactSchema.__schemaIDRange.name,MetaCompactSchema.__schemaIDRange);
        _SmAp.put(MetaCompactSchema.__schemaPackage.name,MetaCompactSchema.__schemaPackage);
        _SmAp.put(MetaCompactSchema.__actionDefList.name,MetaCompactSchema.__actionDefList);
        _SmAp.put(MetaCompactSchema.__attributeDefList.name,MetaCompactSchema.__attributeDefList);
        _SmAp.put(MetaCompactSchema.__classDefList.name,MetaCompactSchema.__classDefList);
        _SmAp.put(MetaCompactSchema.__codeComment.name,MetaCompactSchema.__codeComment);
        _SmAp.put(MetaCompactSchema.__comment.name,MetaCompactSchema.__comment);
        _SmAp.put(MetaCompactSchema.__complexTypeDefList.name,MetaCompactSchema.__complexTypeDefList);
        _SmAp.put(MetaCompactSchema.__createAttributeFactory.name,MetaCompactSchema.__createAttributeFactory);
        _SmAp.put(MetaCompactSchema.__defFiles.name,MetaCompactSchema.__defFiles);
        _SmAp.put(MetaCompactSchema.__dependsOn.name,MetaCompactSchema.__dependsOn);
        _SmAp.put(MetaCompactSchema.__dependsOnRef.name,MetaCompactSchema.__dependsOnRef);
        _SmAp.put(MetaCompactSchema.__description.name,MetaCompactSchema.__description);
        _SmAp.put(MetaCompactSchema.__dmwPackage.name,MetaCompactSchema.__dmwPackage);
        _SmAp.put(MetaCompactSchema.__dmwTypeToPackage.name,MetaCompactSchema.__dmwTypeToPackage);
        _SmAp.put(MetaCompactSchema.__dotName.name,MetaCompactSchema.__dotName);
        _SmAp.put(MetaCompactSchema.__dsdModuleList.name,MetaCompactSchema.__dsdModuleList);
        _SmAp.put(MetaCompactSchema.__enumDefList.name,MetaCompactSchema.__enumDefList);
        _SmAp.put(MetaCompactSchema.__example.name,MetaCompactSchema.__example);
        _SmAp.put(MetaCompactSchema.__extendedReferenceTypeDefList.name,MetaCompactSchema.__extendedReferenceTypeDefList);
        _SmAp.put(MetaCompactSchema.__file.name,MetaCompactSchema.__file);
        _SmAp.put(MetaCompactSchema.__generatedFileHeader.name,MetaCompactSchema.__generatedFileHeader);
        _SmAp.put(MetaCompactSchema.__hint.name,MetaCompactSchema.__hint);
        _SmAp.put(MetaCompactSchema.__internalTypeDefList.name,MetaCompactSchema.__internalTypeDefList);
        _SmAp.put(MetaCompactSchema.__lineNumber.name,MetaCompactSchema.__lineNumber);
        _SmAp.put(MetaCompactSchema.__nvp.name,MetaCompactSchema.__nvp);
        _SmAp.put(MetaCompactSchema.__obsolete.name,MetaCompactSchema.__obsolete);
        _SmAp.put(MetaCompactSchema.__optimize.name,MetaCompactSchema.__optimize);
        _SmAp.put(MetaCompactSchema.__question.name,MetaCompactSchema.__question);
        _SmAp.put(MetaCompactSchema.__relatedToConcept.name,MetaCompactSchema.__relatedToConcept);
        _SmAp.put(MetaCompactSchema.__ruleCategoryList.name,MetaCompactSchema.__ruleCategoryList);
        _SmAp.put(MetaCompactSchema.__ruleDataList.name,MetaCompactSchema.__ruleDataList);
        _SmAp.put(MetaCompactSchema.__ruleDefinitionList.name,MetaCompactSchema.__ruleDefinitionList);
        _SmAp.put(MetaCompactSchema.__schemaExtension.name,MetaCompactSchema.__schemaExtension);
        _SmAp.put(MetaCompactSchema.__skip.name,MetaCompactSchema.__skip);
        _SmAp.put(MetaCompactSchema.__sliceDefList.name,MetaCompactSchema.__sliceDefList);
        _SmAp.put(MetaCompactSchema.__sortName.name,MetaCompactSchema.__sortName);
        _SmAp.put(MetaCompactSchema.__tags.name,MetaCompactSchema.__tags);
        _SmAp.put(MetaCompactSchema.__typeDefList.name,MetaCompactSchema.__typeDefList);
        _SmAp.put(MetaCompactSchema.__version.name,MetaCompactSchema.__version);
        _SmAp.put(MetaCompactSchema.__why.name,MetaCompactSchema.__why);
    }


    public SchemaDefinitionDMO(){
        super("SchemaDefinition");
    }

    public SchemaDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public SchemaDefinitionDMO getNew(){
        SchemaDefinitionDMO rc = new SchemaDefinitionDMO();
        return(rc);
    }

    @Override
    public SchemaDefinitionDMO getSlice(DmcSliceInfo info){
        SchemaDefinitionDMO rc = new SchemaDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The dark-matter schema module (DmsModule) in which something is defined. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setName(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaCompactSchema.__name);
        
        attr.set(value);
        set(MetaCompactSchema.__name,attr);
    }

    /**
     * The base identifier value for a schema. This value is added to each dmdID
     * value associated with the AttributeDefinitions defined by the schema. This
     * allows for easy rebasing of identifier values if required. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Integer getSchemaBaseID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaCompactSchema.__schemaBaseID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaBaseID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setSchemaBaseID(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__schemaBaseID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaCompactSchema.__schemaBaseID);
        
        attr.set(value);
        set(MetaCompactSchema.__schemaBaseID,attr);
    }

    /**
     * The maximum number of attribute definitions in a particular schema. This
     * will provide immediate feedback if you exceed the given ID range for your
     * schema. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Integer getSchemaIDRange(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaCompactSchema.__schemaIDRange);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaIDRange to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setSchemaIDRange(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__schemaIDRange);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaCompactSchema.__schemaIDRange);
        
        attr.set(value);
        set(MetaCompactSchema.__schemaIDRange,attr);
    }

    /**
     * Indicates the package that a schema will be part of when its code is
     * generated using DMO generator tool. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getSchemaPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__schemaPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setSchemaPackage(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__schemaPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__schemaPackage);
        
        attr.set(value);
        set(MetaCompactSchema.__schemaPackage,attr);
    }

    /**
     * A list of action definition references. 
     * @return An Iterator of ActionDefinitionDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<ActionDefinitionREF> getActionDefList(){
        DmcTypeActionDefinitionREFMV attr = (DmcTypeActionDefinitionREFMV) get(MetaCompactSchema.__actionDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another actionDefList value.
     * @param value A value compatible with DmcTypeActionDefinitionREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addActionDefList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__actionDefList);
        if (attr == null)
            attr = new DmcTypeActionDefinitionREFMV(MetaCompactSchema.__actionDefList);
        
        attr.add(value);
        add(MetaCompactSchema.__actionDefList,attr);
        return(attr);
    }

    /**
     * A list of attribute definition references. 
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<AttributeDefinitionREF> getAttributeDefList(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaCompactSchema.__attributeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another attributeDefList value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addAttributeDefList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__attributeDefList);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaCompactSchema.__attributeDefList);
        
        attr.add(value);
        add(MetaCompactSchema.__attributeDefList,attr);
        return(attr);
    }

    /**
     * A list of class definition references. 
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<ClassDefinitionREF> getClassDefList(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(MetaCompactSchema.__classDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another classDefList value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addClassDefList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__classDefList);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(MetaCompactSchema.__classDefList);
        
        attr.add(value);
        add(MetaCompactSchema.__classDefList,attr);
        return(attr);
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addComment(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__comment);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__comment);
        
        attr.add(value);
        add(MetaCompactSchema.__comment,attr);
        return(attr);
    }

    /**
     * A list of complex type definition references. 
     * @return An Iterator of ComplexTypeDefinitionDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<ComplexTypeDefinitionREF> getComplexTypeDefList(){
        DmcTypeComplexTypeDefinitionREFMV attr = (DmcTypeComplexTypeDefinitionREFMV) get(MetaCompactSchema.__complexTypeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another complexTypeDefList value.
     * @param value A value compatible with DmcTypeComplexTypeDefinitionREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addComplexTypeDefList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__complexTypeDefList);
        if (attr == null)
            attr = new DmcTypeComplexTypeDefinitionREFMV(MetaCompactSchema.__complexTypeDefList);
        
        attr.add(value);
        add(MetaCompactSchema.__complexTypeDefList,attr);
        return(attr);
    }

    /**
     * When specified as true on a SchemaDefinition, the DMO generation utility
     * will create a free standing AttributeFactory for the schema. This allows
     * for the creation of attributes taht can then be embedded in complex
     * objects and properly serialized/deserialized. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Boolean getCreateAttributeFactory(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaCompactSchema.__createAttributeFactory);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets createAttributeFactory to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setCreateAttributeFactory(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__createAttributeFactory);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaCompactSchema.__createAttributeFactory);
        
        attr.set(value);
        set(MetaCompactSchema.__createAttributeFactory,attr);
    }

    /**
     * A list of files that contain the class, attribute and type definitions
     * that comprise a schema. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getDefFiles(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__defFiles);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addDefFiles(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__defFiles);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__defFiles);
        
        attr.add(value);
        add(MetaCompactSchema.__defFiles,attr);
        return(attr);
    }

    /**
     * A list of schema names. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getDependsOn(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__dependsOn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addDependsOn(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__dependsOn);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__dependsOn);
        
        attr.add(value);
        add(MetaCompactSchema.__dependsOn,attr);
        return(attr);
    }

    /**
     * A list of schema references that are based on the contents of the
     * dependsOn attribute. 
     * @return An Iterator of SchemaDefinitionDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<SchemaDefinitionREF> getDependsOnRef(){
        DmcTypeSchemaDefinitionREFMV attr = (DmcTypeSchemaDefinitionREFMV) get(MetaCompactSchema.__dependsOnRef);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnRef value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addDependsOnRef(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__dependsOnRef);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFMV(MetaCompactSchema.__dependsOnRef);
        
        attr.add(value);
        add(MetaCompactSchema.__dependsOnRef,attr);
        return(attr);
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:279)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addDescription(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__description);
        
        attr.add(value);
        add(MetaCompactSchema.__description,attr);
        return(attr);
    }

    /**
     * Indicates the package where server related Dark Matter Wrapper classes 
     * were generated for this schema. This is used when we're generating derived
     * wrapper classes. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getDmwPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__dmwPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setDmwPackage(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__dmwPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__dmwPackage);
        
        attr.set(value);
        set(MetaCompactSchema.__dmwPackage,attr);
    }

    /**
     * The dmwTypeToPackage attribute is used to indicate alternative generation
     * packages for the Dark Matter Wrapper (DMW) code generation mechanisms. For
     * instance, if we  want to generate GXT wrappers for use with Sencha's GXT
     * model classes, we could specify dmwTypeToPackage gxt com.example.client.
     * Each of schemas that's loaded for generation would have to have this same
     * attribute specified so that, if there were derived classes across schemas,
     * the appropriate wrapper derivations could be determined. See the
     * ClassDefintion.adjustClass() method to see how this is used. 
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<StringToString> getDmwTypeToPackage(){
        DmcTypeStringToStringMV attr = (DmcTypeStringToStringMV) get(MetaCompactSchema.__dmwTypeToPackage);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dmwTypeToPackage value.
     * @param value A value compatible with DmcTypeStringToStringMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addDmwTypeToPackage(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__dmwTypeToPackage);
        if (attr == null)
            attr = new DmcTypeStringToStringMV(MetaCompactSchema.__dmwTypeToPackage);
        
        attr.add(value);
        add(MetaCompactSchema.__dmwTypeToPackage,attr);
        return(attr);
    }

    /**
     * The dotName attribute is used to store dot separated names. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setDotName(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaCompactSchema.__dotName);
        
        attr.set(value);
        set(MetaCompactSchema.__dotName,attr);
    }

    /**
     * The set of DSDefinitionModules defined in a schema. 
     * @return An Iterator of DSDefinitionModuleDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<DSDefinitionModuleREF> getDsdModuleList(){
        DmcTypeDSDefinitionModuleREFMV attr = (DmcTypeDSDefinitionModuleREFMV) get(MetaCompactSchema.__dsdModuleList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dsdModuleList value.
     * @param value A value compatible with DmcTypeDSDefinitionModuleREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addDsdModuleList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__dsdModuleList);
        if (attr == null)
            attr = new DmcTypeDSDefinitionModuleREFMV(MetaCompactSchema.__dsdModuleList);
        
        attr.add(value);
        add(MetaCompactSchema.__dsdModuleList,attr);
        return(attr);
    }

    /**
     * A list of EnumDefinitions. 
     * @return An Iterator of EnumDefinitionDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<EnumDefinitionREF> getEnumDefList(){
        DmcTypeEnumDefinitionREFMV attr = (DmcTypeEnumDefinitionREFMV) get(MetaCompactSchema.__enumDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another enumDefList value.
     * @param value A value compatible with DmcTypeEnumDefinitionREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addEnumDefList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__enumDefList);
        if (attr == null)
            attr = new DmcTypeEnumDefinitionREFMV(MetaCompactSchema.__enumDefList);
        
        attr.add(value);
        add(MetaCompactSchema.__enumDefList,attr);
        return(attr);
    }

    /**
     * The example attribute is used to provide additional examples of how some
     * defined thing is to be used. 
     * @return An Iterator of Example objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addExample(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__example);
        if (attr == null)
            attr = new DmcTypeExampleMV(MetaCompactSchema.__example);
        
        attr.add(value);
        add(MetaCompactSchema.__example,attr);
        return(attr);
    }

    /**
     * A list of extended reference type definition references. 
     * @return An Iterator of ExtendedReferenceTypeDefinitionDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<ExtendedReferenceTypeDefinitionREF> getExtendedReferenceTypeDefList(){
        DmcTypeExtendedReferenceTypeDefinitionREFMV attr = (DmcTypeExtendedReferenceTypeDefinitionREFMV) get(MetaCompactSchema.__extendedReferenceTypeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another extendedReferenceTypeDefList value.
     * @param value A value compatible with DmcTypeExtendedReferenceTypeDefinitionREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addExtendedReferenceTypeDefList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__extendedReferenceTypeDefList);
        if (attr == null)
            attr = new DmcTypeExtendedReferenceTypeDefinitionREFMV(MetaCompactSchema.__extendedReferenceTypeDefList);
        
        attr.add(value);
        add(MetaCompactSchema.__extendedReferenceTypeDefList,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setFile(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__file);
        
        attr.set(value);
        set(MetaCompactSchema.__file,attr);
    }

    /**
     * The name of file that coresides with the schema.dms file that contains a
     * common header to be applied to all generated code. For instance, you might
     * want a common licensing comment at the top of your generated files. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getGeneratedFileHeader(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__generatedFileHeader);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setGeneratedFileHeader(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__generatedFileHeader);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__generatedFileHeader);
        
        attr.set(value);
        set(MetaCompactSchema.__generatedFileHeader,attr);
    }

    /**
     * A short description of something that can be dumped as one line summary of
     * something. For longer explanations, use the description attribute. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setHint(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__hint);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__hint);
        
        attr.set(value);
        set(MetaCompactSchema.__hint,attr);
    }

    /**
     * A list of type definitions that were generated internally to represent
     * enums and object references. 
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<TypeDefinitionREF> getInternalTypeDefList(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) get(MetaCompactSchema.__internalTypeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another internalTypeDefList value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addInternalTypeDefList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__internalTypeDefList);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFMV(MetaCompactSchema.__internalTypeDefList);
        
        attr.add(value);
        add(MetaCompactSchema.__internalTypeDefList,attr);
        return(attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setLineNumber(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaCompactSchema.__lineNumber);
        
        attr.set(value);
        set(MetaCompactSchema.__lineNumber,attr);
    }

    /**
     * A set of additional name value pairs that can be associated with an
     * object. 
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setObsolete(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__obsolete);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__obsolete);
        
        attr.set(value);
        set(MetaCompactSchema.__obsolete,attr);
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addOptimize(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__optimize);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__optimize);
        
        attr.add(value);
        add(MetaCompactSchema.__optimize,attr);
        return(attr);
    }

    /**
     * A question associated with the definition of something. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addRelatedToConcept(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__relatedToConcept);
        if (attr == null)
            attr = new DmcTypeConcinnityREFMV(MetaCompactSchema.__relatedToConcept);
        
        attr.add(value);
        add(MetaCompactSchema.__relatedToConcept,attr);
        return(attr);
    }

    /**
     * The RuleCategories defined in a schema. 
     * @return An Iterator of RuleCategoryDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<RuleCategoryREF> getRuleCategoryList(){
        DmcTypeRuleCategoryREFMV attr = (DmcTypeRuleCategoryREFMV) get(MetaCompactSchema.__ruleCategoryList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleCategoryList value.
     * @param value A value compatible with DmcTypeRuleCategoryREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addRuleCategoryList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__ruleCategoryList);
        if (attr == null)
            attr = new DmcTypeRuleCategoryREFMV(MetaCompactSchema.__ruleCategoryList);
        
        attr.add(value);
        add(MetaCompactSchema.__ruleCategoryList,attr);
        return(attr);
    }

    /**
     * The RuleData defined in a schema. 
     * @return An Iterator of RuleDataDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<RuleDataREF> getRuleDataList(){
        DmcTypeRuleDataREFMV attr = (DmcTypeRuleDataREFMV) get(MetaCompactSchema.__ruleDataList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleDataList value.
     * @param value A value compatible with DmcTypeRuleDataREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addRuleDataList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__ruleDataList);
        if (attr == null)
            attr = new DmcTypeRuleDataREFMV(MetaCompactSchema.__ruleDataList);
        
        attr.add(value);
        add(MetaCompactSchema.__ruleDataList,attr);
        return(attr);
    }

    /**
     * The RuleDefinitions defined in a schema. 
     * @return An Iterator of RuleDefinitionDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<RuleDefinitionREF> getRuleDefinitionList(){
        DmcTypeRuleDefinitionREFMV attr = (DmcTypeRuleDefinitionREFMV) get(MetaCompactSchema.__ruleDefinitionList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleDefinitionList value.
     * @param value A value compatible with DmcTypeRuleDefinitionREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addRuleDefinitionList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__ruleDefinitionList);
        if (attr == null)
            attr = new DmcTypeRuleDefinitionREFMV(MetaCompactSchema.__ruleDefinitionList);
        
        attr.add(value);
        add(MetaCompactSchema.__ruleDefinitionList,attr);
        return(attr);
    }

    /**
     * The fully qualified name of a class that extends the schema management
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement the SchemaExtensionIF. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getSchemaExtension(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__schemaExtension);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another schemaExtension value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addSchemaExtension(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__schemaExtension);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__schemaExtension);
        
        attr.add(value);
        add(MetaCompactSchema.__schemaExtension,attr);
        return(attr);
    }

    /**
     * A version from which something should be excluded (even though it is
     * included in later versions). This is an unusual situation, and should be
     * approached with extreme caution! 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addSkip(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__skip);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__skip);
        
        attr.add(value);
        add(MetaCompactSchema.__skip,attr);
        return(attr);
    }

    /**
     * A list of slice definition references. 
     * @return An Iterator of SliceDefinitionDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<SliceDefinitionREF> getSliceDefList(){
        DmcTypeSliceDefinitionREFMV attr = (DmcTypeSliceDefinitionREFMV) get(MetaCompactSchema.__sliceDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another sliceDefList value.
     * @param value A value compatible with DmcTypeSliceDefinitionREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addSliceDefList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__sliceDefList);
        if (attr == null)
            attr = new DmcTypeSliceDefinitionREFMV(MetaCompactSchema.__sliceDefList);
        
        attr.add(value);
        add(MetaCompactSchema.__sliceDefList,attr);
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addTags(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__tags);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__tags);
        
        attr.add(value);
        add(MetaCompactSchema.__tags,attr);
        return(attr);
    }

    /**
     * A list of type definition references. 
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:261)
    public Iterator<TypeDefinitionREF> getTypeDefList(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) get(MetaCompactSchema.__typeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another typeDefList value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFMV
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addTypeDefList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__typeDefList);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFMV(MetaCompactSchema.__typeDefList);
        
        attr.add(value);
        add(MetaCompactSchema.__typeDefList,attr);
        return(attr);
    }

    /**
     * The version at which something was introduced. Version names are assumed
     * to be lexicographically sortable i.e. the name of a version must have a
     * nautral sort order that increases. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setVersion(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__version);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__version);
        
        attr.set(value);
        set(MetaCompactSchema.__version,attr);
    }

    /**
     * An indication of why something was added to a specification or a system.
     * This might be a reference to a requirement or feature concept. How this is
     * used will depend on context. Due to the fact that it is a weak reference,
     * you may also just put in free form text, since it will simply be treated
     * as an unresolved reference. 
     */
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
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
    // org.dmd.dms.tools.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setWhy(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__why);
        if (attr == null)
            attr = new DmcTypeConcinnityREFSV(MetaCompactSchema.__why);
        
        attr.set(value);
        set(MetaCompactSchema.__why,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.tools.meta.DmoFormatter.formatDMOForClass(DmoFormatter.java:249)

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
