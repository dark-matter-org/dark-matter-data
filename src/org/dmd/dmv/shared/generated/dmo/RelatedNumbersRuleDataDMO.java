//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmv.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                                    // Always required - (GenUtility.java:220)
import org.dmd.dmc.DmcAttribute;                                                // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcOmni;                                                     // Lazy resolution - (GenUtility.java:316)
import org.dmd.dmc.DmcSliceInfo;                                                // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                                           // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.RuleName;                                              // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;                        // Type specific set/add - (GenUtility.java:303)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.dmo.RuleDataDMO;                                   // Base class - (GenUtility.java:351)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                      // Helper class - (GenUtility.java:331)
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;             // Reference type - (GenUtility.java:296)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                           // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dms.generated.types.DmcTypeRuleNameSV;                           // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringSV;                             // Required type - (GenUtility.java:324)
import org.dmd.dmv.shared.generated.enums.NumericRelationEnum;                  // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dmv.shared.generated.types.DmcTypeNumericRelationEnumSV;         // Required type - (GenUtility.java:324)

/**
 * The RelatedNumbersRule ensures that a particular numeric\n relationship
 * exists between two single-valued, numeric values on an object.\n An
 * example usage might be:\n <pre>\n RelatedNumbersRuleData\n ruleName       
 * dmvHeightGirth\n ruleTitle       Your height must exceed your girth.\n
 * applyToClass    Person\n lhs             height\n rhs             girth\n
 * numericRelation GT\n description     If your girth exceeds your height,
 * you're in trouble!\n </pre>\n The rule will only test the relationship if
 * both attributes exist; if not,\n that's okay - the rule will pass.\n
 * <p/>\n It's a good rule of thumb to indicate the relationship you expect
 * in the\n title of the rule since this is what will be returned in the case
 * that \n the relatioship check fails.\n <p/>\n NOTE: this rule works by
 * implicitly converting the values of the attributes\n to type Double in
 * order to be able to compare apples to apples. However,\n if you are
 * dealing with large numeric values you may run into issues.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class RelatedNumbersRuleDataDMO  extends RuleDataDMO  implements Serializable  {

    public final static String constructionClassName = "RelatedNumbersRuleData";


    static {
    }

    public RelatedNumbersRuleDataDMO() {
        super("RelatedNumbersRuleData");
    }

    protected RelatedNumbersRuleDataDMO(String oc) {
        super(oc);
    }

    @Override
    public RelatedNumbersRuleDataDMO getNew(){
        RelatedNumbersRuleDataDMO rc = new RelatedNumbersRuleDataDMO();
        return(rc);
    }

    @Override
    public RelatedNumbersRuleDataDMO getSlice(DmcSliceInfo info){
        RelatedNumbersRuleDataDMO rc = new RelatedNumbersRuleDataDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public RelatedNumbersRuleDataDMO(DmcTypeModifierMV mods) {
        super("RelatedNumbersRuleData");
        modrec(true);
        setModifier(mods);
    }

    public RelatedNumbersRuleDataDMO getModificationRecorder(){
        RelatedNumbersRuleDataDMO rc = new RelatedNumbersRuleDataDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setDescription(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public RuleName getRuleName(){
        DmcTypeRuleNameSV attr = (DmcTypeRuleNameSV) get(MetaDMSAG.__ruleName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setRuleName(RuleName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleName);
        if (attr == null)
            attr = new DmcTypeRuleNameSV(MetaDMSAG.__ruleName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__ruleName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setRuleName(Object value) throws DmcValueException {
        DmcTypeRuleNameSV attr  = (DmcTypeRuleNameSV) get(MetaDMSAG.__ruleName);
        if (attr == null)
            attr = new DmcTypeRuleNameSV(MetaDMSAG.__ruleName);
        
        attr.set(value);
        set(MetaDMSAG.__ruleName,attr);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remRuleName(){
         rem(MetaDMSAG.__ruleName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getRuleTitle(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setRuleTitle(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__ruleTitle);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__ruleTitle,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setRuleTitle(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__ruleTitle);
        
        attr.set(value);
        set(MetaDMSAG.__ruleTitle,attr);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remRuleTitle(){
         rem(MetaDMSAG.__ruleTitle);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:645)
    public AttributeDefinitionREF getLhs(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(DmvDMSAG.__lhs);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to AttributeDefinition without attempting lazy resolution (if turned on).
     */
    public AttributeDefinitionREF getLhsREF(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(DmvDMSAG.__lhs);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lhs to the specified value.
     * @param value AttributeDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:699)
    public void setLhs(AttributeDefinitionDMO value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__lhs);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(DmvDMSAG.__lhs);
        else
            ((DmcTypeAttributeDefinitionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmvDMSAG.__lhs,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets lhs to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setLhs(Object value) throws DmcValueException {
        DmcTypeAttributeDefinitionREFSV attr  = (DmcTypeAttributeDefinitionREFSV) get(DmvDMSAG.__lhs);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(DmvDMSAG.__lhs);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmvDMSAG.__lhs,attr);
    }

    /**
     * Removes the lhs attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remLhs(){
         rem(DmvDMSAG.__lhs);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:645)
    public AttributeDefinitionREF getRhs(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(DmvDMSAG.__rhs);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to AttributeDefinition without attempting lazy resolution (if turned on).
     */
    public AttributeDefinitionREF getRhsREF(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(DmvDMSAG.__rhs);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets rhs to the specified value.
     * @param value AttributeDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:699)
    public void setRhs(AttributeDefinitionDMO value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__rhs);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(DmvDMSAG.__rhs);
        else
            ((DmcTypeAttributeDefinitionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmvDMSAG.__rhs,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets rhs to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setRhs(Object value) throws DmcValueException {
        DmcTypeAttributeDefinitionREFSV attr  = (DmcTypeAttributeDefinitionREFSV) get(DmvDMSAG.__rhs);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(DmvDMSAG.__rhs);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmvDMSAG.__rhs,attr);
    }

    /**
     * Removes the rhs attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remRhs(){
         rem(DmvDMSAG.__rhs);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public NumericRelationEnum getNumericRelation(){
        DmcTypeNumericRelationEnumSV attr = (DmcTypeNumericRelationEnumSV) get(DmvDMSAG.__numericRelation);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets numericRelation to the specified value.
     * @param value NumericRelationEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setNumericRelation(NumericRelationEnum value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__numericRelation);
        if (attr == null)
            attr = new DmcTypeNumericRelationEnumSV(DmvDMSAG.__numericRelation);
        
        try{
            attr.set(value);
            set(DmvDMSAG.__numericRelation,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets numericRelation to the specified value.
     * @param value A value compatible with DmcTypeNumericRelationEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setNumericRelation(Object value) throws DmcValueException {
        DmcTypeNumericRelationEnumSV attr  = (DmcTypeNumericRelationEnumSV) get(DmvDMSAG.__numericRelation);
        if (attr == null)
            attr = new DmcTypeNumericRelationEnumSV(DmvDMSAG.__numericRelation);
        
        attr.set(value);
        set(DmvDMSAG.__numericRelation,attr);
    }

    /**
     * Removes the numericRelation attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remNumericRelation(){
         rem(DmvDMSAG.__numericRelation);
    }




}
