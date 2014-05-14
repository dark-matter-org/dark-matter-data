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
import java.io.Serializable;                            // Serializable marker interface - (DmoFormatter.java:58)
import java.util.*;                                     // Attribute info support - (DmoFormatter.java:59)
import org.dmd.core.*;                                  // dark-matter core - (DmoFormatter.java:80)
import org.dmd.core.feedback.DMFeedbackSet;             // To allow error feedback - (DmoFormatter.java:79)
import org.dmd.core.interfaces.DmcDefinitionIF;         // This is a domain specific definition - (DmoFormatter.java:90)
import org.dmd.core.schema.DmcAttributeInfo;            // To access attribute info - (DmoFormatter.java:81)
import org.dmd.core.schema.DmcSliceInfo;                // To allow object slicing - (DmoFormatter.java:82)
import org.dmd.dms.shared.generated.enums.*;            // Has enum attributes - (DmoFormatter.java:96)
import org.dmd.dms.shared.generated.types.*;            // Generated type access - (DmoFormatter.java:93)
import org.dmd.dms.shared.types.*;                      // For common types - (DmoFormatter.java:83)



/**
 * The RuleCategory allows for the definition of categories of rules to be
 * applied to various objects and indicates the expected interface to be
 * implemented by a rule instance. A RuleDefinition may belong to multiple
 * categories.  <p/> RuleCategories fall into two broad types, ATTRIBUTE and
 * CLASS level, as specified via the ruleType attribute. When a
 * RuleDefinition belongs to an ATTRIBUTE level category, its instances will
 * have a mandatory applyToAttribute attribute. Both ATTRIBUTE and CLASS
 * level RuleDefinitions have an optional applyToClass attribute by default.
 * <p/> Specifying a RuleCategory will cause the generation of several
 * artifacts including: <ul> <li> a category interface: this interface will
 * be created based on the ruleParam values and will be implemented by
 * RuleDefinitions that are part of the category </li> a rule collection:
 * this is a category specific collection of rules that organize the rule
 * instances in this category. </ul> Exactly how a RuleCategory applies rule
 * instances is category specific and this behaviour should be part of the
 * description of a rule category. <p/> For CLASS level rules, you must
 * specify the classInfoFromParam attribute to indicate how to  get the
 * DmcClassInfo from whatever object you are passing to the rule. For
 * ATTRIBUTE level rules, you must specify both attributeInfoFromParam and
 * classInfoFromParam. 
 * Generated from: org.dmd.dms.tools.generation.meta.DmoFormatter.formatDMOForClass(DmoFormatter.java:108)
 */
