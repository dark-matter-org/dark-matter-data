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
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1871)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1820)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1822)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1844)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1834)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1860)


/**
 * The RuleData class serves as a common base for all ClassDefinitions\n that
 * are generated internally to represent the data associated with
 * RuleDefinitions.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1881)
 */
@SuppressWarnings("serial")
public class RuleDataDMO extends DmcObject implements DmcNamedObjectIF, Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__ruleName.id,MetaDMSAG.__ruleName);
        _ImAp.put(MetaDMSAG.__ruleTitle.id,MetaDMSAG.__ruleTitle);
        _ImAp.put(MetaDMSAG.__applyToClass.id,MetaDMSAG.__applyToClass);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__immediateHalt.id,MetaDMSAG.__immediateHalt);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__msgKey.id,MetaDMSAG.__msgKey);
        _ImAp.put(MetaDMSAG.__msgParam.id,MetaDMSAG.__msgParam);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__ruleName.name,MetaDMSAG.__ruleName);
        _SmAp.put(MetaDMSAG.__ruleTitle.name,MetaDMSAG.__ruleTitle);
        _SmAp.put(MetaDMSAG.__applyToClass.name,MetaDMSAG.__applyToClass);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__immediateHalt.name,MetaDMSAG.__immediateHalt);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__msgKey.name,MetaDMSAG.__msgKey);
        _SmAp.put(MetaDMSAG.__msgParam.name,MetaDMSAG.__msgParam);
    }


    public RuleDataDMO(){
        super("RuleData");
    }

    public RuleDataDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public RuleDataDMO getNew(){
        RuleDataDMO rc = new RuleDataDMO();
        return(rc);
    }

    @Override
    public RuleDataDMO getSlice(DmcSliceInfo info){
        RuleDataDMO rc = new RuleDataDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The ruleName attribute is used to store a single camelCase format name for
     * a rule.\n The name starts with a single letter and can be followed by a
     * mix of letters and numbers. No spaces or \n other characters are allowed.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2271)
    public RuleName getRuleName(){
        DmcTypeRuleNameSV attr = (DmcTypeRuleNameSV) get(MetaDMSAG.__ruleName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2364)
    public void setRuleName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleName);
        if (attr == null)
            attr = new DmcTypeRuleNameSV(MetaDMSAG.__ruleName);
        
        attr.set(value);
        set(MetaDMSAG.__ruleName,attr);
    }

    /**
     * The title of a rule.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2271)
    public String getRuleTitle(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2364)
    public void setRuleTitle(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__ruleTitle);
        
        attr.set(value);
        set(MetaDMSAG.__ruleTitle,attr);
    }

    /**
     * The class to which a rule should be applied.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2271)
    public ClassDefinitionREF getApplyToClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(MetaDMSAG.__applyToClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets applyToClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2364)
    public void setApplyToClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__applyToClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(MetaDMSAG.__applyToClass);
        
        attr.set(value);
        set(MetaDMSAG.__applyToClass,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2271)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2364)
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
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2271)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2304)
    public String getDescriptionWithNewlines(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV().replaceAll("\\\\n","\\\n"));
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2364)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2271)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2364)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * The immediateHalt flag is used to indicate that no further\n rule
     * processing should occur if a rule fails. It is an optional attribute on
     * rule instance\n objects. In somes cases, there is no point in continuing
     * with the application of a set \n of rules, so this flag gives the option
     * of halting further processing.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2271)
    public Boolean getImmediateHalt(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__immediateHalt);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets immediateHalt to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2364)
    public void setImmediateHalt(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__immediateHalt);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__immediateHalt);
        
        attr.set(value);
        set(MetaDMSAG.__immediateHalt,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2271)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2364)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * The msgKey may be specified on rule instances to indicate the key to be
     * used\n to look up translated messages. This is primarily a GWT mechanism,
     * but should be applicable in\n other contexts.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2271)
    public String getMsgKey(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__msgKey);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets msgKey to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2364)
    public void setMsgKey(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__msgKey);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__msgKey);
        
        attr.set(value);
        set(MetaDMSAG.__msgKey,attr);
    }

    /**
     * The msgParam allows for the specification of parameters to be
     * substituted\n into translated messages.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2469)
    public Iterator<String> getMsgParam(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__msgParam);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another msgParam value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
    public DmcAttribute<?> addMsgParam(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__msgParam);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__msgParam);
        
        attr.add(value);
        add(MetaDMSAG.__msgParam,attr);
        return(attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:2065)

    /**
     * @return The name of this object from the ruleName attribute.
     */
    @Override
    public RuleName getObjectName(){
        DmcTypeRuleName attr = (DmcTypeRuleName) get(MetaDMSAG.__ruleName);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The ruleName attribute.
     */
    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> attr = (DmcTypeRuleName) get(MetaDMSAG.__ruleName);
        return(attr);
    }

}
