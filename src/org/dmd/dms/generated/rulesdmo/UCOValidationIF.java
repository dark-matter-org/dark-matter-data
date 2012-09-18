package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:249)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:207)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:208)
import org.dmd.dmc.util.DmcUncheckedObject;           // Required for obj - (RuleFormatter.java:218)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:251)
public interface UCOValidationIF extends RuleIF {

    /**
     * @param obj The object to be validated:
     */
    public void execute(DmcUncheckedObject obj) throws DmcRuleExceptionSet;

}

