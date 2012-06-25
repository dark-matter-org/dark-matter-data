package org.dmd.dms.generated.rules;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:93)
import java.util.ArrayList;                                                // To store category IDs - (RuleFormatter.java:57)
import java.util.Iterator;                                                 // To access category IDs - (RuleFormatter.java:58)
import org.dmd.dmc.rules.RuleIF;                                           // All rules implement this - (RuleFormatter.java:56)
import org.dmd.dms.generated.dmo.AllowedAttributesRuleInstanceDMO;         // Rule parameters object - (RuleFormatter.java:62)
import org.dmd.dms.generated.enums.RuleScopeEnum;                          // Rule scope - (RuleFormatter.java:54)
import org.dmd.dms.generated.enums.RuleTypeEnum;                           // Rule type - (RuleFormatter.java:55)
import org.dmd.dms.shared.interfaces.ModifierValidationIF;                 // Required by RuleCategory ModifierValidation - (RuleFormatter.java:78)
import org.dmd.dms.shared.interfaces.ObjectValidationIF;                   // Required by RuleCategory ObjectValidation - (RuleFormatter.java:78)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:95)
abstract public class AllowedAttributesRuleBaseImpl implements RuleIF, ObjectValidationIF, ModifierValidationIF {

    static RuleScopeEnum      scope = RuleScopeEnum.GLOBAL;
    static RuleTypeEnum       type  = RuleTypeEnum.CLASS;

    static ArrayList<Integer> categories;

    protected AllowedAttributesRuleInstanceDMO ruleDMO;

    protected AllowedAttributesRuleBaseImpl(AllowedAttributesRuleInstanceDMO dmo){
        ruleDMO = dmo;
        if (categories == null){
            categories.add(2);
            categories.add(4);
        }
    }

    @Override
    public String getRuleTitle() {
        return(ruleDMO.getRuleTitle());
    }

    @Override
    public RuleScopeEnum getRuleScope() {
        return(scope);
    }

    @Override
    public RuleTypeEnum getRuleType() {
        return(type);
    }

    @Override
    public Iterator<Integer> getCategories() {
        return(categories.iterator());
    }

}

