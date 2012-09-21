package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:252)
import org.dmd.dmc.DmcObject;                                 // Required for obj - (RuleFormatter.java:221)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                 // Rule type - (RuleFormatter.java:209)
import org.dmd.dmc.rules.RuleIF;                              // All rules implement this - (RuleFormatter.java:210)
import org.dmd.dmc.types.Modifier;                            // Required for mod - (RuleFormatter.java:221)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for mods - (RuleFormatter.java:221)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:254)
public interface ObjectModifierValidationIF extends RuleIF {

    /**
     * @param obj The object being modified
     * @param mods The set of modifications being performed
     * @param mod The particular modification being validated
     */
    public void execute(DmcObject obj, DmcTypeModifierMV mods, Modifier mod) throws DmcRuleExceptionSet;

}

