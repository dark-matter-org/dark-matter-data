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
public class RuleCategoryDMO extends org.dmd.dms.shared.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaCompactSchema.__classInfoFromParam.id,MetaCompactSchema.__classInfoFromParam);
        _ImAp.put(MetaCompactSchema.__definedInDmsModule.id,MetaCompactSchema.__definedInDmsModule);
        _ImAp.put(MetaCompactSchema.__name.id,MetaCompactSchema.__name);
        _ImAp.put(MetaCompactSchema.__opContext.id,MetaCompactSchema.__opContext);
        _ImAp.put(MetaCompactSchema.__ruleCategoryID.id,MetaCompactSchema.__ruleCategoryID);
        _ImAp.put(MetaCompactSchema.__ruleParam.id,MetaCompactSchema.__ruleParam);
        _ImAp.put(MetaCompactSchema.__ruleType.id,MetaCompactSchema.__ruleType);
        _ImAp.put(MetaCompactSchema.__attributeInfoFromParam.id,MetaCompactSchema.__attributeInfoFromParam);
        _ImAp.put(MetaCompactSchema.__codeComment.id,MetaCompactSchema.__codeComment);
        _ImAp.put(MetaCompactSchema.__comment.id,MetaCompactSchema.__comment);
        _ImAp.put(MetaCompactSchema.__description.id,MetaCompactSchema.__description);
        _ImAp.put(MetaCompactSchema.__dotName.id,MetaCompactSchema.__dotName);
        _ImAp.put(MetaCompactSchema.__example.id,MetaCompactSchema.__example);
        _ImAp.put(MetaCompactSchema.__file.id,MetaCompactSchema.__file);
        _ImAp.put(MetaCompactSchema.__hint.id,MetaCompactSchema.__hint);
        _ImAp.put(MetaCompactSchema.__lineNumber.id,MetaCompactSchema.__lineNumber);
        _ImAp.put(MetaCompactSchema.__nvp.id,MetaCompactSchema.__nvp);
        _ImAp.put(MetaCompactSchema.__obsolete.id,MetaCompactSchema.__obsolete);
        _ImAp.put(MetaCompactSchema.__optimize.id,MetaCompactSchema.__optimize);
        _ImAp.put(MetaCompactSchema.__question.id,MetaCompactSchema.__question);
        _ImAp.put(MetaCompactSchema.__relatedToConcept.id,MetaCompactSchema.__relatedToConcept);
        _ImAp.put(MetaCompactSchema.__ruleImport.id,MetaCompactSchema.__ruleImport);
        _ImAp.put(MetaCompactSchema.__skip.id,MetaCompactSchema.__skip);
        _ImAp.put(MetaCompactSchema.__sortName.id,MetaCompactSchema.__sortName);
        _ImAp.put(MetaCompactSchema.__tags.id,MetaCompactSchema.__tags);
        _ImAp.put(MetaCompactSchema.__version.id,MetaCompactSchema.__version);
        _ImAp.put(MetaCompactSchema.__why.id,MetaCompactSchema.__why);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaCompactSchema.__classInfoFromParam.name,MetaCompactSchema.__classInfoFromParam);
        _SmAp.put(MetaCompactSchema.__definedInDmsModule.name,MetaCompactSchema.__definedInDmsModule);
        _SmAp.put(MetaCompactSchema.__name.name,MetaCompactSchema.__name);
        _SmAp.put(MetaCompactSchema.__opContext.name,MetaCompactSchema.__opContext);
        _SmAp.put(MetaCompactSchema.__ruleCategoryID.name,MetaCompactSchema.__ruleCategoryID);
        _SmAp.put(MetaCompactSchema.__ruleParam.name,MetaCompactSchema.__ruleParam);
        _SmAp.put(MetaCompactSchema.__ruleType.name,MetaCompactSchema.__ruleType);
        _SmAp.put(MetaCompactSchema.__attributeInfoFromParam.name,MetaCompactSchema.__attributeInfoFromParam);
        _SmAp.put(MetaCompactSchema.__codeComment.name,MetaCompactSchema.__codeComment);
        _SmAp.put(MetaCompactSchema.__comment.name,MetaCompactSchema.__comment);
        _SmAp.put(MetaCompactSchema.__description.name,MetaCompactSchema.__description);
        _SmAp.put(MetaCompactSchema.__dotName.name,MetaCompactSchema.__dotName);
        _SmAp.put(MetaCompactSchema.__example.name,MetaCompactSchema.__example);
        _SmAp.put(MetaCompactSchema.__file.name,MetaCompactSchema.__file);
        _SmAp.put(MetaCompactSchema.__hint.name,MetaCompactSchema.__hint);
        _SmAp.put(MetaCompactSchema.__lineNumber.name,MetaCompactSchema.__lineNumber);
        _SmAp.put(MetaCompactSchema.__nvp.name,MetaCompactSchema.__nvp);
        _SmAp.put(MetaCompactSchema.__obsolete.name,MetaCompactSchema.__obsolete);
        _SmAp.put(MetaCompactSchema.__optimize.name,MetaCompactSchema.__optimize);
        _SmAp.put(MetaCompactSchema.__question.name,MetaCompactSchema.__question);
        _SmAp.put(MetaCompactSchema.__relatedToConcept.name,MetaCompactSchema.__relatedToConcept);
        _SmAp.put(MetaCompactSchema.__ruleImport.name,MetaCompactSchema.__ruleImport);
        _SmAp.put(MetaCompactSchema.__skip.name,MetaCompactSchema.__skip);
        _SmAp.put(MetaCompactSchema.__sortName.name,MetaCompactSchema.__sortName);
        _SmAp.put(MetaCompactSchema.__tags.name,MetaCompactSchema.__tags);
        _SmAp.put(MetaCompactSchema.__version.name,MetaCompactSchema.__version);
        _SmAp.put(MetaCompactSchema.__why.name,MetaCompactSchema.__why);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getClassInfoFromParam(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__classInfoFromParam);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets classInfoFromParam to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setClassInfoFromParam(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__classInfoFromParam);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__classInfoFromParam);
        
        attr.set(value);
        set(MetaCompactSchema.__classInfoFromParam,attr);
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
     * Indicates the operational context for some component e.g. object or
     * attribute validators. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public OperationalContextEnum getOpContext(){
        DmcTypeOperationalContextEnumSV attr = (DmcTypeOperationalContextEnumSV) get(MetaCompactSchema.__opContext);
        if (attr == null)
            return(OperationalContextEnum.DMO);

        return(attr.getSV());
    }

    /**
     * Sets opContext to the specified value.
     * @param value A value compatible with DmcTypeOperationalContextEnumSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setOpContext(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__opContext);
        if (attr == null)
            attr = new DmcTypeOperationalContextEnumSV(MetaCompactSchema.__opContext);
        
        attr.set(value);
        set(MetaCompactSchema.__opContext,attr);
    }

    /**
     * The numeric ID of a rule category. Category IDs must be unique for all
     * RuleDefinitions defined within a schema. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Integer getRuleCategoryID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaCompactSchema.__ruleCategoryID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleCategoryID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setRuleCategoryID(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__ruleCategoryID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaCompactSchema.__ruleCategoryID);
        
        attr.set(value);
        set(MetaCompactSchema.__ruleCategoryID,attr);
    }

    /**
     * A parameter to be supplied to a rule when it is executed. 
     * @return An Iterator of RuleParam objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<RuleParam> getRuleParam(){
        DmcTypeRuleParamMV attr = (DmcTypeRuleParamMV) get(MetaCompactSchema.__ruleParam);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleParam value.
     * @param value A value compatible with DmcTypeRuleParamMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addRuleParam(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__ruleParam);
        if (attr == null)
            attr = new DmcTypeRuleParamMV(MetaCompactSchema.__ruleParam);
        
        attr.add(value);
        add(MetaCompactSchema.__ruleParam,attr);
        return(attr);
    }

    /**
     * The type of a rule. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public RuleTypeEnum getRuleType(){
        DmcTypeRuleTypeEnumSV attr = (DmcTypeRuleTypeEnumSV) get(MetaCompactSchema.__ruleType);
        if (attr == null)
            return(RuleTypeEnum.ATTRIBUTE);

        return(attr.getSV());
    }

    /**
     * Sets ruleType to the specified value.
     * @param value A value compatible with DmcTypeRuleTypeEnumSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setRuleType(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__ruleType);
        if (attr == null)
            attr = new DmcTypeRuleTypeEnumSV(MetaCompactSchema.__ruleType);
        
        attr.set(value);
        set(MetaCompactSchema.__ruleType,attr);
    }

    /**
     * Indicates how the DmcAttributeInfo should be extracted from one of the
     * ruleParam values associated with a RuleCategory. If additional classes are
     * required to support this access, you can specify ruleImport values as
     * appropriate. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getAttributeInfoFromParam(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__attributeInfoFromParam);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets attributeInfoFromParam to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setAttributeInfoFromParam(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__attributeInfoFromParam);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__attributeInfoFromParam);
        
        attr.set(value);
        set(MetaCompactSchema.__attributeInfoFromParam,attr);
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
     * An import required for generation of the rule collection associated with a
     * RuleCategory. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getRuleImport(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__ruleImport);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleImport value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addRuleImport(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__ruleImport);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__ruleImport);
        
        attr.add(value);
        add(MetaCompactSchema.__ruleImport,attr);
        return(attr);
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
