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
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1844)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1797)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1799)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1821)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1811)
import org.dmd.dms.generated.enums.*;         // Has enum attributes - (MetaGenerator.java:1839)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1833)


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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1854)
 */
@SuppressWarnings("serial")
public class RuleCategoryDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__classInfoFromParam.id,MetaDMSAG.__classInfoFromParam);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__opContext.id,MetaDMSAG.__opContext);
        _ImAp.put(MetaDMSAG.__ruleCategoryID.id,MetaDMSAG.__ruleCategoryID);
        _ImAp.put(MetaDMSAG.__ruleParam.id,MetaDMSAG.__ruleParam);
        _ImAp.put(MetaDMSAG.__ruleType.id,MetaDMSAG.__ruleType);
        _ImAp.put(MetaDMSAG.__attributeInfoFromParam.id,MetaDMSAG.__attributeInfoFromParam);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__dotName.id,MetaDMSAG.__dotName);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__ruleImport.id,MetaDMSAG.__ruleImport);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__classInfoFromParam.name,MetaDMSAG.__classInfoFromParam);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__opContext.name,MetaDMSAG.__opContext);
        _SmAp.put(MetaDMSAG.__ruleCategoryID.name,MetaDMSAG.__ruleCategoryID);
        _SmAp.put(MetaDMSAG.__ruleParam.name,MetaDMSAG.__ruleParam);
        _SmAp.put(MetaDMSAG.__ruleType.name,MetaDMSAG.__ruleType);
        _SmAp.put(MetaDMSAG.__attributeInfoFromParam.name,MetaDMSAG.__attributeInfoFromParam);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__dotName.name,MetaDMSAG.__dotName);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__ruleImport.name,MetaDMSAG.__ruleImport);
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
     * ruleParam values\n associated with a RuleCategory. If additional classes
     * are required to support this access, you can specify ruleImport\n values
     * as appropriate.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2239)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2332)
    public void setClassInfoFromParam(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__classInfoFromParam);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__classInfoFromParam);
        
        attr.set(value);
        set(MetaDMSAG.__classInfoFromParam,attr);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2239)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2272)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2332)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace\n characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2239)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2332)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Indicates the operational context for some component e.g. object or
     * attribute\n validators.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2239)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2332)
    public void setOpContext(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__opContext);
        if (attr == null)
            attr = new DmcTypeOperationalContextEnumSV(MetaDMSAG.__opContext);
        
        attr.set(value);
        set(MetaDMSAG.__opContext,attr);
    }

    /**
     * The numeric ID of a rule category.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2239)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2332)
    public void setRuleCategoryID(Object value) throws DmcValueException {
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2437)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2492)
    public DmcAttribute<?> addRuleParam(Object value) throws DmcValueException {
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2239)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2332)
    public void setRuleType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleType);
        if (attr == null)
            attr = new DmcTypeRuleTypeEnumSV(MetaDMSAG.__ruleType);
        
        attr.set(value);
        set(MetaDMSAG.__ruleType,attr);
    }

    /**
     * Indicates how the DmcAttributeInfo should be extracted from one of the
     * ruleParam values\n associated with a RuleCategory. If additional classes
     * are required to support this access, you can specify ruleImport\n values
     * as appropriate.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2239)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2332)
    public void setAttributeInfoFromParam(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__attributeInfoFromParam);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__attributeInfoFromParam);
        
        attr.set(value);
        set(MetaDMSAG.__attributeInfoFromParam,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2239)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2332)
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * The dotName attribute is used to store dot separated names.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2239)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2332)
    public void setDotName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2239)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2332)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2239)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2332)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * An import required for generation of the rule collection associated with\n
     * a RuleCategory.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2437)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2492)
    public DmcAttribute<?> addRuleImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleImport);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__ruleImport);
        
        attr.add(value);
        add(MetaDMSAG.__ruleImport,attr);
        return(attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:2033)

    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public StringName getObjectName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        return(attr);
    }

}