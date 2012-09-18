package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:285)
import java.util.TreeMap;                             // Storage for the rules - (RuleFormatter.java:272)
import org.dmd.dmc.DmcObject;                         // Required for obj - (RuleFormatter.java:218)
import org.dmd.dmc.rules.ClassRuleCollection;         // Class rule - (RuleFormatter.java:278)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:207)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:208)
import org.dmd.dmc.rules.RuleKey;                     // Generic rule key - (RuleFormatter.java:273)
public class InitializationRuleCollection extends ClassRuleCollection<InitializationIF> {

    public InitializationRuleCollection(){
        rules = new TreeMap<RuleKey,InitializationIF>();
    }

    @Override
    public void addRule(RuleIF rule) {

        if (rule instanceof InitializationIF){
            
        }
    }

    /**
     * @param obj The object to be initialized
     */
    public void execute(DmcObject obj) throws DmcRuleExceptionSet {
    }

}

