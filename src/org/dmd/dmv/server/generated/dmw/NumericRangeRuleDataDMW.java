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
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dmc.types.RuleName;                                       // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.AttributeDefinition;                                  // Is reference type - (BaseDMWGeneratorNewest.java:925)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:889)
import org.dmd.dms.RuleData;                                             // Derived class - (BaseDMWGeneratorNewest.java:1066)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:894)
import org.dmd.dms.generated.types.AttributeDefinitionREF;               // Is reference type REF - (BaseDMWGeneratorNewest.java:933)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:893)
import org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)


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
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class NumericRangeRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public NumericRangeRuleDataDMW() {
        super(new NumericRangeRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._NumericRangeRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public NumericRangeRuleDataDMW(DmcTypeModifierMV mods) {
        super(new NumericRangeRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._NumericRangeRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:500)
    public NumericRangeRuleDataDMW getModificationRecorder(){
        NumericRangeRuleDataDMW rc = new NumericRangeRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public NumericRangeRuleDataDMW(NumericRangeRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._NumericRangeRuleData);
    }

    public NumericRangeRuleDataDMO getDMO() {
        return((NumericRangeRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected NumericRangeRuleDataDMW(NumericRangeRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1115)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1252)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public void setApplyToAttribute(AttributeDefinition value) {
        ((NumericRangeRuleDataDMO) core).setApplyToAttribute(value.getDMO());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1346)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).setApplyToAttribute(value);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remApplyToAttribute(){
        ((NumericRangeRuleDataDMO) core).remApplyToAttribute();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getDescription(){
        return(((NumericRangeRuleDataDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setDescription(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setDescription(String value){
        ((NumericRangeRuleDataDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remDescription(){
        ((NumericRangeRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Double getNrrMaximum(){
        return(((NumericRangeRuleDataDMO) core).getNrrMaximum());
    }

    /**
     * Sets nrrMaximum to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setNrrMaximum(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).setNrrMaximum(value);
    }

    /**
     * Sets nrrMaximum to the specified value.
     * @param value Double
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setNrrMaximum(Double value){
        ((NumericRangeRuleDataDMO) core).setNrrMaximum(value);
    }

    /**
     * Removes the nrrMaximum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remNrrMaximum(){
        ((NumericRangeRuleDataDMO) core).remNrrMaximum();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Double getNrrMinimum(){
        return(((NumericRangeRuleDataDMO) core).getNrrMinimum());
    }

    /**
     * Sets nrrMinimum to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setNrrMinimum(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).setNrrMinimum(value);
    }

    /**
     * Sets nrrMinimum to the specified value.
     * @param value Double
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setNrrMinimum(Double value){
        ((NumericRangeRuleDataDMO) core).setNrrMinimum(value);
    }

    /**
     * Removes the nrrMinimum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remNrrMinimum(){
        ((NumericRangeRuleDataDMO) core).remNrrMinimum();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public RuleName getRuleName(){
        return(((NumericRangeRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setRuleName(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setRuleName(RuleName value){
        ((NumericRangeRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remRuleName(){
        ((NumericRangeRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getRuleTitle(){
        return(((NumericRangeRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((NumericRangeRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setRuleTitle(String value){
        ((NumericRangeRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remRuleTitle(){
        ((NumericRangeRuleDataDMO) core).remRuleTitle();
    }


}
