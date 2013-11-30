package org.dmd.dmv.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                             // To support getMVCopy() - (BaseDMWGenerator.java:1100)
import java.util.Iterator;                                              // Support copy of MV objects - (BaseDMWGenerator.java:2159)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.types.RuleName;                                      // Is named by - (BaseDMWGenerator.java:985)
import org.dmd.dms.AttributeDefinition;                                 // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.dms.ClassDefinition;                                     // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.RuleData;                                            // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Attribute description from the meta schema - (BaseDMWGenerator.java:821)
import org.dmd.dms.generated.dmw.StringIterableDMW;                     // For multi-valued String - (BaseDMWGenerator.java:2022)
import org.dmd.dms.generated.types.AttributeDefinitionREF;              // Is reference type REF - (BaseDMWGenerator.java:1034)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGenerator.java:994)
import org.dmd.dmv.shared.generated.dmo.ValueLengthRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)



/**
 * java.util.AbstractList$Itr@31a3ca10
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
public class ValueLengthRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public ValueLengthRuleDataDMW() {
        super(new ValueLengthRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._ValueLengthRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public ValueLengthRuleDataDMW(DmcTypeModifierMV mods) {
        super(new ValueLengthRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._ValueLengthRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public ValueLengthRuleDataDMW getModificationRecorder(){
        ValueLengthRuleDataDMW rc = new ValueLengthRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public ValueLengthRuleDataDMW(ValueLengthRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._ValueLengthRuleData);
    }

    public ValueLengthRuleDataDMW cloneIt() {
        ValueLengthRuleDataDMW rc = new ValueLengthRuleDataDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ValueLengthRuleDataDMO getDMO() {
        return((ValueLengthRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected ValueLengthRuleDataDMW(ValueLengthRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1216)
    public RuleName getObjectName(){
        return(((ValueLengthRuleDataDMO) core).getRuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ValueLengthRuleDataDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ValueLengthRuleDataDMW){
            return( getObjectName().equals( ((ValueLengthRuleDataDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1353)
    public AttributeDefinition getApplyToAttribute(){
        AttributeDefinitionREF ref = ((ValueLengthRuleDataDMO) core).getApplyToAttribute();
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1438)
    public void setApplyToAttribute(AttributeDefinition value) {
        ((ValueLengthRuleDataDMO) core).setApplyToAttribute(value.getDMO());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1447)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).setApplyToAttribute(value);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remApplyToAttribute(){
        ((ValueLengthRuleDataDMO) core).remApplyToAttribute();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getDescriptionSize(){
        return(((ValueLengthRuleDataDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getDescriptionIsEmpty(){
        if (((ValueLengthRuleDataDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getDescriptionHasValue(){
        if (((ValueLengthRuleDataDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ValueLengthRuleDataDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addDescription(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addDescription(String value){
        ((ValueLengthRuleDataDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean descriptionContains(String value){
        return(((ValueLengthRuleDataDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delDescription(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delDescription(String value){
        ((ValueLengthRuleDataDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remDescription(){
        ((ValueLengthRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Integer getMaxLength(){
        return(((ValueLengthRuleDataDMO) core).getMaxLength());
    }

    /**
     * Sets maxLength to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setMaxLength(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).setMaxLength(value);
    }

    /**
     * Sets maxLength to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setMaxLength(Integer value){
        ((ValueLengthRuleDataDMO) core).setMaxLength(value);
    }

    /**
     * Removes the maxLength attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remMaxLength(){
        ((ValueLengthRuleDataDMO) core).remMaxLength();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Integer getMinLength(){
        return(((ValueLengthRuleDataDMO) core).getMinLength());
    }

    /**
     * Sets minLength to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setMinLength(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).setMinLength(value);
    }

    /**
     * Sets minLength to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setMinLength(Integer value){
        ((ValueLengthRuleDataDMO) core).setMinLength(value);
    }

    /**
     * Removes the minLength attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remMinLength(){
        ((ValueLengthRuleDataDMO) core).remMinLength();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public RuleName getRuleName(){
        return(((ValueLengthRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setRuleName(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setRuleName(RuleName value){
        ((ValueLengthRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remRuleName(){
        ((ValueLengthRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getRuleTitle(){
        return(((ValueLengthRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setRuleTitle(String value){
        ((ValueLengthRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remRuleTitle(){
        ((ValueLengthRuleDataDMO) core).remRuleTitle();
    }


}
