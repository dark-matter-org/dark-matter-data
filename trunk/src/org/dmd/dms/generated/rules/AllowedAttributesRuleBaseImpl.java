package org.dmd.dms.generated.rules;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:98)
import java.util.ArrayList;                                            // To store category IDs - (RuleFormatter.java:62)
import java.util.Iterator;                                             // To access category IDs - (RuleFormatter.java:63)
import org.dmd.dmc.rules.RuleIF;                                       // All rules implement this - (RuleFormatter.java:61)
import org.dmd.dms.generated.dmo.AllowedAttributesRuleDataDMO;         // Rule parameters object - (RuleFormatter.java:67)
import org.dmd.dms.generated.enums.RuleScopeEnum;                      // Rule scope - (RuleFormatter.java:59)
import org.dmd.dms.generated.enums.RuleTypeEnum;                       // Rule type - (RuleFormatter.java:60)
import org.dmd.dms.shared.interfaces.ModifierValidationIF;             // Required by RuleCategory ModifierValidation - (RuleFormatter.java:83)
import org.dmd.dms.shared.interfaces.ObjectValidationIF;               // Required by RuleCategory ObjectValidation - (RuleFormatter.java:83)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:100)
abstract public class AllowedAttributesRuleBaseImpl implements RuleIF, ObjectValidationIF, ModifierValidationIF {

    static RuleScopeEnum      scope = RuleScopeEnum.GLOBAL;
    static RuleTypeEnum       type  = RuleTypeEnum.CLASS;

    static ArrayList<Integer> categories;

    protected AllowedAttributesRuleDataDMO ruleDMO;

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

