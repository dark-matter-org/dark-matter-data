//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                      // Support for MULTI attribute - (BaseDMWGenerator.java:2119)
import java.util.Iterator;                                       // Support copy of MV objects - (BaseDMWGenerator.java:2133)
import org.dmd.dmc.*;                                            // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.RuleName;                               // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.RuleData;                                     // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dms.generated.dmo.MetaDMSAG;                      // Attribute description from the meta schema - (BaseDMWGenerator.java:910)
import org.dmd.dms.generated.dmw.StringIterableDMW;              // For multi-valued String - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmv.shared.generated.dmo.InitRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)



/**
 * The InitRule allows you to specify attribute values for a \n newly created
 * object or an object read from file or received in a CreateRequest\n (for
 * instance). The InitRule will only set the values of attributes that are\n
 * missing from the object; existing attributes are not alterred. An
 * example\n usage might be:\n <p>\n <pre>\n InitRuleData\n ruleName    
 * <schema>InitX\n ruleTitle    Initialize the X class\n applyToClass X\n
 * attributeA   some value\n attributeB   42\n attributeC   something\n
 * attributeC   something else\n description  This provides a good initial
 * setup for X objects. Other setups\n  may be required in other
 * circumstances.\n </pre>
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
// Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:532)
public class InitRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public InitRuleDataDMW() {
        super(new InitRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._InitRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public InitRuleDataDMW(DmcTypeModifierMV mods) {
        super(new InitRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._InitRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:634)
    public InitRuleDataDMW getModificationRecorder(){
        InitRuleDataDMW rc = new InitRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public InitRuleDataDMW(InitRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._InitRuleData);
    }

    public InitRuleDataDMO getDMO() {
        return((InitRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected InitRuleDataDMW(InitRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public RuleName getObjectName(){
        return(((InitRuleDataDMO) core).getRuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((InitRuleDataDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof InitRuleDataDMW){
            return( getObjectName().equals( ((InitRuleDataDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getDescriptionSize(){
        return(((InitRuleDataDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getDescriptionIsEmpty(){
        if (((InitRuleDataDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getDescriptionHasValue(){
        if (((InitRuleDataDMO) core).getDescriptionSize() == 0)
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
        
        return(new StringIterableDMW(((InitRuleDataDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addDescription(Object value) throws DmcValueException {
        ((InitRuleDataDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addDescription(String value){
        ((InitRuleDataDMO) core).addDescription(value);
    }

    /**
     * @param value A value compatible with String
     * @return true if the collection contains the description value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean descriptionContains(String value){
        return(((InitRuleDataDMO) core).descriptionContains(value));
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
        ((InitRuleDataDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delDescription(String value){
        ((InitRuleDataDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remDescription(){
        ((InitRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public RuleName getRuleName(){
        return(((InitRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setRuleName(Object value) throws DmcValueException {
        ((InitRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setRuleName(RuleName value){
        ((InitRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remRuleName(){
        ((InitRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getRuleTitle(){
        return(((InitRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((InitRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setRuleTitle(String value){
        ((InitRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remRuleTitle(){
        ((InitRuleDataDMO) core).remRuleTitle();
    }


}
