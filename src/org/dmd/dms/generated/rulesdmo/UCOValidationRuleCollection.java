package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:301)
import java.util.ArrayList;                           // Storage for the rules - (RuleFormatter.java:277)
import org.dmd.dmc.DmcClassInfo;                      // Handle to class info - (RuleFormatter.java:281)
import org.dmd.dmc.DmcOmni;                           // Rule tracing support - (RuleFormatter.java:280)
import org.dmd.dmc.rules.ClassRuleCollection;         // Class rule - (RuleFormatter.java:294)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:210)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:211)
import org.dmd.dmc.util.DmcUncheckedObject;           // Required for uco - (RuleFormatter.java:222)


public class UCOValidationRuleCollection extends ClassRuleCollection<UCOValidationIF> {

    public UCOValidationRuleCollection(){
    }

    // Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:381)
    @Override
    public void addRule(RuleIF r){

        if (r instanceof UCOValidationIF){
            super.addThisRule((UCOValidationIF)r);
        }
    }

    /**
     * @param uco The object to be validated:
     */
    public void execute(DmcUncheckedObject uco) throws DmcRuleExceptionSet {
        DmcRuleExceptionSet rc = null;
        DmcClassInfo        cI = DmcOmni.instance().getClassInfo(uco.getConstructionClass());
        ArrayList<UCOValidationIF> ruleList = super.getRules(cI);

        if (ruleList != null){
            for(UCOValidationIF rule: ruleList){
                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleExecuted("Applying: " + rule.getRuleTitle() + " to: " + cI.name);
                try {
                    rule.execute(uco);
                } catch (DmcRuleExceptionSet e) {
                    if (rc == null)
                        rc = e;
                    else
                        rc.add(e);
                    
                    if (DmcOmni.instance().ruleTracing())
                        DmcOmni.instance().ruleFailed(e);
                    
                    if (rc.immediateHalt())
                        throw(rc);
                }
            }
        }

        for(UCOValidationIF rule: globalRules){
            if (DmcOmni.instance().ruleTracing())
                DmcOmni.instance().ruleExecuted("Applying global: " + rule.getRuleTitle() + " to: " + cI.name);
            try {
                rule.execute(uco);
            } catch (DmcRuleExceptionSet e) {
                if (rc == null)
                    rc = e;
                else
                    rc.add(e);

                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleFailed(e);

                 if (rc.immediateHalt())
                    throw(rc);
            }
        }
        if (rc != null)
            throw(rc);
    }

}

