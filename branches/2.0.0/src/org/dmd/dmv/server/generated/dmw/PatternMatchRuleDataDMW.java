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
import org.dmd.dmv.shared.generated.dmo.PatternMatchRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)


/**
 * The PatternMatchRule allows you to validate that an attribute\n in an
 * object conforms to a regex patern that you specify. If the pattern match\n
 * fails, the ruleTitle is used as the error message, so use a clear rule
 * title to\n indicate the intent of the pattern match. For instance the
 * following rule is \n applied to the names of EnumDefinitions:\n <pre>\n
 * PatternMatchRuleData\n ruleName			dmvEnumDefinitionNameCheck\n
 * ruleTitle			An EnumDefinition's name must end with Enum\n
 * matchesPattern		^.*Enum\n applyToAttribute	name\n
 * applyToClass		EnumDefinition\n </pre>
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class PatternMatchRuleDataDMW extends RuleData {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public PatternMatchRuleDataDMW() {
        super(new PatternMatchRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._PatternMatchRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public PatternMatchRuleDataDMW(DmcTypeModifierMV mods) {
        super(new PatternMatchRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._PatternMatchRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public PatternMatchRuleDataDMW getModificationRecorder(){
        PatternMatchRuleDataDMW rc = new PatternMatchRuleDataDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public PatternMatchRuleDataDMW(PatternMatchRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._PatternMatchRuleData);
    }

    public PatternMatchRuleDataDMO getDMO() {
        return((PatternMatchRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected PatternMatchRuleDataDMW(PatternMatchRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1252)
    public AttributeDefinition getApplyToAttribute(){
        AttributeDefinitionREF ref = ((PatternMatchRuleDataDMO) core).getApplyToAttribute();
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
        ((PatternMatchRuleDataDMO) core).setApplyToAttribute(value.getDMO());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1346)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        ((PatternMatchRuleDataDMO) core).setApplyToAttribute(value);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remApplyToAttribute(){
        ((PatternMatchRuleDataDMO) core).remApplyToAttribute();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getDescription(){
        return(((PatternMatchRuleDataDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setDescription(Object value) throws DmcValueException {
        ((PatternMatchRuleDataDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setDescription(String value){
        ((PatternMatchRuleDataDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remDescription(){
        ((PatternMatchRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getMatchesPattern(){
        return(((PatternMatchRuleDataDMO) core).getMatchesPattern());
    }

    /**
     * Sets matchesPattern to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setMatchesPattern(Object value) throws DmcValueException {
        ((PatternMatchRuleDataDMO) core).setMatchesPattern(value);
    }

    /**
     * Sets matchesPattern to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setMatchesPattern(String value){
        ((PatternMatchRuleDataDMO) core).setMatchesPattern(value);
    }

    /**
     * Removes the matchesPattern attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remMatchesPattern(){
        ((PatternMatchRuleDataDMO) core).remMatchesPattern();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public RuleName getRuleName(){
        return(((PatternMatchRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setRuleName(Object value) throws DmcValueException {
        ((PatternMatchRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setRuleName(RuleName value){
        ((PatternMatchRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remRuleName(){
        ((PatternMatchRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getRuleTitle(){
        return(((PatternMatchRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((PatternMatchRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setRuleTitle(String value){
        ((PatternMatchRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remRuleTitle(){
        ((PatternMatchRuleDataDMO) core).remRuleTitle();
    }


}
