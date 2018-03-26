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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                // Always required - (GenUtility.java:227)
import java.util.*;                                                         // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                            // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                        // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                                 // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                            // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                       // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.RuleName;                                          // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                 // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.dmo.RuleDataDMO;                               // Base class - (GenUtility.java:367)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                  // Helper class - (GenUtility.java:346)
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFMV;         // Reference type - (GenUtility.java:311)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeRuleNameSV;                       // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringMV;                         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringSV;                         // Required type - (GenUtility.java:339)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The OnlyOneOfTheseAttributesAllowedRule allows you to specify\n that only
 * one of the possible attributes specified must be present\n in the object
 * being checked. This only makes sense where the attributes in\n question
 * are optional (may have) in the object.\n <p/>\n An example of this rule
 * can be seen below.\n <pre>\n OnlyOneOfTheseAttributesAllowedRule\n
 * ruleName			dmvMoneySource\n ruleTitle			Only \n
 * applyToClass		PaymentMethod\n onePossibility		creditCardNumber\n
 * onePossibility		payPalAccount\n </pre>
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class OnlyOneOfTheseAttributesAllowedRuleDataDMO  extends RuleDataDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "OnlyOneOfTheseAttributesAllowedRuleData";


    static {
    }

    public OnlyOneOfTheseAttributesAllowedRuleDataDMO() {
        super("OnlyOneOfTheseAttributesAllowedRuleData");
    }

    protected OnlyOneOfTheseAttributesAllowedRuleDataDMO(String oc) {
        super(oc);
    }

    @Override
    public OnlyOneOfTheseAttributesAllowedRuleDataDMO getNew(){
        OnlyOneOfTheseAttributesAllowedRuleDataDMO rc = new OnlyOneOfTheseAttributesAllowedRuleDataDMO();
        return(rc);
    }

    @Override
    public OnlyOneOfTheseAttributesAllowedRuleDataDMO getSlice(DmcSliceInfo info){
        OnlyOneOfTheseAttributesAllowedRuleDataDMO rc = new OnlyOneOfTheseAttributesAllowedRuleDataDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public OnlyOneOfTheseAttributesAllowedRuleDataDMO(DmcTypeModifierMV mods) {
        super("OnlyOneOfTheseAttributesAllowedRuleData");
        modrec(true);
        setModifier(mods);
    }

    public OnlyOneOfTheseAttributesAllowedRuleDataDMO getModificationRecorder(){
        OnlyOneOfTheseAttributesAllowedRuleDataDMO rc = new OnlyOneOfTheseAttributesAllowedRuleDataDMO();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public RuleName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__ruleName);
        if (name != null)
            return((RuleName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__ruleName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof OnlyOneOfTheseAttributesAllowedRuleDataDMO){
            return( getObjectName().equals( ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:784)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1136)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1150)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1225)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1257)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1332)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1348)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1367)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:796)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remRuleName(){
         rem(MetaDMSAG.__ruleName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:796)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remRuleTitle(){
         rem(MetaDMSAG.__ruleTitle);
    }

    /**
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:982)
    public Iterator<AttributeDefinitionREF> getOnePossibility(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(DmvDMSAG.__onePossibility);
        if (attr == null)
            return( ((List<AttributeDefinitionREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<AttributeDefinitionREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of AttributeDefinitionREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1002)
    public Iterator<AttributeDefinitionREF> getOnePossibilityREFs(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(DmvDMSAG.__onePossibility);
        if (attr == null)
            return( ((List<AttributeDefinitionREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another onePossibility to the specified value.
     * @param value AttributeDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1016)
    public DmcAttribute<?> addOnePossibility(AttributeDefinitionDMO value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__onePossibility);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(DmvDMSAG.__onePossibility);
        
        try{
            setLastValue(attr.add(value));
            add(DmvDMSAG.__onePossibility,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another onePossibility value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1257)
    public DmcAttribute<?> addOnePossibility(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmvDMSAG.__onePossibility);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(DmvDMSAG.__onePossibility);
        
        setLastValue(attr.add(value));
        add(DmvDMSAG.__onePossibility,attr);
        return(attr);
    }

    /**
     * Returns the number of values in onePossibility
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
    public int getOnePossibilitySize(){
        DmcAttribute<?> attr = get(DmvDMSAG.__onePossibility);
        if (attr == null){
            if (DmvDMSAG.__onePossibility.indexSize == 0)
                return(0);
            else
                return(DmvDMSAG.__onePossibility.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a onePossibility value.
     * @param value The AttributeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1313)
    public DmcAttribute<?> delOnePossibility(Object value){
        DmcAttribute<?> attr = get(DmvDMSAG.__onePossibility);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeAttributeDefinitionREFMV(DmvDMSAG.__onePossibility), value);
        else
            attr = del(DmvDMSAG.__onePossibility, value);
        
        return(attr);
    }

    /**
     * Removes the onePossibility attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1367)
    public void remOnePossibility(){
         rem(DmvDMSAG.__onePossibility);
    }




}
