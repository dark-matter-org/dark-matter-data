package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:248)
import org.dmd.dmc.DmcObject;                         // Required for obj - (RuleFormatter.java:217)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:206)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:207)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:250)
public interface InitializationIF extends RuleIF {

    /**
     * @param obj The object to be initialized
     */
    public void execute(DmcObject obj) throws DmcRuleExceptionSet;

}

