package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:253)
import org.dmd.dmc.DmcAttribute;                      // Required for attribute - (RuleFormatter.java:222)
import org.dmd.dmc.DmcObject;                         // Required for obj - (RuleFormatter.java:222)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:210)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:211)



// Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:255)
public interface AttributeValidationIF extends RuleIF {

    /**
     * @param obj The object in which the attribute exists
     * @param attribute The attribute to be validated
     */
    public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet;

}

