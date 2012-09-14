package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:241)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:199)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:200)
import org.dmd.dmc.util.DmcUncheckedObject;           // Required for obj - (RuleFormatter.java:210)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:243)
public interface UCOValidationIF extends RuleIF {

    /**
     * @param obj The object to be validated:
     */
    public void execute(DmcUncheckedObject obj) throws DmcRuleExceptionSet;

}

