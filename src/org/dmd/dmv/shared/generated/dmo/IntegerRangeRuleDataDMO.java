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
import java.io.Serializable;                                  // Always required - (GenUtility.java:220)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.RuleName;                            // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.dmo.RuleDataDMO;                 // Base class - (GenUtility.java:351)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;          // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dms.generated.types.DmcTypeRuleNameSV;         // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type - (GenUtility.java:324)

/**
 * null
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class IntegerRangeRuleDataDMO  extends RuleDataDMO  implements Serializable  {

    public final static String constructionClassName = "IntegerRangeRuleData";


    static {
    }

    public IntegerRangeRuleDataDMO() {
        super("IntegerRangeRuleData");
    }

    protected IntegerRangeRuleDataDMO(String oc) {
        super(oc);
    }

    @Override
    public IntegerRangeRuleDataDMO getNew(){
        IntegerRangeRuleDataDMO rc = new IntegerRangeRuleDataDMO();
        return(rc);
    }

    @Override
    public IntegerRangeRuleDataDMO getSlice(DmcSliceInfo info){
        IntegerRangeRuleDataDMO rc = new IntegerRangeRuleDataDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public IntegerRangeRuleDataDMO(DmcTypeModifierMV mods) {
        super("IntegerRangeRuleData");
        modrec(true);
        setModifier(mods);
    }

    public IntegerRangeRuleDataDMO getModificationRecorder(){
        IntegerRangeRuleDataDMO rc = new IntegerRangeRuleDataDMO();
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Integer getIrrMinimum(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmvDMSAG.__irrMinimum);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets irrMinimum to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setIrrMinimum(Integer value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__irrMinimum);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmvDMSAG.__irrMinimum);
        
        try{
            attr.set(value);
            set(DmvDMSAG.__irrMinimum,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets irrMinimum to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setIrrMinimum(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmvDMSAG.__irrMinimum);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmvDMSAG.__irrMinimum);
        
        attr.set(value);
        set(DmvDMSAG.__irrMinimum,attr);
    }

    /**
     * Removes the irrMinimum attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remIrrMinimum(){
         rem(DmvDMSAG.__irrMinimum);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Integer getIrrMaximum(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmvDMSAG.__irrMaximum);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets irrMaximum to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setIrrMaximum(Integer value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__irrMaximum);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmvDMSAG.__irrMaximum);
        
        try{
            attr.set(value);
            set(DmvDMSAG.__irrMaximum,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets irrMaximum to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setIrrMaximum(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmvDMSAG.__irrMaximum);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmvDMSAG.__irrMaximum);
        
        attr.set(value);
        set(DmvDMSAG.__irrMaximum,attr);
    }

    /**
     * Removes the irrMaximum attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remIrrMaximum(){
         rem(DmvDMSAG.__irrMaximum);
    }




}
