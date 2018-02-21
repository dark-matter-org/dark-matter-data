package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:253)
import java.lang.String;                              // Required for attributeName - (RuleFormatter.java:222)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:210)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:211)
import org.dmd.dmc.util.DmcUncheckedObject;           // Required for uco - (RuleFormatter.java:222)
import org.dmd.dmc.util.UcoDataStoreIF;               // Required for in - (RuleFormatter.java:222)
import org.dmd.dmc.util.UcoFeedbackIF;                // Required for listener - (RuleFormatter.java:222)



// Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:255)
public interface UCOAttributeNormalizationIF extends RuleIF {

    /**
     * @param uco The object in which attribute resides:
     * @param attributeName The attribute to be normalized:
     * @param in The data store from which objects can be retrieved:
     * @param listener The feedback listener:
     */
    public void execute(DmcUncheckedObject uco, String attributeName, UcoDataStoreIF in, UcoFeedbackIF listener) throws DmcRuleExceptionSet;

}

