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
package org.dmd.dms.generated.dmw;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dmw.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;
import org.dmd.dmc.definitions.DmcDefinitionIF;

/**
 * The RuleCategory allows for the definition of categories of rules to be
 * applied\n to various objects and indicates the expected interface to be
 * implemented by a rule instance.\n A RuleDefinition may belong to multiple
 * categories. \n <p/>\n RuleCategories fall into two broad types, ATTRIBUTE
 * and CLASS level, as specified via the ruleType\n attribute. When a
 * RuleDefinition belongs to an ATTRIBUTE level category, its instances will
 * have\n a mandatory applyToAttribute attribute. Both ATTRIBUTE and CLASS
 * level RuleDefinitions have an optional\n applyToClass attribute by
 * default.\n <p/>\n Specifying a RuleCategory will cause the generation of
 * several artifacts including:\n <ul>\n <li> a category interface: this
 * interface will be created based on the ruleParam values and will be\n
 * implemented by RuleDefinitions that are part of the category\n </li> a
 * rule collection: this is a category specific collection of rules that
 * organize the rule instances\n in this category.\n </ul>\n Exactly how a
 * RuleCategory applies rule instances is category specific and this
 * behaviour should be\n part of the description of a rule category.\n <p/>\n
 * For CLASS level rules, you must specify the classInfoFromParam attribute
 * to indicate how to \n get the DmcClassInfo from whatever object you are
 * passing to the rule. For ATTRIBUTE level rules,\n you must specify both
 * attributeInfoFromParam and classInfoFromParam. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1630)
 */
@SuppressWarnings("unused")
public class RuleCategoryDMW extends org.dmd.dms.DmsDefinition implements DmcDefinitionIF {

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

    protected RuleCategoryDMW(String mn) throws DmcValueException {
        super(new RuleCategoryDMO());
        mycore = (RuleCategoryDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2374)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2447)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Indicates the operational context for some component e.g. object or
     * attribute\n validators. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2374)
    public OperationalContextEnum getOpContext(){
        return(mycore.getOpContext());
    }

    /**
     * Sets opContext to the specified value.
     * @param value A value compatible with DmcTypeOperationalContextEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2447)
    public void setOpContext(Object value) throws DmcValueException {
        mycore.setOpContext(value);
    }

    /**
     * The numeric ID of a rule category. Category IDs must be unique for all
     * RuleDefinitions defined\n within a schema. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2374)
    public Integer getRuleCategoryID(){
        return(mycore.getRuleCategoryID());
    }

    /**
     * Sets ruleCategoryID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2447)
    public void setRuleCategoryID(Object value) throws DmcValueException {
        mycore.setRuleCategoryID(value);
    }

    /**
     * The type of a rule. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2374)
    public RuleTypeEnum getRuleType(){
        return(mycore.getRuleType());
    }

    /**
     * Sets ruleType to the specified value.
     * @param value A value compatible with DmcTypeRuleTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2447)
    public void setRuleType(Object value) throws DmcValueException {
        mycore.setRuleType(value);
    }

    /**
     * A parameter to be supplied to a rule when it is executed. 
     * @return An Iterator of RuleParam objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2578)
    public Iterator<RuleParam> getRuleParam(){
        DmcTypeRuleParamMV attr = (DmcTypeRuleParamMV) mycore.get(MetaDMSAG.__ruleParam);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleParam value.
     * @param value A value compatible with DmcTypeRuleParamMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2658)
    public void addRuleParam(Object value) throws DmcValueException {
        mycore.addRuleParam(value);
    }

    /**
     * Returns the number of ruleParam values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2671)
    public int getRuleParamSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleParam);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates how the DmcClassInfo should be extracted from one of the
     * ruleParam values\n associated with a RuleCategory. If additional classes
     * are required to support this access, you can specify ruleImport\n values
     * as appropriate. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2374)
    public String getClassInfoFromParam(){
        return(mycore.getClassInfoFromParam());
    }

    /**
     * Sets classInfoFromParam to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2447)
    public void setClassInfoFromParam(Object value) throws DmcValueException {
        mycore.setClassInfoFromParam(value);
    }

    /**
     * An import required for generation of the rule collection associated with\n
     * a RuleCategory. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2578)
    public Iterator<String> getRuleImport(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__ruleImport);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleImport value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2658)
    public void addRuleImport(Object value) throws DmcValueException {
        mycore.addRuleImport(value);
    }

    /**
     * Returns the number of ruleImport values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2671)
    public int getRuleImportSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleImport);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates how the DmcAttributeInfo should be extracted from one of the
     * ruleParam values\n associated with a RuleCategory. If additional classes
     * are required to support this access, you can specify ruleImport\n values
     * as appropriate. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2374)
    public String getAttributeInfoFromParam(){
        return(mycore.getAttributeInfoFromParam());
    }

    /**
     * Sets attributeInfoFromParam to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2447)
    public void setAttributeInfoFromParam(Object value) throws DmcValueException {
        mycore.setAttributeInfoFromParam(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1791)

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

}
