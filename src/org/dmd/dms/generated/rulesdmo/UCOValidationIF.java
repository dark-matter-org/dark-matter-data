package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:253)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:210)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:211)
import org.dmd.dmc.util.DmcUncheckedObject;           // Required for uco - (RuleFormatter.java:222)



// Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:255)
public interface UCOValidationIF extends RuleIF {

    /**
     * @param uco The object to be validated:
     */
    public void execute(DmcUncheckedObject uco) throws DmcRuleExceptionSet;

}

