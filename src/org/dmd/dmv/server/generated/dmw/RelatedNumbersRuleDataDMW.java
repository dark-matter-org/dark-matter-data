package org.dmd.dmv.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import org.dmd.dmc.*;                                                      // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.types.RuleName;                                         // Is named by - (BaseDMWGenerator.java:985)
import org.dmd.dms.AttributeDefinition;                                    // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.dms.ClassDefinition;                                        // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.RuleData;                                               // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                 // Is reference type REF - (BaseDMWGenerator.java:1034)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor - (BaseDMWGenerator.java:994)
import org.dmd.dmv.shared.generated.dmo.RelatedNumbersRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)
import org.dmd.dmv.shared.generated.enums.NumericRelationEnum;             // Primitive type - (BaseDMWGenerator.java:1069)



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
 * that \n the relationship check fails.\n <p/>\n NOTE: this rule works by
 * implicitly converting the values of the attributes\n to type Double in
 * order to be able to compare apples to apples. However,\n if you are
 * dealing with large numeric values you may run into issues.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
public class RelatedNumbersRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public RelatedNumbersRuleDataDMW() {
        super(new RelatedNumbersRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._RelatedNumbersRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public RelatedNumbersRuleDataDMW(DmcTypeModifierMV mods) {
        super(new RelatedNumbersRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._RelatedNumbersRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public RelatedNumbersRuleDataDMW getModificationRecorder(){
        RelatedNumbersRuleDataDMW rc = new RelatedNumbersRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected RelatedNumbersRuleDataDMW(RelatedNumbersRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1216)
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

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getDescription(){
        return(((RelatedNumbersRuleDataDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setDescription(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setDescription(String value){
        ((RelatedNumbersRuleDataDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remDescription(){
        ((RelatedNumbersRuleDataDMO) core).remDescription();
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1353)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1438)
    public void setLhs(AttributeDefinition value) {
        ((RelatedNumbersRuleDataDMO) core).setLhs(value.getDMO());
    }

    /**
     * Sets the lhs to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1447)
    public void setLhs(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).setLhs(value);
    }

    /**
     * Removes the lhs attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remLhs(){
        ((RelatedNumbersRuleDataDMO) core).remLhs();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public NumericRelationEnum getNumericRelation(){
        return(((RelatedNumbersRuleDataDMO) core).getNumericRelation());
    }

    /**
     * Sets numericRelation to the specified value.
     * @param value A value compatible with DmcTypeNumericRelationEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setNumericRelation(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).setNumericRelation(value);
    }

    /**
     * Sets numericRelation to the specified value.
     * @param value NumericRelationEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setNumericRelation(NumericRelationEnum value){
        ((RelatedNumbersRuleDataDMO) core).setNumericRelation(value);
    }

    /**
     * Removes the numericRelation attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remNumericRelation(){
        ((RelatedNumbersRuleDataDMO) core).remNumericRelation();
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1353)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1438)
    public void setRhs(AttributeDefinition value) {
        ((RelatedNumbersRuleDataDMO) core).setRhs(value.getDMO());
    }

    /**
     * Sets the rhs to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1447)
    public void setRhs(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).setRhs(value);
    }

    /**
     * Removes the rhs attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remRhs(){
        ((RelatedNumbersRuleDataDMO) core).remRhs();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public RuleName getRuleName(){
        return(((RelatedNumbersRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setRuleName(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setRuleName(RuleName value){
        ((RelatedNumbersRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remRuleName(){
        ((RelatedNumbersRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getRuleTitle(){
        return(((RelatedNumbersRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((RelatedNumbersRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setRuleTitle(String value){
        ((RelatedNumbersRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remRuleTitle(){
        ((RelatedNumbersRuleDataDMO) core).remRuleTitle();
    }


}
