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

/**
 * The RuleCategory allows for the definition of categories of rules to be
 * applied to various objects and indicates the expected interface to be
 * implemented by a rule instance. A RuleDefinition may belong to multiple
 * categories. The basic RuleManager provides interfaces to trigger the
 * RuleCategories defined as part of the meta schema. If you add other rule
 * categories, you would derive from the RuleManager to add the additional
 * methods required
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1553)
 */
@SuppressWarnings("unused")
public class RuleCategoryDMW extends org.dmd.dms.DmsDefinition {

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
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2247)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2310)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Indicates the operational context for some component e.g. object or
     * attribute validators.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2247)
    public OperationalContextEnum getOpContext(){
        return(mycore.getOpContext());
    }

    /**
     * Sets opContext to the specified value.
     * @param value A value compatible with DmcTypeOperationalContextEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2310)
    public void setOpContext(Object value) throws DmcValueException {
        mycore.setOpContext(value);
    }

    /**
     * The numeric ID of a rule category.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2247)
    public Integer getRuleCategoryID(){
        return(mycore.getRuleCategoryID());
    }

    /**
     * Sets ruleCategoryID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2310)
    public void setRuleCategoryID(Object value) throws DmcValueException {
        mycore.setRuleCategoryID(value);
    }

    /**
     * The fully qualified name of the interface to be implemented by rules of a
     * particular category.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2247)
    public String getRuleInterface(){
        return(mycore.getRuleInterface());
    }

    /**
     * Sets ruleInterface to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2310)
    public void setRuleInterface(Object value) throws DmcValueException {
        mycore.setRuleInterface(value);
    }

    /**
     * Indicates how a particular category of rule is executed.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2247)
    public String getRuleExecution(){
        return(mycore.getRuleExecution());
    }

    /**
     * Sets ruleExecution to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2310)
    public void setRuleExecution(Object value) throws DmcValueException {
        mycore.setRuleExecution(value);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The text provided should conform to XHTML
     * concepts since it will be dumped in the context of the generated HTML
     * documentation.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2247)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2310)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * An import required for arguements to a ruleExecution specification.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2416)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2471)
    public DmcAttribute<?> addRuleImport(Object value) throws DmcValueException {
        return(mycore.addRuleImport(value));
    }

    /**
     * Returns the number of ruleImport values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2483)
    public int getRuleImportSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleImport);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    public StringName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
