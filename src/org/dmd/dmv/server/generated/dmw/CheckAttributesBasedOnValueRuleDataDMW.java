package org.dmd.dmv.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                             // To support getMVCopy() - (BaseDMWGenerator.java:1071)
import java.util.HashSet;                                                               // To support getMVCopy() - (BaseDMWGenerator.java:1090)
import java.util.Iterator;                                                              // Support copy of MV objects - (BaseDMWGenerator.java:2133)
import org.dmd.dmc.*;                                                                   // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.RuleName;                                                      // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.AttributeDefinition;                                                 // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.dms.ClassDefinition;                                                     // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.RuleData;                                                            // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;                                // For multi-valued adds of AttributeDefinition - (BaseDMWGenerator.java:1658)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                             // Attribute description from the meta schema - (BaseDMWGenerator.java:910)
import org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW;                        // For multi-valued AttributeDefinition - (BaseDMWGenerator.java:1600)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                     // For multi-valued String - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                              // Is reference type REF - (BaseDMWGenerator.java:1005)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                   // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;                                       // Attribute basedOnValue from the dmv schema - (BaseDMWGenerator.java:910)



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
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
// Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:532)
public class CheckAttributesBasedOnValueRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public CheckAttributesBasedOnValueRuleDataDMW() {
        super(new CheckAttributesBasedOnValueRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._CheckAttributesBasedOnValueRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public CheckAttributesBasedOnValueRuleDataDMW(DmcTypeModifierMV mods) {
        super(new CheckAttributesBasedOnValueRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._CheckAttributesBasedOnValueRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:634)
    public CheckAttributesBasedOnValueRuleDataDMW getModificationRecorder(){
        CheckAttributesBasedOnValueRuleDataDMW rc = new CheckAttributesBasedOnValueRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected CheckAttributesBasedOnValueRuleDataDMW(CheckAttributesBasedOnValueRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setBasedOnAttribute(AttributeDefinition value) {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setBasedOnAttribute(value.getDMO());
    }

    /**
     * Sets the basedOnAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     * @throws DmcValueException is the value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1419)
    public void setBasedOnAttribute(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setBasedOnAttribute(value);
    }

    /**
     * Removes the basedOnAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remBasedOnAttribute(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remBasedOnAttribute();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getBasedOnValueSize(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getBasedOnValueSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getBasedOnValueIsEmpty(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getBasedOnValueSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getBasedOnValueHasValue(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getBasedOnValueSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public StringIterableDMW getBasedOnValueIterable(){
        DmcAttribute<?> attr = core.get(DmvDMSAG.__basedOnValue);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((CheckAttributesBasedOnValueRuleDataDMO) core).getBasedOnValue()));
    }

    /**
     * Adds another basedOnValue value.
     * @param value A value compatible with String
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addBasedOnValue(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).addBasedOnValue(value);
    }

    /**
     * Adds another basedOnValue value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addBasedOnValue(String value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).addBasedOnValue(value);
    }

    /**
     * @param value A value compatible with String
     * @return true if the collection contains the basedOnValue value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean basedOnValueContains(String value){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).basedOnValueContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
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
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delBasedOnValue(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).delBasedOnValue(value);
    }

    /**
     * Deletes a basedOnValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delBasedOnValue(String value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).delBasedOnValue(value);
    }

    /**
     * Removes the basedOnValue attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remBasedOnValue(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remBasedOnValue();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getDescriptionSize(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getDescriptionIsEmpty(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getDescriptionHasValue(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((CheckAttributesBasedOnValueRuleDataDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addDescription(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addDescription(String value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).addDescription(value);
    }

    /**
     * @param value A value compatible with String
     * @return true if the collection contains the description value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean descriptionContains(String value){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDescriptionCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delDescription(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delDescription(String value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remDescription(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remDescription();
    }

    /**
     * @return The number of AttributeDefinition items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getExcludeThisAttributeSize(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getExcludeThisAttributeSize());
    }

    /**
     * @return true if there are no AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getExcludeThisAttributeIsEmpty(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getExcludeThisAttributeSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getExcludeThisAttributeHasValue(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getExcludeThisAttributeSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1607)
    public AttributeDefinitionIterableDMW getExcludeThisAttributeIterable(){
        DmcAttribute<?> attr = core.get(DmvDMSAG.__excludeThisAttribute);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);
        
        return(new AttributeDefinitionIterableDMW(((CheckAttributesBasedOnValueRuleDataDMO) core).getExcludeThisAttribute()));
    }

    /**
     * Adds another excludeThisAttribute value.
     * @param value A value compatible with AttributeDefinition
     * @return the attribute instance
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1665)
    public DmcAttribute<?> addExcludeThisAttribute(AttributeDefinition value){
        DmcAttribute<?> attr = ((CheckAttributesBasedOnValueRuleDataDMO) core).addExcludeThisAttribute(((AttributeDefinitionDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a excludeThisAttribute value.
     * @param value The AttributeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1715)
    public void delExcludeThisAttribute(AttributeDefinition value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).delExcludeThisAttribute(value.getDMO());
    }

    /**
     * @return A COPY of the collection of AttributeDefinition objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1779)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remExcludeThisAttribute(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remExcludeThisAttribute();
    }

    /**
     * @return The number of AttributeDefinition items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getIncludeThisAttributeSize(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getIncludeThisAttributeSize());
    }

    /**
     * @return true if there are no AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getIncludeThisAttributeIsEmpty(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getIncludeThisAttributeSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getIncludeThisAttributeHasValue(){
        if (((CheckAttributesBasedOnValueRuleDataDMO) core).getIncludeThisAttributeSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1607)
    public AttributeDefinitionIterableDMW getIncludeThisAttributeIterable(){
        DmcAttribute<?> attr = core.get(DmvDMSAG.__includeThisAttribute);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);
        
        return(new AttributeDefinitionIterableDMW(((CheckAttributesBasedOnValueRuleDataDMO) core).getIncludeThisAttribute()));
    }

    /**
     * Adds another includeThisAttribute value.
     * @param value A value compatible with AttributeDefinition
     * @return the attribute instance
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1665)
    public DmcAttribute<?> addIncludeThisAttribute(AttributeDefinition value){
        DmcAttribute<?> attr = ((CheckAttributesBasedOnValueRuleDataDMO) core).addIncludeThisAttribute(((AttributeDefinitionDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a includeThisAttribute value.
     * @param value The AttributeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1715)
    public void delIncludeThisAttribute(AttributeDefinition value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).delIncludeThisAttribute(value.getDMO());
    }

    /**
     * @return A COPY of the collection of AttributeDefinition objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1779)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remIncludeThisAttribute(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remIncludeThisAttribute();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public RuleName getRuleName(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setRuleName(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setRuleName(RuleName value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remRuleName(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getRuleTitle(){
        return(((CheckAttributesBasedOnValueRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setRuleTitle(String value){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remRuleTitle(){
        ((CheckAttributesBasedOnValueRuleDataDMO) core).remRuleTitle();
    }


}
