package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:249)
import org.dmd.dmc.DmcObject;                         // Required for obj - (RuleFormatter.java:218)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:207)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:208)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:251)
public interface ObjectValidationIF extends RuleIF {

    /**
     * @param obj The object to be validated
     */
    public void execute(DmcObject obj) throws DmcRuleExceptionSet;

}

