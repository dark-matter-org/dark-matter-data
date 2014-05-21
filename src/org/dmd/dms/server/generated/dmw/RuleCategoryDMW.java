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
 * @author Auto Generated
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:113)
 */
@SuppressWarnings("unused")
public class RuleCategoryDMW extends org.dmd.dms.server.extended.DmsDefinition implements DmcDefinitionIF  {

    private RuleCategoryDMO mycore;

    protected RuleCategoryDMW() {
        super(new RuleCategoryDMO());
        mycore = (RuleCategoryDMO) core;
        mycore.setContainer(this);
    }

    protected RuleCategoryDMW(DmcObject obj) {
        super(obj);
        mycore = (RuleCategoryDMO) core;
        mycore.setContainer(this);
    }

    protected RuleCategoryDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (RuleCategoryDMO) core;
        mycore.setContainer(this);
    }

    public  RuleCategoryDMO getDMO() {
        return(mycore);
    }

    protected RuleCategoryDMW(ClassDefinition cd) {
        super(cd);
    }

    protected RuleCategoryDMW(String mn) throws DMFeedbackSet {
        super(new RuleCategoryDMO());
        mycore = (RuleCategoryDMO) core;
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
     * Indicates the operational context for some component e.g. object or
     * attribute validators. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public OperationalContextEnum getOpContext(){
        return(mycore.getOpContext());
    }

    /**
     * Sets opContext to the specified value.
     * @param value A value compatible with DmcTypeOperationalContextEnumSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setOpContext(Object value) throws DMFeedbackSet {
        mycore.setOpContext(value);
    }

    /**
     * The numeric ID of a rule category. Category IDs must be unique for all
     * RuleDefinitions defined within a schema. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Integer getRuleCategoryID(){
        return(mycore.getRuleCategoryID());
    }

    /**
     * Sets ruleCategoryID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setRuleCategoryID(Object value) throws DMFeedbackSet {
        mycore.setRuleCategoryID(value);
    }

    /**
     * The type of a rule. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public RuleTypeEnum getRuleType(){
        return(mycore.getRuleType());
    }

    /**
     * Sets ruleType to the specified value.
     * @param value A value compatible with DmcTypeRuleTypeEnumSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setRuleType(Object value) throws DMFeedbackSet {
        mycore.setRuleType(value);
    }

    /**
     * A parameter to be supplied to a rule when it is executed. 
     * @return An Iterator of RuleParam objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
    public RuleParamIterableDMW getRuleParamIterable(){
        DmcTypeRuleParamMV attr = (DmcTypeRuleParamMV) mycore.get(MetaDMSAG.__ruleParam);
        if (attr == null)
            return(RuleParamIterableDMW.emptyList);

        return(new RuleParamIterableDMW(attr.getMV()));
    }

    /**
     * Adds another ruleParam value.
     * @param value A value compatible with DmcTypeRuleParamMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addRuleParam(Object value) throws DMFeedbackSet {
        mycore.addRuleParam(value);
    }

    /**
     * Returns the number of ruleParam values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getRuleParamSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleParam);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if ruleParam has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getRuleParamHasValue(){
        return(getRuleParamSize() > 0);
    }

    /**
     * Indicates how the DmcClassInfo should be extracted from one of the
     * ruleParam values associated with a RuleCategory. If additional classes are
     * required to support this access, you can specify ruleImport values as
     * appropriate. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getClassInfoFromParam(){
        return(mycore.getClassInfoFromParam());
    }

    /**
     * Sets classInfoFromParam to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setClassInfoFromParam(Object value) throws DMFeedbackSet {
        mycore.setClassInfoFromParam(value);
    }

    /**
     * An import required for generation of the rule collection associated with a
     * RuleCategory. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
    public StringIterableDMW getRuleImportIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__ruleImport);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    /**
     * Adds another ruleImport value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addRuleImport(Object value) throws DMFeedbackSet {
        mycore.addRuleImport(value);
    }

    /**
     * Returns the number of ruleImport values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getRuleImportSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleImport);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if ruleImport has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getRuleImportHasValue(){
        return(getRuleImportSize() > 0);
    }

    /**
     * Indicates how the DmcAttributeInfo should be extracted from one of the
     * ruleParam values associated with a RuleCategory. If additional classes are
     * required to support this access, you can specify ruleImport values as
     * appropriate. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getAttributeInfoFromParam(){
        return(mycore.getAttributeInfoFromParam());
    }

    /**
     * Sets attributeInfoFromParam to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setAttributeInfoFromParam(Object value) throws DMFeedbackSet {
        mycore.setAttributeInfoFromParam(value);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperFunctions(MetaDSDHelper.java:946)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        DmsModuleREF ref = ((RuleCategoryDMO) core).getDefinedInDmsModule();
        return(ref.getName().getNameString());
    }

}
