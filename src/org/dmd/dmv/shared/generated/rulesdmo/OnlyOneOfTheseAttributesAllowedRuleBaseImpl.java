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
package org.dmd.dmv.shared.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:523)
import java.util.ArrayList;                                                                 // To store category IDs - (RuleFormatter.java:491)
import java.util.Iterator;                                                                  // To access category IDs - (RuleFormatter.java:492)
import org.dmd.dmc.DmcAttributeInfo;                                                        // To support retrieval of attribute info - (RuleFormatter.java:496)
import org.dmd.dmc.DmcClassInfo;                                                            // To support retrieval of rule class - (RuleFormatter.java:495)
import org.dmd.dmc.DmcObject;                                                               // To support the dynamic constructor - (RuleFormatter.java:494)
import org.dmd.dmc.DmcOmni;                                                                 // To map class and attribute names to info - (RuleFormatter.java:493)
import org.dmd.dmc.rules.ClassRuleKey;                                                      // To allow rule sorting - (RuleFormatter.java:504)
import org.dmd.dmc.rules.DynamicInitIF;                                                     // To allow for dynamic initialization of rule data - (RuleFormatter.java:498)
import org.dmd.dmc.rules.RuleIF;                                                            // All rules implement this - (RuleFormatter.java:490)
import org.dmd.dmc.rules.RuleKey;                                                           // To allow rule sorting - (RuleFormatter.java:497)
import org.dmd.dms.generated.dmo.RuleDataDMO;                                               // To allow access to the rule data DMO - (RuleFormatter.java:499)
import org.dmd.dms.generated.enums.RuleTypeEnum;                                            // Rule type - (RuleFormatter.java:489)
import org.dmd.dms.generated.rulesdmo.ObjectValidationIF;                                   // The interface for the ObjectValidation category - (RuleFormatter.java:514)
import org.dmd.dmv.shared.generated.dmo.OnlyOneOfTheseAttributesAllowedRuleDataDMO;         // Rule parameters object - (RuleFormatter.java:508)



// Generated from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:525)
abstract public class OnlyOneOfTheseAttributesAllowedRuleBaseImpl implements RuleIF, DynamicInitIF,ObjectValidationIF {

    static RuleTypeEnum       type  = RuleTypeEnum.CLASS;

    static ArrayList<Integer> categories;

    private DmcClassInfo      classInfo;
    private RuleKey           key;

    protected OnlyOneOfTheseAttributesAllowedRuleDataDMO ruleDMO;

    protected OnlyOneOfTheseAttributesAllowedRuleBaseImpl(){
        ruleDMO = null;
        if (categories == null){
            categories = new ArrayList<Integer>();
            categories.add(2);
        }
    }

    /**
     * This method allows for the dynamic instantiation and initialization of the
     * data associated with this rule. It is used by the DmcSchemaParser and generally
     * shouldn't be used unless you know what you're doing!
     */
    public void setRuleData(DmcObject obj){
        if (obj instanceof OnlyOneOfTheseAttributesAllowedRuleDataDMO)
            ruleDMO = (OnlyOneOfTheseAttributesAllowedRuleDataDMO)obj;
        else
            throw(new IllegalStateException("Object of class " + obj.getClass().getName() + " passed when object of class OnlyOneOfTheseAttributesAllowedRuleDataDMO required"));
    }

    protected OnlyOneOfTheseAttributesAllowedRuleBaseImpl(OnlyOneOfTheseAttributesAllowedRuleDataDMO dmo){
        ruleDMO = dmo;
        if (categories == null){
            categories = new ArrayList<Integer>();
            categories.add(2);
        }
    }

    @Override
    public RuleKey getKey() {
        if (key == null)
            key = new ClassRuleKey(getApplyToClass());
        return(key);
    }

    @Override
    public String getRuleTitle() {
        return(ruleDMO.getRuleTitle());
    }

    @Override
    public DmcClassInfo getRuleClass() {
        return(ruleDMO.getConstructionClassInfo());
    }

    @Override
    public RuleTypeEnum getRuleType() {
        return(type);
    }

    @Override
    public Iterator<Integer> getCategories() {
        return(categories.iterator());
    }

    @Override
    public Iterator<String> getMsgParam() {
        return(ruleDMO.getMsgParam());
    }

    @Override
    public String getMsgKey() {
        return(ruleDMO.getMsgKey());
    }

    @Override
    public RuleDataDMO getRuleDataDMO() {
        return(ruleDMO);
    }

    @Override
    public DmcClassInfo getApplyToClass() {
        if (classInfo != null)
            return(classInfo);
        
        if (ruleDMO == null)
            return(null);
        
        if (ruleDMO.getApplyToClass() != null)
            classInfo = DmcOmni.instance().getClassInfo(ruleDMO.getApplyToClass().getObjectName().getNameString());
        
        return(classInfo);
    }

    @Override
    public DmcAttributeInfo getApplyToAttribute() {
        return(null);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        
        sb.append(getRuleType() + " ");
        
        sb.append(getRuleClass().name + " ");
        
        sb.append(getKey() + " ");
        
        sb.append(getRuleTitle());
        
        return(sb.toString());
    }

}

