//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.types.RuleName;                                       // Is named by - (BaseDMWGenerator.java:985)
import org.dmd.dms.AttributeDefinition;                                  // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.RuleData;                                             // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dms.generated.types.AttributeDefinitionREF;               // Is reference type REF - (BaseDMWGenerator.java:1034)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGenerator.java:994)
import org.dmd.dmv.shared.generated.dmo.PatternMatchRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)



/**
 * The PatternMatchRule allows you to validate that an attribute\n in an
 * object conforms to a regex pattern that you specify. If the pattern
 * match\n fails, the ruleTitle is used as the error message, so use a clear
 * rule title to\n indicate the intent of the pattern match. For instance the
 * following rule is \n applied to the names of EnumDefinitions:\n <pre>\n
 * PatternMatchRuleData\n ruleName          dmvEnumDefinitionNameCheck\n
 * ruleTitle         An EnumDefinition's name must end with Enum\n
 * matchesPattern    ^.*Enum\n applyToAttribute  name\n applyToClass     
 * EnumDefinition\n </pre>
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
public class PatternMatchRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public PatternMatchRuleDataDMW() {
        super(new PatternMatchRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._PatternMatchRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public PatternMatchRuleDataDMW(DmcTypeModifierMV mods) {
        super(new PatternMatchRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._PatternMatchRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public PatternMatchRuleDataDMW getModificationRecorder(){
        PatternMatchRuleDataDMW rc = new PatternMatchRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public PatternMatchRuleDataDMW(PatternMatchRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._PatternMatchRuleData);
    }

    public PatternMatchRuleDataDMW cloneIt() {
        PatternMatchRuleDataDMW rc = new PatternMatchRuleDataDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PatternMatchRuleDataDMO getDMO() {
        return((PatternMatchRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected PatternMatchRuleDataDMW(PatternMatchRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1216)
    public RuleName getObjectName(){
        return(((PatternMatchRuleDataDMO) core).getRuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((PatternMatchRuleDataDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof PatternMatchRuleDataDMW){
            return( getObjectName().equals( ((PatternMatchRuleDataDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1353)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1438)
    public void setApplyToAttribute(AttributeDefinition value) {
        ((PatternMatchRuleDataDMO) core).setApplyToAttribute(value.getDMO());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1447)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        ((PatternMatchRuleDataDMO) core).setApplyToAttribute(value);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remApplyToAttribute(){
        ((PatternMatchRuleDataDMO) core).remApplyToAttribute();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getDescription(){
        return(((PatternMatchRuleDataDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setDescription(Object value) throws DmcValueException {
        ((PatternMatchRuleDataDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setDescription(String value){
        ((PatternMatchRuleDataDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remDescription(){
        ((PatternMatchRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getMatchesPattern(){
        return(((PatternMatchRuleDataDMO) core).getMatchesPattern());
    }

    /**
     * Sets matchesPattern to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setMatchesPattern(Object value) throws DmcValueException {
        ((PatternMatchRuleDataDMO) core).setMatchesPattern(value);
    }

    /**
     * Sets matchesPattern to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setMatchesPattern(String value){
        ((PatternMatchRuleDataDMO) core).setMatchesPattern(value);
    }

    /**
     * Removes the matchesPattern attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remMatchesPattern(){
        ((PatternMatchRuleDataDMO) core).remMatchesPattern();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public RuleName getRuleName(){
        return(((PatternMatchRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setRuleName(Object value) throws DmcValueException {
        ((PatternMatchRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setRuleName(RuleName value){
        ((PatternMatchRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remRuleName(){
        ((PatternMatchRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getRuleTitle(){
        return(((PatternMatchRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((PatternMatchRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setRuleTitle(String value){
        ((PatternMatchRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remRuleTitle(){
        ((PatternMatchRuleDataDMO) core).remRuleTitle();
    }


}
