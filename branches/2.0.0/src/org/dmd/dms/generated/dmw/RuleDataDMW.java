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
 * The RuleData class serves as a common base for all ClassDefinitions\n that
 * are generated internally to represent the data associated with
 * RuleDefinitions.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1561)
 */
@SuppressWarnings("unused")
public abstract class RuleDataDMW extends DmwNamedObjectWrapper {

    private RuleDataDMO mycore;

    protected RuleDataDMW() {
        super(new RuleDataDMO());
        mycore = (RuleDataDMO) core;
        mycore.setContainer(this);
    }

    protected RuleDataDMW(DmcObject obj) {
        super(obj);
        mycore = (RuleDataDMO) core;
        mycore.setContainer(this);
    }

    protected RuleDataDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (RuleDataDMO) core;
        mycore.setContainer(this);
    }

    public  RuleDataDMO getDMO() {
        return(mycore);
    }

    /**
     * The title of a rule.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public String getRuleTitle(){
        return(mycore.getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2354)
    public void setRuleTitle(Object value) throws DmcValueException {
        mycore.setRuleTitle(value);
    }

    /**
     * The ruleName attribute is used to store a single camelCase format name for
     * a rule.\n The name starts with a single letter and can be followed by a
     * mix of letters and numbers. No spaces or \n other characters are allowed.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public RuleName getRuleName(){
        return(mycore.getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2354)
    public void setRuleName(Object value) throws DmcValueException {
        mycore.setRuleName(value);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public String getDescription(){
        return(mycore.getDescription());
    }

    public String getDescriptionWithNewlines(){
        return(mycore.getDescriptionWithNewlines());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2354)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public SchemaDefinition getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) mycore.get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);
        SchemaDefinitionDMO obj = attr.getSV().getObject();
        return((SchemaDefinition)obj.getContainer());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with SchemaDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2341)
    public void setDefinedIn(SchemaDefinition value) throws DmcValueException {
        mycore.setDefinedIn(value.getDmcObject());
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public String getFile(){
        return(mycore.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2354)
    public void setFile(Object value) throws DmcValueException {
        mycore.setFile(value);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public Integer getLineNumber(){
        return(mycore.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2354)
    public void setLineNumber(Object value) throws DmcValueException {
        mycore.setLineNumber(value);
    }

    /**
     * The class to which a rule should be applied.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public ClassDefinition getApplyToClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) mycore.get(MetaDMSAG.__applyToClass);
        if (attr == null)
            return(null);
        ClassDefinitionDMO obj = attr.getSV().getObject();
        return((ClassDefinition)obj.getContainer());
    }

    /**
     * Sets applyToClass to the specified value.
     * @param value A value compatible with ClassDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2341)
    public void setApplyToClass(ClassDefinition value) throws DmcValueException {
        mycore.setApplyToClass(value.getDmcObject());
    }

    /**
     * The immediateHalt flag is used to indicate that no further\n rule
     * processing should occur if a rule fails. It is an optional attribute on
     * rule instance\n objects. In somes cases, there is no point in continuing
     * with the application of a set \n of rules, so this flag gives the option
     * of halting further processing.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public Boolean getImmediateHalt(){
        return(mycore.getImmediateHalt());
    }

    /**
     * Sets immediateHalt to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2354)
    public void setImmediateHalt(Object value) throws DmcValueException {
        mycore.setImmediateHalt(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the ruleName attribute.
     */
    public RuleName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The ruleName attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}