@SuppressWarnings("serial")
public class RuleCategoryDMO extends org.dmd.dms.shared.generated.dmo.DmsDefinitionDMO implements Serializable, DmcDefinitionIF {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__classInfoFromParam.id,MetaDMSAG.__classInfoFromParam);
        _ImAp.put(MetaDMSAG.__definedInDmsModule.id,MetaDMSAG.__definedInDmsModule);
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__opContext.id,MetaDMSAG.__opContext);
        _ImAp.put(MetaDMSAG.__ruleCategoryID.id,MetaDMSAG.__ruleCategoryID);
        _ImAp.put(MetaDMSAG.__ruleParam.id,MetaDMSAG.__ruleParam);
        _ImAp.put(MetaDMSAG.__ruleType.id,MetaDMSAG.__ruleType);
        _ImAp.put(MetaDMSAG.__attributeInfoFromParam.id,MetaDMSAG.__attributeInfoFromParam);
        _ImAp.put(MetaDMSAG.__codeComment.id,MetaDMSAG.__codeComment);
        _ImAp.put(MetaDMSAG.__comment.id,MetaDMSAG.__comment);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__dotName.id,MetaDMSAG.__dotName);
        _ImAp.put(MetaDMSAG.__example.id,MetaDMSAG.__example);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__hint.id,MetaDMSAG.__hint);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__nvp.id,MetaDMSAG.__nvp);
        _ImAp.put(MetaDMSAG.__obsolete.id,MetaDMSAG.__obsolete);
        _ImAp.put(MetaDMSAG.__optimize.id,MetaDMSAG.__optimize);
        _ImAp.put(MetaDMSAG.__question.id,MetaDMSAG.__question);
        _ImAp.put(MetaDMSAG.__relatedToConcept.id,MetaDMSAG.__relatedToConcept);
        _ImAp.put(MetaDMSAG.__ruleImport.id,MetaDMSAG.__ruleImport);
        _ImAp.put(MetaDMSAG.__skip.id,MetaDMSAG.__skip);
        _ImAp.put(MetaDMSAG.__sortName.id,MetaDMSAG.__sortName);
        _ImAp.put(MetaDMSAG.__tags.id,MetaDMSAG.__tags);
        _ImAp.put(MetaDMSAG.__version.id,MetaDMSAG.__version);
        _ImAp.put(MetaDMSAG.__why.id,MetaDMSAG.__why);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__classInfoFromParam.name,MetaDMSAG.__classInfoFromParam);
        _SmAp.put(MetaDMSAG.__definedInDmsModule.name,MetaDMSAG.__definedInDmsModule);
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__opContext.name,MetaDMSAG.__opContext);
        _SmAp.put(MetaDMSAG.__ruleCategoryID.name,MetaDMSAG.__ruleCategoryID);
        _SmAp.put(MetaDMSAG.__ruleParam.name,MetaDMSAG.__ruleParam);
        _SmAp.put(MetaDMSAG.__ruleType.name,MetaDMSAG.__ruleType);
        _SmAp.put(MetaDMSAG.__attributeInfoFromParam.name,MetaDMSAG.__attributeInfoFromParam);
        _SmAp.put(MetaDMSAG.__codeComment.name,MetaDMSAG.__codeComment);
        _SmAp.put(MetaDMSAG.__comment.name,MetaDMSAG.__comment);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__dotName.name,MetaDMSAG.__dotName);
        _SmAp.put(MetaDMSAG.__example.name,MetaDMSAG.__example);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__hint.name,MetaDMSAG.__hint);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__nvp.name,MetaDMSAG.__nvp);
        _SmAp.put(MetaDMSAG.__obsolete.name,MetaDMSAG.__obsolete);
        _SmAp.put(MetaDMSAG.__optimize.name,MetaDMSAG.__optimize);
        _SmAp.put(MetaDMSAG.__question.name,MetaDMSAG.__question);
        _SmAp.put(MetaDMSAG.__relatedToConcept.name,MetaDMSAG.__relatedToConcept);
        _SmAp.put(MetaDMSAG.__ruleImport.name,MetaDMSAG.__ruleImport);
        _SmAp.put(MetaDMSAG.__skip.name,MetaDMSAG.__skip);
        _SmAp.put(MetaDMSAG.__sortName.name,MetaDMSAG.__sortName);
        _SmAp.put(MetaDMSAG.__tags.name,MetaDMSAG.__tags);
        _SmAp.put(MetaDMSAG.__version.name,MetaDMSAG.__version);
        _SmAp.put(MetaDMSAG.__why.name,MetaDMSAG.__why);
    }


    public RuleCategoryDMO(){
        super("RuleCategory");
    }

    public RuleCategoryDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public RuleCategoryDMO getNew(){
        RuleCategoryDMO rc = new RuleCategoryDMO();
        return(rc);
    }

    @Override
    public RuleCategoryDMO getSlice(DmcSliceInfo info){
        RuleCategoryDMO rc = new RuleCategoryDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * Indicates how the DmcClassInfo should be extracted from one of the
     * ruleParam values associated with a RuleCategory. If additional classes are
     * required to support this access, you can specify ruleImport values as
     * appropriate. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
    public String getClassInfoFromParam(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__classInfoFromParam);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets classInfoFromParam to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setClassInfoFromParam(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__classInfoFromParam);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__classInfoFromParam);
        
        attr.set(value);
        set(MetaDMSAG.__classInfoFromParam,attr);
    }

    /**
     * The dark-matter schema module (DmsModule) in which something is defined. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
    public DmsModuleREF getDefinedInDmsModule(){
        DmcTypeDmsModuleREFSV attr = (DmcTypeDmsModuleREFSV) get(MetaDMSAG.__definedInDmsModule);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedInDmsModule to the specified value.
     * @param value A value compatible with DmcTypeDmsModuleREFSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setDefinedInDmsModule(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedInDmsModule);
        if (attr == null)
            attr = new DmcTypeDmsModuleREFSV(MetaDMSAG.__definedInDmsModule);
        
        attr.set(value);
        set(MetaDMSAG.__definedInDmsModule,attr);
    }

    /**
     * How a name is composed will depend on the context in which it used. For
     * instance, the names of definitions specified as part of a dark-matter
     * schema will conform to conventions of naming classes and or attributes in
     * Java. <p/> The generated documentation for a set of Domain Specific
     * Language (DSL) concepts will indicate the rules that apply to a name in
     * that DSL. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setName(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Indicates the operational context for some component e.g. object or
     * attribute validators. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
    public OperationalContextEnum getOpContext(){
        DmcTypeOperationalContextEnumSV attr = (DmcTypeOperationalContextEnumSV) get(MetaDMSAG.__opContext);
        if (attr == null)
            return(OperationalContextEnum.DMO);

        return(attr.getSV());
    }

    /**
     * Sets opContext to the specified value.
     * @param value A value compatible with DmcTypeOperationalContextEnumSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setOpContext(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__opContext);
        if (attr == null)
            attr = new DmcTypeOperationalContextEnumSV(MetaDMSAG.__opContext);
        
        attr.set(value);
        set(MetaDMSAG.__opContext,attr);
    }

    /**
     * The numeric ID of a rule category. Category IDs must be unique for all
     * RuleDefinitions defined within a schema. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
    public Integer getRuleCategoryID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__ruleCategoryID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleCategoryID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setRuleCategoryID(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleCategoryID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__ruleCategoryID);
        
        attr.set(value);
        set(MetaDMSAG.__ruleCategoryID,attr);
    }

    /**
     * A parameter to be supplied to a rule when it is executed. 
     * @return An Iterator of RuleParam objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:281)
    public Iterator<RuleParam> getRuleParam(){
        DmcTypeRuleParamMV attr = (DmcTypeRuleParamMV) get(MetaDMSAG.__ruleParam);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleParam value.
     * @param value A value compatible with DmcTypeRuleParamMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addRuleParam(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleParam);
        if (attr == null)
            attr = new DmcTypeRuleParamMV(MetaDMSAG.__ruleParam);
        
        attr.add(value);
        add(MetaDMSAG.__ruleParam,attr);
        return(attr);
    }

    /**
     * The type of a rule. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
    public RuleTypeEnum getRuleType(){
        DmcTypeRuleTypeEnumSV attr = (DmcTypeRuleTypeEnumSV) get(MetaDMSAG.__ruleType);
        if (attr == null)
            return(RuleTypeEnum.ATTRIBUTE);

        return(attr.getSV());
    }

    /**
     * Sets ruleType to the specified value.
     * @param value A value compatible with DmcTypeRuleTypeEnumSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setRuleType(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleType);
        if (attr == null)
            attr = new DmcTypeRuleTypeEnumSV(MetaDMSAG.__ruleType);
        
        attr.set(value);
        set(MetaDMSAG.__ruleType,attr);
    }

    /**
     * Indicates how the DmcAttributeInfo should be extracted from one of the
     * ruleParam values associated with a RuleCategory. If additional classes are
     * required to support this access, you can specify ruleImport values as
     * appropriate. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
    public String getAttributeInfoFromParam(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__attributeInfoFromParam);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets attributeInfoFromParam to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setAttributeInfoFromParam(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__attributeInfoFromParam);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__attributeInfoFromParam);
        
        attr.set(value);
        set(MetaDMSAG.__attributeInfoFromParam,attr);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:281)
    public Iterator<String> getCodeComment(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__codeComment);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another codeComment value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addCodeComment(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__codeComment);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__codeComment);
        
        attr.add(value);
        add(MetaDMSAG.__codeComment,attr);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:281)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addComment(Object value) throws DMFeedbackSet {
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setDefinedIn(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:281)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:295)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addDescription(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        attr.add(value);
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * The dotName attribute is used to store dot separated names. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setDotName(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * The example attribute is used to provide additional examples of how some
     * defined thing is to be used. 
     * @return An Iterator of Example objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:281)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addExample(Object value) throws DMFeedbackSet {
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setFile(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * A short description of something that can be dumped as one line summary of
     * something. For longer explanations, use the description attribute. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setHint(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__hint);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__hint);
        
        attr.set(value);
        set(MetaDMSAG.__hint,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setLineNumber(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * A set of additional name value pairs that can be associated with an
     * object. 
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:281)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addNvp(Object value) throws DMFeedbackSet {
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setObsolete(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__obsolete);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__obsolete);
        
        attr.set(value);
        set(MetaDMSAG.__obsolete,attr);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:281)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addOptimize(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__optimize);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__optimize);
        
        attr.add(value);
        add(MetaDMSAG.__optimize,attr);
        return(attr);
    }

    /**
     * A question associated with the definition of something. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:281)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addQuestion(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__question);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__question);
        
        attr.add(value);
        add(MetaDMSAG.__question,attr);
        return(attr);
    }

    /**
     * Allows for references to base concepts that relate this definition to
     * another definition in the Concinnity domain. This mechanism is only used
     * in the domain of dark-matter schema definitions; other DSLs will allow for
     * direct reference to Concinnity concepts. 
     * @return An Iterator of ConcinnityDMO objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:276)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addRelatedToConcept(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            attr = new DmcTypeConcinnityREFMV(MetaDMSAG.__relatedToConcept);
        
        attr.add(value);
        add(MetaDMSAG.__relatedToConcept,attr);
        return(attr);
    }

    /**
     * An import required for generation of the rule collection associated with a
     * RuleCategory. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:281)
    public Iterator<String> getRuleImport(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__ruleImport);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleImport value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addRuleImport(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleImport);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__ruleImport);
        
        attr.add(value);
        add(MetaDMSAG.__ruleImport,attr);
        return(attr);
    }

    /**
     * A version from which something should be excluded (even though it is
     * included in later versions). This is an unusual situation, and should be
     * approached with extreme caution! 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:281)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addSkip(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__skip);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__skip);
        
        attr.add(value);
        add(MetaDMSAG.__skip,attr);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setSortName(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__sortName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__sortName);
        
        attr.set(value);
        set(MetaDMSAG.__sortName,attr);
    }

    /**
     * A collection of tags that can facilitate searching for definitions. The
     * values are limited to a-zA-Z0-9 and the space character. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:281)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addTags(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__tags);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__tags);
        
        attr.add(value);
        add(MetaDMSAG.__tags,attr);
        return(attr);
    }

    /**
     * The version at which something was introduced. Version names are assumed
     * to be lexicographically sortable i.e. the name of a version must have a
     * nautral sort order that increases. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setVersion(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__version);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__version);
        
        attr.set(value);
        set(MetaDMSAG.__version,attr);
    }

    /**
     * An indication of why something was added to a specification or a system.
     * This might be a reference to a requirement or feature concept. How this is
     * used will depend on context. Due to the fact that it is a weak reference,
     * you may also just put in free form text, since it will simply be treated
     * as an unresolved reference. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:80)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:172)
    public void setWhy(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__why);
        if (attr == null)
            attr = new DmcTypeConcinnityREFSV(MetaDMSAG.__why);
        
        attr.set(value);
        set(MetaDMSAG.__why,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.tools.generation.meta.DmoFormatter.formatDMOForClass(DmoFormatter.java:249)

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
