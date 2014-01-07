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
import java.util.ArrayList;                                                              // To support getMVCopy() - (BaseDMWGenerator.java:1105)
import java.util.Iterator;                                                               // Support copy of MV objects - (BaseDMWGenerator.java:2164)
import org.dmd.dmc.*;                                                                    // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dmc.types.RuleName;                                                       // Is named by - (BaseDMWGenerator.java:986)
import org.dmd.dms.AttributeDefinition;                                                  // Is reference type - (BaseDMWGenerator.java:1031)
import org.dmd.dms.ClassDefinition;                                                      // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.RuleData;                                                             // Derived class - (BaseDMWGenerator.java:1172)
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;                                 // For multi-valued adds of AttributeDefinition - (BaseDMWGenerator.java:1691)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                              // Attribute description from the meta schema - (BaseDMWGenerator.java:821)
import org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW;                         // For multi-valued AttributeDefinition - (BaseDMWGenerator.java:1633)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                      // For multi-valued String - (BaseDMWGenerator.java:2027)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                    // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;                                        // Attribute onePossibility from the dmv schema - (BaseDMWGenerator.java:821)
import org.dmd.dmv.shared.generated.dmo.OneOfTheseAttributesRequiredRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1176)



/**
 * java.util.AbstractList$Itr@6364cbde
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
public class OneOfTheseAttributesRequiredRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public OneOfTheseAttributesRequiredRuleDataDMW() {
        super(new OneOfTheseAttributesRequiredRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._OneOfTheseAttributesRequiredRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public OneOfTheseAttributesRequiredRuleDataDMW(DmcTypeModifierMV mods) {
        super(new OneOfTheseAttributesRequiredRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._OneOfTheseAttributesRequiredRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public OneOfTheseAttributesRequiredRuleDataDMW getModificationRecorder(){
        OneOfTheseAttributesRequiredRuleDataDMW rc = new OneOfTheseAttributesRequiredRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public OneOfTheseAttributesRequiredRuleDataDMW(OneOfTheseAttributesRequiredRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._OneOfTheseAttributesRequiredRuleData);
    }

    public OneOfTheseAttributesRequiredRuleDataDMW cloneIt() {
        OneOfTheseAttributesRequiredRuleDataDMW rc = new OneOfTheseAttributesRequiredRuleDataDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public OneOfTheseAttributesRequiredRuleDataDMO getDMO() {
        return((OneOfTheseAttributesRequiredRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected OneOfTheseAttributesRequiredRuleDataDMW(OneOfTheseAttributesRequiredRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1221)
    public RuleName getObjectName(){
        return(((OneOfTheseAttributesRequiredRuleDataDMO) core).getRuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((OneOfTheseAttributesRequiredRuleDataDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof OneOfTheseAttributesRequiredRuleDataDMW){
            return( getObjectName().equals( ((OneOfTheseAttributesRequiredRuleDataDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public Boolean isAndOnlyOne(){
        return(((OneOfTheseAttributesRequiredRuleDataDMO) core).isAndOnlyOne());
    }

    /**
     * Sets andOnlyOne to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setAndOnlyOne(Object value) throws DmcValueException {
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).setAndOnlyOne(value);
    }

    /**
     * Sets andOnlyOne to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setAndOnlyOne(Boolean value){
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).setAndOnlyOne(value);
    }

    /**
     * Removes the andOnlyOne attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remAndOnlyOne(){
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).remAndOnlyOne();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getDescriptionSize(){
        return(((OneOfTheseAttributesRequiredRuleDataDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getDescriptionIsEmpty(){
        if (((OneOfTheseAttributesRequiredRuleDataDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getDescriptionHasValue(){
        if (((OneOfTheseAttributesRequiredRuleDataDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2031)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((OneOfTheseAttributesRequiredRuleDataDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2057)
    public void addDescription(Object value) throws DmcValueException {
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2067)
    public void addDescription(String value){
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2124)
    public boolean descriptionContains(String value){
        return(((OneOfTheseAttributesRequiredRuleDataDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2168)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2195)
    public void delDescription(Object value) throws DmcValueException {
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2204)
    public void delDescription(String value){
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remDescription(){
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).remDescription();
    }

    /**
     * @return The number of AttributeDefinition items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getOnePossibilitySize(){
        return(((OneOfTheseAttributesRequiredRuleDataDMO) core).getOnePossibilitySize());
    }

    /**
     * @return true if there are no AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getOnePossibilityIsEmpty(){
        if (((OneOfTheseAttributesRequiredRuleDataDMO) core).getOnePossibilitySize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any AttributeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getOnePossibilityHasValue(){
        if (((OneOfTheseAttributesRequiredRuleDataDMO) core).getOnePossibilitySize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1640)
    public AttributeDefinitionIterableDMW getOnePossibilityIterable(){
        DmcAttribute<?> attr = core.get(DmvDMSAG.__onePossibility);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);
        
        return(new AttributeDefinitionIterableDMW(((OneOfTheseAttributesRequiredRuleDataDMO) core).getOnePossibility()));
    }

    /**
     * Adds another onePossibility value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1697)
    public DmcAttribute<?> addOnePossibility(AttributeDefinition value){
        DmcAttribute<?> attr = ((OneOfTheseAttributesRequiredRuleDataDMO) core).addOnePossibility(((AttributeDefinitionDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a onePossibility value.
     * @param value The AttributeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1747)
    public void delOnePossibility(AttributeDefinition value){
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).delOnePossibility(value.getDMO());
    }

    /**
     * @return A COPY of the collection of AttributeDefinition objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1811)
    public ArrayList<AttributeDefinition> getOnePossibilityCopy(){
        DmcAttribute<?> attr = ((OneOfTheseAttributesRequiredRuleDataDMO) core).get(DmvDMSAG.__onePossibility);
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remOnePossibility(){
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).remOnePossibility();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public RuleName getRuleName(){
        return(((OneOfTheseAttributesRequiredRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setRuleName(Object value) throws DmcValueException {
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setRuleName(RuleName value){
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remRuleName(){
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public String getRuleTitle(){
        return(((OneOfTheseAttributesRequiredRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setRuleTitle(String value){
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remRuleTitle(){
        ((OneOfTheseAttributesRequiredRuleDataDMO) core).remRuleTitle();
    }


}
