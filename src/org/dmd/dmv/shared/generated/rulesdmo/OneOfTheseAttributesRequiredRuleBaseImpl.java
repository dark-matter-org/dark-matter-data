package org.dmd.dmv.shared.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:517)
import java.util.ArrayList;                                                              // To store category IDs - (RuleFormatter.java:486)
import java.util.Iterator;                                                               // To access category IDs - (RuleFormatter.java:487)
import org.dmd.dmc.DmcAttributeInfo;                                                     // To support retrieval of attribute info - (RuleFormatter.java:491)
import org.dmd.dmc.DmcClassInfo;                                                         // To support retrieval of rule class - (RuleFormatter.java:490)
import org.dmd.dmc.DmcObject;                                                            // To support the dynamic constructor - (RuleFormatter.java:489)
import org.dmd.dmc.DmcOmni;                                                              // To map class and attribute names to info - (RuleFormatter.java:488)
import org.dmd.dmc.rules.ClassRuleKey;                                                   // To allow rule sorting - (RuleFormatter.java:498)
import org.dmd.dmc.rules.DynamicInitIF;                                                  // To allow for dynamic initialization of rule data - (RuleFormatter.java:493)
import org.dmd.dmc.rules.RuleIF;                                                         // All rules implement this - (RuleFormatter.java:485)
import org.dmd.dmc.rules.RuleKey;                                                        // To allow rule sorting - (RuleFormatter.java:492)
import org.dmd.dms.generated.enums.RuleTypeEnum;                                         // Rule type - (RuleFormatter.java:484)
import org.dmd.dms.generated.rulesdmo.ObjectModifierValidationIF;                        // The interface for the ObjectModifierValidation category - (RuleFormatter.java:508)
import org.dmd.dms.generated.rulesdmo.ObjectValidationIF;                                // The interface for the ObjectValidation category - (RuleFormatter.java:508)
import org.dmd.dmv.shared.generated.dmo.OneOfTheseAttributesRequiredRuleDataDMO;         // Rule parameters object - (RuleFormatter.java:502)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:519)
abstract public class OneOfTheseAttributesRequiredRuleBaseImpl implements RuleIF, DynamicInitIF,ObjectValidationIF,ObjectModifierValidationIF {

    static RuleTypeEnum       type  = RuleTypeEnum.CLASS;

    static ArrayList<Integer> categories;

    private DmcClassInfo      classInfo;
    private RuleKey           key;

    protected OneOfTheseAttributesRequiredRuleDataDMO ruleDMO;

    protected OneOfTheseAttributesRequiredRuleBaseImpl(){
        ruleDMO = null;
        if (categories == null){
            categories = new ArrayList<Integer>();
            categories.add(2);
            categories.add(4);
        }
    }

    /**
     * This method allows for the dynamic instantiation and initialization of the
     * data associated with this rule. It is used by the DmcSchemaParser and generally
     * shouldn't be used unless you know what you're doing!
     */
    public void setRuleData(DmcObject obj){
        if (obj instanceof OneOfTheseAttributesRequiredRuleDataDMO)
            ruleDMO = (OneOfTheseAttributesRequiredRuleDataDMO)obj;
        else
            throw(new IllegalStateException("Object of class " + obj.getClass().getName() + " passed when object of class OneOfTheseAttributesRequiredRuleDataDMO required"));
    }

    protected OneOfTheseAttributesRequiredRuleBaseImpl(OneOfTheseAttributesRequiredRuleDataDMO dmo){
        ruleDMO = dmo;
        if (categories == null){
            categories = new ArrayList<Integer>();
            categories.add(2);
            categories.add(4);
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

