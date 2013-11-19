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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:365)
import java.util.ArrayList;                                                         // To support getMVCopy() - (BaseDMWGenerator.java:1073)
import org.dmd.dmc.*;                                                               // If any attributes - (BaseDMWGenerator.java:979)
import org.dmd.dmc.types.RuleName;                                                  // Is named by - (BaseDMWGenerator.java:958)
import org.dmd.dms.AttributeDefinition;                                             // Is reference type - (BaseDMWGenerator.java:999)
import org.dmd.dms.ClassDefinition;                                                 // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:963)
import org.dmd.dms.RuleData;                                                        // Derived class - (BaseDMWGenerator.java:1140)
import org.dmd.dms.TypeDefinition;                                                  // Is reference type - (BaseDMWGenerator.java:999)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor - (BaseDMWGenerator.java:968)
import org.dmd.dms.generated.dmo.TypeDefinitionDMO;                                 // For multi-valued adds of TypeDefinition - (BaseDMWGenerator.java:1659)
import org.dmd.dms.generated.dmw.TypeDefinitionIterableDMW;                         // For multi-valued TypeDefinition - (BaseDMWGenerator.java:1601)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                   // Primitive type - (BaseDMWGenerator.java:1042)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                          // Is reference type REF - (BaseDMWGenerator.java:1007)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (BaseDMWGenerator.java:967)
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;                                   // Attribute allowedType from the dmv schema - (BaseDMWGenerator.java:794)
import org.dmd.dmv.shared.generated.dmo.ReferencedAttributeTypeRuleDataDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1144)



/**
 * The ReferencedAttributeTypeRule allowes you to restrict the type of\n an
 * attribute referred to by an AttributeDefinition reference. Some examples
 * include:\n <pre>\n ReferencedAttributeTypeRuleData\n ruleName         
 * dmvNRRApplyToAttribute\n ruleTitle         The applyToAttribute attribute
 * in a NumericRangeRuleData instance must refer to an Integer, Long, Float
 * or Double attribute\n applyToAttribute  applyToAttribute\n applyToClass   
 *   NumericRangeRuleData\n allowedType       Integer\n allowedType      
 * Long\n allowedType       Float\n allowedType       Double\n </pre>\n In
 * this case, we're restricting the applyToAttribute to be a numeric type,
 * either Integer, Long Float or Double.\n <p/>\n You can also restrict the
 * valueType of an attribute reference, for instance:\n <pre>\n
 * ReferencedAttributeTypeRuleData\n ruleName          dmvLhs\n ruleTitle    
 *     The lhs attribute must be a single valued Integer, Long, Float or
 * Double\n applyToAttribute  lhs\n applyToClass     
 * RelatedNumbersRuleData\n allowedType       Integer\n allowedType      
 * Long\n allowedType       Float\n allowedType       Double\n
 * allowedValueType  SINGLE\n </pre>\n Here, we're indicating that the lhs
 * (left hand side) attribute must be single valued.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:391)
 */
