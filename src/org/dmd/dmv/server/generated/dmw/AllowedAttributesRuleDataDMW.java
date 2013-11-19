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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:365)
import org.dmd.dmc.*;                                                         // If any attributes - (BaseDMWGenerator.java:979)
import org.dmd.dmc.types.RuleName;                                            // Is named by - (BaseDMWGenerator.java:958)
import org.dmd.dms.ClassDefinition;                                           // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:963)
import org.dmd.dms.RuleData;                                                  // Derived class - (BaseDMWGenerator.java:1140)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor - (BaseDMWGenerator.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor - (BaseDMWGenerator.java:967)
import org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1144)



/**
 * The AllowedAttributesRule will determine whether or not the \n attributes
 * of a DMO conform to the must/may specification of its class definition.\n
 * For classes of type EXTENSIBLE, only the must have attributes are
 * checked.\n <p/>\n Regardless of the environment in which you are running,
 * you must ensure that the\n DmcOmni has been loaded with the appropriate
 * schema. If you are using the dark-matter\n Model View Whatever (MVW)
 * project for GWT, this aspect is taken care of automatically.\n <p/>\n
 * Since this is a GLOBAL class rule, there will only ever be a single
 * instance of\n this rule created as part of the dmv schema, as indicated
 * below:\n <pre>\n AllowedAttributesRuleData\n ruleName   
 * dmvAllowedAttributes\n ruleTitle 	 An object's attributes must conform to
 * its schema.\n description Ensures that must/may attribute rules are
 * followed.\n </pre>
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:391)
 */
public class AllowedAttributesRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:470)
    public AllowedAttributesRuleDataDMW() {
        super(new AllowedAttributesRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._AllowedAttributesRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:476)
    public AllowedAttributesRuleDataDMW(DmcTypeModifierMV mods) {
        super(new AllowedAttributesRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._AllowedAttributesRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:527)
    public AllowedAttributesRuleDataDMW getModificationRecorder(){
        AllowedAttributesRuleDataDMW rc = new AllowedAttributesRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public AllowedAttributesRuleDataDMW(AllowedAttributesRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._AllowedAttributesRuleData);
    }

    public AllowedAttributesRuleDataDMW cloneIt() {
        AllowedAttributesRuleDataDMW rc = new AllowedAttributesRuleDataDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public AllowedAttributesRuleDataDMO getDMO() {
        return((AllowedAttributesRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:554)
    protected AllowedAttributesRuleDataDMW(AllowedAttributesRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1189)
    public RuleName getObjectName(){
        return(((AllowedAttributesRuleDataDMO) core).getRuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((AllowedAttributesRuleDataDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof AllowedAttributesRuleDataDMW){
            return( getObjectName().equals( ((AllowedAttributesRuleDataDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public String getDescription(){
        return(((AllowedAttributesRuleDataDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setDescription(Object value) throws DmcValueException {
        ((AllowedAttributesRuleDataDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setDescription(String value){
        ((AllowedAttributesRuleDataDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remDescription(){
        ((AllowedAttributesRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public RuleName getRuleName(){
        return(((AllowedAttributesRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setRuleName(Object value) throws DmcValueException {
        ((AllowedAttributesRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setRuleName(RuleName value){
        ((AllowedAttributesRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remRuleName(){
        ((AllowedAttributesRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public String getRuleTitle(){
        return(((AllowedAttributesRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((AllowedAttributesRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setRuleTitle(String value){
        ((AllowedAttributesRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remRuleTitle(){
        ((AllowedAttributesRuleDataDMO) core).remRuleTitle();
    }


}
