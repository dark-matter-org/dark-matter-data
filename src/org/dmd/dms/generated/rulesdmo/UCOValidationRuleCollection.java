package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:300)
import java.util.ArrayList;                           // Storage for the rules - (RuleFormatter.java:276)
import java.util.TreeMap;                             // Storage for the rules - (RuleFormatter.java:277)
import org.dmd.dmc.DmcClassInfo;                      // Handle to class info - (RuleFormatter.java:280)
import org.dmd.dmc.DmcOmni;                           // Rule tracing support - (RuleFormatter.java:279)
import org.dmd.dmc.rules.ClassRuleCollection;         // Class rule - (RuleFormatter.java:293)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:209)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:210)
import org.dmd.dmc.rules.RuleKey;                     // Generic rule key - (RuleFormatter.java:278)
import org.dmd.dmc.rules.RuleList;                    // Rules with flag to indicate that we've gathered info up the class hierarchy - (RuleFormatter.java:272)
import org.dmd.dmc.util.DmcUncheckedObject;           // Required for obj - (RuleFormatter.java:221)

public class UCOValidationRuleCollection extends ClassRuleCollection<UCOValidationIF> {

    public UCOValidationRuleCollection(){
        globalRules = new ArrayList<UCOValidationIF>();
        rules = new TreeMap<RuleKey,RuleList<UCOValidationIF>>();
    }

    // Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:368)
    @Override
    public void addRule(RuleIF r){

        if (r instanceof UCOValidationIF){
            UCOValidationIF rule = (UCOValidationIF)r;
            if (rule.getApplyToClass() == null){
                globalRules.add(rule);
            }
            else{
                RuleList<UCOValidationIF> classRules = rules.get(rule.getKey());
                if (classRules == null)
                    classRules = new RuleList<UCOValidationIF>();
                classRules.addRule(rule);
            }
        }
    }

    /**
     * @param obj The object to be validated:
     */
    public void execute(DmcUncheckedObject obj) throws DmcRuleExceptionSet {
        DmcClassInfo     cI = DmcOmni.instance().getClassInfo(obj.getConstructionClass());
        ArrayList<UCOValidationIF> ruleList = super.getRules(cI);

        if (ruleList != null){
            for(UCOValidationIF rule: ruleList){
                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleExecuted("Applying " + rule.getRuleTitle() + " to: " + cI.name);
                rule.execute(obj);
            }
        }

        for(UCOValidationIF rule: globalRules){
            if (DmcOmni.instance().ruleTracing())
                DmcOmni.instance().ruleExecuted("Applying " + rule.getRuleTitle() + " to: " + cI.name);
            rule.execute(obj);
        }
    }

}

