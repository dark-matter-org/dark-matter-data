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
 * The RuleDefinition allows for the definition of rules that can be applied
 * to attributes or classes in different operational contexts. Rules are not
 * just for validation, they can be applied to objects at different times in
 * an object's life cycle e.g. the InitRule can initialize a set of
 * attributes to known values. <p/> RuleDefinitions will result in the
 * generation of ClassDefinitions that define the  DMOs that will carry the
 * parameters associated with the rule and expectation that you will define
 * an implementation class for the rule that derives from an abstract
 * BaseImpl (base implementation) of the rule that provides common rule
 * infrastructure and appropriate abstract methods that must be filled in.
 * <p/> RuleDefinitions and ClassDefinitions share the same dmdID space and
 * the IDs must be unique. This is because each RuleDefinition results in the
 * creation of a  ClassDefinition for the DMO part of the rule that carries
 * the rule parameters.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1137)
 */
@SuppressWarnings("unused")
public class RuleDefinitionDMW extends org.dmd.dms.DmsDefinition {

    private RuleDefinitionDMO mycore;

    protected RuleDefinitionDMW() {
        super(new RuleDefinitionDMO());
        mycore = (RuleDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected RuleDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (RuleDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected RuleDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (RuleDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  RuleDefinitionDMO getDMO() {
        return(mycore);
    }

    protected RuleDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected RuleDefinitionDMW(String mn) throws DmcValueException {
        super(new RuleDefinitionDMO());
        mycore = (RuleDefinitionDMO) core;
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1781)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1833)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Indicates the operational context for some component e.g. object or
     * attribute validators.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1781)
    public OperationalContextEnum getOpContext(){
        return(mycore.getOpContext());
    }

    /**
     * Sets opContext to the specified value.
     * @param value A value compatible with DmcTypeOperationalContextEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1833)
    public void setOpContext(Object value) throws DmcValueException {
        mycore.setOpContext(value);
    }

    /**
     * The type of a rule.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1781)
    public RuleTypeEnum getRuleType(){
        return(mycore.getRuleType());
    }

    /**
     * Sets ruleType to the specified value.
     * @param value A value compatible with DmcTypeRuleTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1833)
    public void setRuleType(Object value) throws DmcValueException {
        mycore.setRuleType(value);
    }

    /**
     * The scope of a rule.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1781)
    public RuleScopeEnum getRuleScope(){
        return(mycore.getRuleScope());
    }

    /**
     * Sets ruleScope to the specified value.
     * @param value A value compatible with DmcTypeRuleScopeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1833)
    public void setRuleScope(Object value) throws DmcValueException {
        mycore.setRuleScope(value);
    }

    /**
     * The category of a rule.
     * @return An Iterator of RuleCategory objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1913)
    public RuleCategoryIterableDMW getRuleCategory(){
        DmcTypeRuleCategoryREFMV attr = (DmcTypeRuleCategoryREFMV) mycore.get(MetaDMSAG.__ruleCategory);
        if (attr == null)
            return(RuleCategoryIterableDMW.emptyList);

        return(new RuleCategoryIterableDMW(attr.getMV()));
    }

    /**
     * Adds another ruleCategory value.
     * @param value A value compatible with RuleCategory
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1961)
    public DmcAttribute<?> addRuleCategory(RuleCategory value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addRuleCategory(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of ruleCategory values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1984)
    public int getRuleCategorySize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleCategory);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes. This is used as part of the serialization mechanisms built
     * into Dark Matter Objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1781)
    public Integer getDmdID(){
        return(mycore.getDmdID());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1833)
    public void setDmdID(Object value) throws DmcValueException {
        mycore.setDmdID(value);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1781)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1833)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have.
     * When accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1913)
    public AttributeDefinitionIterableDMW getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__must);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another must value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1961)
    public DmcAttribute<?> addMust(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMust(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of must values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1984)
    public int getMustSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__must);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY have. When
     * accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1913)
    public AttributeDefinitionIterableDMW getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__may);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another may value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1961)
    public DmcAttribute<?> addMay(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMay(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of may values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1984)
    public int getMaySize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__may);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates whether or not the ClassDefinition associated with a
     * RuleDefinition has classType EXTENSIBLE or not. This mechanism is useful
     * in situations where the exact set of attributes associated with a rule
     * must be flexible. The best example is the InitRule where any set of
     * attributes can be specified as value for the rule.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1781)
    public Boolean getIsExtensible(){
        return(mycore.getIsExtensible());
    }

    /**
     * Sets isExtensible to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1833)
    public void setIsExtensible(Object value) throws DmcValueException {
        mycore.setIsExtensible(value);
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
