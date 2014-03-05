package org.dmd.dmv.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                                 // To support getMVCopy() - (BaseDMWGenerator.java:1181)
import java.util.Iterator;                                                                  // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                                                       // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.types.RuleName;                                                          // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.AttributeDefinition;                                                     // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.dms.ClassDefinition;                                                         // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.RuleData;                                                                // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;                                    // For multi-valued adds of AttributeDefinition - (BaseDMWGenerator.java:1767)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                 // Attribute description from the meta schema - (BaseDMWGenerator.java:897)
import org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW;                            // For multi-valued AttributeDefinition - (BaseDMWGenerator.java:1709)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                         // For multi-valued String - (BaseDMWGenerator.java:2103)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                       // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;                                           // Attribute onePossibility from the dmv schema - (BaseDMWGenerator.java:897)
import org.dmd.dmv.shared.generated.dmo.OnlyOneOfTheseAttributesAllowedRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)



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
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class OnlyOneOfTheseAttributesAllowedRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public OnlyOneOfTheseAttributesAllowedRuleDataDMW() {
        super(new OnlyOneOfTheseAttributesAllowedRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._OnlyOneOfTheseAttributesAllowedRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public OnlyOneOfTheseAttributesAllowedRuleDataDMW(DmcTypeModifierMV mods) {
        super(new OnlyOneOfTheseAttributesAllowedRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._OnlyOneOfTheseAttributesAllowedRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:615)
    public OnlyOneOfTheseAttributesAllowedRuleDataDMW getModificationRecorder(){
        OnlyOneOfTheseAttributesAllowedRuleDataDMW rc = new OnlyOneOfTheseAttributesAllowedRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public OnlyOneOfTheseAttributesAllowedRuleDataDMW(OnlyOneOfTheseAttributesAllowedRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._OnlyOneOfTheseAttributesAllowedRuleData);
    }

    public OnlyOneOfTheseAttributesAllowedRuleDataDMW cloneIt() {
        OnlyOneOfTheseAttributesAllowedRuleDataDMW rc = new OnlyOneOfTheseAttributesAllowedRuleDataDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public OnlyOneOfTheseAttributesAllowedRuleDataDMO getDMO() {
        return((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected OnlyOneOfTheseAttributesAllowedRuleDataDMW(OnlyOneOfTheseAttributesAllowedRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public RuleName getObjectName(){
        return(((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getRuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof OnlyOneOfTheseAttributesAllowedRuleDataDMW){
            return( getObjectName().equals( ((OnlyOneOfTheseAttributesAllowedRuleDataDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getDescriptionSize(){
        return(((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getDescriptionIsEmpty(){
        if (((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getDescriptionHasValue(){
        if (((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getDescriptionSize() == 0)
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
        
        return(new StringIterableDMW(((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addDescription(Object value) throws DmcValueException {
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addDescription(String value){
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean descriptionContains(String value){
        return(((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).descriptionContains(value));
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
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delDescription(String value){
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remDescription(){
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).remDescription();
    }

    /**
     * @return The number of AttributeDefinition items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getOnePossibilitySize(){
        return(((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getOnePossibilitySize());
    }

    /**
     * @return true if there are no AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getOnePossibilityIsEmpty(){
        if (((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getOnePossibilitySize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getOnePossibilityHasValue(){
        if (((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getOnePossibilitySize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1716)
    public AttributeDefinitionIterableDMW getOnePossibilityIterable(){
        DmcAttribute<?> attr = core.get(DmvDMSAG.__onePossibility);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);
        
        return(new AttributeDefinitionIterableDMW(((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getOnePossibility()));
    }

    /**
     * Adds another onePossibility value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1773)
    public DmcAttribute<?> addOnePossibility(AttributeDefinition value){
        DmcAttribute<?> attr = ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).addOnePossibility(((AttributeDefinitionDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a onePossibility value.
     * @param value The AttributeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1823)
    public void delOnePossibility(AttributeDefinition value){
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).delOnePossibility(value.getDMO());
    }

    /**
     * @return A COPY of the collection of AttributeDefinition objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1887)
    public ArrayList<AttributeDefinition> getOnePossibilityCopy(){
        DmcAttribute<?> attr = ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).get(DmvDMSAG.__onePossibility);
        if (attr == null)
            return(new ArrayList<AttributeDefinition>());
        
        ArrayList<AttributeDefinition> rc = new ArrayList<AttributeDefinition>(attr.getMVSize());
        
        AttributeDefinitionIterableDMW it = getOnePossibilityIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the onePossibility attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remOnePossibility(){
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).remOnePossibility();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public RuleName getRuleName(){
        return(((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setRuleName(Object value) throws DmcValueException {
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setRuleName(RuleName value){
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remRuleName(){
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getRuleTitle(){
        return(((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setRuleTitle(String value){
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remRuleTitle(){
        ((OnlyOneOfTheseAttributesAllowedRuleDataDMO) core).remRuleTitle();
    }


}
