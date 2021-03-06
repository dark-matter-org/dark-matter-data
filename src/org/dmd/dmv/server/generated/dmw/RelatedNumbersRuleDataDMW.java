package org.dmd.dmv.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                // Support for MULTI attribute - (BaseDMWGenerator.java:2119)
import java.util.Iterator;                                                 // Support copy of MV objects - (BaseDMWGenerator.java:2133)
import org.dmd.dmc.*;                                                      // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.RuleName;                                         // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.AttributeDefinition;                                    // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.dms.ClassDefinition;                                        // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.RuleData;                                               // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Attribute description from the meta schema - (BaseDMWGenerator.java:910)
import org.dmd.dms.generated.dmw.StringIterableDMW;                        // For multi-valued String - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                 // Is reference type REF - (BaseDMWGenerator.java:1005)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmv.shared.generated.dmo.RelatedNumbersRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmv.shared.generated.enums.NumericRelationEnum;             // Primitive type - (BaseDMWGenerator.java:1040)



/**
 * The RelatedNumbersRule ensures that a particular numeric\n relationship
 * exists between two single-valued, numeric values on an object.\n An
 * example usage might be:\n <pre>\n RelatedNumbersRuleData\n ruleName       
 * dmvHeightGirth\n ruleTitle       Your height must exceed your girth.\n
 * applyToClass    Person\n lhs             height\n rhs             girth\n
 * numericRelation GT\n description     If your girth exceeds your height,
 * you're in trouble!\n </pre>\n The rule will only test the relationship if
 * both attributes exist; if not,\n that's okay - the rule will pass.\n <p>\n
 * It's a good rule of thumb to indicate the relationship you expect in the\n
 * title of the rule since this is what will be returned in the case that \n
 * the relationship check fails.\n <p>\n NOTE: this rule works by implicitly
 * converting the values of the attributes\n to type Double in order to be
 * able to compare apples to apples. However,\n if you are dealing with large
 * numeric values you may run into issues.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
// Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:532)
public class RelatedNumbersRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public RelatedNumbersRuleDataDMW() {
        super(new RelatedNumbersRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._RelatedNumbersRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public RelatedNumbersRuleDataDMW(DmcTypeModifierMV mods) {
        super(new RelatedNumbersRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._RelatedNumbersRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:634)
    public RelatedNumbersRuleDataDMW getModificationRecorder(){
        RelatedNumbersRuleDataDMW rc = new RelatedNumbersRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public RelatedNumbersRuleDataDMW(RelatedNumbersRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._RelatedNumbersRuleData);
    }

    public RelatedNumbersRuleDataDMW cloneIt() {
        RelatedNumbersRuleDataDMW rc = new RelatedNumbersRuleDataDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public RelatedNumbersRuleDataDMO getDMO() {
        return((RelatedNumbersRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected RelatedNumbersRuleDataDMW(RelatedNumbersRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public RuleName getObjectName(){
        return(((RelatedNumbersRuleDataDMO) core).getRuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((RelatedNumbersRuleDataDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof RelatedNumbersRuleDataDMW){
            return( getObjectName().equals( ((RelatedNumbersRuleDataDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getDescriptionSize(){
        return(((RelatedNumbersRuleDataDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getDescriptionIsEmpty(){
        if (((RelatedNumbersRuleDataDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getDescriptionHasValue(){
        if (((RelatedNumbersRuleDataDMO) core).getDescriptionSize() == 0)
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
        
        return(new StringIterableDMW(((RelatedNumbersRuleDataDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addDescription(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addDescription(String value){
        ((RelatedNumbersRuleDataDMO) core).addDescription(value);
    }

    /**
     * @param value A value compatible with String
     * @return true if the collection contains the description value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean descriptionContains(String value){
        return(((RelatedNumbersRuleDataDMO) core).descriptionContains(value));
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
        ((RelatedNumbersRuleDataDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delDescription(String value){
        ((RelatedNumbersRuleDataDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remDescription(){
        ((RelatedNumbersRuleDataDMO) core).remDescription();
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public AttributeDefinition getLhs(){
        AttributeDefinitionREF ref = ((RelatedNumbersRuleDataDMO) core).getLhs();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((AttributeDefinition)ref.getObject().getContainer());
    }

    /**
     * Sets the lhs to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setLhs(AttributeDefinition value) {
        ((RelatedNumbersRuleDataDMO) core).setLhs(value.getDMO());
    }

    /**
     * Sets the lhs to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     * @throws DmcValueException is the value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1419)
    public void setLhs(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).setLhs(value);
    }

    /**
     * Removes the lhs attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remLhs(){
        ((RelatedNumbersRuleDataDMO) core).remLhs();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public NumericRelationEnum getNumericRelation(){
        return(((RelatedNumbersRuleDataDMO) core).getNumericRelation());
    }

    /**
     * Sets numericRelation to the specified value.
     * @param value A value compatible with DmcTypeNumericRelationEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setNumericRelation(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).setNumericRelation(value);
    }

    /**
     * Sets numericRelation to the specified value.
     * @param value NumericRelationEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setNumericRelation(NumericRelationEnum value){
        ((RelatedNumbersRuleDataDMO) core).setNumericRelation(value);
    }

    /**
     * Removes the numericRelation attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remNumericRelation(){
        ((RelatedNumbersRuleDataDMO) core).remNumericRelation();
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public AttributeDefinition getRhs(){
        AttributeDefinitionREF ref = ((RelatedNumbersRuleDataDMO) core).getRhs();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((AttributeDefinition)ref.getObject().getContainer());
    }

    /**
     * Sets the rhs to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setRhs(AttributeDefinition value) {
        ((RelatedNumbersRuleDataDMO) core).setRhs(value.getDMO());
    }

    /**
     * Sets the rhs to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     * @throws DmcValueException is the value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1419)
    public void setRhs(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).setRhs(value);
    }

    /**
     * Removes the rhs attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remRhs(){
        ((RelatedNumbersRuleDataDMO) core).remRhs();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public RuleName getRuleName(){
        return(((RelatedNumbersRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setRuleName(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setRuleName(RuleName value){
        ((RelatedNumbersRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remRuleName(){
        ((RelatedNumbersRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getRuleTitle(){
        return(((RelatedNumbersRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setRuleTitle(String value){
        ((RelatedNumbersRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remRuleTitle(){
        ((RelatedNumbersRuleDataDMO) core).remRuleTitle();
    }


}
