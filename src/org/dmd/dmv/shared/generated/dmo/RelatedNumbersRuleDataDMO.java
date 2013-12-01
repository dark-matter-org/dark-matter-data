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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:393)
import java.io.Serializable;                                                    // Always required - (GenUtility.java:221)
import java.util.*;                                                             // Always required if we have any MV attributes - (GenUtility.java:216)
import org.dmd.dmc.DmcAttribute;                                                // Named object - (GenUtility.java:373)
import org.dmd.dmc.DmcNamedObjectIF;                                            // Named object - (GenUtility.java:372)
import org.dmd.dmc.DmcOmni;                                                     // Lazy resolution - (GenUtility.java:317)
import org.dmd.dmc.DmcSliceInfo;                                                // Required for object slicing - (GenUtility.java:226)
import org.dmd.dmc.DmcValueException;                                           // Any attributes - (GenUtility.java:238)
import org.dmd.dmc.types.RuleName;                                              // Naming attribute type - (GenUtility.java:367)
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;                        // Type specific set/add - (GenUtility.java:304)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Required for MODREC constructor - (GenUtility.java:225)
import org.dmd.dms.generated.dmo.RuleDataDMO;                                   // Base class - (GenUtility.java:352)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                      // Helper class - (GenUtility.java:332)
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;             // Reference type - (GenUtility.java:297)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                           // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeRuleNameSV;                           // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeStringMV;                             // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeStringSV;                             // Required type - (GenUtility.java:325)
import org.dmd.dmv.shared.generated.enums.NumericRelationEnum;                  // Primitive type and !auxiliary class - (GenUtility.java:268)
import org.dmd.dmv.shared.generated.types.DmcTypeNumericRelationEnumSV;         // Required type - (GenUtility.java:325)

/**
 * java.util.AbstractList$Itr@141dddba
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class RelatedNumbersRuleDataDMO  extends RuleDataDMO  implements DmcNamedObjectIF, Serializable  {

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
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:750)
    public RuleName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__ruleName);
        if (name != null)
            return((RuleName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:767)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__ruleName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:774)
    public boolean equals(Object obj){
        if (obj instanceof RelatedNumbersRuleDataDMO){
            return( getObjectName().equals( ((RelatedNumbersRuleDataDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:782)
    public int hashCode(){
        RuleName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public String getNthDescription(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another description to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean descriptionContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * Returns the number of values in description
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null){
            if (MetaDMSAG.__description.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__description.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__description), value);
        else
            attr = del(MetaDMSAG.__description, value);
        
        return(attr);
    }

    /**
     * Deletes a description from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__description), value);
        else
            attr = del(MetaDMSAG.__description, value);
        
        return(attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remRuleName(){
         rem(MetaDMSAG.__ruleName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remRuleTitle(){
         rem(MetaDMSAG.__ruleTitle);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:652)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:706)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remLhs(){
         rem(DmvDMSAG.__lhs);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:652)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:706)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remRhs(){
         rem(DmvDMSAG.__rhs);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remNumericRelation(){
         rem(DmvDMSAG.__numericRelation);
    }




}
