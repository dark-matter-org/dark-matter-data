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
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:365)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dmc.types.RuleName;                                      // Is named by - (BaseDMWGeneratorNewest.java:958)
import org.dmd.dms.AttributeDefinition;                                 // Is reference type - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dms.ClassDefinition;                                     // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.RuleData;                                            // Derived class - (BaseDMWGeneratorNewest.java:1140)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.types.AttributeDefinitionREF;              // Is reference type REF - (BaseDMWGeneratorNewest.java:1007)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmv.shared.generated.dmo.ValueLengthRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)



/**
 * The ValueLengthRule allows you to indicate the maximum length,\n the
 * minimum length or both the maximum and minimum length of the String form
 * of\n a value associated with an attribute. It works for both single valued
 * and\n multi-valued attributes.\n <p/>\n If you have added types via the
 * TypeDefinition mechanisms,\n you should ensure that you have overloaded
 * the toString() method \n <pre>\n ValueLengthRuleData\n ruleName        
 * userNameLength\n ruleTitle        The user name must be between 6 and 20
 * characters\n applyToAttribute userNameString\n minLength        6\n
 * maxLength        20\n </pre>\n Or, just a minimum length:\n <pre>\n
 * ValueLengthRuleData\n ruleName         tagLength\n ruleTitle        Tag
 * information must be 4 characters or more.\n applyToAttribute dataTag\n
 * applyToClass     chunkOfData\n minLength        4\n </pre>\n Or, just a
 * maximum length:\n <pre>\n ValueLengthRuleData\n ruleName        
 * infoLength\n ruleTitle        The info must be less than or equal to 50
 * characters.\n applyToAttribute info\n applyToClass     chunkOfData\n
 * maxLength        50\n </pre>\n NOTE: If you have added types via the
 * TypeDefinition mechanisms, you should ensure\n that you have overloaded
 * the toString() method of the primitiveType that\n you're using.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
public class ValueLengthRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public ValueLengthRuleDataDMW() {
        super(new ValueLengthRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._ValueLengthRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public ValueLengthRuleDataDMW(DmcTypeModifierMV mods) {
        super(new ValueLengthRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._ValueLengthRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    public ValueLengthRuleDataDMW getModificationRecorder(){
        ValueLengthRuleDataDMW rc = new ValueLengthRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected ValueLengthRuleDataDMW(ValueLengthRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1189)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1326)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setApplyToAttribute(AttributeDefinition value) {
        ((ValueLengthRuleDataDMO) core).setApplyToAttribute(value.getDMO());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1420)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).setApplyToAttribute(value);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remApplyToAttribute(){
        ((ValueLengthRuleDataDMO) core).remApplyToAttribute();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public String getDescription(){
        return(((ValueLengthRuleDataDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setDescription(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setDescription(String value){
        ((ValueLengthRuleDataDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remDescription(){
        ((ValueLengthRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public Integer getMaxLength(){
        return(((ValueLengthRuleDataDMO) core).getMaxLength());
    }

    /**
     * Sets maxLength to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setMaxLength(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).setMaxLength(value);
    }

    /**
     * Sets maxLength to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setMaxLength(Integer value){
        ((ValueLengthRuleDataDMO) core).setMaxLength(value);
    }

    /**
     * Removes the maxLength attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remMaxLength(){
        ((ValueLengthRuleDataDMO) core).remMaxLength();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public Integer getMinLength(){
        return(((ValueLengthRuleDataDMO) core).getMinLength());
    }

    /**
     * Sets minLength to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setMinLength(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).setMinLength(value);
    }

    /**
     * Sets minLength to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setMinLength(Integer value){
        ((ValueLengthRuleDataDMO) core).setMinLength(value);
    }

    /**
     * Removes the minLength attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remMinLength(){
        ((ValueLengthRuleDataDMO) core).remMinLength();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public RuleName getRuleName(){
        return(((ValueLengthRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setRuleName(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setRuleName(RuleName value){
        ((ValueLengthRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remRuleName(){
        ((ValueLengthRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public String getRuleTitle(){
        return(((ValueLengthRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((ValueLengthRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setRuleTitle(String value){
        ((ValueLengthRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remRuleTitle(){
        ((ValueLengthRuleDataDMO) core).remRuleTitle();
    }


}
