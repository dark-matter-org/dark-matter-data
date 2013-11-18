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
package org.dmd.dmv.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:365)
import java.util.ArrayList;                                                             // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1073)
import java.util.HashSet;                                                               // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1092)
import java.util.Iterator;                                                              // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2132)
import org.dmd.dmc.*;                                                                   // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dmc.types.RuleName;                                                      // Is named by - (BaseDMWGeneratorNewest.java:958)
import org.dmd.dms.AttributeDefinition;                                                 // Is reference type - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dms.ClassDefinition;                                                     // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.RuleData;                                                            // Derived class - (BaseDMWGeneratorNewest.java:1140)
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;                                // For multi-valued adds of AttributeDefinition - (BaseDMWGeneratorNewest.java:1659)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW;                        // For multi-valued AttributeDefinition - (BaseDMWGeneratorNewest.java:1601)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                     // For multi-valued String - (BaseDMWGeneratorNewest.java:1995)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                              // Is reference type REF - (BaseDMWGeneratorNewest.java:1007)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;                                       // Attribute basedOnValue from the dmv schema - (BaseDMWGeneratorNewest.java:794)



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
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
public class CheckAttributesBasedOnValueRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public CheckAttributesBasedOnValueRuleDataDMW() {
        super(new CheckAttributesBasedOnValueRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._CheckAttributesBasedOnValueRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public CheckAttributesBasedOnValueRuleDataDMW(DmcTypeModifierMV mods) {
        super(new CheckAttributesBasedOnValueRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._CheckAttributesBasedOnValueRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    public CheckAttributesBasedOnValueRuleDataDMW getModificationRecorder(){
        CheckAttributesBasedOnValueRuleDataDMW rc = new CheckAttributesBasedOnValueRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public CheckAttributesBasedOnValueRuleDataDMW(CheckAttributesBasedOnValueRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._CheckAttributesBasedOnValueRuleData);
    }

    public CheckAttributesBasedOnValueRuleDataDMW cloneIt() {
        CheckAttributesBasedOnValueRuleDataDMW rc = new CheckAttributesBasedOnValueRuleDataDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public CheckAttributesBasedOnValueRuleDataDMO getDMO() {
        return((CheckAttributesBasedOnValueRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected CheckAttributesBasedOnValueRuleDataDMW(CheckAttributesBasedOnValueRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1189)
    public RuleName getObjectName(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getRuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof CheckAttributesBasedOnValueRuleDataDMW){
            return( getObjectName().equals( ((CheckAttributesBasedOnValueRuleDataDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1326)
    public AttributeDefinition getBasedOnAttribute(){
        AttributeDefinitionREF ref = ((CheckAttributesBasedOnValueRuleDataDMO) core).getBasedOnAttribute();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((AttributeDefinition)ref.getObject().getContainer());
    }

    /**
     * Sets the basedOnAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setBasedOnAttribute(AttributeDefinition value) {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setBasedOnAttribute(value.getDMO());
    }

    /**
     * Sets the basedOnAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1420)
    public void setBasedOnAttribute(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setBasedOnAttribute(value);
    }

    /**
     * Removes the basedOnAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remBasedOnAttribute(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remBasedOnAttribute();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1563)
    public int getBasedOnValueSize(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getBasedOnValueSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1571)
    public boolean getBasedOnValueIsEmpty(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getBasedOnValueSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1581)
    public boolean getBasedOnValueHasValue(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getBasedOnValueSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1999)
    public StringIterableDMW getBasedOnValueIterable(){
        DmcAttribute<?> attr = core.get(DmvDMSAG.__basedOnValue);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((CheckAttributesBasedOnValueRuleDataDMO) core).getBasedOnValue()));
    }

    /**
     * Adds another basedOnValue value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2025)
    public void addBasedOnValue(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).addBasedOnValue(value);
    }

    /**
     * Adds another basedOnValue value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2035)
    public void addBasedOnValue(String value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).addBasedOnValue(value);
    }

    /**
     * Returns true if the collection contains the basedOnValue value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2092)
    public boolean basedOnValueContains(String value){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).basedOnValueContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2136)
    @SuppressWarnings("unchecked")
    public HashSet<String> getBasedOnValueCopy(){
        DmcAttribute<?> attr = core.get(DmvDMSAG.__basedOnValue);
        if (attr == null)
            return(new HashSet<String>());
        
        HashSet<String> rc = new HashSet<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a basedOnValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2163)
    public void delBasedOnValue(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).delBasedOnValue(value);
    }

    /**
     * Deletes a basedOnValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2172)
    public void delBasedOnValue(String value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).delBasedOnValue(value);
    }

    /**
     * Removes the basedOnValue attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2184)
    public void remBasedOnValue(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remBasedOnValue();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public String getDescription(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setDescription(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setDescription(String value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remDescription(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remDescription();
    }

    /**
     * @return The number of AttributeDefinition items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1563)
    public int getExcludeThisAttributeSize(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getExcludeThisAttributeSize());
    }

    /**
     * @return true if there are no AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1571)
    public boolean getExcludeThisAttributeIsEmpty(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getExcludeThisAttributeSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1581)
    public boolean getExcludeThisAttributeHasValue(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getExcludeThisAttributeSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1608)
    public AttributeDefinitionIterableDMW getExcludeThisAttributeIterable(){
        DmcAttribute<?> attr = core.get(DmvDMSAG.__excludeThisAttribute);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);
        
        return(new AttributeDefinitionIterableDMW(((CheckAttributesBasedOnValueRuleDataDMO) core).getExcludeThisAttribute()));
    }

    /**
     * Adds another excludeThisAttribute value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1665)
    public DmcAttribute<?> addExcludeThisAttribute(AttributeDefinition value){
        DmcAttribute<?> attr = ((CheckAttributesBasedOnValueRuleDataDMO) core).addExcludeThisAttribute(((AttributeDefinitionDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a excludeThisAttribute value.
     * @param value The AttributeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1715)
    public void delExcludeThisAttribute(AttributeDefinition value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).delExcludeThisAttribute(value.getDMO());
    }

    /**
     * @return A COPY of the collection of AttributeDefinition objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1779)
    public ArrayList<AttributeDefinition> getExcludeThisAttributeCopy(){
        DmcAttribute<?> attr = ((CheckAttributesBasedOnValueRuleDataDMO) core).get(DmvDMSAG.__excludeThisAttribute);
        if (attr == null)
            return(new ArrayList<AttributeDefinition>());
        
        ArrayList<AttributeDefinition> rc = new ArrayList<AttributeDefinition>(attr.getMVSize());
        
        AttributeDefinitionIterableDMW it = getExcludeThisAttributeIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the excludeThisAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2184)
    public void remExcludeThisAttribute(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remExcludeThisAttribute();
    }

    /**
     * @return The number of AttributeDefinition items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1563)
    public int getIncludeThisAttributeSize(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getIncludeThisAttributeSize());
    }

    /**
     * @return true if there are no AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1571)
    public boolean getIncludeThisAttributeIsEmpty(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getIncludeThisAttributeSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1581)
    public boolean getIncludeThisAttributeHasValue(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getIncludeThisAttributeSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1608)
    public AttributeDefinitionIterableDMW getIncludeThisAttributeIterable(){
        DmcAttribute<?> attr = core.get(DmvDMSAG.__includeThisAttribute);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);
        
        return(new AttributeDefinitionIterableDMW(((CheckAttributesBasedOnValueRuleDataDMO) core).getIncludeThisAttribute()));
    }

    /**
     * Adds another includeThisAttribute value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1665)
    public DmcAttribute<?> addIncludeThisAttribute(AttributeDefinition value){
        DmcAttribute<?> attr = ((CheckAttributesBasedOnValueRuleDataDMO) core).addIncludeThisAttribute(((AttributeDefinitionDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a includeThisAttribute value.
     * @param value The AttributeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1715)
    public void delIncludeThisAttribute(AttributeDefinition value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).delIncludeThisAttribute(value.getDMO());
    }

    /**
     * @return A COPY of the collection of AttributeDefinition objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1779)
    public ArrayList<AttributeDefinition> getIncludeThisAttributeCopy(){
        DmcAttribute<?> attr = ((CheckAttributesBasedOnValueRuleDataDMO) core).get(DmvDMSAG.__includeThisAttribute);
        if (attr == null)
            return(new ArrayList<AttributeDefinition>());
        
        ArrayList<AttributeDefinition> rc = new ArrayList<AttributeDefinition>(attr.getMVSize());
        
        AttributeDefinitionIterableDMW it = getIncludeThisAttributeIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the includeThisAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2184)
    public void remIncludeThisAttribute(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remIncludeThisAttribute();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public RuleName getRuleName(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setRuleName(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setRuleName(RuleName value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remRuleName(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public String getRuleTitle(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setRuleTitle(String value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remRuleTitle(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remRuleTitle();
    }


}
