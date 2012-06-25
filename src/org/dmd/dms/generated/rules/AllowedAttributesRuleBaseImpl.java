package org.dmd.dms.generated.rules;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:86)
import org.dmd.dmc.rules.RuleIF;                                           // All rules implement this - (RuleFormatter.java:56)
import org.dmd.dms.generated.dmo.AllowedAttributesRuleInstanceDMO;         // Rule parameters object - (RuleFormatter.java:60)
import org.dmd.dms.generated.enums.RuleScopeEnum;                          // Rule scope - (RuleFormatter.java:54)
import org.dmd.dms.generated.enums.RuleTypeEnum;                           // Rule type - (RuleFormatter.java:55)
import org.dmd.dms.shared.interfaces.ModifierValidationIF;                 // Required by RuleCategory ModifierValidation - (RuleFormatter.java:71)
import org.dmd.dms.shared.interfaces.ObjectValidationIF;                   // Required by RuleCategory ObjectValidation - (RuleFormatter.java:71)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:88)
abstract public class AllowedAttributesRuleBaseImpl implements RuleIF, ObjectValidationIF, ModifierValidationIF {

    static RuleScopeEnum scope = RuleScopeEnum.GLOBAL;
    static RuleTypeEnum  type  = RuleTypeEnum.CLASS;
    protected AllowedAttributesRuleInstanceDMO ruleDMO;

    protected AllowedAttributesRuleBaseImpl(AllowedAttributesRuleInstanceDMO dmo){
        ruleDMO = dmo;
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

}

