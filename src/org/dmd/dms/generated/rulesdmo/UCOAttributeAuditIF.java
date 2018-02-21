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
public interface UCOAttributeAuditIF extends RuleIF {

    /**
     * @param uco The object at which the audit begins:
     * @param attributeName The attribute to be audited:
     * @param in The data store from which objects can be retrieved:
     * @param out The data store to which objects may be written:
     * @param listener The feedback listener:
     */
    public void execute(DmcUncheckedObject uco, String attributeName, UcoDataStoreIF in, UcoDataStoreIF out, UcoFeedbackIF listener) throws DmcRuleExceptionSet;

}

