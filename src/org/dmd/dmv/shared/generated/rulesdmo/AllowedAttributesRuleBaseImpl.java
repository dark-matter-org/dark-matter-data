package org.dmd.dmv.shared.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:521)
import java.util.ArrayList;                                                   // To store category IDs - (RuleFormatter.java:490)
import java.util.Iterator;                                                    // To access category IDs - (RuleFormatter.java:491)
import org.dmd.dmc.DmcAttributeInfo;                                          // To support retrieval of attribute info - (RuleFormatter.java:495)
import org.dmd.dmc.DmcClassInfo;                                              // To support retrieval of rule class - (RuleFormatter.java:494)
import org.dmd.dmc.DmcObject;                                                 // To support the dynamic constructor - (RuleFormatter.java:493)
import org.dmd.dmc.DmcOmni;                                                   // To map class and attribute names to info - (RuleFormatter.java:492)
import org.dmd.dmc.rules.ClassRuleKey;                                        // To allow rule sorting - (RuleFormatter.java:502)
import org.dmd.dmc.rules.DynamicInitIF;                                       // To allow for dynamic initialization of rule data - (RuleFormatter.java:497)
import org.dmd.dmc.rules.RuleIF;                                              // All rules implement this - (RuleFormatter.java:489)
import org.dmd.dmc.rules.RuleKey;                                             // To allow rule sorting - (RuleFormatter.java:496)
import org.dmd.dms.generated.enums.RuleTypeEnum;                              // Rule type - (RuleFormatter.java:488)
import org.dmd.dms.generated.rulesdmo.ObjectValidationIF;                     // The interface for the ObjectValidation category - (RuleFormatter.java:512)
import org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO;         // Rule parameters object - (RuleFormatter.java:506)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:523)
abstract public class AllowedAttributesRuleBaseImpl implements RuleIF, DynamicInitIF,ObjectValidationIF {

    static RuleTypeEnum       type  = RuleTypeEnum.CLASS;

    static ArrayList<Integer> categories;

    private DmcClassInfo      classInfo;
    private RuleKey           key;

    protected AllowedAttributesRuleDataDMO ruleDMO;

    protected AllowedAttributesRuleBaseImpl(){
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
        if (obj instanceof AllowedAttributesRuleDataDMO)
            ruleDMO = (AllowedAttributesRuleDataDMO)obj;
        else
            throw(new IllegalStateException("Object of class " + obj.getClass().getName() + " passed when object of class AllowedAttributesRuleDataDMO required"));
    }

    protected AllowedAttributesRuleBaseImpl(AllowedAttributesRuleDataDMO dmo){
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

