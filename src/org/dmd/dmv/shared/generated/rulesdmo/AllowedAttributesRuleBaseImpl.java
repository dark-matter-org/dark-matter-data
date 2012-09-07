package org.dmd.dmv.shared.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:240)
import java.util.ArrayList;                                                   // To store category IDs - (RuleFormatter.java:218)
import java.util.Iterator;                                                    // To access category IDs - (RuleFormatter.java:219)
import org.dmd.dmc.DmcAttributeInfo;                                          // To support retrieval of attribute info - (RuleFormatter.java:222)
import org.dmd.dmc.DmcClassInfo;                                              // To support retrieval of rule class - (RuleFormatter.java:221)
import org.dmd.dmc.DmcOmni;                                                   // To map class and attribute names to info - (RuleFormatter.java:220)
import org.dmd.dmc.rules.RuleIF;                                              // All rules implement this - (RuleFormatter.java:217)
import org.dmd.dms.generated.enums.RuleTypeEnum;                              // Rule type - (RuleFormatter.java:216)
import org.dmd.dms.shared.interfaces.ModifierValidationIF;                    // The interface for the ModifierValidation category - (RuleFormatter.java:231)
import org.dmd.dms.shared.interfaces.ObjectValidationIF;                      // The interface for the ObjectValidation category - (RuleFormatter.java:231)
import org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO;         // Rule parameters object - (RuleFormatter.java:225)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:242)
abstract public class AllowedAttributesRuleBaseImpl implements RuleIF,ObjectValidationIF,ModifierValidationIF {

    static RuleTypeEnum       type  = RuleTypeEnum.CLASS;

    static ArrayList<Integer> categories;

    private DmcClassInfo      classInfo;
    private DmcAttributeInfo  attrInfo;

    protected AllowedAttributesRuleDataDMO ruleDMO;

    protected AllowedAttributesRuleBaseImpl(){
        ruleDMO = null;
        if (categories == null){
            categories = new ArrayList<Integer>();
            categories.add(2);
            categories.add(4);
        }
    }

    protected AllowedAttributesRuleBaseImpl(AllowedAttributesRuleDataDMO dmo){
        ruleDMO = dmo;
        if (categories == null){
            categories = new ArrayList<Integer>();
            categories.add(2);
            categories.add(4);
        }
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
        if (attrInfo != null)
            return(attrInfo);
        
        if (ruleDMO == null)
            return(null);
        if (ruleDMO.getApplyToAttribute() != null)
            attrInfo = DmcOmni.instance().getAttributeInfo(ruleDMO.getApplyToAttribute().getObjectName().getNameString());
        
        return(attrInfo);
    }

}

