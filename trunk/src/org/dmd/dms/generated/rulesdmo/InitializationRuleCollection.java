package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:300)
import java.util.ArrayList;                           // Storage for the rules - (RuleFormatter.java:276)
import org.dmd.dmc.DmcClassInfo;                      // Handle to class info - (RuleFormatter.java:280)
import org.dmd.dmc.DmcObject;                         // Required for obj - (RuleFormatter.java:221)
import org.dmd.dmc.DmcOmni;                           // Rule tracing support - (RuleFormatter.java:279)
import org.dmd.dmc.rules.ClassRuleCollection;         // Class rule - (RuleFormatter.java:293)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:209)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:210)

public class InitializationRuleCollection extends ClassRuleCollection<InitializationIF> {

    public InitializationRuleCollection(){
    }

    // Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:369)
    @Override
    public void addRule(RuleIF r){

        if (r instanceof InitializationIF){
            super.addThisRule((InitializationIF)r);
        }
    }

    /**
     * @param obj The object to be initialized
     */
    public void execute(DmcObject obj) throws DmcRuleExceptionSet {
        DmcClassInfo     cI = obj.getConstructionClassInfo();
        ArrayList<InitializationIF> ruleList = super.getRules(cI);

        if (ruleList != null){
            for(InitializationIF rule: ruleList){
                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleExecuted("Applying " + rule.getRuleTitle() + " to: " + cI.name);
                rule.execute(obj);
            }
        }

        for(InitializationIF rule: globalRules){
            if (DmcOmni.instance().ruleTracing())
                DmcOmni.instance().ruleExecuted("Applying " + rule.getRuleTitle() + " to: " + cI.name);
            rule.execute(obj);
        }
    }

}

