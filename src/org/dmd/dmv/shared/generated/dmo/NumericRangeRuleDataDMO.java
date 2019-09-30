//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;         // Reference type - (GenUtility.java:311)
import org.dmd.dms.generated.types.DmcTypeDoubleSV;                         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeRuleNameSV;                       // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringMV;                         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringSV;                         // Required type - (GenUtility.java:339)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The NumericRangeRule ensures that a numeric attribute has values\n that
 * fall within a given range. It can be used for both single-valued and
 * multi-valued\n attributes. The nrrMinimum must be less than the
 * nrrMaximum. An example usage\n might be:\n <p>\n <pre>\n
 * NumericRangeRuleData\n ruleName         rangeCheckY\n ruleTitle       
 * Attribute Y in range 1-10\n applyToAttribute Y\n nrrMinimum       1\n
 * nrrMaximum       10\n description      This constraint is required because
 * blah, blah blah.\n </pre>\n NOTE: this rule works by implicitly converting
 * the values of the attributes\n to type Double in order to be able to do
 * the range comparison. However,\n if you are dealing with large numeric
 * values you may run into issues.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class NumericRangeRuleDataDMO  extends RuleDataDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "NumericRangeRuleData";


    static {
    }

    public NumericRangeRuleDataDMO() {
        super("NumericRangeRuleData");
    }

    protected NumericRangeRuleDataDMO(String oc) {
        super(oc);
    }

    @Override
    public NumericRangeRuleDataDMO getNew(){
        NumericRangeRuleDataDMO rc = new NumericRangeRuleDataDMO();
        return(rc);
    }

    @Override
    public NumericRangeRuleDataDMO getSlice(DmcSliceInfo info){
        NumericRangeRuleDataDMO rc = new NumericRangeRuleDataDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NumericRangeRuleDataDMO(DmcTypeModifierMV mods) {
        super("NumericRangeRuleData");
        modrec(true);
        setModifier(mods);
    }

    public NumericRangeRuleDataDMO getModificationRecorder(){
        NumericRangeRuleDataDMO rc = new NumericRangeRuleDataDMO();
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
        if (obj instanceof NumericRangeRuleDataDMO){
            return( getObjectName().equals( ((NumericRangeRuleDataDMO) obj).getObjectName()) );
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1289)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1301)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1315)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1390)
    public boolean descriptionContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1424)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * @return the number of values in description
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1441)
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
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1502)
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
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1519)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1538)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public Double getNrrMinimum(){
        DmcTypeDoubleSV attr = (DmcTypeDoubleSV) get(DmvDMSAG.__nrrMinimum);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nrrMinimum to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setNrrMinimum(Double value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__nrrMinimum);
        if (attr == null)
            attr = new DmcTypeDoubleSV(DmvDMSAG.__nrrMinimum);
        
        try{
            attr.set(value);
            set(DmvDMSAG.__nrrMinimum,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets nrrMinimum to the specified value.
     * @param value A value compatible with DmcTypeDoubleSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setNrrMinimum(Object value) throws DmcValueException {
        DmcTypeDoubleSV attr  = (DmcTypeDoubleSV) get(DmvDMSAG.__nrrMinimum);
        if (attr == null)
            attr = new DmcTypeDoubleSV(DmvDMSAG.__nrrMinimum);
        
        attr.set(value);
        set(DmvDMSAG.__nrrMinimum,attr);
    }

    /**
     * Removes the nrrMinimum attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remNrrMinimum(){
         rem(DmvDMSAG.__nrrMinimum);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public Double getNrrMaximum(){
        DmcTypeDoubleSV attr = (DmcTypeDoubleSV) get(DmvDMSAG.__nrrMaximum);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nrrMaximum to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setNrrMaximum(Double value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__nrrMaximum);
        if (attr == null)
            attr = new DmcTypeDoubleSV(DmvDMSAG.__nrrMaximum);
        
        try{
            attr.set(value);
            set(DmvDMSAG.__nrrMaximum,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets nrrMaximum to the specified value.
     * @param value A value compatible with DmcTypeDoubleSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setNrrMaximum(Object value) throws DmcValueException {
        DmcTypeDoubleSV attr  = (DmcTypeDoubleSV) get(DmvDMSAG.__nrrMaximum);
        if (attr == null)
            attr = new DmcTypeDoubleSV(DmvDMSAG.__nrrMaximum);
        
        attr.set(value);
        set(DmvDMSAG.__nrrMaximum,attr);
    }

    /**
     * Removes the nrrMaximum attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remNrrMaximum(){
         rem(DmvDMSAG.__nrrMaximum);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
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
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remRuleName(){
         rem(MetaDMSAG.__ruleName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
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
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remRuleTitle(){
         rem(MetaDMSAG.__ruleTitle);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:678)
    /**
     * @return the AttributeDefinitionREF
     */
    public AttributeDefinitionREF getApplyToAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__applyToAttribute);
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:700)
    /**
     * @return the reference to AttributeDefinition without attempting lazy resolution (if turned on).
     */
    public AttributeDefinitionREF getApplyToAttributeREF(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__applyToAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:718)
    /**
     * Sets applyToAttribute to the specified value.
     * @param value AttributeDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setApplyToAttribute(AttributeDefinitionDMO value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__applyToAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__applyToAttribute);
        else
            ((DmcTypeAttributeDefinitionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(MetaDMSAG.__applyToAttribute,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets applyToAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        DmcTypeAttributeDefinitionREFSV attr  = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__applyToAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__applyToAttribute);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(MetaDMSAG.__applyToAttribute,attr);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remApplyToAttribute(){
         rem(MetaDMSAG.__applyToAttribute);
    }




}