public class ReferencedAttributeTypeRuleDataDMW extends RuleData implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:470)
    public ReferencedAttributeTypeRuleDataDMW() {
        super(new ReferencedAttributeTypeRuleDataDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._ReferencedAttributeTypeRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:476)
    public ReferencedAttributeTypeRuleDataDMW(DmcTypeModifierMV mods) {
        super(new ReferencedAttributeTypeRuleDataDMO(mods), org.dmd.dmv.server.generated.DmvSchemaAG._ReferencedAttributeTypeRuleData);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:527)
    public ReferencedAttributeTypeRuleDataDMW getModificationRecorder(){
        ReferencedAttributeTypeRuleDataDMW rc = new ReferencedAttributeTypeRuleDataDMW();
        rc.setRuleName(getRuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public ReferencedAttributeTypeRuleDataDMW(ReferencedAttributeTypeRuleDataDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._ReferencedAttributeTypeRuleData);
    }

    public ReferencedAttributeTypeRuleDataDMW cloneIt() {
        ReferencedAttributeTypeRuleDataDMW rc = new ReferencedAttributeTypeRuleDataDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ReferencedAttributeTypeRuleDataDMO getDMO() {
        return((ReferencedAttributeTypeRuleDataDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:554)
    protected ReferencedAttributeTypeRuleDataDMW(ReferencedAttributeTypeRuleDataDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1189)
    public RuleName getObjectName(){
        return(((ReferencedAttributeTypeRuleDataDMO) core).getRuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ReferencedAttributeTypeRuleDataDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ReferencedAttributeTypeRuleDataDMW){
            return( getObjectName().equals( ((ReferencedAttributeTypeRuleDataDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of TypeDefinition items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1563)
    public int getAllowedTypeSize(){
        return(((ReferencedAttributeTypeRuleDataDMO) core).getAllowedTypeSize());
    }

    /**
     * @return true if there are no TypeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1571)
    public boolean getAllowedTypeIsEmpty(){
        if (((ReferencedAttributeTypeRuleDataDMO) core).getAllowedTypeSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TypeDefinitionDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1581)
    public boolean getAllowedTypeHasValue(){
        if (((ReferencedAttributeTypeRuleDataDMO) core).getAllowedTypeSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public TypeDefinitionIterableDMW getAllowedTypeIterable(){
        DmcAttribute<?> attr = core.get(DmvDMSAG.__allowedType);
        if (attr == null)
            return(TypeDefinitionIterableDMW.emptyList);
        
        return(new TypeDefinitionIterableDMW(((ReferencedAttributeTypeRuleDataDMO) core).getAllowedType()));
    }

    /**
     * Adds another allowedType value.
     * @param value A value compatible with TypeDefinition
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1665)
    public DmcAttribute<?> addAllowedType(TypeDefinition value){
        DmcAttribute<?> attr = ((ReferencedAttributeTypeRuleDataDMO) core).addAllowedType(((TypeDefinitionDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a allowedType value.
     * @param value The TypeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1715)
    public void delAllowedType(TypeDefinition value){
        ((ReferencedAttributeTypeRuleDataDMO) core).delAllowedType(value.getDMO());
    }

    /**
     * @return A COPY of the collection of TypeDefinition objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1779)
    public ArrayList<TypeDefinition> getAllowedTypeCopy(){
        DmcAttribute<?> attr = ((ReferencedAttributeTypeRuleDataDMO) core).get(DmvDMSAG.__allowedType);
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2184)
    public void remAllowedType(){
        ((ReferencedAttributeTypeRuleDataDMO) core).remAllowedType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public ValueTypeEnum getAllowedValueType(){
        return(((ReferencedAttributeTypeRuleDataDMO) core).getAllowedValueType());
    }

    /**
     * Sets allowedValueType to the specified value.
     * @param value A value compatible with DmcTypeValueTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setAllowedValueType(Object value) throws DmcValueException {
        ((ReferencedAttributeTypeRuleDataDMO) core).setAllowedValueType(value);
    }

    /**
     * Sets allowedValueType to the specified value.
     * @param value ValueTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setAllowedValueType(ValueTypeEnum value){
        ((ReferencedAttributeTypeRuleDataDMO) core).setAllowedValueType(value);
    }

    /**
     * Removes the allowedValueType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remAllowedValueType(){
        ((ReferencedAttributeTypeRuleDataDMO) core).remAllowedValueType();
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1326)
    public AttributeDefinition getApplyToAttribute(){
        AttributeDefinitionREF ref = ((ReferencedAttributeTypeRuleDataDMO) core).getApplyToAttribute();
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1411)
    public void setApplyToAttribute(AttributeDefinition value) {
        ((ReferencedAttributeTypeRuleDataDMO) core).setApplyToAttribute(value.getDMO());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1420)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        ((ReferencedAttributeTypeRuleDataDMO) core).setApplyToAttribute(value);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remApplyToAttribute(){
        ((ReferencedAttributeTypeRuleDataDMO) core).remApplyToAttribute();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public String getDescription(){
        return(((ReferencedAttributeTypeRuleDataDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setDescription(Object value) throws DmcValueException {
        ((ReferencedAttributeTypeRuleDataDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setDescription(String value){
        ((ReferencedAttributeTypeRuleDataDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remDescription(){
        ((ReferencedAttributeTypeRuleDataDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public RuleName getRuleName(){
        return(((ReferencedAttributeTypeRuleDataDMO) core).getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setRuleName(Object value) throws DmcValueException {
        ((ReferencedAttributeTypeRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setRuleName(RuleName value){
        ((ReferencedAttributeTypeRuleDataDMO) core).setRuleName(value);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remRuleName(){
        ((ReferencedAttributeTypeRuleDataDMO) core).remRuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public String getRuleTitle(){
        return(((ReferencedAttributeTypeRuleDataDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((ReferencedAttributeTypeRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setRuleTitle(String value){
        ((ReferencedAttributeTypeRuleDataDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remRuleTitle(){
        ((ReferencedAttributeTypeRuleDataDMO) core).remRuleTitle();
    }


}
