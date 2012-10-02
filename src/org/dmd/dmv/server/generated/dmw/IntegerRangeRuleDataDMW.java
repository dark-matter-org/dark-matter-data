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
import org.dmd.dmc.types.RuleName;                                       // Primitive type - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.AttributeDefinition;                                  // Is reference type - (BaseDMWGeneratorNewest.java:925)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:889)
import org.dmd.dms.RuleData;                                             // Derived class - (BaseDMWGeneratorNewest.java:1066)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:894)
import org.dmd.dms.generated.types.AttributeDefinitionREF;               // Is reference type REF - (BaseDMWGeneratorNewest.java:933)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:893)
import org.dmd.dmv.shared.generated.dmo.IntegerRangeRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)


/**
 * The IntegerRangeRule ensures that an Integer attribute has a value that
 * falls\n within a given range. The irrMinimum must be less than the
 * irrMaximum. An example usage\n might be:\n <p/>\n <pre>\n
 * IntegerRangeRuleData\n ruleName         <schema>RangeCheckY\n ruleTitle   
 *     Attribute Y in range 1-10\n applyToAttribute Y\n irrMinimum       1\n
 * irrMaximum       10\n description      This constraint is required because
 * blah, blah blah.\n </pre>
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class IntegerRangeRuleDataDMW extends RuleData {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public IntegerRangeRuleDataDMW() {
        super(new IntegerRangeRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._IntegerRangeRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public IntegerRangeRuleDataDMW(DmcTypeModifierMV mods) {
        super(new IntegerRangeRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._IntegerRangeRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public IntegerRangeRuleDataDMW getModificationRecorder(){
        IntegerRangeRuleDataDMW rc = new IntegerRangeRuleDataDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public IntegerRangeRuleDataDMW(IntegerRangeRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._IntegerRangeRuleData);
    }

    public IntegerRangeRuleDataDMO getDMO() {
        return((IntegerRangeRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected IntegerRangeRuleDataDMW(IntegerRangeRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1252)
    public AttributeDefinition getApplyToAttribute(){
        AttributeDefinitionREF ref = ((IntegerRangeRuleDataDMO) core).getApplyToAttribute();
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
        ((IntegerRangeRuleDataDMO) core).setApplyToAttribute(value.getDMO());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1346)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        ((IntegerRangeRuleDataDMO) core).setApplyToAttribute(value);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remApplyToAttribute(){
        ((IntegerRangeRuleDataDMO) core).remApplyToAttribute();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getDescription(){
        return(((IntegerRangeRuleDataDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setDescription(Object value) throws DmcValueException {
        ((IntegerRangeRuleDataDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setDescription(String value){
        ((IntegerRangeRuleDataDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remDescription(){
        ((IntegerRangeRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Integer getIrrMaximum(){
        return(((IntegerRangeRuleDataDMO) core).getIrrMaximum());
    }

    /**
     * Sets irrMaximum to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setIrrMaximum(Object value) throws DmcValueException {
        ((IntegerRangeRuleDataDMO) core).setIrrMaximum(value);
    }

    /**
     * Sets irrMaximum to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setIrrMaximum(Integer value){
        ((IntegerRangeRuleDataDMO) core).setIrrMaximum(value);
    }

    /**
     * Removes the irrMaximum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remIrrMaximum(){
        ((IntegerRangeRuleDataDMO) core).remIrrMaximum();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Integer getIrrMinimum(){
        return(((IntegerRangeRuleDataDMO) core).getIrrMinimum());
    }

    /**
     * Sets irrMinimum to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setIrrMinimum(Object value) throws DmcValueException {
        ((IntegerRangeRuleDataDMO) core).setIrrMinimum(value);
    }

    /**
     * Sets irrMinimum to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setIrrMinimum(Integer value){
        ((IntegerRangeRuleDataDMO) core).setIrrMinimum(value);
    }

    /**
     * Removes the irrMinimum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remIrrMinimum(){
        ((IntegerRangeRuleDataDMO) core).remIrrMinimum();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public RuleName getRuleName(){
        return(((IntegerRangeRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setRuleName(Object value) throws DmcValueException {
        ((IntegerRangeRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setRuleName(RuleName value){
        ((IntegerRangeRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remRuleName(){
        ((IntegerRangeRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getRuleTitle(){
        return(((IntegerRangeRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((IntegerRangeRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setRuleTitle(String value){
        ((IntegerRangeRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remRuleTitle(){
        ((IntegerRangeRuleDataDMO) core).remRuleTitle();
    }


}
