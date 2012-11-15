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
package org.dmd.dmv.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                                // Always required - (GenUtility.java:220)
import java.util.*;                                                         // Always required if we have any MV attributes - (GenUtility.java:215)
import org.dmd.dmc.DmcAttribute;                                            // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcOmni;                                                 // Lazy resolution - (GenUtility.java:316)
import org.dmd.dmc.DmcSliceInfo;                                            // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                                       // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.RuleName;                                          // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;                    // Type specific set/add - (GenUtility.java:303)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                 // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.dmo.RuleDataDMO;                               // Base class - (GenUtility.java:351)
import org.dmd.dms.generated.dmo.TypeDefinitionDMO;                         // Type specific set/add - (GenUtility.java:303)
import org.dmd.dms.generated.enums.ValueTypeEnum;                           // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                  // Helper class - (GenUtility.java:331)
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;         // Reference type - (GenUtility.java:296)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dms.generated.types.DmcTypeRuleNameSV;                       // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringSV;                         // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeTypeDefinitionREFMV;              // Reference type - (GenUtility.java:296)
import org.dmd.dms.generated.types.DmcTypeValueTypeEnumSV;                  // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.TypeDefinitionREF;                       // Helper class - (GenUtility.java:331)

/**
 * The AttributeTypeRule allowes you to restrict the type of\n an attribute
 * of a particular AttributeDefinition reference.\n <p/>
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class AttributeTypeRuleDataDMO  extends RuleDataDMO  implements Serializable  {

    public final static String constructionClassName = "AttributeTypeRuleData";


    static {
    }

    public AttributeTypeRuleDataDMO() {
        super("AttributeTypeRuleData");
    }

    protected AttributeTypeRuleDataDMO(String oc) {
        super(oc);
    }

    @Override
    public AttributeTypeRuleDataDMO getNew(){
        AttributeTypeRuleDataDMO rc = new AttributeTypeRuleDataDMO();
        return(rc);
    }

    @Override
    public AttributeTypeRuleDataDMO getSlice(DmcSliceInfo info){
        AttributeTypeRuleDataDMO rc = new AttributeTypeRuleDataDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public AttributeTypeRuleDataDMO(DmcTypeModifierMV mods) {
        super("AttributeTypeRuleData");
        modrec(true);
        setModifier(mods);
    }

    public AttributeTypeRuleDataDMO getModificationRecorder(){
        AttributeTypeRuleDataDMO rc = new AttributeTypeRuleDataDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setDescription(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public ValueTypeEnum getAllowedValueType(){
        DmcTypeValueTypeEnumSV attr = (DmcTypeValueTypeEnumSV) get(DmvDMSAG.__allowedValueType);
        if (attr == null)
            return(ValueTypeEnum.SINGLE);

        return(attr.getSV());
    }

    /**
     * Sets allowedValueType to the specified value.
     * @param value ValueTypeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setAllowedValueType(ValueTypeEnum value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__allowedValueType);
        if (attr == null)
            attr = new DmcTypeValueTypeEnumSV(DmvDMSAG.__allowedValueType);
        
        try{
            attr.set(value);
            set(DmvDMSAG.__allowedValueType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets allowedValueType to the specified value.
     * @param value A value compatible with DmcTypeValueTypeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setAllowedValueType(Object value) throws DmcValueException {
        DmcTypeValueTypeEnumSV attr  = (DmcTypeValueTypeEnumSV) get(DmvDMSAG.__allowedValueType);
        if (attr == null)
            attr = new DmcTypeValueTypeEnumSV(DmvDMSAG.__allowedValueType);
        
        attr.set(value);
        set(DmvDMSAG.__allowedValueType,attr);
    }

    /**
     * Removes the allowedValueType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remAllowedValueType(){
         rem(DmvDMSAG.__allowedValueType);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public RuleName getRuleName(){
        DmcTypeRuleNameSV attr = (DmcTypeRuleNameSV) get(MetaDMSAG.__ruleName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value RuleName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setRuleName(RuleName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleName);
        if (attr == null)
            attr = new DmcTypeRuleNameSV(MetaDMSAG.__ruleName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__ruleName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setRuleName(Object value) throws DmcValueException {
        DmcTypeRuleNameSV attr  = (DmcTypeRuleNameSV) get(MetaDMSAG.__ruleName);
        if (attr == null)
            attr = new DmcTypeRuleNameSV(MetaDMSAG.__ruleName);
        
        attr.set(value);
        set(MetaDMSAG.__ruleName,attr);
    }

    /**
     * Removes the ruleName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remRuleName(){
         rem(MetaDMSAG.__ruleName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getRuleTitle(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setRuleTitle(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__ruleTitle);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__ruleTitle,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setRuleTitle(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__ruleTitle);
        
        attr.set(value);
        set(MetaDMSAG.__ruleTitle,attr);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remRuleTitle(){
         rem(MetaDMSAG.__ruleTitle);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:645)
    public AttributeDefinitionREF getApplyToAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__applyToAttribute);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to AttributeDefinition without attempting lazy resolution (if turned on).
     */
    public AttributeDefinitionREF getApplyToAttributeREF(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__applyToAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets applyToAttribute to the specified value.
     * @param value AttributeDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:699)
    public void setApplyToAttribute(AttributeDefinitionDMO value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__applyToAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__applyToAttribute);
        else
            ((DmcTypeAttributeDefinitionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(MetaDMSAG.__applyToAttribute,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets applyToAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        DmcTypeAttributeDefinitionREFSV attr  = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__applyToAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__applyToAttribute);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(MetaDMSAG.__applyToAttribute,attr);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remApplyToAttribute(){
         rem(MetaDMSAG.__applyToAttribute);
    }

    /**
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public Iterator<TypeDefinitionREF> getAllowedType(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) get(DmvDMSAG.__allowedType);
        if (attr == null)
            return( ((List<TypeDefinitionREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<TypeDefinitionREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of TypeDefinitionREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:980)
    public Iterator<TypeDefinitionREF> getAllowedTypeREFs(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) get(DmvDMSAG.__allowedType);
        if (attr == null)
            return( ((List<TypeDefinitionREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another allowedType to the specified value.
     * @param value TypeDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:994)
    public DmcAttribute<?> addAllowedType(TypeDefinitionDMO value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__allowedType);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFMV(DmvDMSAG.__allowedType);
        
        try{
            setLastValue(attr.add(value));
            add(DmvDMSAG.__allowedType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another allowedType value.
     * @param value A value compatible with TypeDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addAllowedType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmvDMSAG.__allowedType);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFMV(DmvDMSAG.__allowedType);
        
        setLastValue(attr.add(value));
        add(DmvDMSAG.__allowedType,attr);
        return(attr);
    }

    /**
     * Returns the number of values in allowedType
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getAllowedTypeSize(){
        DmcAttribute<?> attr = get(DmvDMSAG.__allowedType);
        if (attr == null){
            if (DmvDMSAG.__allowedType.indexSize == 0)
                return(0);
            else
                return(DmvDMSAG.__allowedType.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a allowedType value.
     * @param value The TypeDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1291)
    public DmcAttribute<?> delAllowedType(Object value){
        DmcAttribute<?> attr = get(DmvDMSAG.__allowedType);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTypeDefinitionREFMV(DmvDMSAG.__allowedType), value);
        else
            attr = del(DmvDMSAG.__allowedType, value);
        
        return(attr);
    }

    /**
     * Removes the allowedType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remAllowedType(){
         rem(DmvDMSAG.__allowedType);
    }




}
