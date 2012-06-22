package org.dmd.dms.generated.rules;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:81)
import org.dmd.dms.generated.dmo.AllowedAttributesRuleDMO;         // Rule parameters object - (RuleFormatter.java:55)
import org.dmd.dms.shared.interfaces.ModifierValidationIF;         // Required by RuleCategory ModifierValidation - (RuleFormatter.java:66)
import org.dmd.dms.shared.interfaces.ObjectValidationIF;           // Required by RuleCategory ObjectValidation - (RuleFormatter.java:66)
import org.dmd.dms.shared.interfaces.RuleIF;                       // All rules implement this - (RuleFormatter.java:51)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:83)
abstract public class AllowedAttributesRuleBaseImpl implements RuleIF, ObjectValidationIF, ModifierValidationIF {

    protected AllowedAttributesRuleDMO ruleDMO;

    protected AllowedAttributesRuleBaseImpl(AllowedAttributesRuleDMO dmo){
        ruleDMO = dmo;
    }

    @Override
    public String getRuleTitle() {
        return(ruleDMO.getRuleTitle());
    }
}

