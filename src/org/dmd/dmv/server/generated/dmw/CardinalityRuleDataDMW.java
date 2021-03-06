package org.dmd.dmv.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                             // Support for MULTI attribute - (BaseDMWGenerator.java:2119)
import java.util.Iterator;                                              // Support copy of MV objects - (BaseDMWGenerator.java:2133)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.RuleName;                                      // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.AttributeDefinition;                                 // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.dms.ClassDefinition;                                     // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.RuleData;                                            // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Attribute description from the meta schema - (BaseDMWGenerator.java:910)
import org.dmd.dms.generated.dmw.StringIterableDMW;                     // For multi-valued String - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.types.AttributeDefinitionREF;              // Is reference type REF - (BaseDMWGenerator.java:1005)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmv.shared.generated.dmo.CardinalityRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)



/**
 * The CardinalityRule lets you specify the required cardinality of a
 * multi-valued attribute.\n <pre>\n CardinalityRuleData\n ruleName         
 * oneToFiveThingsAllowed\n ruleTitle         The things attribute must have
 * 1 to 5 things in it.\n applyToAttribute  things\n applyToClass     
 * SomethingWithThings\n crMinimum         1\n crMaximum         5\n </pre>\n
 * <p>\n <pre>\n CardinalityRuleData\n ruleName          minimumOfTwoThing\n
 * ruleTitle         The things attribute must have at least 2 things in
 * it.\n applyToAttribute  things\n applyToClass      SomethingWithThings\n
 * crMinimum         2\n </pre>\n <p>\n <pre>\n CardinalityRuleData\n
 * ruleName          maximumOfTenThings\n ruleTitle         The things
 * attribute must have a maximum of 10 things in it.\n applyToAttribute 
 * things\n applyToClass      SomethingWithThings\n crMaximum         10\n
 * </pre>
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
// Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:532)
public class CardinalityRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public CardinalityRuleDataDMW() {
        super(new CardinalityRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._CardinalityRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public CardinalityRuleDataDMW(DmcTypeModifierMV mods) {
        super(new CardinalityRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._CardinalityRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:634)
    public CardinalityRuleDataDMW getModificationRecorder(){
        CardinalityRuleDataDMW rc = new CardinalityRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public CardinalityRuleDataDMW(CardinalityRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._CardinalityRuleData);
    }

    public CardinalityRuleDataDMW cloneIt() {
        CardinalityRuleDataDMW rc = new CardinalityRuleDataDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public CardinalityRuleDataDMO getDMO() {
        return((CardinalityRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected CardinalityRuleDataDMW(CardinalityRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public RuleName getObjectName(){
        return(((CardinalityRuleDataDMO) core).getRuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((CardinalityRuleDataDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof CardinalityRuleDataDMW){
            return( getObjectName().equals( ((CardinalityRuleDataDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public AttributeDefinition getApplyToAttribute(){
        AttributeDefinitionREF ref = ((CardinalityRuleDataDMO) core).getApplyToAttribute();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((AttributeDefinition)ref.getObject().getContainer());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setApplyToAttribute(AttributeDefinition value) {
        ((CardinalityRuleDataDMO) core).setApplyToAttribute(value.getDMO());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     * @throws DmcValueException is the value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1419)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        ((CardinalityRuleDataDMO) core).setApplyToAttribute(value);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remApplyToAttribute(){
        ((CardinalityRuleDataDMO) core).remApplyToAttribute();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Double getCrMaximum(){
        return(((CardinalityRuleDataDMO) core).getCrMaximum());
    }

    /**
     * Sets crMaximum to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setCrMaximum(Object value) throws DmcValueException {
        ((CardinalityRuleDataDMO) core).setCrMaximum(value);
    }

    /**
     * Sets crMaximum to the specified value.
     * @param value Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setCrMaximum(Double value){
        ((CardinalityRuleDataDMO) core).setCrMaximum(value);
    }

    /**
     * Removes the crMaximum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remCrMaximum(){
        ((CardinalityRuleDataDMO) core).remCrMaximum();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Double getCrMinimum(){
        return(((CardinalityRuleDataDMO) core).getCrMinimum());
    }

    /**
     * Sets crMinimum to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setCrMinimum(Object value) throws DmcValueException {
        ((CardinalityRuleDataDMO) core).setCrMinimum(value);
    }

    /**
     * Sets crMinimum to the specified value.
     * @param value Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setCrMinimum(Double value){
        ((CardinalityRuleDataDMO) core).setCrMinimum(value);
    }

    /**
     * Removes the crMinimum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remCrMinimum(){
        ((CardinalityRuleDataDMO) core).remCrMinimum();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getDescriptionSize(){
        return(((CardinalityRuleDataDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getDescriptionIsEmpty(){
        if (((CardinalityRuleDataDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getDescriptionHasValue(){
        if (((CardinalityRuleDataDMO) core).getDescriptionSize() == 0)
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
        
        return(new StringIterableDMW(((CardinalityRuleDataDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addDescription(Object value) throws DmcValueException {
        ((CardinalityRuleDataDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addDescription(String value){
        ((CardinalityRuleDataDMO) core).addDescription(value);
    }

    /**
     * @param value A value compatible with String
     * @return true if the collection contains the description value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean descriptionContains(String value){
        return(((CardinalityRuleDataDMO) core).descriptionContains(value));
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
        ((CardinalityRuleDataDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delDescription(String value){
        ((CardinalityRuleDataDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remDescription(){
        ((CardinalityRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public RuleName getRuleName(){
        return(((CardinalityRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setRuleName(Object value) throws DmcValueException {
        ((CardinalityRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setRuleName(RuleName value){
        ((CardinalityRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remRuleName(){
        ((CardinalityRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getRuleTitle(){
        return(((CardinalityRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((CardinalityRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setRuleTitle(String value){
        ((CardinalityRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remRuleTitle(){
        ((CardinalityRuleDataDMO) core).remRuleTitle();
    }


}
