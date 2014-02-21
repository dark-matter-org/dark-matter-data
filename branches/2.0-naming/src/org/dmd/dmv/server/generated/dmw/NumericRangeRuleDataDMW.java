package org.dmd.dmv.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                              // Support for MULTI attribute - (BaseDMWGenerator.java:2226)
import java.util.Iterator;                                               // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.types.RuleName;                                       // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.AttributeDefinition;                                  // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.RuleData;                                             // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Attribute description from the meta schema - (BaseDMWGenerator.java:897)
import org.dmd.dms.generated.dmw.StringIterableDMW;                      // For multi-valued String - (BaseDMWGenerator.java:2103)
import org.dmd.dms.generated.types.AttributeDefinitionREF;               // Is reference type REF - (BaseDMWGenerator.java:1115)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)



/**
 * The NumericRangeRule ensures that a numeric attribute has values\n that
 * fall within a given range. It can be used for both single-valued and
 * multi-valued\n attributes. The nrrMinimum must be less than the
 * nrrMaximum. An example usage\n might be:\n <p/>\n <pre>\n
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
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class NumericRangeRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public NumericRangeRuleDataDMW() {
        super(new NumericRangeRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._NumericRangeRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public NumericRangeRuleDataDMW(DmcTypeModifierMV mods) {
        super(new NumericRangeRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._NumericRangeRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:615)
    public NumericRangeRuleDataDMW getModificationRecorder(){
        NumericRangeRuleDataDMW rc = new NumericRangeRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public NumericRangeRuleDataDMW(NumericRangeRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._NumericRangeRuleData);
    }

    public NumericRangeRuleDataDMW cloneIt() {
        NumericRangeRuleDataDMW rc = new NumericRangeRuleDataDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public NumericRangeRuleDataDMO getDMO() {
        return((NumericRangeRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected NumericRangeRuleDataDMW(NumericRangeRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public RuleName getObjectName(){
        return(((NumericRangeRuleDataDMO) core).getRuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((NumericRangeRuleDataDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof NumericRangeRuleDataDMW){
            return( getObjectName().equals( ((NumericRangeRuleDataDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1434)
    public AttributeDefinition getApplyToAttribute(){
        AttributeDefinitionREF ref = ((NumericRangeRuleDataDMO) core).getApplyToAttribute();
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1519)
    public void setApplyToAttribute(AttributeDefinition value) {
        ((NumericRangeRuleDataDMO) core).setApplyToAttribute(value.getDMO());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1528)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).setApplyToAttribute(value);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remApplyToAttribute(){
        ((NumericRangeRuleDataDMO) core).remApplyToAttribute();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getDescriptionSize(){
        return(((NumericRangeRuleDataDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getDescriptionIsEmpty(){
        if (((NumericRangeRuleDataDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getDescriptionHasValue(){
        if (((NumericRangeRuleDataDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((NumericRangeRuleDataDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addDescription(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addDescription(String value){
        ((NumericRangeRuleDataDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean descriptionContains(String value){
        return(((NumericRangeRuleDataDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
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
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delDescription(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delDescription(String value){
        ((NumericRangeRuleDataDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remDescription(){
        ((NumericRangeRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public Double getNrrMaximum(){
        return(((NumericRangeRuleDataDMO) core).getNrrMaximum());
    }

    /**
     * Sets nrrMaximum to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setNrrMaximum(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).setNrrMaximum(value);
    }

    /**
     * Sets nrrMaximum to the specified value.
     * @param value Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setNrrMaximum(Double value){
        ((NumericRangeRuleDataDMO) core).setNrrMaximum(value);
    }

    /**
     * Removes the nrrMaximum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remNrrMaximum(){
        ((NumericRangeRuleDataDMO) core).remNrrMaximum();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public Double getNrrMinimum(){
        return(((NumericRangeRuleDataDMO) core).getNrrMinimum());
    }

    /**
     * Sets nrrMinimum to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setNrrMinimum(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).setNrrMinimum(value);
    }

    /**
     * Sets nrrMinimum to the specified value.
     * @param value Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setNrrMinimum(Double value){
        ((NumericRangeRuleDataDMO) core).setNrrMinimum(value);
    }

    /**
     * Removes the nrrMinimum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remNrrMinimum(){
        ((NumericRangeRuleDataDMO) core).remNrrMinimum();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public RuleName getRuleName(){
        return(((NumericRangeRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setRuleName(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setRuleName(RuleName value){
        ((NumericRangeRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remRuleName(){
        ((NumericRangeRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getRuleTitle(){
        return(((NumericRangeRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setRuleTitle(String value){
        ((NumericRangeRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remRuleTitle(){
        ((NumericRangeRuleDataDMO) core).remRuleTitle();
    }


}