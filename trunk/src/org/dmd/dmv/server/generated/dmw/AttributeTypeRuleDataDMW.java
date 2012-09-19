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
import java.util.ArrayList;                                               // To support getMVCopy() - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dmc.*;                                                     // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dmc.types.RuleName;                                        // Primitive type - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.AttributeDefinition;                                   // Is reference type - (BaseDMWGeneratorNewest.java:925)
import org.dmd.dms.ClassDefinition;                                       // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:889)
import org.dmd.dms.RuleData;                                              // Derived class - (BaseDMWGeneratorNewest.java:1066)
import org.dmd.dms.TypeDefinition;                                        // Is reference type - (BaseDMWGeneratorNewest.java:925)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:894)
import org.dmd.dms.generated.dmo.TypeDefinitionDMO;                       // For multi-valued adds of TypeDefinition - (BaseDMWGeneratorNewest.java:1585)
import org.dmd.dms.generated.dmw.TypeDefinitionIterableDMW;               // For multi-valued TypeDefinition - (BaseDMWGeneratorNewest.java:1527)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                // Is reference type REF - (BaseDMWGeneratorNewest.java:933)
import org.dmd.dms.generated.types.ClassDefinitionREF;                    // Is reference type REF - (BaseDMWGeneratorNewest.java:933)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:893)
import org.dmd.dmv.shared.generated.dmo.AttributeTypeRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;                         // Attribute allowedType from the dmv schema - (BaseDMWGeneratorNewest.java:720)


/**
 * null
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class AttributeTypeRuleDataDMW extends RuleData {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public AttributeTypeRuleDataDMW() {
        super(new AttributeTypeRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._AttributeTypeRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public AttributeTypeRuleDataDMW(DmcTypeModifierMV mods) {
        super(new AttributeTypeRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._AttributeTypeRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public AttributeTypeRuleDataDMW getModificationRecorder(){
        AttributeTypeRuleDataDMW rc = new AttributeTypeRuleDataDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public AttributeTypeRuleDataDMW(AttributeTypeRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._AttributeTypeRuleData);
    }

    public AttributeTypeRuleDataDMO getDMO() {
        return((AttributeTypeRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected AttributeTypeRuleDataDMW(AttributeTypeRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of TypeDefinition items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1489)
    public int getAllowedTypeSize(){
        return(((AttributeTypeRuleDataDMO) core).getAllowedTypeSize());
    }

    /**
     * @return true if there are no TypeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1497)
    public boolean getAllowedTypeIsEmpty(){
        if (((AttributeTypeRuleDataDMO) core).getAllowedTypeSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TypeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1507)
    public boolean getAllowedTypeHasValue(){
        if (((AttributeTypeRuleDataDMO) core).getAllowedTypeSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public TypeDefinitionIterableDMW getAllowedTypeIterable(){
        DmcAttribute<?> attr = core.get(DmvDMSAG.__allowedType);
        if (attr == null)
            return(TypeDefinitionIterableDMW.emptyList);
        
        return(new TypeDefinitionIterableDMW(((AttributeTypeRuleDataDMO) core).getAllowedType()));
    }

    /**
     * Adds another allowedType value.
     * @param value A value compatible with TypeDefinition
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1591)
    public DmcAttribute<?> addAllowedType(TypeDefinition value){
        DmcAttribute<?> attr = ((AttributeTypeRuleDataDMO) core).addAllowedType(((TypeDefinitionDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a allowedType value.
     * @param value The TypeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1641)
    public void delAllowedType(TypeDefinition value){
        ((AttributeTypeRuleDataDMO) core).delAllowedType(value.getDMO());
    }

    /**
     * @return A COPY of the collection of TypeDefinition objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1703)
    public ArrayList<TypeDefinition> getAllowedTypeCopy(){
        DmcAttribute<?> attr = ((AttributeTypeRuleDataDMO) core).get(DmvDMSAG.__allowedType);
        if (attr == null)
            return(new ArrayList<TypeDefinition>());
        
        ArrayList<TypeDefinition> rc = new ArrayList<TypeDefinition>(attr.getMVSize());
        
        TypeDefinitionIterableDMW it = getAllowedTypeIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the allowedType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2106)
    public void remAllowedType(){
        ((AttributeTypeRuleDataDMO) core).remAllowedType();
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1252)
    public AttributeDefinition getApplyToAttribute(){
        AttributeDefinitionREF ref = ((AttributeTypeRuleDataDMO) core).getApplyToAttribute();
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
        ((AttributeTypeRuleDataDMO) core).setApplyToAttribute(value.getDMO());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1346)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        ((AttributeTypeRuleDataDMO) core).setApplyToAttribute(value);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remApplyToAttribute(){
        ((AttributeTypeRuleDataDMO) core).remApplyToAttribute();
    }

    /**
     * @return A ClassDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1252)
    public ClassDefinition getApplyToClass(){
        ClassDefinitionREF ref = ((AttributeTypeRuleDataDMO) core).getApplyToClass();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ClassDefinition)ref.getObject().getContainer());
    }

    /**
     * Sets the applyToClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public void setApplyToClass(ClassDefinition value) {
        ((AttributeTypeRuleDataDMO) core).setApplyToClass(value.getDMO());
    }

    /**
     * Sets the applyToClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1346)
    public void setApplyToClass(Object value) throws DmcValueException {
        ((AttributeTypeRuleDataDMO) core).setApplyToClass(value);
    }

    /**
     * Removes the applyToClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remApplyToClass(){
        ((AttributeTypeRuleDataDMO) core).remApplyToClass();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getDescription(){
        return(((AttributeTypeRuleDataDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setDescription(Object value) throws DmcValueException {
        ((AttributeTypeRuleDataDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setDescription(String value){
        ((AttributeTypeRuleDataDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remDescription(){
        ((AttributeTypeRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public RuleName getRuleName(){
        return(((AttributeTypeRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setRuleName(Object value) throws DmcValueException {
        ((AttributeTypeRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setRuleName(RuleName value){
        ((AttributeTypeRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remRuleName(){
        ((AttributeTypeRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getRuleTitle(){
        return(((AttributeTypeRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((AttributeTypeRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setRuleTitle(String value){
        ((AttributeTypeRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remRuleTitle(){
        ((AttributeTypeRuleDataDMO) core).remRuleTitle();
    }


}
