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
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFMV;         // Reference type - (GenUtility.java:311)
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;         // Reference type - (GenUtility.java:311)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeRuleNameSV;                       // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringMV;                         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringSET;                        // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringSV;                         // Required type - (GenUtility.java:339)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The CheckAttributesBasedOnValueRule allows you to specify\n that certain
 * optional attributes must exist (or not exist) based on the value\n of
 * another single valued attribute in an object. This allows for finer
 * control of must/may\n attributes based on other values in an object. An
 * example usage (from\n the dark-matter validation schema) looks like:\n
 * <pre>\n CheckAttributesBasedOnValueRuleData\n ruleName             
 * dmvNoMustInExtensible\n ruleTitle             If a ClassDefinition's
 * classType is AUXILIARY, it can't have mandatory attributes\n applyToClass 
 *         ClassDefinition\n basedOnAttribute      classType\n basedOnValue  
 *        AUXILIARY\n excludeThisAttribute  must\n description           An
 * AUXILIARY class can be added to an object dynamically and\n  we don't
 * allow mandatory attributes in such classes.\n </pre>\n If the
 * basedOnAttribute doesn't exist in the object being validated, the rule
 * does nothing.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class CheckAttributesBasedOnValueRuleDataDMO  extends RuleDataDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "CheckAttributesBasedOnValueRuleData";


    static {
    }

    public CheckAttributesBasedOnValueRuleDataDMO() {
        super("CheckAttributesBasedOnValueRuleData");
    }

    protected CheckAttributesBasedOnValueRuleDataDMO(String oc) {
        super(oc);
    }

    @Override
    public CheckAttributesBasedOnValueRuleDataDMO getNew(){
        CheckAttributesBasedOnValueRuleDataDMO rc = new CheckAttributesBasedOnValueRuleDataDMO();
        return(rc);
    }

    @Override
    public CheckAttributesBasedOnValueRuleDataDMO getSlice(DmcSliceInfo info){
        CheckAttributesBasedOnValueRuleDataDMO rc = new CheckAttributesBasedOnValueRuleDataDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public CheckAttributesBasedOnValueRuleDataDMO(DmcTypeModifierMV mods) {
        super("CheckAttributesBasedOnValueRuleData");
        modrec(true);
        setModifier(mods);
    }

    public CheckAttributesBasedOnValueRuleDataDMO getModificationRecorder(){
        CheckAttributesBasedOnValueRuleDataDMO rc = new CheckAttributesBasedOnValueRuleDataDMO();
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
        if (obj instanceof CheckAttributesBasedOnValueRuleDataDMO){
            return( getObjectName().equals( ((CheckAttributesBasedOnValueRuleDataDMO) obj).getObjectName()) );
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1278)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1290)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1304)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1379)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1411)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1428)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1486)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1502)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1521)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    /**
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1136)
    public Iterator<AttributeDefinitionREF> getExcludeThisAttribute(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(DmvDMSAG.__excludeThisAttribute);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1156)
    public Iterator<AttributeDefinitionREF> getExcludeThisAttributeREFs(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(DmvDMSAG.__excludeThisAttribute);
        if (attr == null)
            return( ((List<AttributeDefinitionREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another excludeThisAttribute to the specified value.
     * @param value AttributeDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1170)
    public DmcAttribute<?> addExcludeThisAttribute(AttributeDefinitionDMO value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__excludeThisAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(DmvDMSAG.__excludeThisAttribute);
        
        try{
            setLastValue(attr.add(value));
            add(DmvDMSAG.__excludeThisAttribute,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another excludeThisAttribute value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1411)
    public DmcAttribute<?> addExcludeThisAttribute(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmvDMSAG.__excludeThisAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(DmvDMSAG.__excludeThisAttribute);
        
        setLastValue(attr.add(value));
        add(DmvDMSAG.__excludeThisAttribute,attr);
        return(attr);
    }

    /**
     * Returns the number of values in excludeThisAttribute
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1428)
    public int getExcludeThisAttributeSize(){
        DmcAttribute<?> attr = get(DmvDMSAG.__excludeThisAttribute);
        if (attr == null){
            if (DmvDMSAG.__excludeThisAttribute.indexSize == 0)
                return(0);
            else
                return(DmvDMSAG.__excludeThisAttribute.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a excludeThisAttribute value.
     * @param value The AttributeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1467)
    public DmcAttribute<?> delExcludeThisAttribute(Object value){
        DmcAttribute<?> attr = get(DmvDMSAG.__excludeThisAttribute);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeAttributeDefinitionREFMV(DmvDMSAG.__excludeThisAttribute), value);
        else
            attr = del(DmvDMSAG.__excludeThisAttribute, value);
        
        return(attr);
    }

    /**
     * Removes the excludeThisAttribute attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1521)
    public void remExcludeThisAttribute(){
         rem(DmvDMSAG.__excludeThisAttribute);
    }

    /**
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1136)
    public Iterator<AttributeDefinitionREF> getIncludeThisAttribute(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(DmvDMSAG.__includeThisAttribute);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1156)
    public Iterator<AttributeDefinitionREF> getIncludeThisAttributeREFs(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(DmvDMSAG.__includeThisAttribute);
        if (attr == null)
            return( ((List<AttributeDefinitionREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another includeThisAttribute to the specified value.
     * @param value AttributeDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1170)
    public DmcAttribute<?> addIncludeThisAttribute(AttributeDefinitionDMO value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__includeThisAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(DmvDMSAG.__includeThisAttribute);
        
        try{
            setLastValue(attr.add(value));
            add(DmvDMSAG.__includeThisAttribute,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another includeThisAttribute value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1411)
    public DmcAttribute<?> addIncludeThisAttribute(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmvDMSAG.__includeThisAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(DmvDMSAG.__includeThisAttribute);
        
        setLastValue(attr.add(value));
        add(DmvDMSAG.__includeThisAttribute,attr);
        return(attr);
    }

    /**
     * Returns the number of values in includeThisAttribute
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1428)
    public int getIncludeThisAttributeSize(){
        DmcAttribute<?> attr = get(DmvDMSAG.__includeThisAttribute);
        if (attr == null){
            if (DmvDMSAG.__includeThisAttribute.indexSize == 0)
                return(0);
            else
                return(DmvDMSAG.__includeThisAttribute.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a includeThisAttribute value.
     * @param value The AttributeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1467)
    public DmcAttribute<?> delIncludeThisAttribute(Object value){
        DmcAttribute<?> attr = get(DmvDMSAG.__includeThisAttribute);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeAttributeDefinitionREFMV(DmvDMSAG.__includeThisAttribute), value);
        else
            attr = del(DmvDMSAG.__includeThisAttribute, value);
        
        return(attr);
    }

    /**
     * Removes the includeThisAttribute attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1521)
    public void remIncludeThisAttribute(){
         rem(DmvDMSAG.__includeThisAttribute);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remRuleName(){
         rem(MetaDMSAG.__ruleName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remRuleTitle(){
         rem(MetaDMSAG.__ruleTitle);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:660)
    public AttributeDefinitionREF getBasedOnAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(DmvDMSAG.__basedOnAttribute);
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
    public AttributeDefinitionREF getBasedOnAttributeREF(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(DmvDMSAG.__basedOnAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets basedOnAttribute to the specified value.
     * @param value AttributeDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:714)
    public void setBasedOnAttribute(AttributeDefinitionDMO value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__basedOnAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(DmvDMSAG.__basedOnAttribute);
        else
            ((DmcTypeAttributeDefinitionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmvDMSAG.__basedOnAttribute,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets basedOnAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setBasedOnAttribute(Object value) throws DmcValueException {
        DmcTypeAttributeDefinitionREFSV attr  = (DmcTypeAttributeDefinitionREFSV) get(DmvDMSAG.__basedOnAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(DmvDMSAG.__basedOnAttribute);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmvDMSAG.__basedOnAttribute,attr);
    }

    /**
     * Removes the basedOnAttribute attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remBasedOnAttribute(){
         rem(DmvDMSAG.__basedOnAttribute);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1278)
    public Iterator<String> getBasedOnValue(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmvDMSAG.__basedOnValue);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1290)
    public String getNthBasedOnValue(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmvDMSAG.__basedOnValue);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another basedOnValue to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1304)
    public DmcAttribute<?> addBasedOnValue(String value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__basedOnValue);
        if (attr == null)
            attr = new DmcTypeStringSET(DmvDMSAG.__basedOnValue);
        
        try{
            setLastValue(attr.add(value));
            add(DmvDMSAG.__basedOnValue,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1379)
    public boolean basedOnValueContains(String value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__basedOnValue);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another basedOnValue value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1411)
    public DmcAttribute<?> addBasedOnValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmvDMSAG.__basedOnValue);
        if (attr == null)
            attr = new DmcTypeStringSET(DmvDMSAG.__basedOnValue);
        
        setLastValue(attr.add(value));
        add(DmvDMSAG.__basedOnValue,attr);
        return(attr);
    }

    /**
     * Returns the number of values in basedOnValue
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1428)
    public int getBasedOnValueSize(){
        DmcAttribute<?> attr = get(DmvDMSAG.__basedOnValue);
        if (attr == null){
            if (DmvDMSAG.__basedOnValue.indexSize == 0)
                return(0);
            else
                return(DmvDMSAG.__basedOnValue.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a basedOnValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1486)
    public DmcAttribute<?> delBasedOnValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmvDMSAG.__basedOnValue);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmvDMSAG.__basedOnValue), value);
        else
            attr = del(DmvDMSAG.__basedOnValue, value);
        
        return(attr);
    }

    /**
     * Deletes a basedOnValue from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1502)
    public DmcAttribute<?> delBasedOnValue(String value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__basedOnValue);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmvDMSAG.__basedOnValue), value);
        else
            attr = del(DmvDMSAG.__basedOnValue, value);
        
        return(attr);
    }

    /**
     * Removes the basedOnValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1521)
    public void remBasedOnValue(){
         rem(DmvDMSAG.__basedOnValue);
    }




}
