package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:241)
import org.dmd.dmc.DmcAttribute;                      // Required for attribute - (RuleFormatter.java:210)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:199)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:200)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:243)
public interface AttributeValidationIF extends RuleIF {

    /**
     * @param attribute The attribute to be validated
     */
    public void execute(DmcAttribute<?> attribute) throws DmcRuleExceptionSet;

}

