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
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1537)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1490)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1492)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1514)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1504)
import org.dmd.dms.generated.enums.*;         // Has enum attributes - (MetaGenerator.java:1532)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1526)


/**
 * The RuleDefinition allows for the definition of rules that can be applied
 * to attributes or classes. Rules are not just for validation, they can be
 * applied to objects at different times in an object's life cycle e.g.  the
 * InitRule can initialize a set of attributes to known values. <p/>
 * RuleDefinitions will result in the generation of ClassDefinitions that
 * define the  DMOs that will carry the parameters associated with the rule
 * and expectation that you will define an implementation class for the rule
 * that derives from an abstract BaseImpl (base implementation) of the rule
 * that provides common rule infrastructure and appropriate abstract methods
 * that must be filled in. <p/> RuleDefinitions and ClassDefinitions share
 * the same dmdID space and the IDs must be unique. This is because each
 * RuleDefinition results in the creation of a  ClassDefinition for the DMO
 * part of the rule that carries the rule parameters.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1547)
 */
@SuppressWarnings("serial")
public class RuleDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__dmdID.id,MetaDMSAG.__dmdID);
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__ruleCategory.id,MetaDMSAG.__ruleCategory);
        _ImAp.put(MetaDMSAG.__ruleScope.id,MetaDMSAG.__ruleScope);
        _ImAp.put(MetaDMSAG.__ruleType.id,MetaDMSAG.__ruleType);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__dependency.id,MetaDMSAG.__dependency);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__isExtensible.id,MetaDMSAG.__isExtensible);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__may.id,MetaDMSAG.__may);
        _ImAp.put(MetaDMSAG.__must.id,MetaDMSAG.__must);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__dmdID.name,MetaDMSAG.__dmdID);
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__ruleCategory.name,MetaDMSAG.__ruleCategory);
        _SmAp.put(MetaDMSAG.__ruleScope.name,MetaDMSAG.__ruleScope);
        _SmAp.put(MetaDMSAG.__ruleType.name,MetaDMSAG.__ruleType);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__dependency.name,MetaDMSAG.__dependency);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__isExtensible.name,MetaDMSAG.__isExtensible);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__may.name,MetaDMSAG.__may);
        _SmAp.put(MetaDMSAG.__must.name,MetaDMSAG.__must);
    }


    public RuleDefinitionDMO(){
        super("RuleDefinition");
    }

    public RuleDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public RuleDefinitionDMO getNew(){
        RuleDefinitionDMO rc = new RuleDefinitionDMO();
        return(rc);
    }

    @Override
    public RuleDefinitionDMO getSlice(DmcSliceInfo info){
        RuleDefinitionDMO rc = new RuleDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1929)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1986)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes. This is used as part of the serialization mechanisms built
     * into Dark Matter Objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1929)
    public Integer getDmdID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__dmdID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1986)
    public void setDmdID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmdID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__dmdID);
        
        attr.set(value);
        set(MetaDMSAG.__dmdID,attr);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1929)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1986)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * The category of a rule.
     * @return An Iterator of RuleCategoryDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2084)
    public Iterator<RuleCategoryREF> getRuleCategory(){
        DmcTypeRuleCategoryREFMV attr = (DmcTypeRuleCategoryREFMV) get(MetaDMSAG.__ruleCategory);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleCategory value.
     * @param value A value compatible with DmcTypeRuleCategoryREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2146)
    public DmcAttribute<?> addRuleCategory(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleCategory);
        if (attr == null)
            attr = new DmcTypeRuleCategoryREFMV(MetaDMSAG.__ruleCategory);
        
        attr.add(value);
        add(MetaDMSAG.__ruleCategory,attr);
        return(attr);
    }

    /**
     * The scope of a rule.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1929)
    public RuleScopeEnum getRuleScope(){
        DmcTypeRuleScopeEnumSV attr = (DmcTypeRuleScopeEnumSV) get(MetaDMSAG.__ruleScope);
        if (attr == null)
            return(RuleScopeEnum.PERCLASS);

        return(attr.getSV());
    }

    /**
     * Sets ruleScope to the specified value.
     * @param value A value compatible with DmcTypeRuleScopeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1986)
    public void setRuleScope(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleScope);
        if (attr == null)
            attr = new DmcTypeRuleScopeEnumSV(MetaDMSAG.__ruleScope);
        
        attr.set(value);
        set(MetaDMSAG.__ruleScope,attr);
    }

    /**
     * The type of a rule.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1929)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1986)
    public void setRuleType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleType);
        if (attr == null)
            attr = new DmcTypeRuleTypeEnumSV(MetaDMSAG.__ruleType);
        
        attr.set(value);
        set(MetaDMSAG.__ruleType,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1929)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1986)
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * A reference to a single Dependency.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1929)
    public DependencyREF getDependency(){
        DmcTypeDependencyREFSV attr = (DmcTypeDependencyREFSV) get(MetaDMSAG.__dependency);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dependency to the specified value.
     * @param value A value compatible with DmcTypeDependencyREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1986)
    public void setDependency(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependency);
        if (attr == null)
            attr = new DmcTypeDependencyREFSV(MetaDMSAG.__dependency);
        
        attr.set(value);
        set(MetaDMSAG.__dependency,attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1929)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1986)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * Indicates whether or not the ClassDefinition associated with a
     * RuleDefinition has classType EXTENSIBLE or not. This mechanism is useful
     * in situations where the exact set of attributes associated with a rule
     * must be flexible. The best example is the InitRule where any set of
     * attributes can be specified as value for the rule.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1929)
    public Boolean getIsExtensible(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__isExtensible);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isExtensible to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1986)
    public void setIsExtensible(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isExtensible);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isExtensible);
        
        attr.set(value);
        set(MetaDMSAG.__isExtensible,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1929)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1986)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY have. When
     * accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2084)
    public Iterator<AttributeDefinitionREF> getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__may);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another may value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2146)
    public DmcAttribute<?> addMay(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__may);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__may);
        
        attr.add(value);
        add(MetaDMSAG.__may,attr);
        return(attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have.
     * When accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2084)
    public Iterator<AttributeDefinitionREF> getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__must);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another must value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2146)
    public DmcAttribute<?> addMust(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__must);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__must);
        
        attr.add(value);
        add(MetaDMSAG.__must,attr);
        return(attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
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
    public DmcTypeStringName getObjectNameAttribute(){
        DmcTypeStringName attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr);
    }

}
